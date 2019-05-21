# 单例模式

## 常见写法

### 饿汉式

```java
public class HungerManModel {

    private HungerManModel(){}

    private static HungerManModel instance=new HungerManModel();
    
}
```

- 优点：简单，线程安全
- 缺点：不管用不用先new出来占用内容

### 懒汉式

#### 简单懒汉式

```java
public class LazyManModel {

    private LazyManModel(){}

    private static LazyManModel instance;

    public static LazyManModel getInstance(){
        if (instance==null){
            instance=new LazyManModel();
        }
        return instance;
    }
}
```

- 优点：在用的时候进行实例化
- 缺点：线程不安全

#### 双重检查锁式

简单懒汉式的升级版

```java
public class DoubleLockedCheckModel {
    private DoubleLockedCheckModel(){}

    private static DoubleLockedCheckModel instance;

    public static DoubleLockedCheckModel getInstance(){
        if (instance==null){
            synchronized (DoubleLockedCheckModel.class){
                if(instance==null){
                    instance=new DoubleLockedCheckModel();
                }
            }
        }
        return instance;
    }
}
```

- 优点：线程安全的懒汉式
- 缺点：锁有性能影响

#### 内部类式

```java
public class InnerClassModel {

    private InnerClassModel(){}

    public static final InnerClassModel getInstance(){
        return LazyHolder.instance;
    }
    
    static class LazyHolder{

        public static final InnerClassModel instance=new InnerClassModel();
    }

}
```

- 优点：天生线程安全
- 缺点：第一次加载时反应不够快

### 注册式

#### 枚举式

```java
public enum EnumModel {
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumModel getInstance(){
        return INSTANCE;
    }
}
```

- 优点：从JDK层面防止反射和序列化，同时又是线程安全的
- 缺点：暂时没想到

#### 容器注册式

```java
public class RegistryModel {

    private static final Map<String, Object> ioc = new ConcurrentHashMap<>();

    private RegistryModel() {
    }

    public static RegistryModel getInstance(String className) {
        return (RegistryModel) getBean(className);
    }

    public static Object getBean(String className) {
        synchronized (ioc) {

            if (!ioc.containsKey(className)) {
                try {
                    Class<?> clazz = Class.forName(className);
                    Object obj=clazz.newInstance();
                    ioc.put(className, obj);
                    return obj;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            } else {
                return ioc.get(className);
            }
        }
        return null;
    }
}
```

- 优点：适合大量单例对象的管理
- 缺点：没有想到

## 单例的防御

破坏单例的主要式两种方式：

- 反射

  通过类类型强制实例化

  - 解决方案：在私有构造器中进行判断，如果已经实例化过，则抛出异常

- 序列化，反序列化

  通过将对象写入文件，在还原的方式，会产生多个对象

  ```java
  FileOutputStream fos = null;
  try {
  fos = new FileOutputStream("SeriableSingleton.obj");
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(s2);
  oos.flush();
  oos.close();
  FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
  ObjectInputStream ois = new ObjectInputStream(fis);
  s1 = (SeriableSingleton)ois.readObject();
  ois.close();
  System.out.println(s1);
  System.out.println(s2);
  System.out.println(s1 == s2);
  } catch (Exception e) {
  e.printStackTrace();
  }
  ```

  序列化和反序列化是通过上面的代码进行的

  其中反序列化是`s1 = (SeriableSingleton)ois.readObject();`这一步完成的

  readObject方法中调用readObject0()方法,此方法是用来对各中类型的对象反序列化操作进行处理的

  具体类型，处理逻辑不同

  - 解决方案：比如对象类型的反序列化，可以通过下面的方法进行

    ```java
    private Object readResolve(){
    return INSTANCE;
    }
    ```

    在readObject0方法中，会对对象中的是否有此方法进行判断，有则覆盖原先创建的实例，没有则不覆盖



## 内部类的执行逻辑

```sequence
Title:内部类执行逻辑
客户端->单例类: 调用获取实例的方法 
单例类->单例类: 初始化静态块和静态字段
单例类->单例类: 执行获取实例的方法
单例类->内部类: 获取内部类的静态属性
内部类->内部类: 初始化静态块和静态字段
内部类->内部类: 执行获取实例的方法
内部类->单例类: 返回静态字段
单例类->客户端: 返回实例对象
```

