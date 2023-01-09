package com.bridgelabz.day1PracticeProblem;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		System.out.println("Enter Any Number");
		Scanner sc =new Scanner(System.in);
		year = sc.nextInt();
		
		if(year %100==0 && year%400==0 || year%100!=0 && year%4==0) {
			System.out.println("year is a Leap Year");
		}else {
			System.out.println("year is not a Leap Year");
		}
	}

}
