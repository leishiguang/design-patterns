package com.ray.pool;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

/**
 * 自定义连接线程池
 * getInstance() 返回 BasePool 的唯一实例，第一次调用时将执行构造函数
 * getConnection() 返回一个连接示例，getConnection(long time)添加时间限制
 * freeConnection(Connection con) 将连接示例返回连接池
 * getNum() 返回空闲连接数
 * getNumActive() 返回当前使用的连接数
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public abstract class BasePool {

    public String propertiesName = "connection-INF.properties";

    /**
     * 唯一实例
     */
    private static BasePool instance = null;

    /**
     * 最大连接数
     */
    protected int maxConnect = 100;

    /**
     * 保持连接数
     */
    protected int normalConnect = 10;

    /**
     * 驱动字符串
     */
    protected String driverName = null;

    /**
     * 驱动变量
     */
    protected Driver driver = null;

    /**
     * 私有构造函数，不允许外界访问
     */
    protected BasePool() {
        init();
        loadDrivers(driverName);
    }

    /**
     * 单例模式，返回当前连接池 Pool 实例
     */
    public static BasePool getInstance() {
        if (instance == null) {
            synchronized (BasePool.class) {
                if (instance == null) {
                    instance = getInstanceChild();
                }
            }
        }
        return instance;
    }

    public static BasePool getInstanceChild() {
        return null;
    }

    /**
     * 创建连接池
     */
    public abstract void createPool();

    /**
     * 获得一个可用连接，如果没有就创建一个，且小于最大连接数
     */
    public abstract Connection getConnection();

    /**
     * 获得一个连接，有时间限制
     */
    public abstract Connection getConnection(long time);

    /**
     * 将连接对象返回给连接池
     */
    public abstract void freeConnection(Connection connection);

    /**
     * 返回当前空闲连接数
     */
    public abstract int getNum();

    /**
     * 返回当前活动线程数
     */
    public abstract int getNumActive();


    /**
     * 装载和注册所有JDBC驱动程序
     *
     * @param url url
     */
    protected void loadDrivers(String url) {

    }

    /**
     * 撤销驱动
     */
    protected synchronized void release() {

    }

    /**
     * 初始化所有从配置文件读取的成员变量
     */
    private void init() {
        InputStream is = BasePool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        try {
            p.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.driverName = p.getProperty("driverName");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

}
