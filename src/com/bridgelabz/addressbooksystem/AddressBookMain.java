package com.bridgelabz.addressbooksystem;

public class AddressBookMain {

	
	public static void main(String[] args) {

		AddressBookSystemIF addressBookImpl = new AddressBookSystemImpl();
		System.out.println("----------Welcome To Address Book Program----------");
		Contacts contacts = new Contacts();
		addressBookImpl.createContacts(contacts);
		addressBookImpl.editContacts(contacts);
	}
}