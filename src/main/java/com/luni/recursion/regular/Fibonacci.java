package com.luni.recursion.regular;

public final class Fibonacci {

	public int fibonacciTail(int number) {
		return fibTailRec(number, 0, 1);
	}

	private int fibTailRec(int number, int a, int b) {
		if (number == 0)
			return a;
		if (number == 1)
			return b;

		return fibTailRec(number - 1, b, a + b);
		
	}
}