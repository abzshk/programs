package com.user.practice;

import java.util.Scanner;

public class BinaryFlip {

	int arr[], i, j, n, c = 0, a = 0, b = 0, k, temp;

	public static void main(String[] args) {

		BinaryFlip b = new BinaryFlip();
		b.getValues();

		b.processFlip();

		b.displayBinaryNum();
	}

	private void displayBinaryNum() {
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	private void processFlip() {
		for (i = 0; i < n && c - b >= 0; i++) {
			if (arr[i] == 1) {
				arr[i] = 0;
				c = c - b;
				System.out.println("C : " + c);
			}
		}
		for (i = 0; i < n; i++) {
			if (c - a >= 0 && arr[i] == 1) {
				for (j = i + 1; j < n; j++) {
					if (arr[j] == 0 && i < j && c - a >= 0) {
						swap(i, j);
						System.out.println("SWAP : "+c);
						break;
					}
				}
			}
		}
	}

	private void swap(int i2, int j2) {
		temp = arr[i2];
		arr[i2] = arr[j2];
		arr[j2] = temp;
		c = c - a;
	}

	private void getValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter Binary Number : ");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter CASH : ");
		c = sc.nextInt();
		System.out.println("Enter A : ");
		a = sc.nextInt();
		System.out.println("Enter B : ");
		b = sc.nextInt();
		sc.close();
	}

}
