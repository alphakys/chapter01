package Ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int N = sc.nextInt();
		
		if(N>0) {
			if(N%2==0)
			System.out.println("짝수입니다.");
			if(N%2!=0) 
				System.out.println("홀수입니다.");
			}
		else if(N==0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		
		
		sc.close();
	}

}
