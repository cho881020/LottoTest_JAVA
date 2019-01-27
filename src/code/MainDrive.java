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
//						하나라도 걸렸으면 더 볼 필요도 없다.
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
		
	}
}
