package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("단을 입력해주세요");
		System.out.println("단: ");	
		int N =sc.nextInt();
		
		int i=1;
		
		while(i<10) {
			System.out.println(N+" * "+i+" = "+N*i);
			i++;
		}
		
		sc.close();
	}

}
