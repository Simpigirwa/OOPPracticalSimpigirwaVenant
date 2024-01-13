package Com.Venant.OopPracticalStaticMethod;

public class TestStaticMethod {

	public static void main(String args[]){
		Student.change();//calling change method
		//creating objects
		Student s1 = new Student(111,"Allen");
		Student s2 = new Student(222,"Aryan");
		Student s3 = new Student(333,"Nancy");
		//calling display method
		s1.display();
		s2.display();
		s3.display();
		}
		}