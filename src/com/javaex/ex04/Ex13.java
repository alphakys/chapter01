package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		//do while문 사용
		/*
			Scanner sc = new Scanner(System.in);
			
			int N;
			int sum=0;
			
			
			System.out.println("숫자를 입력하세요. [0이면 종료]");
			
			do {
				
				N= sc.nextInt();
				
				
				System.out.println("합계: "+sum);
				
				
				
					
			}while(sum!=0);
				System.out.println("종료");
		
			
			sc.close();
			*/
		
		
		
				Scanner sc = new Scanner(System.in);
				
				int N;
				int sum=0;
				
				System.out.println("숫자를 입력하세요. [0이면 종료]");
				
				while(true) {
					
					N= sc.nextInt();
					sum = sum+N;
					System.out.println("합계: "+sum);
					
					if(sum==0) {
						break;
					}
					
				} System.out.println("종료");
				
				
				
		
		
		
		
		
		
		
			}
			
			
			
		
	}


