package org.infy.lex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q11IOQ {

	public static void main(String[] args) throws IOException {

		
		FileOutputStream fos= new FileOutputStream("C:/output.txt");
		
		String data="Learning";
		fos.write(data.getBytes());
		fos.close();
		
		fos= new FileOutputStream("C:/output.txt");
		data= "Java is really fun!";
		fos.write(data.getBytes());
		fos.close();
	}

}
