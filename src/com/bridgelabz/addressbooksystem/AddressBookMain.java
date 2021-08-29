package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		AddressBookSystemIF addressBookImpl = new AddressBookSystemImpl();
		System.out.println("----------Welcome To Address Book Program----------");
		System.out.println();
		System.out.print("Enter total number of Address Books To be stored: ");
		int totalNumberOfAddressBooks = scanner.nextInt();
		String[] addressBooksNames = new String[totalNumberOfAddressBooks];
		scanner.nextLine();
		int addressBookCounter=-1;
		System.out.print("Enter total number of contacts To be stored: ");
		int totalNumberOfContacts = scanner.nextInt();
		scanner.nextLine();
		Contacts[] contacts = new Contacts[totalNumberOfContacts];
		int contactTopPointer = -1;
		while(true) {

			System.out.print("\n1.Create a new contact\n2.Edit an existing contact\n3.Delete an existing contact\n4.Create Address Book\n5.Exit\nSelect your option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1: if(contactTopPointer < totalNumberOfContacts-1) {
				contactTopPointer++;
				contacts[contactTopPointer] = new Contacts(); 
				addressBookImpl.createContacts(contacts[contactTopPointer]);
			}
			else {
				System.out.println("Address Book Full!");
			}
			break;
			case 2: addressBookImpl.editContacts(contacts, contactTopPointer, totalNumberOfContacts);
			break;
			case 3: contactTopPointer= addressBookImpl.deleteContacts(contacts, contactTopPointer, totalNumberOfContacts);
			break;
			case 4:if(addressBookCounter < totalNumberOfAddressBooks-1) {
				addressBookCounter = addressBookImpl.createAddressBooks(addressBooksNames, addressBookCounter, totalNumberOfAddressBooks);
			}
			else {
				System.out.println("Address Books Limit Reached!");
			}
			break;
			case 5:scanner.close();
			System.exit(1);
			break;
			default: System.err.println("Invalid Option!");
			}
		}
	}
}