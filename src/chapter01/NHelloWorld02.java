package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print("숫자를 입력하세요 : ");
		int count= scanner.nextInt();
		
		for(int i=0;i<count;i++){
			System.out.println("Hello World");
		}
		
		scanner.close();

	}

}
