package org.hitech.dao;
import java.util.HashMap;
import org.hitech.model.Course;
import org.hitech.model.Student;

public class Student_Course_DAO {
	
	static void addStudentCourseDetails(Student s,Course c)
	{
		HashMap<Student, Course> hashMap = null;
		hashMap.put(new Student(1,"Neha","ten"), new Course(101, "Java",250));
		
	}
	
	static void getStudentCourseDetails()
	{
		
	}
	
	void deleteStudentCourseDetails()
	{
		
	}

	public static void main(String[] args) {
		HashMap<Student,Course> hashMap=new HashMap<>();
		
		hashMap.put(new Student(1,"Neha","ten"), new Course(101, "Java",250));
		
		System.out.println(hashMap);
		

	}

}
