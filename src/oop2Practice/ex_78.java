package oop2Practice;

public class ex_78 {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.new Inner().method1();
	}

}

class Outer{
	
	int value = 10;
	
	class Inner{
		
		int value = 20;
		void method1() {
			
			int value = 30;
			
			System.out.println(new Outer().value);
			System.out.println(new Inner().value);
			System.out.println(value);
			
		}
	}
}
