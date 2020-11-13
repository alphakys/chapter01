package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
			
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.print("점수: ");
		int N = sc.nextInt();
		
		if(N>=60) {
			System.out.println("합격입니다.");
			} else {
				System.out.println();
			}
		
		sc.close();
}
}