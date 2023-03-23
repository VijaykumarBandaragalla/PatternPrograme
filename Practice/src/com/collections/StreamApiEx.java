package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class product1 implements Comparable<product1>{
	int id;
	String name;
	Float price;
	public product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(product1 p2) {
		return price.compareTo(p2.price);

	}
	@Override
	public String toString() {
		return "product1 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class StreamApiEx {
	public static void main(String[] args) {
		List<product1> list=new ArrayList<product1>();  
        list.add(new product1(1,"Samsung A5",17000f));  
        list.add(new product1(3,"Iphone 6S",65000f));  
        list.add(new product1(2,"Sony Xperia",25000f));  
        list.add(new product1(4,"Nokia Lumia",15000f));  
        list.add(new product1(5,"Redmi4 ",26000f));  
        list.add(new product1(6,"Lenevo Vibe",19000f));  
        
        Collections.sort(list);
        Stream<product1> filtered_data=list.stream().filter(p->p.price>20000);
        
        filtered_data.forEach((product1 n)->System.out.println(n.id+" , "+n.name+" , "+n.price));
        

	}
}
