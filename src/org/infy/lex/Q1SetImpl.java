package org.infy.lex;

import java.util.Set;
import java.util.TreeSet;

public class Q1SetImpl {

	public static void main(String[] args) {

		Set<String> set= new TreeSet<String>();
		set.add("Infosys");
		set.add("Google");
		set.add("IBM");
		
		for(String s:set)
		{
			System.out.println(" "+s);
			set.clear();
			
		}
		
	}

}
