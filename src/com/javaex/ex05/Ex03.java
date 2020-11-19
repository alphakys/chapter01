package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {

				
		
		int[] lotto = new int[6];
		
		
		for(int i = 0;i<6;i++) {
							lotto[i] = (int)(Math.random()*45)+1;
								}
		
		
		
		for(int k : lotto) {
			System.out.println(k);
		}
		
		
		
				

	}

}
