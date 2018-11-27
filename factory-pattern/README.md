#### 1、工厂模式

在面向对象编程中，我们通常使用new关键字创建一个对象，但是在使用new 时，我们需要操心这个类创建过程中的一系列步骤，
这个时候，我们可以用工厂，利用工厂创建我们需要的对象，而不需要关系类的创建过程。

工厂模式分为：
* 简单工厂模式
* 工厂方法模式
* 抽象工厂模式

##### 简单工厂模式
简单工厂模式有称作静态工厂方法模式，使用工厂的静态方法创建对象，静态方法根据传值的不同创建不同的对象。

`simplefactory`：实现了简单工厂模式

`Fruit`抽象水果类，`Apple`和`banana`为具体的水果类，`SimpleFacotry`为简单工厂，使用静态方法创建各种水果。
具体类图如下：
![simplefactory](simplefactory.png)

##### 工厂方法模式
工厂方法模式是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。核心工厂不在负责产品的创建。

`methodfactory`：实现了工厂方法模式

`Fruit`抽象水果类，`Apple`和`banana`为具体的水果类，`FruitFactory`为抽象工厂接口，`BananaFactory`和`AppleFactory`为具体工厂实现类
具体类图如下：
![methodfactory](methodfactory.uml)
