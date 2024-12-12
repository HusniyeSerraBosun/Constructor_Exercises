package dog;

public class Dog {
	private String name;
	private String breed;
	
	public Dog() {
		name="unknown";
		breed="unknown";
	}
	public Dog(String name,String breed) {
		this.name=name;
		this.breed=breed;
	}
	/*public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}*/
	public static void main(String[] args) {
		Dog dog=new Dog("Berry","King Charles Spaniel");
		
		System.out.println("Dog's Name: "+dog.name);
		System.out.println("Dog's Breed: "+dog.breed);
	}
}
