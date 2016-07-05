package chapter01;

public class ArrayTest {

	public static void main(String[] args) {
		char[] c; // char c[];
		c = new char[3];
		
		c[0] = 'S';
		c[1] = 'K';
		c[2] = 'U';
		
		int[] scores = {100, 90, 20, 30, 40};
		System.out.println(scores.length);
		
		int sum = 0;
		for(int i=0;i<scores.length;i++){
			sum = sum + scores[i];
		}
		
		// 확장 for문
		int sum2 = 0;
		for(int score : scores){
			sum2 += score;
		}
			
		System.out.println(sum + ", " + sum2);
		
		
	}
}