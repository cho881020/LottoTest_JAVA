package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		정대호 브런치
			
//	1) 사용자에게 6개의 숫자를 입력받아서 배열에 저장.
//	  - 1~45의 숫자만 입력가능, 중복된 숫자는 허용 X
		
		Scanner scan = new Scanner(System.in);  // 스캐너
		int[] userInputArr = new int[6]; // 6칸짜리 배열 생성.
		

		for (int i = 0 ; i < userInputArr.length ; i++) {
			
			while(true) {
				
//				번호 입력 받기
				System.out.print(String.format("%d번째 숫자를 입력하세요 : ",i+1));
				int userInput = scan.nextInt();
				
//				번호 유효성 검사
//				1) 1~45 여부  => 범위 벗어날시 false
				boolean numRange = userInput >= 1 && userInput <=45 ;
				
//				2) 중복검사  => 기본 전제 true , 중복발생시 false
				boolean isnotDuplNum = true ; 
				
//				저장된 배열을 다시 돌아본다.
				for (int j= 0 ; j < userInputArr.length ; j++) {
					
					if( userInputArr[j] == userInput) {
//						중복 검사를 통과하지 못한다!
						isnotDuplNum = false ;
//						하나라도 걸렸으면 더 볼 필요도 없다.
						break;
					}
			
				}
				
//				범위와 중복 검사를 모두 (and) 통과한다면
				if(numRange && isnotDuplNum) {
					
//					배열에 입력값을 저장.
					userInputArr[i] = userInput;
//					안내매세지 출력
					System.out.println("다음 숫자를 입력하세요.");
//					다음 숫자를 입력받기 위해 while문을 탈출
					break;
				}
				else {
					System.out.println("다시 입력하세요.");
				}
				
				
				
			}  //while 끝 =>입력받은 숫자의 유효성 검사 및 데이터 입력 완료
			
		} // for 끝 ==> 사용자 숫자 저장.
		
		
//	 2) 컴퓨터가 이번주의 당첨번호 6개를 생성.
//	 - 1~45의 숫자만 입력가능, 중복된 숫자는 허용 X
//	 ※ 보너스번호는 이번 문제에서는 반영하지 않을 생각.

//		당첨번호 6개를 저장할 배열을 생성.
		int[] lottoAnswerArr = new int[6];
		
		
//		6개의 당첨번호를 만들기 위한 반복문.
		for (int i = 0 ; i < lottoAnswerArr.length ; i++ ) {
			
			
//			조건을 만족시킬때까지 다시 만들도록 무한반복.
			while(true) {
				double randomVal = Math.random();
				
//				0 + 1 <= randomVal * 45 + 1 < 45 + 1     => 1 <= randomVal < 46 => 1~45
				int randomNum = (int) ( randomVal * 45 + 1 );
				
//				랜덤으로 나온 값이 1~45인지? 검사를 안해도 되겠다!
//				boolean rangeOk = 
				
//				이미 만들어져있는지? 검사해야함.
				boolean duplOk = true ;
				
				for (int j=0 ; j < lottoAnswerArr.length ; j++) {
					
					if (lottoAnswerArr[j] == randomNum) {
						duplOk = false ;
						break;
					}
				}
				
//				중복여부가 괜찮다면
				if (duplOk) {
//					랜덤으로 생성한 번호를 당첨번호로 등록.
					lottoAnswerArr[i] = randomNum ;
//					다음 숫자를 뽑으러 이동.
					break;
				}
				
			}  // while 종료 => 숫자 생성 반복
			
		} // for 끝 
		
		
//		당첨번호가 어떤것들인지 화면에 출력
		for(int i = 0 ; i < lottoAnswerArr.length ; i++) {
			
			System.out.println(lottoAnswerArr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
//	 3) 두 개의 배열을 모두 작은 숫자부터 큰 숫자 순으로 정렬.
//
//	4) 정렬된 두개의 배열을 가지고 비교해서 등수를 출력.
//	  - 6개의 숫자가 모두 같다! 1등.
//	  - 5개의 숫자가 같다! 3등
//	  - 4개 : 4등
//	  - 3개 : 5등
		
	} // main 종료
}
