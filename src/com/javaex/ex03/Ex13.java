package com.javaex.ex03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
			case 4 :
			case 6 : 
			case 9:
			case 11:
				
				System.out.println("31일 입니다.");
				break;
			

				
				
			case 2 : 
				System.out.println("28일 입니다.");
				break;
				

			default :
				System.out.println("30일 입니다.");
				
				
		}
		sc.close();
	}

}
