package pattern.behavioral.strategy.payport;

/**
 * 银联支付
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class UnionPay extends Payment {
    /**
     * 支付类型
     */
    @Override
    public String getName() {
        return "银联支付";
    }

    /**
     * 查询余额
     */
    @Override
    protected double queryBalance(String uid) {
        return 888;
    }
}
