package com.poo;

import java.util.Scanner;

public class Channel {

	Scanner in = new Scanner(System.in);

	public double readNumberScanner() {
		double num = in.nextDouble();
		return num;
	}
	
	public int readOperationScanner(){
		int operation = in.nextInt();
		return operation;
	}

	public void print(String text) {
		System.out.print(text);
	}

	public double readNumber(String text) {
		print(text);
		return readNumberScanner();
	}
	
	public int readOperation(String text) {
		print(text);
		return readOperationScanner();
	}
}
