package com.adi;

public class Test {
	public void m1() {
		System.out.println("m1");
	}

	public void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {

		System.out.println("Hello");

		Test t = new Test();
		t.m1();
		t.m2();

	}

}
