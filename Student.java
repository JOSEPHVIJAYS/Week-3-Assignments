package bank;

public class Student {
	public void getStudentInfo() 
	{
		System.out.println(" **** GET STUDENT INFORMATION ****");
		
	}
	public void getStudentInfo(String y , int x) 
	{
		String Name = y;
		int id = x;
		
		System.out.println(" NAME =" +Name);
		System.out.println(" id number =" +id);
	}
	public void getStudentInfo(String x, String y) 
	{
		String EmailId =x;
		String PhoneNumber = y;
		System.out.println(" EMAIL ID = "+EmailId);
		System.out.println(" PHONENUMBER = "+PhoneNumber);
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.getStudentInfo();
		student.getStudentInfo("nakulesh", 1601);
		student.getStudentInfo("nakul@gmail.com", "6754865490");
	}

}
