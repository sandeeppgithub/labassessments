package com.Ex5;

public class FactorialNumMain {
	
	static FactorialNum f1;

	public static void main(String[] args) {
		
		f1 = (n) -> {
			if (n == 0)
				return 1;
			else {
				return n * (f1.fact(n - 1));
			}
		};
		int i = f1.fact(9);
		System.out.println("Factorial of given: "+i);
	}

}


