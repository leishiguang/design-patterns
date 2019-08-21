package strategy.payport;

/**
 * 支付状态包装类
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return (String.format("支付状态：[%s],%s,交易详情：%s", code, msg, data));
    }
}
