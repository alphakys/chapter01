package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
			
		int j=1;
		int i;
			for(i =0;j<=10;j++) {
				
				i+=j;       //i= 0(i)+1(j)
					  		//i= 1(i)+2(j)
					  		//i= 3(i)+3(j)	
							//i= 6(i)+4(j)
							//i= 10(i)+5(j)	
				System.out.println(j+"까지의 합은 "+i);
			}	
			System.out.println("1부터 10까지의 정수의 합은 "+i+"입니다");
			
	}

}
