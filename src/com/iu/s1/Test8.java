package com.iu.s1;

public class Test8 {
	public static void main(String[] args) {
		System.out.println("----Test8 start----");
		 int price;
		 int money;
		 int zandon;
		
		 price = 57860;
		 money = 100000;
		 zandon = money - price;
		 
		 System.out.println("물건값 : "+price);
		 System.out.println("지불 금액 : "+money);
		 System.out.println("거스름돈 : "+zandon);
		 
		 int man = zandon/10000;
		 System.out.println("만원 : "+man+"장");
		 int cheon = zandon/1000%10;
		 System.out.println("천원 : "+cheon+"장");
		 int bek = zandon/100%10;
		 System.out.println("백원 : "+bek+"개");
		 int sip = zandon/10%10;
		 System.out.println("십원 : "+sip+"개");
		 
		 
	}
}
