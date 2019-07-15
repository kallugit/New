package practice;

public class C {
 private int a ;
 
 C(int a){
	 this.a=a;
 }
 public void methodC() {
	 System.out.println("inside method c");
 }
}
class D{
	public static void main(String[] args) {
		C objc= new C(20);
		//objc.methodC();
		//.out.println("value of c:" +objc.c);
		System.out.println("hello");
	}
}
