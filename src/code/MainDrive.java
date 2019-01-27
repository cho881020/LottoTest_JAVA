package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		남초이 작업칸
		
//		기능1. 사용자에게 6개의 숫자를 입력받아서 배열에 저장.
//		작성 완료하면 커밋 후 푸시.
		
		int[] userInputNumArry = new int[6];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0 ; i < userInputNumArry.length ; i++) {
			System.out.print(String.format("%d번째 숫자 입력 : ", i+1));
			
			userInputNumArry[i] = scan.nextInt();
			
			
		}
		
		
	}
}
