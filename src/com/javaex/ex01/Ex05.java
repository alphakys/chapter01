package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		
		//일반적 경우
		
		double result01 = PI*5*5;
		System.out.println(result01);
		
		//pi값을 변경하는 경우
		//pi=3.145875   -----> 상수를 변수로 다시 지정하면 오류가 발생;
		double result02=PI*5*5;
		System.out.println(result02);
	
	
		
	//상수 정의
		//final double PI = 3.14;
	
		
}}
