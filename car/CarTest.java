package car;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1=new Car("Mercedes","S-Class","2020");
		
		System.out.println("First Car:"+"\n---------------"+"\nBrand: "+car1.getBrand()+
						   "\nModel: "+car1.getModel()+"\nYear: "+car1.getYear()+"\n");
		
		
		Car car2=new Car("","","");
		
		System.out.println("Second Car:"+"\n---------------"+"\nBrand: "+car2.getBrand()+
				   "\nModel: "+car2.getModel()+"\nYear: "+car2.getYear());
		
	}

}
