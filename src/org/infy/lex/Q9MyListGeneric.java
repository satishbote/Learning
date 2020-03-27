package org.infy.lex;

import java.util.ArrayList;
import java.util.List;

public class Q9MyListGeneric {
	
	public static void displayElements(List<? super Integer> li){
		System.out.println(li);     // line4
	}

	public static void main(String[] args) {

		List<Number> l1= new ArrayList<Number>();
		l1.add(1009.9f); //line1
		l1.add(200);	//line2
		l1.add(new Double(300));	//line3
		
		displayElements(l1);
		
	}

}
