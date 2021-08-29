package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

	public static void createContacts() {

		Contacts contacts = new Contacts();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		contacts.setFirstName(scanner.nextLine());
		System.out.print("Enter Last Name: ");
		contacts.setLastName(scanner.nextLine());
		System.out.print("Enter Address: ");
		contacts.setAddress(scanner.nextLine());
		System.out.print("Enter City: ");
		contacts.setCity(scanner.nextLine());
		System.out.print("Enter State: ");
		contacts.setState(scanner.nextLine());
		System.out.print("Enter Zip Code: ");
		contacts.setZip(scanner.nextInt());
		System.out.print("Enter Phone Number: ");
		scanner.nextLine();
		contacts.setPhoneNumber(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Enter E Mail ID: ");
		contacts.setEmail(scanner.nextLine());
		scanner.close();
	}

	public static void main(String[] args) {

		System.out.println("----------Welcome To Address Book Program----------");
		createContacts();
	}
}
