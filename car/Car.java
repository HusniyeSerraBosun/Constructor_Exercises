package car;

public class Car {
	private String brand;
	private String model;
	private String year;
	
	public Car(String brand,String model,String year) {
	
		//if brand is null or empty, then assign Unknown brand else use brand.
		this.brand=(brand==null||brand.isEmpty()) ? "Unknown brand": brand;
		
		this.model=(model==null||model.isEmpty()) ? "Unknown model" : model;
		
		this.year=(year==null||year.isEmpty()) ? "Unknown year" : year;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public String getYear() {
		return year;
	}
}
