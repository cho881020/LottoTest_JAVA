package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		박소정의 작업칸
		
//		기능1. 사용자에게 6개의 숫자를 입력받아서 배열에 저장.
//		작성 완료하면 커밋 후 푸시
		
//		6칸짜리 배열 생성
		int[] userLottoNumArray = new int[6];
		
		Scanner scan = new Scanner(System.in);		
		
		for (int i=0 ; i < userLottoNumArray.length ; i++) {
			
			while (true) {
				System.out.print(String.format("%d번째 숫자를 입력 : ", i+1));
				
//				입력값을 바로 배열에 넣지 않고, 별개 변수에 임시저장
				int inputNum = scan.nextInt();
				
//				입력값이 1~45 여야 true로 저장.
				boolean rangeOK = 1 <= inputNum && inputNum <= 45;
				
//				중복 검사 결과 저장. 기본 전제는 일단 true로 설정
				boolean duplOK = true;
				
//				저장된 배열을 다시 돌아본다.
				for (int j=0 ; j < userLottoNumArray.length ; j ++) {
//					하나라도 지금 입력하는 값과 같다면,
					if (userLottoNumArray[j] == inputNum) {
//						중복검사를 통과하지 못한다!
						duplOK = false;
//						하나라도 걸렸으면 더 볼필요도 없다.
						break;
					}
				}
				
//				범위와, 중복검사를 모두 (and) 통과한다면,
				if (rangeOK && duplOK) {
					
//					배열에 입력값을 저장.
					userLottoNumArray[i] = inputNum;
//					안내 메세지를 출력
					System.out.println("다음 숫자를 입려과세요.");
//					다음 숫자를 입력받기 위해 while문을 탈출.
					break;
				}
			}			
		}
		
//		기능2. 6개의 숫자를 입력 받을 때, 1~45인지, 중복을 검사해서 OK 일 때만 배열에 저장.
		
	}
}
