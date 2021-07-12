package com.iu.s1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("-~-~- test10 start -~-~-");

		Scanner sc = new Scanner(System.in);
			
		int input=10;
		int output=0; 
		
		System.out.println("숫자를 입력하세요");
		input = sc.nextInt();//ten
		output = input/4*10+input%4;
		
		System.out.println("Input : "+input);
		System.out.println("Output : "+output);
		
		
	}
}