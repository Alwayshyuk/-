package practice;

@FunctionalInterface
interface MyFunction {
	void myMethod();
}
class Outer {
	int val = 10;	//Outer.this.val
	
	class Inner {
		int val = 20; //this.val
		
		void method(int i) {
			int val = 30;
//			i = 10;	//에러. 상수의 값은 변경 불가
			
			MyFunction f = () -> {
				System.out.println("i: " + i);	//100
				System.out.println("val: " + val);	//30
				System.out.println("this.val: " + this.val);	//20
				System.out.println("Outer.this.val: " + Outer.this.val);	//10
			};
			f.myMethod();
		}
	}
}
public class LambdaEx3 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}
}
