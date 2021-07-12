package com.iu.s1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("-~-~- test10 start -~-~-");

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 - ");
		
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		int output = 0;
		output = (num%4) + (num/4*10);
		
		System.out.println("Input : "+num);
		System.out.println("Output : "+output);
		
		
	}
}