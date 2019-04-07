package com.springmvc.headfrist.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试 序列化对单例的破坏
 * <p>Title:SerializableDemo</p>
 * @author liuwanlin
 * @date 2017年11月29日上午11:48:26
 */
public class SerializableDemo {
	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		// 输出流   字节
      ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("tempFile"));
      // 调用writeObject的方法将字节写到流中  
      obj.writeObject(SingletonSerializable.getSingletonSerializable());
      File file = new File("tempFile");
      // 输入流
      ObjectInputStream outputStream= new ObjectInputStream(new FileInputStream(file));
      SingletonSerializable newInstance=(SingletonSerializable) outputStream.readObject();
      System.out.println( newInstance== SingletonSerializable.getSingletonSerializable());
      obj.flush();
      obj.close();
      outputStream.close();
	}
	
	
	// false 
	
	// 现在 解释为啥序列化单例模式会被 破坏
	// 在调用 outputStream.readObject();中 源码     obj = desc.isInstantiable() ? desc.newInstance() : null; 
	// 这里创建的这个obj对象，就是本方法要返回的对象，也可以暂时理解为是ObjectInputStream的readObject返回的对象。
	// isInstantiable：如果一个serializable/externalizable的类可以在运行时被实例化，那么该方法就返回true。
	//	desc.newInstance：该方法通过反射的方式调用无参构造方法新建一个对象。
	//
	//	所以。到目前为止，也就可以解释，为什么序列化可以破坏单例了？
	//
	//	答：序列化会通过反射调用无参数的构造方法创建一个新的对象
	
	
	// 所以，为了防止序列化破坏单例模式   只要在SingletonSerializable类中定义readResolve就可以解决该问题：
	
	// private Object readResolve() {
	//    return singleton;
	//  }
	
	//hasReadResolveMethod:如果实现了serializable 或者 externalizable接口的类中包含readResolve则返回true

	//invokeReadResolve:通过反射的方式调用要被反序列化的类的readResolve方法。
	
	
}
