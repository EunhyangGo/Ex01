package com.biz.ex01;

public class Exec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 0;
		intNum = 30;
		add(intNum);
		int intNum1 =0;
		intNum1 =50;
		add(intNum1, intNum);//����������ִ� ���� �����°�
		add(100,200);
	}

	public static void add(int intNum) {
		
	}
	public static void add(int intNumA, int intNumB) {
		System.out.println(intNumA);
		intNumB = 500; //�޼��忡�� ���� �����ϸ� ���ο��� ���޵� ���� �ҿ������.
		//�޼����� �Ű������� ���ο��� ������ ���� ��� �׸��̴�.
		System.out.println(intNumB);
}
}
