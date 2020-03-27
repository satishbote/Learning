package org.infy.lex;

import java.util.ArrayList;
import java.util.List;

public class Q6Test {

	public static void main(String[] args) {

		
		List<Long>	li= new ArrayList<Long>();
		li.add(Long.valueOf(10));
		
		List<Number> l2=li;
		System.out.println(l2);
	}

}
