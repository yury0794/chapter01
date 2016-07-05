package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		boolean b = true;
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + "x" + num2 + "=" + num1*num2 + b);
		
		float f = 3.14f;
		double d = 3.14;		
		String s = "Hello World";
		
		num1 = 20;
		
		// 상수는 관례적으로 전부 대문자로 쓴다.
		final double PI = 3.14;
		double area = 3 * 3 * PI;
	}
}
