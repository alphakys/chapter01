package com.javaex.ex05;

public class Ex08 {
	public static void main(String[] args) {
		
		
		int[] arrA = new int[] {10,20,30};
		int[] arrB = new int[] {11,2,30,11};
		
		//arrA.length = arrB.length;
		
		//같은 경우
		
		
		
		//배열의 크기 
		
		if(arrA.length!=arrB.length) {
						
					System.out.println("두 배열의 크기가 다릅니다.");
								}
		else {
		// 값이 다른 경우
		
		for(int i=0; i<arrA.length;i++) {
					if(arrA[i]==arrB[i]) {
									System.out.println("");
										}
					else {
						System.out.println(i+"번째 값이 다릅니다.");
						}
										}
		
		
		
			 }
		
		
		
		
		
		
		
		
}
}