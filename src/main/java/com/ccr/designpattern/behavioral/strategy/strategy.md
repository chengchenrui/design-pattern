# 行为型 - 策略(Strategy)

## 意图

定义一系列算法，封装每个算法，并使它们可以互换。

策略模式可以让算法独立于使用它的客户端

## 类图


- Strategy 接口定义了一个算法族，它们都具有 behavior() 方法。 
- Context 是使用到该算法族的类，其中的 doSomething() 方法会调用 behavior()，setStrategy(in Strategy) 方法可以动态地改变 strategy 对象，也就是说能动态地改变 Context 所使用的算法。

![](../../../../../../../../images/strategy_class.png)