package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		기능1. 사용자에게 6개 숫자를 입력받아서 배열에 저장.

		Scanner scan = new Scanner(System.in);
		int[] userInputNumArr = new int[6];

		for (int i = 0; i < userInputNumArr.length; i++) {

			while (true) {

				System.out.print(String.format("%d번째 숫자 입력: ", i + 1));

//					입력값을 바로 배열에 넣지 않고 별개변수에 임시저장
				int inputNum = scan.nextInt();

//					입력받은 값이 1~45사이의 숫자? 1<=변수 && 변수 <=45 이어야 true로 저장.
				boolean rangeOk = (1 <= inputNum) && (inputNum <= 45);

//					중복된 숫자가 없어야함. 기본 전제 true
				boolean duplOk = true;

//					저장될 배열을 다시 돌아서 검사해봄. 
				for (int j = 0; j < userInputNumArr.length; j++) {
//						지금 입력값과 하나라도 같다면 중복검사 통과 못해
					if (userInputNumArr[j] == inputNum) {
						duplOk = false; // 하나라도 걸리면 더 볼 필요없음
						break;
					}
				}

				
				if(rangeOk && duplOk) {			// 범위, 중복검사 모두 통과하면
					userInputNumArr[i] = inputNum;	//배열에 입력값 저장
					System.out.println("다음 숫자 입력하세요~~");	
					break;									//탈출
				}
				
			}

		}

//		 기능 2. 6개의 숫자를 입력받을때 1~45 인지, 중복 검사해서 ok 일때만 배열에 저장.

//		 기능 3. 컴퓨터가 6개의 숫자 저장. 1~45 인지, 중복 검사해서 ok 일때만 배열에 저장.
		
		
		int[] lottoAnswerArr = new int[6];	//당첨번호 6개 저장할 배열
		
//		6개의 당첨번호를 만들기 위한 반복문
		for(int i=0; i<lottoAnswerArr.length;i++) {
			
			while(true) { 	//어떤 조건을 만족시킬때까지 계속 다시 만들어야 하니까 while
				double randomVal = Math.random();
//				0<= randomVal <1
//				randomVal 에 45을 곱한후 1 더하면 ? 0<= randomVal*45<45
//				1<=randomVal*45+1<46 
				
				int randomNum = (int)(randomVal*45+1); 		//컴터가 1~45랜덤으로 만든다
				
//				랜덤으로 나온 값이 1~45인가? 위에서 범위를 이미 제한 했기 때문에 검사 안해도 될듯!
//				boolean rangeOK - 검사 넘어감
				
//				중복은 ? 검사해야함.
				boolean duplOk = true;
				for(int j=0; j<lottoAnswerArr.length;j++) {
					if(lottoAnswerArr[j]==randomVal) {
						duplOk = false;
						break;
				}
			}
				if(duplOk) { //중복 여부 넘어가면
					lottoAnswerArr[i] = randomNum; //랜덤 생성 번호를 당첨 번호로 등록
					break;
				}
			
			
		}
		
	}
}
