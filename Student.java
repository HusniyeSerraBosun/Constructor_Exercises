package student;

public class Student {
	private int studentID;
	private String studentName;
	private String grade;
	
	public Student() {
		studentID=0;
		studentName="unknown";
		grade="unknown";
	}
	public Student(int studentID,String studentName,String grade) {
		this.studentID=studentID;
		this.studentName=studentName;
		this.grade=grade;
	}
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getGrade() {
		return grade;
	}
	public void setStudentID(int studentID) {
		this.studentID=studentID;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
}
