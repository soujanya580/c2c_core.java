package com.tns.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List  ob=new ArrayList<>();
		ob.add(4);
		ob.add(6);
		ob.add("abc");
		ob.add(13.65f);
		ob.add(4);
		ob.add(null);
		ob.isEmpty();
		ob.removeLast();
		ob.containsAll(ob);
		ob.add(2, ob);
		System.out.println(ob);
		
		boolean c=ob.contains(4);
		System.out.println(c);
		
		ob.remove(2);
		System.out.println(ob);
	}

}
