package org.infy.lex;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Q20FixedThreadPool {

	public static void main(String[] args) {
		
		ThreadPoolExecutor executor= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		for(int i=0; i<5; i++){
			MyThread t1= new MyThread();
			executor.execute(t1);
		}
		
		System.out.println("\n Maximum number of threads inside pool "+executor.getMaximumPoolSize());
		executor.shutdown();

	}

}
