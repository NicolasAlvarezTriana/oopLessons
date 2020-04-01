package com.poo;

public class BynariOperation {
	private double factor;

	public BynariOperation(double factor) {
		this.factor = factor;
	}

	public double adder(double num) {
		return num + factor;
	}

	public double subtraction(double num) {
		return num - factor;
	}

	public double divider(double num) {
		if (factor == 0) {
			return 0;
		} else {
			return num / factor;
		}
	}

	public double multiply(double num) {
		return num * factor;
	}

}
