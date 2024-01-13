package Com.Venant.OopPractical;

public class Student {

	int id;
	String name; 
	int rollno;
	
	void insertRecord(int r, String n){
	rollno=r;
	name=n;
	}
	void displayInformation()
	{
	System.out.println(rollno+" "+name);
	}
	public static void main(String args[]){ 
		Student s1=new Student();
		System.out.println(s1.name); 
	} 
}
