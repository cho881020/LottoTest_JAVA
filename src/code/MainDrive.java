package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		김성일 작업칸
		
//		기능1. 사용자에게 6개의 숫자를 입력받아서 배열에 저장
//		작성 완료하면 커밋후 푸시
		
//		6칸 짜리 배열 생성.
		
			int[] userInputArr = new int[6];
			
			Scanner scan = new Scanner(System.in);
			
			for (int i = 0; i < userInputArr.length; i++) {
//				숫자 입력 안내 메시지 띄우기
				while (true) {
					System.out.print(String.format("%d번째 숫자 입력 : ", i+1));
					
//					입력값을 바로 배열에 넣지 않고, 별개 변수에 임시저장
					int inputNum = scan.nextInt();
					
//					입력값이
					boolean rangeOk = 1 <= inputNum && inputNum <= 45;
//					중복검사 결과저장. 기본전제는 일단 true 설정
					boolean duplOK = true;
					
					for (int j = 0; j < userInputArr.length; j++) {
						if(userInputArr[j] == inputNum) {
//							중복검사를 통과하지 못한다!
							duplOK = false;
//							하나라도 걸렸으면 더 볼필요도 없다
							break;
						}
					}
//				범위와, 중복검사를 모두 통과한다면
					if(rangeOk && duplOK) {
//						배열에 입력값읓ㄹ 저장
						userInputArr[i] = inputNum;
//						안내메시지 출력
						System.out.println("다음 숫자를 입력하세요.");
//						다음숫자를 입력하기 위해 while 문을 탈출
						break;
					}
				}
				
				
			}
			
//			기능2. 6개의 숫자를 입력  받을때,1~45인지, 중복이 아닌지 ok일때만 배열에 저장 

			
			
//          기능3. 컴퓨터가 6개의 숫자를 저장. 1~45인지, 중복이 아닌지 검사해서 저장
			
//			당첨번호 67개를 저장할 배열을 생성.
			int[] lottoAnswerArr = new int[6];
			
//			6개의 당첨번호를 만들기 위한 반복문.
		    for (int i = 0; i < lottoAnswerArr.length; i++) {
				
//		    	조건을 만족시킬때까지 다시 만들도록 무한반복.
		    	while(true) {
		    	 double randomVal = Math.random();
		    	 
//		    	 0+1 <= randomVal*45 < 45+1
		    	 
		    	 int randomNum = (int) (randomVal*45+1);
		    	 
//		    	 랜덤으로 나온값이 1~45 인지? 검사를 안해도 되겠다 생각
//		    	 boolean rangeOK
		    	 
//		    	 이미 만들어져있는지? 검사 해야함.
		    	 boolean duplOK = true;
		    	 
		    	 for (int j = 0; j < lottoAnswerArr.length; j++) {
		    		 if(lottoAnswerArr[j] == randomNum) {
//		    			 이번에 뽑은 번호가 중복이다!
		    			 duplOK = false;
		    			 break;
		    		 }
					
				}
//		    	 중복여부가 괜찮다면 
		    		if(duplOK) {
//		    			랜덤으로 생성한 번호를 당첨번호로 등록.
		    			lottoAnswerArr[i] = randomNum;
//		    			다음 숫자를 뽑으러 이동.
		    			break;
		    		}
		    	}
			}
	}
}
		