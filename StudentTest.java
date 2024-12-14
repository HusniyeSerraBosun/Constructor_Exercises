package student;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Student student=new Student();//object with default constructor.

		System.out.print("Enter student ID: ");
		//int ID=scanner.nextInt();-----------------------------> If we don't use setter,
		student.setStudentID(scanner.nextInt());				// we use these codes that
		scanner.nextLine();										//shown with arrow.
																
		System.out.print("Enter student name: ");				
		//String Name=scanner.nextLine();----------------------->
		student.setStudentName(scanner.nextLine());
		
		System.out.print("Enter student grade: ");
		//String grade=scanner.next();------------------------>
		student.setGrade(scanner.next());
			
		//Student student=new Student(ID,Name,grade);---------->							*
		
		System.out.println("----------------------");
		System.out.println("Student ID: "+student.getStudentID()+
						   "\nStudent Name: "+student.getStudentName()+
						   " \nStudent Grade: "+student.getGrade());
		scanner.close();
		
	}
	
}
