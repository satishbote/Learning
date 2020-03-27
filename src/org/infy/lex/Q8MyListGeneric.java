package org.infy.lex;

import java.util.ArrayList;
import java.util.List;

public class Q8MyListGeneric<Object> {
	
	
	private List<Object> values= new ArrayList<>();
	
	public void add(Object value){
		values.add(value);  //line1
		System.out.println(values);
		
	}

	public static void main(String[] args) {

		Q8MyListGeneric<String> myListString= new Q8MyListGeneric<String>();
		myListString.add("Good");
		
	}

}
