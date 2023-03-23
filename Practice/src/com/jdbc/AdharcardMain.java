package com.jdbc;

public class AdharcardMain {
	public static void main(String[] args) {
		AdharCardSingelton a =AdharCardSingelton.getAdhar();
		a.getSim();
		System.out.println(a.toString());
		System.out.println("=======================");
		AdharCardSingelton b =AdharCardSingelton.getAdhar();
		b.getSim();
		System.out.println(b.toString());
		
	}
}
