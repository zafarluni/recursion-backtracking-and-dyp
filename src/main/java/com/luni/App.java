package com.luni;

import com.luni.recursion.*;

public class App {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		System.out.println("Fib: "+ fib.fibonacciTail(7));
		System.out.println("Fib: "+ fib.fibonacciTail(8));
		System.out.println("Fib: "+ fib.fibonacciTail(9));
	}
}
