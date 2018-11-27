package com.biz.ex01;

public class Exec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 0;
		intNum = 30;
		add(intNum);
		int intNum1 =0;
		intNum1 =50;
		add(intNum1, intNum);//변수에들어있는 값을 보내는것
		add(100,200);
	}

	public static void add(int intNum) {
		
	}
	public static void add(int intNumA, int intNumB) {
		System.out.println(intNumA);
		intNumB = 500; //메서드에서 값을 셋팅하면 메인에서 전달된 값은 소용없어짐.
		//메서드의 매개변수는 메인에서 보내준 값을 담는 그릇이다.
		System.out.println(intNumB);
}
}
