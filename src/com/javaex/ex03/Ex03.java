package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int N = sc.nextInt();
		
		if(N>0) {
			System.out.println("양수");
			} else if(N==0){
				System.out.println("0입니다.");
			} else {
				System.out.println("음수");
			}
		sc.close();
	}

}
