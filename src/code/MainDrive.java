package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		박소정의 작업칸
		
//		기능1. 사용자에게 6개의 숫자를 입력받아서 배열에 저장.
//		작성 완료하면 커밋 후 푸시
		
		int[] userLottoNumArray = new int[6];
		
		Scanner scan = new Scanner(System.in);		
		
		for (int i=0 ; i < userLottoNumArray.length ; i++) {
			
			System.out.print(String.format("%d번째 숫자를 입력 : ", i+1));
			
			userLottoNumArray[i] = scan.nextInt();
		}
		
		for (int i=0 ; i < userLottoNumArray.length ; i++) {
			System.out.println(userLottoNumArray[i]);
		}
		
	}
}
