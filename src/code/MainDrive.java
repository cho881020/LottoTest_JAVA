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
			
			while (true) {
				
				System.out.println(String.format("%d번째 숫자 입력 : ", i+1));
				
//				입력값을 바로 배열에 넣지 않고, 별개 변수에 임시저장.
				int inputNum = scan.nextInt();
				
//				입력값이 1~45 여야 true로 저장.
				boolean rangeOk = 1 <= inputNum && inputNum <= 45;
				
//				중복 검사 결과 저장. 기본 전제는 일단 true로 설정.
				boolean duplOk = true;
				
//				저장된 배열을 다시 돌아본다.
				for (int j=0 ; j <userInputArr.length ; j++) {
					
//					하나라도 지금 입력하는 값과 같다면
					if (userInputArr[j] == inputNum ) {
//						중복 검사를 통과하지 못한다!
						duplOk = false;
//						하나라도 걸렸으면 더 볼필요도 없다.
						break;
					}
					
				}
				
//				범위와, 중복검사를 모두 (and) 통과한다면
				if (rangeOk && duplOk) {
					
//					배열에 입력값을 저장.
					userInputArr[i] = inputNum;
//					안내메세지 출력
					System.out.println("다음 숫자를 입력하세요.");
//					다음 숫자를 입력받기 위해 while문을 탈출.
					break;
				}
				
				
			}
			
			
		}
		
//		기능 2. 6개의 숫자를 입력 받을때, 1~45인지, 중복을 검사해서 OK일때만 배열에 저장.
		
		
		
	}
}









