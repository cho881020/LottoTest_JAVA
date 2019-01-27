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
				if(numRange && isnotDuplNum) {
					userInputArr[i] = userInput;
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
//
//	 3) 두 개의 배열을 모두 작은 숫자부터 큰 숫자 순으로 정렬.
//
//	4) 정렬된 두개의 배열을 가지고 비교해서 등수를 출력.
//	  - 6개의 숫자가 모두 같다! 1등.
//	  - 5개의 숫자가 같다! 3등
//	  - 4개 : 4등
//	  - 3개 : 5등
		
	}
}
