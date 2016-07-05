package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result = 0;

		for (int i = 0; i <= num; i++) {
			result = result + i;
		}

		System.out.println("0부터 " + num + "까지의 합은 : " + result);
		scanner.close();
	}
}
