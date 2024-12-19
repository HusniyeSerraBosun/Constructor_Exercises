package singletonPattern;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton instanceA=Singleton.getInstance();
		
		Singleton instanceB=Singleton.getInstance();
				
		if (instanceA==instanceB) {
			System.out.println("Both instance are the same.");
		}else {
			System.out.println("Instances are different.");
		}
		//NOTE: You can get different results by opening the comment block in singleton.java
	}
}
