package org.infy.lex;

import java.util.ArrayList;
import java.util.List;

public class Q7MyListGeneric<T extends Number> {
	
	private List<T> values=new ArrayList<>();
	
	public void add(T value){
		values.add(value);
		System.out.println(values);
	}
	
	public void remove( T value){
		values.remove(value);
	}
	
	public T get(int index){
		return values.get(index);
	}
	

	public static void main(String[] args) {

		Q7MyListGeneric<Float> myList= new Q7MyListGeneric<Float>();
		myList.add(98.7f);
		myList.add(1009);
		
		
	}

}
