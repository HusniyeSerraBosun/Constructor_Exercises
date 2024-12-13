package book;

public class Book_test {
	public static void main(String[] args) {
		Book bookDefault=new Book();
		System.out.println("First Book ");
		System.out.println("-------------");
		System.out.println("Title: "+bookDefault.getTitle()+
						   "\nAuthor: "+bookDefault.getAuthor()+
						   "\nPrice: "+bookDefault.getPrice());
		
		Book book1=new Book("1984","George Orwell");
		System.out.println("\nSecond Book ");
		System.out.println("-------------");
		System.out.println(book1.toString());
		/*System.out.println("Title: "+book1.getTitle()+
						   "\nAuthor: "+book1.getAuthor()+
						   "\nPrice: "+book1.getPrice());*/
		
		Book book2=new Book("The Midnight Library","Matt Haig",143.95);
		System.out.println("\nThird Book ");
		System.out.println("-------------");
		System.out.println(book2.toString());
		/*System.out.println("Title: "+book2.getTitle()+
						   "\nAuthor: "+book2.getAuthor()+
		                   "\nPrice: "+book2.getPrice());*/
	}
}
