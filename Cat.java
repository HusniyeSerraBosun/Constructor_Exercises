package cat;
public class Cat {
	private String name;
	private int age;

	public Cat() {
		this.name="Cinnamon";
		this.age=2;
	}
	public String getname() {		
		return name;
	}
	public int getage() {
		return age;
	}
	public static void main(String[] args) {
		Cat cat=new Cat();
		
		System.out.println("Name: "+cat.getname()+"\nAge: "+cat.getage());
	}
}
