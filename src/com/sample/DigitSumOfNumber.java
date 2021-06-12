package com.sample;

public class DigitSumOfNumber {

	public static void iDCheck(int iD) {

		int sum = 0;
		while (iD > 0 || sum > 9) {
			if (iD == 0) {
				iD = sum;
				sum = 0;
			}
			sum += iD % 10;
			iD /= 10;
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		iDCheck(55555555);

	}

}
