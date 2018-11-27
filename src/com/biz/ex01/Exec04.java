package com.biz.ex01;

public class Exec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = add();
		String nation = stringA();
		
		System.out.println(nation);
		
	}

	public static int add() {
		int intNum =30;
		int intNum2 =40;
		int intSum = intNum + intNum2;
		return intSum;
	}
	public static String stringA() {
	
		String strName = "Korea";
		return strName;
	}
}
