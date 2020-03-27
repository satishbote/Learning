package org.infy.lex;

public class Q24Tester {

	public static void main(String[] args) {
		
		String[] values={"xy", "xay", "xaby", "xa"};
		for(String value:values){
			if(value.matches("x.y")){
				System.out.println(value);
			}
		}

	}

}
