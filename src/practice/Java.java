package practice;

public class Java {
	int a=10;
	static int b=20;
	
	public void show() {
		int c=30;
		System.out.println("print c:"+c);
	}

	public static void main(String[] args) {
		Java j=new Java();
		System.out.println("print a:" +j.a);
		System.out.println(("print b:" +b));
		j.show();
	}

}
