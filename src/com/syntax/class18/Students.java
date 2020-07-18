package com.syntax.class18;

public class Students {
/*Create a Class called Students
 *Create three  variables  studentName , studentID  and  numberOfStudents
 *Create three objects of the Students Class 
 *Set the value for  studentName , studentID and increment 
 *the numberOfStudents for each object
 *Print out  total number of students 
 */
	String studentName;
	int studentId;
	static int numberOfStudents;
	
	public static void main(String []args) {
		Students stu1 = new Students();
		stu1.studentName="Madeeha";
		stu1.studentId=0707763;
		Students.numberOfStudents++;
		
		Students stu2 = new Students();
		stu2.studentName="Yadco";
		stu2.studentId=0707764;
		Students.numberOfStudents++;
		
		Students stu3 = new Students();
		stu3.studentName="Saria";
		stu3.studentId=0707763;
		Students.numberOfStudents++;
		
		System.out.println("Total number of students are "+Students.numberOfStudents);
		
	
}
	
}

