package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		기능1. 사용자에게 6개 숫자를 입력받아서 배열에 저장.
		
		Scanner scan = new Scanner(System.in);
		int[] userInputNumArr = new int[6];

			for(int i=0; i<userInputNumArr.length;i++) {
				System.out.print(String.format("%d번째 숫자 입력: ", i+1));
				int userInput = scan.nextInt();

			}
		
	
	}
}
