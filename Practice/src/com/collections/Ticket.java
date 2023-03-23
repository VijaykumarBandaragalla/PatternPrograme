package com.collections;

public class Ticket implements Comparable<Ticket>{

	int tno;
	int price;
	public Ticket(int ticketno,int price) {
		this.tno=ticketno;
		this.price=price;
		
	}
	@Override
	public int compareTo(Ticket o) {
//		Ticket T = (Ticket)o;
		if(tno>o.tno) {
			return 66;
		}
		else if(this.tno<o.tno){
			return -88;
		}
		else
			return 0;
		
	}
	@Override
	public String toString() {
		return "ticketno=" + tno  ;
	}

}

