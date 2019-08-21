package pattern.behavioral.strategy.payport;

/**
 * 阿里支付类
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class AliPay extends Payment {

    /**
     * 支付类型
     */
    @Override
    public String getName() {
        return "支付宝";
    }

    /**
     * 查询余额
     */
    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
