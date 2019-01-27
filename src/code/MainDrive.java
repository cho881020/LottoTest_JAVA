package code;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class MainDrive {

	public static void main(String[] args) {
		//오슬기의 브런치
		
//		기능1. 사용자에게 6개의 숫자를 입력받아서 배열에 저장.
//		작성 완료하면 커밋 후 푸시.
		
		int[] userInputNum = new int[6];
		int userInput ;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < userInputNum.length; i++) {
			System.out.println(String.format("%d 번째 입력 : ", i+1 ));
			userInput = scan.nextInt();
			userInputNum[i] = userInput;
		}
		for (int i = 0; i < userInputNum.length; i++) {
			
			System.out.println(userInputNum[i]);
		}
	}
}
