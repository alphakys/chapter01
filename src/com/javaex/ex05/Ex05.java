package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		
		int num = 3;
		
		int num2 = num;
		
		num2 = 7;
		
		System.out.println(num2);
		System.out.println(num);
		
		
		int [] arrA = {3,6,9};
		
		int[] arrB = new int[3];
		
		arrB[0] = arrA[0];
		arrB[1] = arrA[1];
		arrB[2] = arrA[2];
	
		System.out.println(arrB[0]);
		System.out.println(arrB);
		System.out.println(arrA);
		
		
		

	}

}
