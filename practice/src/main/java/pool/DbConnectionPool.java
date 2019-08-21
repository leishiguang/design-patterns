package pool;

import java.sql.Connection;
import java.util.Vector;

/**
 * 数据库连接池管理
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class DbConnectionPool extends BasePool {

    /**
     * 正在使用的连接数
     */
    private int checkOut;

    /**
     * 存放产生的连接对象容器
     */
    private Vector<Connection> freeConnections = new Vector<>();

    /**
     * 创建连接池
     */
    @Override
    public void createPool() {

    }

    /**
     * 获得一个可用连接，如果没有就创建一个，且小于最大连接数
     */
    @Override
    public Connection getConnection() {
        return null;
    }

    /**
     * 获得一个连接，有时间限制
     *
     * @param time
     */
    @Override
    public Connection getConnection(long time) {
        return null;
    }

    /**
     * 将连接对象返回给连接池
     *
     * @param connection
     */
    @Override
    public void freeConnection(Connection connection) {

    }

    /**
     * 返回当前空闲连接数
     */
    @Override
    public int getNum() {
        return 0;
    }

    /**
     * 返回当前活动线程数
     */
    @Override
    public int getNumActive() {
        return 0;
    }
}
