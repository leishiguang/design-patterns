package mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 策略类实现 mvc DispatcherServlet
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class DispatcherServlet extends HttpServlet {

    private List<Handler> handlerMappeing = new ArrayList<>();

    @Override
    public void init() {
        Class<?> memberControllerClass = MemberController.class;
        try {
            handlerMappeing.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", String.class))
                    .setUrl("/web/getMenberById.json"));
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response) throws InvocationTargetException, IllegalAccessException {
        //获取用户请求url
        //按照 J2EE 标准，每个请求对应一个 Serlvet，URL 从浏览器输入
        String uri = request.getRequestURI();

        // Servlet 拿到 URL 以后，要做权衡（做判断，做选择）
        // 根据用户请求的 URL ，找到这个 URL 对应的某个 Java 类的方法

        // 通过获取的 URL 去做 handlerMapping（策略常量）
        Handler handler = null;
        for (Handler h : handlerMappeing) {
            if (uri.equals(h.getUrl())) {
                handler = h;
                break;
            }
        }

        //将具体的任务分发给 Method（通过反射调用对应的方法）

        assert handler != null;
        handler.getMethod().invoke(handler.getController(), request.getParameter("mid"));

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) {
        try {
            doDispatch(req, response);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    class Handler {
        private Object controller;
        private Method method;
        private String url;


        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
