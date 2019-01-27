package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		1) 사용자에게 6개의 숫자를 입력받아서 배열에 저장

//		6칸 짜리 배열 생성
		int[] userInputArray = new int[6];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < userInputArray.length; i++) {
			while (true) {

				System.out.print(String.format("%d번째 숫자입력 : ", i + 1));

//				입력값을 바로 배열에 넣지 않고, 별개 변수에 임시저장
				int inputNum = scan.nextInt();

//				입력값이 1~45 여야 true로 저장
				boolean rangeOk = (1 <= inputNum && inputNum <= 45);

//				중복 검사 결과 저장. 기본 전제는 일단 true로 설정
				boolean duplOk = true;

//				저장된 배열을 다시 돌아본다.
				for (int j = 0; j < userInputArray.length; j++) {

//					하나라도 지금 입력된 값과 같다면
					if (inputNum == userInputArray[j]) {
//						중복 검사를 통과하지 못한다!
						duplOk = false;
//						하나라도 걸렸으면 더 불 필요도 없다.	
						break;
					}
				}

//				범위, 중복검사를 모두 (and)로 통과한다면
				if (rangeOk && duplOk) {

//					배열에 입력값을 저장.
					userInputArray[i] = inputNum;
//					안내메시지 출력
					System.out.println("다음 숫자를 입력하세요.");
//					다음 숫자를 입력받기 위해 while문을 탈출
					break;
				}

			}

		}

//		기능 2. 6개의 숫자를 입력 받을 때, 1~45인지, 중복을 검사해어 OK일 때만 배열에 저장

		for (int i = 0; i < userInputArray.length; i++) {
			System.out.println(userInputArray[i]);
		}
	}
}
