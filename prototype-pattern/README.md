#### 原型模式

原型模式属于对象的创建模式。通过给出一个原型对象来指明所有创建的对象的类型，然后用复制这个原型对象的办法创建出更多同类型的对象。这就是选型模式的用意。

原型模式要求对象实现一个可以“克隆”自身的接口，这样就可以通过复制一个实例对象本身来创建一个新的实例。这样一来，通过原型实例创建新的对象，
就不再需要关心这个实例本身的类型，只要实现了克隆自身的方法，就可以通过这个方法来获取新的对象，而无须再去通过new来创建。

原型模式有两种表现形式：
* 简单形式
* 登记形式

代码里面`v1`实现了简单形式，`v2`实现了登录形式

##### 关于深复制
目前流行的较为公用认可的工具类：

1. Apache的两个版本：（反射机制）
```
org.apache.commons.beanutils.PropertyUtils.copyProperties(Object dest, Object orig)
org.apache.commons.beanutils.BeanUtils.copyProperties(Object dest, Object orig)
```

 2. Spring版本：（反射机制）
 ```
 org.springframework.beans.BeanUtils.copyProperties(Object source, Object target, Class editable, String[] ignoreProperties)
```
 3. cglib版本：（使用动态代理，效率高）
 ```
 net.sf.cglib.beans.BeanCopier.copy(Object paramObject1, Object paramObject2, Converter paramConverter)
 ```