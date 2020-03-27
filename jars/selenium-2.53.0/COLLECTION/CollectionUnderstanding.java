package org.ejagruti.testNG;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionUnderstanding {

	public static void main(String[] args) {
		String name="rohan";
		String[] names=new String[100];
		names[0]="rohan";
		names[1]="manish";
		String firname=names[0];
		String secname=names[1];
		//--------------------------------------dynamic array list
		ArrayList<String> names1=new ArrayList<String>();
		//----how to set
		names1.add("rohan");
		names1.add("ganesh");
		names1.add("manish");
		//----how to get
		String nam1=names1.get(0);
		String nam2=names1.get(1);
		//----------------------------Hashmap
		HashMap<String,String> hmname=new HashMap<String,String>();
		hmname.put("r3","manish");
		hmname.put("r2", "ganesh");
		hmname.put("r1", "rohan");
		String ranktwo=hmname.get("r2");
		//-----hashtable,linklist,vector

	}

}
