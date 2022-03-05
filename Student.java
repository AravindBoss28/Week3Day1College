package org.student;

import java.util.Arrays;

import org.college.College;
import org.department.Department;

public class Student extends Department {
    String studentName = "";
    int studId;
    int departmentID;
    public Student(String name, int id) {
	  this.studentName = name;	
	  this.studId = id;
    }
	
    String getStudentDept(int i) {
	  String[] departments =  Department.getDepartments();	
	  departmentID = i;
	  return this.studentName + " department is " + departments[i];
	}
	
	String getStudentName() {
		return "Student name is "+studentName;
	}
	
	String getStudentId() {
		return "Student id is "+ studId;
	} 
	
	String[] getStudentInfo(int id) {
		String result[] = {"","",""};
		result[0] = (String)this.getStudentId();
		result[1] = (String)this.getStudentName();
		result[2] = (String)this.getStudentDept(id);
		return result;
		
	}
	
	String[] getStudentInfo(String Name) {
		String result[] = {""};
		result[0] = Name;
		return result;
		
	}
	
	String[] getStudentInfo(String Name, int id) {
		String result[] = {"",""};
		result[0] = Name;
		result[1] = id+" ";
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	    // able to access all the methods in college class using different class name
	   // cos of multiple inheritance
	   //  Not created object cos its always going to remain same
       System.out.println(Student.collegeName());
       System.out.println(Department.collegeCode());
       System.out.println(College.collegeRank());
       System.out.println();
       
       System.out.print("Departments available ");
       System.out.println(Arrays.toString(Department.getDepartments()));
       System.out.println();
       
       System.out.println("Student Information");
       // need to create object for student cos its non-static 
       Student s = new Student("Aravind", 1);
       Student s2 = new Student("Boss", 2);
       Student s3  = new Student("Surya", 3);
       
       System.out.println("first student info ===============>");
       System.out.println(s.getStudentName());
       System.out.println(s.getStudentId());
       System.out.println(s.getStudentDept(1));
       System.out.println(Arrays.toString(s.getStudentInfo(s.departmentID)));
       System.out.println();
       
       System.out.println("Second student info ===============>");
       System.out.println(s2.getStudentName());
       System.out.println(s2.getStudentId());
       System.out.println(s2.getStudentDept(2));
       System.out.println(Arrays.toString(s2.getStudentInfo(s2.studentName)));
       System.out.println();
       
       System.out.println("third student info ===============>");
       System.out.println(s3.getStudentName());
       System.out.println(s3.getStudentId());
       System.out.println(s3.getStudentDept(0));
       System.out.println(Arrays.toString(s3.getStudentInfo(s3.studentName, s3.studId)));
       System.out.println();
	}

}
