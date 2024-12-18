package classroom;

public class ClassroomTest {
	public static void main(String[] args) {
		String[] students= {"\nEmily","\nFelix","\nChristopher","\nRachel"};
		
		Classroom classroom=new Classroom("Social 201", students);
		System.out.println(classroom);
	}
}
