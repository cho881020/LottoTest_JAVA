package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		조경진 작업칸
		
//		기능 1. 사용자에게 6개의 숫자를 입력받아서 배열에 저장.
//		작성 완료하면 커밋 후 푸시.
		
//		6칸 짜리 배열 생성.
		int[] userInputArr = new int[6];
		
		Scanner scan = new Scanner(System.in);
		
		
		for (int i=0 ; i < userInputArr.length ; i++) {
			System.out.println(String.format("%d번째 숫자 입력 : ", i+1));
			
			userInputArr[i] = scan.nextInt();
		}
		
		
		
	}
}









