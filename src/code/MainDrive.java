package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		int[] userArr =new int[6];
		
		for(int i=0;i<userArr.length;i++) {
			while(true) {
				
				System.out.print(String.format("%d번째 번호입력", i+1));
				
//				입력값을 바로 배열에 넣지 않고 별개 변수에 임시저장
				int inputNum=scan.nextInt();
				
//				입력값이 1-45여야 true로 저장
				boolean rangeOk = inputNum>0&&inputNum<46;
				
//				중복검사 결과 저장. 기본전제는 일단 true;
				boolean duplOk = true;
				
//				저장된 배열을 다시 돌아본다.
				for(int j=0;j<userArr.length;j++){
//					하나라도 지금 입력하는 값과 같다면
					if(userArr[j]==inputNum) {
//						중복검사를 통과하지 못한다.
						duplOk=false;
//						하나라도 걸렸으면 더 볼 필요도 없다
						break;
					}
				}
				
//				범위와, 중복검사를 모두 (and) 통과한다면
				if(rangeOk&&duplOk) {	
//					배열에 입력값을 저장.
					userArr[i]=inputNum;
//					안내메세지 출력
					System.out.println("다음");
//					다음 숫자를 입력받기위해 while문 탈출
					break;						
				}
				
			}
			
		}
		
//		기능 2) 6개의 숫자를 입력받을때, 1-45인지 중복을 검사해서 ok일때만 배열에 저장
		
//		기능 3) 컴퓨터가 6개의 숫자를저장. 1-45중복인지 아닌지 검사해서저장
		
//		당첨번호 6개를 만들 배열을 생성.
		int[] lottoAnswerArr = new int[6];
		
//		6개의 당첨번호를 만들기위한 반복문
		for(int i=0; i<lottoAnswerArr.length;i++) {
//			조건을 만족시킬때까지 다시 만들도록 무한반복
			while(true) {
				double randomVal = Math.random();
				int randomNum = (int)(randomVal * 45 + 1); // : 1~45의 랜덤값
				
//				랜덤으로 나온 값이 1-45인지? 검사안해도돼!
//				boolean rangeOk
				
//				이미 만들어져있는지? 검사해야돼!
				boolean duplOk = true;
				for(int j=0;j<lottoAnswerArr.length;j++) {
					if(lottoAnswerArr[j]==randomNum) {
//						뽑은 번호가 중복입니다.
						duplOk=false;
						break;
					}
				}
//				중복여부가 괜찮다면
				if(duplOk) {
//					랜덤으로 생성한 번호를 당첨번호로 등록
					lottoAnswerArr[i]=randomNum;
//					다음숫자를 뽑으러 이동
					break;
				}
			}
		}
		
	}
}
