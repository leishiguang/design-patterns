## 在这里探索设计模式

包结构目录：

- basis 简单的实践，侧重基础理论，每种模式均包含多个详细案例；
- practice 联系生产环境联系的实践，侧重应用，每个实践融合了多种设计模式；

使用方式：

- 执行每个子包中的 main 方法；

### 各设计模式小结

**pattern.creational.factory 工厂模式**

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

**pattern.structural.proxy 代理模式**

- a JDK 内置的代理
- b 与 a 类似的案例
- c 简单的一个案例，父亲代理孩子 findLove，扩展了孩子的 findLove 方法
- jdkproxy jdk方式实现的动态代理
- cglibproxy cglib方式实现的动态代理

JDK与CGLib对比
- JDK 动态代理实现了被代理对象的接口，CGLib 代理继承了被代理对象。
- JDK 动态代理和 CGLib 代理都在运行期生成字节码，JDK 动态代理直接写 Class 字节码，CGLib 代理使用 ASM 框架写 Class 字节码，CGLib 实现更复杂，生成代理类比 JDK 动态代理效率低。
- JDK 动态代理调用代理方法是通过反射机制调用的，CGLib 代理是通过 FastClass 机制直接调用的，CGLib 代理的执行效率更高。

**Strategy Pattern 策略模式**

应用场景：
 - 系统中有很多类，而它们的区别仅仅在于行为不同
 - 一个系统需要动态地在集中算法中选择一种。
 
 比如，用策略模式实现选择支付方式的业务场景...
 
 JDK 中的 compare 比较器，用了策略；
 Spring 中的 Resource 也用了策略；
 还有，不同类型的类，采用不同的初始化策略，InstantiationStrategy 接口；
 
 优点：
 
 - 符合开闭原则；
 - 避免使用多重条件语句，如 if...else 语句、switch 语句；
 - 提高算法的保密性和安全性

缺点：

- 客户端必须知道所有的策略，并且自行决定使用哪种策略；
- 代码中会产生非常多的策略类，增加了代码的维护难度；

DispatcherServlet 结合了策略模式、工厂模式、单例模式...

**模板模式**

- course 以课程为示例演示模板模式

一次性实现一个算法的不变部分，并将可变的行为留给子类来实现。
各子类中公共的行为被提取出来并集中到一个公共的父类中，从而避免代码重复。

**适配器模式**

将一个类的接口转换成用户期望的另外一个接口，使原本接口不兼容的类也可以一起工作。
Spring AOP 的 AdvisorAdapter 类，即有三个实现类，实现了顶层适配器接口。

**装饰者模式**

Decorator，在不改变原有对象的基础上，将功能附加到对象上，提供了比继承更有弹性的方案。
- 扩展一个类的功能或者给一个类添加附加职责；
- 动态给一个对象添加功能，这些功能可以再动态地撤销；
