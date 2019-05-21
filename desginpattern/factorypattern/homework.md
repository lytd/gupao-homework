# 工厂模式

## 简单工厂模式

通过固定的工厂生产一种固定的产品

### 优点

不需要关心生产细节，消费端直接调用工厂的生产方法就可以获取产品

### 缺点

无法拓展，有新的产品后需要创建新的工厂

### UML

![简单工厂UML](https://raw.githubusercontent.com/lytd/piclib/master/gpedu/simplefactorypatternuml.png)

## 方法工厂模式

由子类实现创建产品的具体逻辑，用接口统一调用

### 优点

易拓展

### 缺点

当产品比较多时会造成类膨胀的问题

### UML

![工厂方法UML](https://raw.githubusercontent.com/lytd/piclib/master/gpedu/methodfactorypatternuml.png)

## 抽象工厂模式

### 优点

当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

### 缺点

- 会造成代码复杂度提升
- 不符合开闭原则
- 产品族扩展非常麻烦

### UML

![抽象工厂UML](https://raw.githubusercontent.com/lytd/piclib/master/gpedu/abstractfactorypatternuml.png)

### 产品族和产品等级结构

产品族：可以理解为一个工厂内能生产的所有产品

产品等级结构：可以多个工厂可以生产的同一类产品