package com.iu.s1;

public class Test7 {
	public static void main(String [] args) {
		System.out.println("----Test7 start----");
		
		int kor = 56;
		int eng = 65;
		int math = 49;
		
		int hap = kor + eng + math;
		
		double avg = hap / 3.0;
		
		System.out.println("Total : "+hap);
		System.out.println("Average : "+avg);
		
		avg = (int)(avg*100)/100.0;
		kor = 100;  //hap값은 변하지 않음
		
		System.out.println("Total : "+hap);
		System.out.println("Average : "+avg);
		
		
		
	}
}
