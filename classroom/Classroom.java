package classroom;

public class Classroom {
	private String className;
	private String[] students;
	
	public Classroom(String className,String[]student){
		this.className=className;
		this.students=student;
	}
	
	@Override
	public String toString() {
		StringBuilder classroom=new StringBuilder();
		classroom.append("Class Name: ").append(className).append("\nStudents: ");
		
		for(String student: students) {
			classroom.append(student).append(" ");
		}
		return classroom.toString();
	}
}
