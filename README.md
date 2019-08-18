## 在这里探索设计模式

- basis 简单的实践，侧重理论
- practice 一些更饱满的实践，侧重应用

**factory 工厂模式**

- simplify 简单工厂，以 pizza 为例
- abstracted 抽象工厂，拓展了 pizza simplify 简单工厂
- simplify2 简单工厂，以 course 为例

也可以参考 java.util.Calendar.createCalendar ，或 logback 的 LoggerFactory

**Singleton 单例**

- a 一个巧克力锅炉的例子，没有太细致的说明单例实现方法的区别
- b 多了一些说明，分了饿汉模式、懒汉、容器，也有考虑反射、序列化

全局唯一，只提供一个全局访问点。
比如 ApplicationContext、数据库连接池，都是单例模式...

- 一般单例模式，要特别注意反射、序列化对单例的破坏
- 注册式单例模式，枚举式单例模式，容器式单例模式

