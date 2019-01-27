package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] userArr =new int[6];
		int inputNumber = 0;
		
		for(int i=0;i<userArr.length;i++) {
			System.out.print(String.format("%d번째 번호입력", i+1));
			userArr[i]=scan.nextInt();
		}
		
		for(int i=0;i<userArr.length;i++) {
			System.out.print(userArr[i]);
		}
		
	}
}
