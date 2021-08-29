package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookSystemImpl implements AddressBookSystemIF {

	Scanner scanner = new Scanner(System.in);

	@Override
	public void createContacts(Contacts contacts) {

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

	}

	@Override
	public void editContacts(Contacts contacts) {

		System.out.print("Enter the First Name of contact to be edited: ");
		String firstName = scanner.nextLine();
		if(firstName.equalsIgnoreCase(contacts.getFirstName())) {
			System.out.print("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip Code\n7.Phone Number\n8.Email ID\nSelect the field to edit: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:System.out.print("Enter First Name: ");
			contacts.setFirstName(scanner.nextLine());
			break;
			case 2:System.out.print("Enter Last Name: ");
			contacts.setLastName(scanner.nextLine());
			break;
			case 3:System.out.print("Enter Address: ");
			contacts.setAddress(scanner.nextLine());
			break;
			case 4:System.out.print("Enter City: ");
			contacts.setCity(scanner.nextLine());
			break;
			case 5:System.out.print("Enter State: ");
			contacts.setState(scanner.nextLine());
			break;
			case 6:System.out.print("Enter Zip Code: ");
			contacts.setZip(scanner.nextInt());
			scanner.nextLine();
			break;
			case 7:System.out.print("Enter Phone Number: ");
			contacts.setPhoneNumber(scanner.nextInt());
			scanner.nextLine();
			break;
			case 8:System.out.print("Enter E Mail ID: ");
			contacts.setEmail(scanner.nextLine());
			break;
			default:System.err.println("Invalid Option!");
			}
		}
		else {
			System.err.println("Contact Not Found!");
		}
	}
}