package com.algorithm.singleton;

public class Singleton {
	/*
	//1. 饿汉式，饿汉式,线程安全 但效率比较低 。。。一上来就new对象，真够饿的
	private Singleton(){}
	
	private static final Singleton Singleton = new Singleton();
	
	public static Singleton getInstance(){
		return Singleton;
	}
	*/
	
	/*
	//2. 懒汉式，非线程安全 。。。等老板来叫了，才去做事，小子真懒
	private Singleton(){}
	
	private static Singleton Singleton = null;
	
	public static Singleton getInstance(){
		if(Singleton==null){
			Singleton = new Singleton();
		}
		return Singleton;
	}
	*/
	
	/*
	//3. 懒汉式，线程安全，但效率很低 。。。99%情况下不需要同步
	private Singleton(){}
	
	private static Singleton Singleton = null;
	
	public static synchronized Singleton getInstance(){	//方法上加synchronized同步
		if(Singleton==null){
			Singleton = new Singleton();
		}
		return Singleton;
	}
	*/	
	
	/*
	//4. 双重校验锁
	private Singleton(){}
	
	//JDK5以后，为避免双重检查锁存在的问题，加入了volatile，是保证变量修改的可见性
	private static volatile Singleton Singleton = null;
	
	public static Singleton getInstance(){
		if(Singleton==null){
			synchronized(Singleton.class){		//加synchronized关键字同步
				if(Singleton==null){
					Singleton = new Singleton();
				}
			}
		}
		return Singleton;
	}
	*/
	
	/*
	//5. 静态内部类
	private Singleton(){}
	
	private static class SingletonHolder {
		private static final Singleton singleton = new Singleton();
	}
	
	public static final Singleton getInstance(){
		return SingletonHolder.singleton;
	}
	*/
	
//	//6. 枚举
//	private static enum EnumSingleton{
//        INSTANCE;
//		
//        private Singleton singleton;
//        
//        //JVM会保证此方法绝对只调用一次
//        private EnumSingleton(){
//            singleton = new Singleton();
//        }
//        
//        public Singleton getInstance(){
//            return singleton;
//        }
//    }

}
