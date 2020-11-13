package com.javaex.ex03;

import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("월을 입력하세요");
		
		int month = sc.nextInt();
		
		if(month<8 && month!=2) {
			if(month%2==0)
				System.out.println("30일");
			else {
				System.out.println("31일");
			}
		} else {
			if(month%2==0)
				System.out.println("31일");
				 else {
					System.out.println("30일");
				}
	} 	
	

}}
//1 3 5 7 8 10 12 ------ 31
//  4 6    9  11 ---- 30
// 2 ------28
//


//1 3 5 7| 8 10 12  ----- 31
//   4 6 |  9  11 ----- 30