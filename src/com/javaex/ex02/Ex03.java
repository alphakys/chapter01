package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자: ");
		
		int num = sc.nextInt();
		
		System.out.println("입력한 숫자는 " + num + "입니다.");
		
		
		
		
		sc.close();
		
	}

}
