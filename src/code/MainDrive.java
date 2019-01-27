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
				
//				범위와 중복검사를 모두 (and) 통과한다면
				if(rangeOk && duplOk) {
//					배열의 입력 값을 저장.
					userInputNum[i] = userInput;
//					안내 메세지 출력
					System.out.println("다음 숫자를 입력하세요.");
//					다음 숫자를 입력받기 위해 while문을 탈출.
					break;
				}
			}
		}
			
//		기능3. 컴퓨터가 6개의 숫자를 저장. 1~45인지, 중복이 아닌지 검사 .
//		당첨번호 6개를 저장할 배열을 생성.
		int[] lottoAnswerArr = new int[6];
//		6개의 당첨번호를 만들기 위한 반복문.
		for (int i = 0; i < lottoAnswerArr.length; i++) {
//			조건을 만족시킬 때까지 다시 만들도록 무한반복.
			while(true) {
				
				double randomVal = Math.random();
//				1 <= randomVal*45 + 1 <46 : 1~45의 값중 랜덤. 및 형변환.
				int randomNum = (int)(randomVal*45 + 1);
				
//				랜덤으로 나온 값이 1~45 인지? 검사를 안해도 되겠다!
//				boolean rangeOk 
				
//				이미 만들어져있는지? 검사해야함. = 중복인지
				boolean duplOk = true;
				for (int j = 0; j < lottoAnswerArr.length; j++) {
					if(lottoAnswerArr[i] == randomNum) {
//						이번에 뽑은 번호가 중봅이다.
						duplOk = false;
						break;
					}
				}
//				중복 여부가 괜찮다면
				if(duplOk) {
//					랜덤으로 생성한 번호를 당첨번호로 등록.
					lottoAnswerArr[i] = randomNum;
//					다음 숫자를 뽑으러 이동.
					break;
				}
				
				
			}
		}

		for (int i = 0; i < userInputNum.length; i++) {
			
			System.out.println(userInputNum[i]);
		}
	}
}
