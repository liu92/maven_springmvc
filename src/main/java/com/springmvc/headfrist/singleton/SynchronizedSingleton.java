package com.springmvc.headfrist.singleton;

public class SynchronizedSingleton {
    /**
     * 一个静态的实例
      */
    private static SynchronizedSingleton synchronizedSingleton;

    /**
     * 私有化构造函数
     */
    private SynchronizedSingleton(){}

    /**
     * 给出一个公共的静态方法返回一个单一实例
     * @return
     */
    public static SynchronizedSingleton getInstance(){ 
    	/**
    	 * 当前实例为null，也就是实例还未创建时才进行同步，
    	 * 否则就直接返回，这样就节省了很多无谓的线程等待时间，
    	 * 值得注意的是在同步块中，我们再次判断了synchronizedSingleton是否为null，
    	 * 
    	 *假设我们去掉同步块中的是否为null的判断，有这样一种情况，
    	 *假设A线程和B线程都在同步块外面判断了synchronizedSingleton为null，
    	 *结果A线程首先获得了线程锁，进入了同步块，然后A线程会创造一个实例，
    	 *此时synchronizedSingleton已经被赋予了实例，A线程退出同步块，
    	 *直接返回了第一个创造的实例，此时B线程获得线程锁，也进入同步块，
    	 *此时A线程其实已经创造好了实例，B线程正常情况应该直接返回的，
    	 *但是因为同步块里没有判断是否为null，直接就是一条创建实例的语句，
    	 *所以B线程也会创造一个实例返回，此时就造成创造了多个实例的情况。
    	 */
        if (synchronizedSingleton == null) { 
            synchronized (SynchronizedSingleton.class) { 
                if (synchronizedSingleton == null) { 
                    synchronizedSingleton = new SynchronizedSingleton(); 
                } 
            } 
        } 
        return synchronizedSingleton; 
    } 
    
    /**
     * 上述：这种做法与上面那种最无脑的同步做法相比就要好很多了，因为我们只是在当前实例为null，
     *也就是实例还未创建时才进行同步，否则就直接返回，这样就节省了很多无谓的线程等待时间，
     *值得注意的是在同步块中，我们再次判断了synchronizedSingleton是否为null，解释下为什么要这样做。
     * 假设我们去掉同步块中的是否为null的判断，有这样一种情况，
     * 假设A线程和B线程都在同步块外面判断了synchronizedSingleton为null，
     * 结果A线程首先获得了线程锁，进入了同步块，然后A线程会创造一个实例，
     * 此时synchronizedSingleton已经被赋予了实例，A线程退出同步块，
     * 直接返回了第一个创造的实例，此时B线程获得线程锁，也进入同步块，此时A线程其实已经创造好了实例，
     * B线程正常情况应该直接返回的，但是因为同步块里没有判断是否为null，
     * 直接就是一条创建实例的语句，所以B线程也会创造一个实例返回，此时就造成创造了多个实例的情况。
     *  走到现在，上述双重加锁的示例看起来貌似是没有问题了，但其实仍然是有问题的，
     *  因为虚拟机在执行创建实例的这一步操作的时候，其实是分了好几步去进行的，
     *  也就是说创建一个新的对象并非是原子性操作。在有些JVM中上述做法是没有问题的，
     *  但是有些情况下是会造成莫名的错误。
     *    首先要明白在JVM创建新的对象时，主要要经过三步。
            1.分配内存
            2.初始化构造器
            3.将对象指向分配的内存的地址
               这种顺序在上述双重加锁的方式是没有问题的，
                因为这种情况下JVM是完成了整个对象的构造才将内存的地址交给了对象
            。但是如果2和3步骤是相反的，就会出现问题了。
              因为这时将会先将内存地址赋给对象，针对上述的双重加锁，
              就是说先将分配好的内存地址指给synchronizedSingleton，
              然后再进行初始化构造器，这时候后面的线程去请求getInstance方法时，
              会认为synchronizedSingleton对象已经实例化了，直接返回一个引用。
              如果在初始化构造器之前，这个线程使用了synchronizedSingleton，就会产生莫名的错误。
             所以我们在语言级别无法避免错误的发生，我们只有将该任务交给JVM，所以有一种比较标准的单例模式。如下所示。
     */
    //------------------------------------------------
     /* public static Singleton getInstance(){
    	  return Singleton.singleton;
    	 }

    	 private static class Singleton{
    	  
    	  protected static Singleton singleton = new Singleton();
    	  
    	 }*/
    //**************
    /**
     *  首先来说一下，这种方式为何会避免了上面莫名的错误，
     *  众所周知，一个类的静态属性只会在第一次加载类时会被初始化，
     *  这是JVM级别的限制，所以我们无需担心初始化进行一半的时候，
     *  有人使用了这个实例，而且由于静态变量只初始化一次，
     *  所以singleton仍然是单例的。另外我们也不需要担心并发所产生的问题，
     *  因为JVM会帮我们保证初始化只进行一次。上面这种写法是我们使用内部类作为单例，
     *  这样不太符合我们的习惯。我们改为以下形式。
     */
      
  
    
   /* public static Singleton getInstance(){ 
        return SingletonInstance.instance; 
    } 
     
    private static class SingletonInstance{ 
         
        static Singleton instance = new Singleton(); 
         
    } */
    
    
} 

  
