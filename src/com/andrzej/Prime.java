package com.andrzej;

/**
 * Created by andrzej on 17.05.17.
 */
public class Prime {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			for (int x = 2; x <= i; x++) {
				if (i == x) {
					System.out.println("Prime number: " + i);
				}
					if (i % x == 0)
					break;
			}
		}

		System.out.println("-----------------------------");
		System.out.println();
		System.out.println();


		for (int x = 2; x <= 100; x++) {
			if (isPrimeNumber(x)) {
				System.out.println("The number " + x + " is a prime number");
			}

		}


	}

	public static boolean isPrimeNumber(int intNum) {
		if (intNum == 1)
			return false;

		for (int a = 2; a <= intNum / 2; a++) {
			if (intNum % a == 0)
				return false;

		}

		return true;
	}
}
