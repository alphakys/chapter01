package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
			
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int N = sc.nextInt();
		
		if(N>=90) {
			System.out.println("A등급");
			} else if (N>=80){
				System.out.println("B등급");
			} else if (N>=70){
				System.out.println("C등급");
			}else if (N>=60){
				System.out.println("D등급");
			}else {
				System.out.println("F등급");
			}
		
		sc.close();
}
}