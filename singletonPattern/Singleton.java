package singletonPattern;

public class Singleton {
	
	private static Singleton instanceSingleton=null;
	
	private Singleton() {
		System.out.println("Singleton instance created.");
	}
	
	public static Singleton getInstance() {
		
		if (instanceSingleton==null) {
			instanceSingleton=new Singleton();
		}
		//instanceSingleton=new Singleton(); //// A new Singleton instance is created each time it is called.
		return instanceSingleton;
	}
}
