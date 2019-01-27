package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		기능1. 사용자에게 6개의 숫자를 입력받아서 배열에 저장.
//		작성 완료하면 커밋후 푸시.
		
		int[] userInput = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<userInput.length; i++) {
			
			while(true) {
				
				System.out.print(String.format("%d번째 번호를 입력하세요 : ", i+1));
				
//				입력값을 바로 넣지 않고 임시변수에 저장.
				int inputNum = sc.nextInt();
				
//				입력값이 1~45여야 true로 저장
				boolean rangeOk = 1 <= inputNum && inputNum < 45;
//				기본전재를 true
				boolean duplOk = true;
				
//				저장된 배열을 다시 돌아봄.
				for(int j=0; j<userInput.length; j++) {
//					하나라도 입력값이 지금과 같다면
					if(userInput[j] == inputNum) {
//						중복검사는 통과하지못함.
						duplOk = false;
//						더 볼것 없음
						break;
					}
				}
//				범위와 중복검사를 모두 (and) 통과한다면
				if(rangeOk && duplOk) {
					userInput[i] = inputNum;
					System.out.println("다음숫자를 입력하세요");
//					다음숫자를 입력하기 위해 while문 탈출
					break;
				}
			}

		}

//		기능2. 6개의 숫자를 입력받을때, 1~45인지, 중복을 검사해서 중복이 아닐경우에 배열에 값을 넣기.
		
//		기능3. 컴퓨터가 6개의 숫자를 저장. 1~45인지, 중복이 아닌지 검사해서 배열값에 넣음.
		
//		당첨번호 6개를 저장할 배열 생성.
		int[] lottoAnswerArr = new int[6];

//		6개의 당첨번호를 만들기 위한 반복문.
		for(int i=0; i<lottoAnswerArr.length; i++) {

//			조건을 만족시킬때까지 무한반복 시킬것.			
			while(true) {
				
				double randomVal = Math.random();
				
//				0 + 1 <= randomVal * 45 + 1 < 45 + 1
				
				int randomNum = (int)(randomVal * 45 + 1);
				
//				랜덤으로 나온 값이 1 ~ 45 인지? 근데 검사는 안해도될듯
//				boolean rangeOk;
				
				boolean duplOk = true;
				
				for(int j=0; j<lottoAnswerArr.length; j++) {
					
					if(lottoAnswerArr[j] == randomNum) {
						duplOk = false;
						break;
					}
				}
//				중복여부가 괜찮다면.
				if(duplOk) {
//					당첨번호로 등록해줌
					lottoAnswerArr[i] = randomNum;
//					다음숫자를 뽑으러 이동
					break;
				}
			}
		}
		
		
//		당첨번호가 어떤것들인지 화면에 출력
		for(int i=0; i<lottoAnswerArr.length; i++) {
			System.out.println(lottoAnswerArr[i]);
		}
		
//		기능3. 당첨번호 작은수 부터 정리
		int[] sortedLottoAnswerArr = new int[6];
		
		
//		정렬된 배열을 담당하는 반복문.
		for(int i=0; i<sortedLottoAnswerArr.length; i++) {
			
//			최소값을 저장할 변수
			int min = 9999999;
//			최소값의 인덱스
			int minIdx = 0;
			
//			당첨번호중에 젤 작은 값을 찾아내는 for문
			for(int j=0; j<lottoAnswerArr.length; j++) {
				
				if(min > lottoAnswerArr[j]) {

//					최소값 갱신.					
					min = lottoAnswerArr[j];
//					찾아낸 위치
					minIdx = j;
				}
			}
//			찾아낸 최소값을 기록
			sortedLottoAnswerArr[i] = min;
//			찾아낸 최소값 자리는 강제로 매우큰 수로 교체;
			lottoAnswerArr[minIdx] = 9999999;
		}
		
		sc.close();
	}
}





