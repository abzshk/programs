package com.user.practice;

import java.util.Scanner;

public class ITCalculator {

	int income = 0;
	String regime = "";
	Scanner inp = new Scanner(System.in);
	int fixed_5_O = 12500;
	int fixed_20_O = 50000;

	int fixed_5_N = 15000;
	int fixed_10_N = 30000;
	int fixed_15_N = 45000;
	int fixed_20_N = 60000;

	public static void main(String[] args) {

		ITCalculator itCalculator = new ITCalculator();
		itCalculator.getIncome();

	}

	private void getIncome() {
		System.out.println("Enter Income : ");
		income = inp.nextInt();
		inp.nextLine();
		System.out.println("Enter Regime(O/N) : ");
		regime = inp.nextLine();

		switch (regime) {
		case "O":
			calcOldTax();
			break;
		case "N":
			calcNewTax();
			break;
		}

	}

	private void calcNewTax() {
		income = income - 50000;
		int minusIncome = 0;
		if (income > 700000) {
			if (income < 900000) {
				minusIncome = income - 600000;
				System.out.println(((minusIncome * 10) / 100) + fixed_5_N);
			} else if (income > 900000 && income < 12000000) {
				minusIncome = income - 900000;
				System.out.println(((minusIncome * 15) / 100) + fixed_10_N + fixed_5_N);
			} else if (income > 1200000 && income < 15000000) {
				minusIncome = income - 1200000;
				System.out.println(((minusIncome * 20) / 100) + fixed_15_N + fixed_10_N + fixed_5_N);
			} else {
				minusIncome = income - 1500000;
				System.out.println(((minusIncome * 30) / 100) + fixed_20_N + fixed_15_N + fixed_10_N + fixed_5_N);
			}
		}
	}

	private void calcOldTax() {
		income = income - 50000;
		int minusIncome = 0;
		if (income > 500000) {
			System.out.print("Income greater than Five Lakh\nIncome Tax Calculated as per Old Regime : ");
			if (income < 750000) {
				minusIncome = income - 500000;
				System.out.println(((minusIncome * 20) / 100) + fixed_5_O);
			} else if (income > 750000 && income < 1000000) {
				minusIncome = income - 750000;
				System.out.println(((minusIncome * 20) / 100) + fixed_20_O + fixed_5_O);
			} else {
				minusIncome = income - 1000000;
				System.out.println(((minusIncome * 30) / 100) + fixed_20_O + fixed_20_O + fixed_5_O);
			}
		}

	}
}
