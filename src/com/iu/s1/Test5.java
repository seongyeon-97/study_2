package com.iu.s1;

public class Test5 {
	public static void main(String [] args) {
		System.out.println("====test5 start====");
		int num1 = 5;
		long num2 = 9L;
		System.out.println(num1);
		
		num1 = (int)num2;  //강제형변환
		System.out.println(num1);

		num1=3;
		//num2= (long)num1;

		num2= num1;  //자동형변환
		System.out.println(num2);
		
		char ch = '1';
		int num3 = ch;
		System.out.println("num3 = "+num3);
		
	}
}
