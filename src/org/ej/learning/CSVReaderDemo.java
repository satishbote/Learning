package org.ej.learning;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVReaderDemo {

	public static void main(String[] args) throws IOException {
		
		

		BufferedReader br= new BufferedReader(new FileReader("D:\\demo1.csv"));
		
		
		CSVParser csv=new CSVParser(br, CSVFormat.DEFAULT.withHeader("Name", "Product", "Description").withIgnoreHeaderCase());
		
		for(CSVRecord c:csv)
		{
			String name=c.get(0);
			String product =c.get(1);
			String description= c.get(2);
			
			
			System.out.print(name);
			System.out.print(product);
			System.out.print(description);
			System.out.println();
		}
		
	}

}
