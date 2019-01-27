package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		기능1. 사용자에게 6개의 숫자를 입력받아서 배열에 저장.
//		작성 완료하면 커밋후 푸시.
		
		int[] userInput = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<userInput.length; i++) {
			
			System.out.print(String.format("%d번째 번호를 입력하세요 : ", i+1));
			
			userInput[i] = sc.nextInt();
			System.out.println(userInput[i]);
		}

		sc.close();
	}
}
