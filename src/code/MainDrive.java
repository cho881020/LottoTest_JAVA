package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		1) 사용자에게 6개의 숫자를 입력받아서 배열에 저장

		int[] userInputNumbers = new int[6];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < userInputNumbers.length; i++) {

				System.out.print(String.format("%d번째 숫자입력 : ", i + 1));

				userInputNumbers[i] = scan.nextInt();
		}
	}
}
