package com.user.registration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UserRegistrationSystem {

	static Scanner sc = new Scanner(System.in);

	public static void menuBar() {
		System.out.println("1 Registration Using Regular Method");
		System.out.println("2 Registration Using Stream Method");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			firstName();
			lastName();
			email();
			phoneNumber();
			password();
			break;
		case 2:
		}
		firstNameUsingLambda();
		lastNameUsingLambda();
		emailUsingLambda();
		phNumberUsingLambda();
		passwordUsingLambda();
	}

	public static void firstNameUsingLambda() {

		String regex = "[A-Z]{1}[a-z]{2,}";
		ArrayList<String> fName = new ArrayList<String>();
		System.out.println("Entet The First Name");
		System.out.println("Enter The Number Of Inputs");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			fName.add(sc.next());
			System.out.println("Your List Of First Name Is =" + fName.toString());
			Pattern pt = Pattern.compile(regex);
			List<String> result = fName.stream().filter(p -> pt.matcher(p).find()).collect(Collectors.<String>toList());
			System.out.println("Your Correct First Name Is" + result);

		}

	}

	public static void lastNameUsingLambda() {
		String regex = "[A-Z]{1}[a-z]{2,}";
		ArrayList<String> lName = new ArrayList<String>();
		System.out.println("Entet The Last Name");
		System.out.println("Enter The Number Of Inputs");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			lName.add(sc.next());
			System.out.println("Your List Of Last Name Is =" + lName.toString());
			Pattern pt = Pattern.compile(regex);
			List<String> result = lName.stream().filter(p -> pt.matcher(p).find()).collect(Collectors.<String>toList());
			System.out.println("Your Correct Last Name Is" + result);

		}

	}

	public static void emailUsingLambda() {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		ArrayList<String> email = new ArrayList<String>();
		System.out.println("Entet The Email Address");
		System.out.println("Enter The Number Of Inputs");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			email.add(sc.next());
			System.out.println("Your List Of Last Name Is =" + email.toString());
			Pattern pt = Pattern.compile(regex);
			List<String> result = email.stream().filter(p -> pt.matcher(p).find()).collect(Collectors.<String>toList());
			System.out.println("Your Correct Email Is" + result);

		}

	}

	public static void phNumberUsingLambda() {
		String regex = "91+[0-9]{9}";
		ArrayList<String> phNumber = new ArrayList<String>();
		System.out.println("Entet The Phone Number");
		System.out.println("Enter The Number Of Inputs");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			phNumber.add(sc.next());
			System.out.println("Your List Of Last Name Is =" + phNumber.toString());
			Pattern pt = Pattern.compile(regex);
			List<String> result = phNumber.stream().filter(p -> pt.matcher(p).find())
					.collect(Collectors.<String>toList());
			System.out.println("Your Correct Mobile Number Is" + result);

		}

	}

	public static void passwordUsingLambda() {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{8,}$";
		ArrayList<String> pass = new ArrayList<String>();
		System.out.println("Entet The Password");
		System.out.println("Enter The Number Of Inputs");
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			pass.add(sc.next());
			System.out.println("Your List Of Last Name Is =" + pass.toString());
			Pattern pt = Pattern.compile(regex);
			List<String> result = pass.stream().filter(p -> pt.matcher(p).find()).collect(Collectors.<String>toList());
			System.out.println("Your Correct Password Is" + result);

		}

	}

	public static void firstName() {

		System.out.println("Enter The First Name Please Make Sure Name Should be Star From Capital Letter And Minimum 3 Character");
		String fName = sc.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fName);
		System.out.println("String Result Is :" + m.matches());
		boolean check = (m.matches());
		if (check == true) {
			System.out.println("First Name Is Valid");
		} else {
			System.out.println("First Name Is Invalid");
		}
	}

	public static void lastName() {

		System.out.println("Enter The Last Name Please Make Sure Name Should be Star From Capital Letter And Minimum 3 Character");
		String lName = sc.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lName);
		System.out.println("String Result Is:" + m.matches());
		boolean check = (m.matches());
		if (check == true) {
			System.out.println("Last Name Is Valid");
		} else {
			System.out.println("Last Name Is Invalid");
		}
	}

	public static void email() {

		System.out.println("Enter The Valid Email Id");
		String email = sc.next();
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		System.out.println("String Result Is :" + m.matches());
		boolean check = (m.matches());
		if (check == true) {
			System.out.println("Email Id Is Valid");
		} else {
			System.out.println("Email Is Invalid");
		}

	}

	public static void phoneNumber() {

		System.out.println("Enter The Valid Phone Number Please Make Sure Number Should Start From 91 Code");
		String phoneNumber = sc.next();
		String regex = "91+[0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phoneNumber);
		System.out.println("String Result Is :" + m.matches());
		boolean check = (m.matches());
		if (check == true) {
			System.out.println("Number Is Valid");
		} else {
			System.out.println("Number IS Invalid");
		}

	}

	public static void password() {

		System.out.println("Please Enter The Valid Password using Rules");
		System.out.println("RULE 1: Minimum 8 Characters ");
		System.out.println("RULE 2: Should Have At Least 1 Upper Case");
		System.out.println("RULE 3: Should Have At Least 1 Numeric Number");
		System.out.println("RULE 4: Should Have At Least 1 Special Character");
		String password = sc.next();
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		System.out.println("String Result Is :" + m.matches());
		boolean check = m.matches();

		if (check == true) {
			System.out.println("Password Is Valid");
		} else {
			System.out.println("Password Is invalid");
		}
	}

	public static void main(String args[]) {

		System.out.println("Welcome To User Registration");
		menuBar();

	}
}
