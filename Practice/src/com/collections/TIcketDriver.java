package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TIcketDriver {
	public static void main(String[] args) {
		ArrayList<Ticket> Tno = new ArrayList<Ticket>();
		Tno.add(new Ticket(135,200435));
		Tno.add(new Ticket(2345,25032));
		Tno.add(new Ticket(332,50012));
		Tno.add(new Ticket(45,7465));
		Tno.add(new Ticket(23,846));
		Collections.sort(Tno);
		for(Object o : Tno) {
			System.out.println(o);
		}
	
		
	}
}
