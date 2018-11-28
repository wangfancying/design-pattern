#### 2、策略模式

策略模式属于对象的行为模式，其用意为针对一组算法，将每一个算法封装到具有共同接口的独立类中，从而使得他们可以相互替换
策略模式是对算法的包装，使得把算法的责任和算法本身分开。

模式涉及三个角色：
* 环境(Context)角色：持有一个Strategy的引用。
* 抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
* 具体策略(ConcreteStrategy)角色：包装了相关的算法或行为。

源代码可以看`v1包`里面，`抽象策略(Strategy)角色`为`MemberStrategy.java`，抽象的图书折扣类，用于计算图书折扣后的价格，
`具体策略(ConcreteStrategy)角色`为`IntermediateMemberStrategy.java`和`PrimaryMemberStrategy.java`（中级会员折扣类和初级会员折扣类）
`环境(Context)角色`为`Price.java`持有一个策略引用。类图参考`v1.uml`


##### 关于v2版本的代码
这段代码将`环境(Context)角色`去掉了，不再会持有一个策略的引用，降低了耦合度。
`抽象策略(Strategy)角色`为`Comparator.java`，抽象的排序类，由于排序各种对象，`具体策略(ConcreteStrategy)角色`为`HightComparator.java`
根据`Person`的age大小排序。`SortUtils`为排序的工具类，不会持有策略的引用，通过方法的参数传入。类图参考`v2.uml`