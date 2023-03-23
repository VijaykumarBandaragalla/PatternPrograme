package com.jdbc;

public class AdharCardSingelton {
	public static AdharCardSingelton ref=null;
	private AdharCardSingelton() {
		System.out.println("Object is created");
	}
	public void getSim() {
		System.out.println("Sim is purchased");
	}
	static AdharCardSingelton getAdhar() {
		if(ref ==null)
			ref = new AdharCardSingelton() ;
		else
			System.out.println("object already exist");
		return ref;
	}
}
