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

	}
}
