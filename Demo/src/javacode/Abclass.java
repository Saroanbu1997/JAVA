package javacode;
 abstract class Abstraclass1 {
	
	abstract void method1();
		
			public void method2() {
				System.out.println("normal method");
			}
	
}
class concrate1 extends Abstraclass1{
	void method1() {
		System.out.println("abstract method");
	}
	void method3(){
		System.out.println("concurate method");
	}
}
public class Abclass {

	public static void main(String[] args) {
		
		Abstraclass1 obj = new concrate1();
		obj.method1();
		obj.method2();
		System.out.println("**************");
		concrate1 obj1= new concrate1();
		obj1.method3();
		obj.method1();
		obj.method2();
	}

}
