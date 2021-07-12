package com.iu.s1;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("===Test6 start===");
		
		int num = 5;
		double num2 = 3.12;
	    num = num + (int)num2;
	    //num = int(num+num2);
	    System.out.println("num = "+num); //8
	    
	    // 국어 영어 수학 = 0 ~ 100  -> int
	    int kor = 63;
	    int eng = 35;
	    int math = 53;
	    
	    //총점을 계산해서 출력
	    int hap = kor + eng + math;
	    System.out.println("총점 : "+hap);
	    
	    double avr = (double)hap/3;
	    System.out.println("평균 : "+avr);
	    
	    double num3 = 5.124;
	    int result = (int)num3;
	    System.out.println(result);
	    
	    
		
	}
}
