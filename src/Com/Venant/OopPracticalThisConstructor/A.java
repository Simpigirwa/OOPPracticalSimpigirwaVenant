package Com.Venant.OopPracticalThisConstructor;

public class A {
	A(){
		System.out.println("hello a");
		}
	
	 A(int x){
	this();
	System.out.println(x);
}
}