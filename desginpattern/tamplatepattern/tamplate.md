# 定义

定义一个操作中的算法框架，而将一些步骤延迟到子类中实现。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

此模式有两种方法：

1. 基本方法：由子类实现，并且在模板方法中调用。
2. 模板方法：可以有一个或几个方法，一般是一个具体方法，也就是一个框架，实现对节本方法的调用，完成固定的逻辑

# 优点

- 封装不可变，拓展可变
- 提取公共部分代码，便于维护
- 行为由父类控制，子类实现

# 缺点

在复杂项目中降低代码的可读性

# 适用范围

- 多个子类有公有方法，并且逻辑基本相同时
- 重要复杂的算法，可以把核心算法设计为模板方法，其余细节由子类实现
- 重构时，把相同代码抽取到父类中，通过通过钩子方法约束其行为

# 注意事项

- 一般模板方法都会用final修饰方式被覆盖

# 思考

除了继承实现模板方式模式以外还有什么办法？

在jdk8以后，接口出现了默认方式，可以通过此特性，在默认方式中实现流程，在实现类中实现每个流程的细节.
此方式有个缺点，就是默认方法可以被覆盖.