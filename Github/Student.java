public class Student{
	String name;
	int rollNo;
	int year;
	String dept;
	public void printStudent(String name,int rollNo,int year,String dept){
		System.out.println("Name = " + name + "\nRollNo. = " + rollNo + "\nYear = " + year + "\nDepartment = " + dept);
	}
	public static void main(String args[]){
		Student s = new Student();
		s.printStudent("Omkar",71,3,"IT");
	}
}