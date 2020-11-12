package Ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int workHour = sc.nextInt();
		int a = 10000;
		
		int pay;
		// salary8up1 = (workHour*10000)+(workHour-8)*2000
		
		
		if(workHour>8) { 
			pay = (8*a)+(workHour-8)*((int)(a*1.5));
		} else {
			pay = workHour*a;
		}
		System.out.println("임금은 "+ pay+ "원 입니다.");
		
		
		sc.close();
	}

}
