package org.infy.lex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Q10ContractEmployee extends Employee {

	int salary;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Q10ContractEmployee 	cemp = new Q10ContractEmployee(10000, "sam");
		
		FileOutputStream fos= new FileOutputStream("C:/serial.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(cemp);
		
		
		FileInputStream fis= new FileInputStream("C:/serial.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		cemp= (Q10ContractEmployee) ois.readObject();
		System.out.println(cemp);
		
		
	}
	
	
	
	Q10ContractEmployee(int salary, String name){
		super.name=name;
		this.salary=salary;
		
	}
	
	public String toString(){
		
		return super.name + salary;
	}

}
