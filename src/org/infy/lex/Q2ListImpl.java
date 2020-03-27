package org.infy.lex;

import java.util.ArrayList;
import java.util.List;

public class Q2ListImpl {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Infosys");
		list.add("Google");
		list.add("IBM");
		list.add("Amazon");
		
		for(int j=0;j<list.size();j++)
		{
			list.remove(j);
			if(list.get(j++).equalsIgnoreCase("Google"))
			{
				list.add("Oracle");
			}
		}
		
		System.out.println(list);
		
		
				
	}

}
