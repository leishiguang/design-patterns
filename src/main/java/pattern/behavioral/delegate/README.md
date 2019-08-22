**Delegate Pattern 委派模式**

严格来讲，不是 GoF 23 中设计模式。其基本作用就是负责任务的调用和分配，和代理模式很像。
可以看作是一种特殊情况下的静态全权代理，但是代理模式注重过程，而委派模式注重结果。

Spring 中如 DispatcherServlet 就用到了委派模式...
在 Spring 中以 Delegate 结尾的都是用到了委派模式。

