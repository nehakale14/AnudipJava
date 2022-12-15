package org.hitech.model;

public class Student {
	int studentID;
	String studentName;
	String qualification;
	
	public Student(int sID,String sName,String string)
	{
		this.studentID=sID;
		this.studentName=sName;
		this.qualification=string;
	}
	//Getter and setter Method 
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	//toString Method
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", qualification=" + qualification
				+ "]";
	}
	//hashCode Method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + studentID;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}
	//equal method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (studentID != other.studentID)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		
	}

}
