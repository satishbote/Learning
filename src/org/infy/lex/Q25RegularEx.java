package org.infy.lex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q25RegularEx {

	public static void main(String[] args) {
		Pattern p= Pattern.compile("M+", 5);
		Matcher m= p.matcher("M Merit Match MM m mM");
		while(m.find()){
			System.out.print(m.group() + " ");
		}

	}

}
