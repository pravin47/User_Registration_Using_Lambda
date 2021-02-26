package com.user.registration;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationSystem {
	static Scanner sc = new Scanner(System.in);

	public static void firstName() {

		System.out.println("Enter The First Name");
		String fName = sc.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(fName);
		System.out.println("String Result Is :" + m1.matches());
		boolean check1 = (m1.matches());
		if (check1 == true) {

			System.out.println("First Name Is Valid");
		} else {
			System.out.println("First Name Is Invalid");
		}
	}

	public static void main(String args[]) {

		firstName();

	}
}
