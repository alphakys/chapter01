package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		
		//자동형변환
		
		int num1 = 1;
		float num2 = 1.0F;
		
		float result1= num1 + num2;
		
		System.out.println(result1);
		
		//자동형변환2
		
		long num3 = 12345L;
		float num4 = 1.1F;
		
		float result2 = num3 + num4;
		System.out.println(result2);

		/////////////////////////////////////
		
		
		//강제 형변환
		
		int i = (int)1112.4223;
		System.out.println(i);
		
		
		float var01 = 12.5F;
		float var02 = var01;
		System.out.println(var02);
		
		
		
		//강제형변환 : 확대변환
		
		byte v01 = 10;
		int v02= (int)v01;
		
		System.out.println(v02);

		
		//강제형변환 : 축소변환(정상)
		
		int v03 = 10;
		byte v04 = (byte)v03;
		
			System.out.println(v04);
		
		
		//강제형변환 : 축소변환(비정상)	
		 int v05 = 12345255;
		 
		 byte v06 = (byte)v05;
			System.out.println();
		
			
		//강제형변환 : 실수---->정수(소수점 아예 없어짐)	
			double v07 = 5.57;
			int v08 = (int)v07;
			System.out.println(v08);
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
