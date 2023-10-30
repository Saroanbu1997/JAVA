package javacode;

public abstract class Abstraclass11 {
	
	abstract void method1();
		
			public void method2() {
				System.out.println("normal method");
			}
	
}
class concrate extends Abstraclass11{
	void method1() {
		System.out.println("abstract method");
	}
	void method3(){
		System.out.println("concurate method");
	}
	
	public static void main(String[] args) {
		Abstraclass11 obj = new concrate();
		obj.method1();
		obj.method2();
		
	}

}
