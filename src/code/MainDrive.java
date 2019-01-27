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

//			기능2. 6개의 숫자를 입력받을 때, 1~45인지, 중복을 검사해서 OK일 때만 배열에 저장.
			while(true) {
				System.out.println(String.format("%d 번째 입력 : ", i+1 ));
				
//				입력값을 바로 배열에 넣지않고, 별개 변수에 임시 저장.
				userInput = scan.nextInt();
				
//				입력값이 1~45여야 true로 저장.
				boolean rangeOk = 1 <= userInput && userInput <=45;
//				중복 검사 결과 저장. 기본 전제는 일단 true로 설정.
				boolean duplOk = true;
				
//				저장된 배열을 다시 돌아본다.
				for (int j = 0; j < userInputNum.length; j++) {
//					하나라도 지금 입력하는 값과 같다면 
					if(userInputNum[j] == userInput) {
//						중복 검사를 통과하지 못한다.
						duplOk = false;
//						하나라도 걸렸으면 더 볼 필요가 없다.
						break;
					}
					
				}
				
				if(rangeOk && duplOk) {
					userInputNum[i] = userInput;
					System.out.println("다음 숫자를 입력하세요.");
					break;
				}
			}
		}
			
		

		for (int i = 0; i < userInputNum.length; i++) {
			
			System.out.println(userInputNum[i]);
		}
	}
}
