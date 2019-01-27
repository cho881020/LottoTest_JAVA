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
		
//		기능3. 컴퓨터가 6개의 숫자를 저장, 1~45인지, 중복이 아닌지 검사해서 저장.
		
//		당첨번호 6개를 만들 배열을 생성.
		int[] lottoAnswerArr = new int[6];
		
//		6개의 당첨번호를 만들기 위한 반복문.
		for (int i=0 ; i < lottoAnswerArr.length ; i++) {
			
//			조건을 만족시킬 때까지 다시 만들도록 무한 반복.
			while (true) {
				
				double randomVa1 = Math.random();
				
//			1 <= randomVa1 * 45 + 1 < 46 : 1~45의 값 중 랜덤.
				int randomNum =	(int) (randomVa1 * 45 + 1);

//				랜덤으로 나온 값이 1~45인지? 검사를 안해도 되겠다!
//				boolean rangeOK
				
//				이미 만들어져있는지? 검사 해야함.
				boolean duplOk = true;
				
				for (int j = 0 ; j < lottoAnswerArr.length ; j++) {
					if (lottoAnswerArr[j] == randomNum) {
//						이번에 뽑은 번호가 중복이다~!
						duplOk = false;
						break;
					}
				}
				
//				중복여부가 괜찮다면
				if (duplOk) {
//					랜덤으로 생성한 번호를 당첨 번호로 등록
					lottoAnswerArr[i] = randomNum;
//					다음 숫자를 뽑으러 이동.
					break;
				}
				
				
				
			}
		}
		
		
	}
}
