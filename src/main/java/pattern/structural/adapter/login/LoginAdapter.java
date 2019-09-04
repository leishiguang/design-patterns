package pattern.structural.adapter.login;

/**
 * 适配器接口
 *
 * @author leishiguang
 * @since v1.0
 */
public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
