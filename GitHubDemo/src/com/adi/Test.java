package com.adi;

public class Test {
	public void m1() {
		System.out.println("m1-method");
	}

	public void m2() {
		System.out.println("m2-method");
	}

	public void m3() {
		System.out.println("m3-method");
	}

	public static void main(String[] args) {

		System.out.println("Hello Main Method");
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
	}

}
