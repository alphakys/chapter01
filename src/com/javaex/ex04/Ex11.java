package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
				
		
		Scanner sc = new Scanner(System.in);
		
		
			boolean run = true;
			
			while(run) {
				System.out.println("숫자를 입력하세요");
				int N = sc.nextInt();
				
				if(N==0) {
					System.out.println("종료");
					run = false;
				}
				else if(N%3==0) {
					System.out.println("숫자 "+N+"은 3의 배수입니다.");
				}
				else {
					System.out.println("숫자 "+N+"은(는2) 3의 배수가 아닙니다.");
				}
			
						}
			
			
			sc.close();
			
	}

}
