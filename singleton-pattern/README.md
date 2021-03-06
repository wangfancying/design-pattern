#### 单例模式
作为对象的创建模式，单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。这个类称为单例类。

有一些对象在实际使用时只需要一个，例如日志对象，打印机驱动程序对象等等，如果制造出多个这样对象，就会导致很多问题

单例模式分为：饥汉模式、懒汉模式和内部类方式

1. 饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
`v1`包中实现了饥汉模式
2. 懒汉式是典型的时间换空间,就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间
`v2`包中实现了懒汉模式，使用“双重检查加锁”的方式来实现，就可以既实现线程安全，又能够使性能不受很大的影响
3. `v3`包实现了内部类方式
4. 单元素的枚举类型已经成为实现Singleton的最佳方法。用枚举来实现单例非常简单，只需要编写一个包含单个元素的枚举类型即可。使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。
`v4`包示例枚举方式

