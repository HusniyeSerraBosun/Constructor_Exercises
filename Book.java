package book;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book() {
		title="unknown";
		author="unknown";
		price=0;
	}
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
		price=125;
	}
	public Book(String title,String author,double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return "Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nPrice: "+getPrice();
	}
	
}
