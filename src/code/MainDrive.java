package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		기능1. 사용자에게 6개 숫자를 입력받아서 배열에 저장.
		Scanner scan = new Scanner(System.in);
		
		int[] userInputNumArr = new int[6];
		System.out.print("숫자 6개를 입력하세요: ");
	
			
			
			for(int i=0; i<userInputNumArr.length;i++) {
				int userInput = scan.nextInt();
				userInputNumArr[i]=userInput;
			}
		
			
			for(int i=0; i<userInputNumArr.length;i++)
				System.out.println(userInputNumArr[i]);
				
	

	
	}
}
