package org.hitech.model;


public class Course {
	int courseID;
	String courseName;
	double price;
	
	public Course(int cID,String cName,double p)
	{
		this.courseID=cID;
		this.courseName=cName;
		this.price=p;
		
	}
	
	//Getter and setter Method 
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	//toString Method 
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", price=" + price + "]";
	}

	//hashcode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseID;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	// equal method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseID != other.courseID)
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public static void main(String[] args) {
		
	}

}

