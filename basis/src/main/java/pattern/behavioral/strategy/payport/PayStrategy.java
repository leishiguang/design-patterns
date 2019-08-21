package pattern.behavioral.strategy.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付策略管理类
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = "AliPay";

    private static Map<String, Payment> payStrategy = new HashMap<>(6);

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(WECHAT_PAY, new WechatPay());
        payStrategy.put(UNION_PAY, new UnionPay());
    }

    public static Payment get(String payKey) {
        if (!payStrategy.containsKey(payKey)) {
            return payStrategy.get(DEFAULT_PAY);
        } else {
            return payStrategy.get(payKey);
        }
    }

}
