package betterJPAMS;

public class Student
{
	boolean isCurrentStudent;
	int gradeLevel;
	String idNumber;
	String name;
	String gender;
	int age;
	double gpa;
	
	public Student()
	{
		isCurrentStudent = false;
		gradeLevel = 0;
		idNumber = "S0000000";
		name = "";
		gender = "";
		age =0;
		gpa = 0.0;
	}
	public Student (boolean isCurrentStudent, int gradeLevel, String gender, int age, String idNumber, double gpa, String name)
	{
		this.isCurrentStudent = isCurrentStudent.";
	}
	
	
	
	
	public String toString()
	{
		String str = "This person is not a current student.";
		if(isCurrentStudent)
		{	
			str = "Name: " + name + " gradeLevel " + " gender " + " age " + " gpa " + "  idNumber " + " isCurrentStudent ";		
		}
			return str;
	}
