package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int workHour = sc.nextInt();
		
		
		int pay;
		// salary8up1 = (workHour*10000)+(workHour-8)*2000
		
		
		if(workHour>8) {
			pay= (8*10000)+(workHour-8)*12000;
			} else {
			pay = workHour*10000;	
			}
		System.out.println("임금은 "+ pay+ "원 입니다.");
		
		
		sc.close();
	}

}
