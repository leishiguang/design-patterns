pattern.structural.proxy 代理模式

- a JDK 内置的代理
- b 与 a 类似的案例
- c 简单的一个案例，父亲代理孩子 findLove，扩展了孩子的 findLove 方法
- jdkproxy jdk方式实现的动态代理
- cglibproxy cglib方式实现的动态代理

JDK与CGLib对比
- JDK 动态代理实现了被代理对象的接口，CGLib 代理继承了被代理对象。
- JDK 动态代理和 CGLib 代理都在运行期生成字节码，JDK 动态代理直接写 Class 字节码，CGLib 代理使用 ASM 框架写 Class 字节码，CGLib 实现更复杂，生成代理类比 JDK 动态代理效率低。
- JDK 动态代理调用代理方法是通过反射机制调用的，CGLib 代理是通过 FastClass 机制直接调用的，CGLib 代理的执行效率更高。

