package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		int[] num6 = new int[6];
		Scanner scan = new Scanner(System.in);
		
		for (int i=0 ; i < num6.length ; i++) {
			System.out.println("숫자 입력 =");
			int inputnum = scan.nextInt();
			num6[i] = inputnum;
		}
	}
}
