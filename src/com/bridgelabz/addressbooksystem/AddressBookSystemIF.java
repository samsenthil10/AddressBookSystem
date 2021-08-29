package com.bridgelabz.addressbooksystem;

public interface AddressBookSystemIF {

	public void createContacts(Contacts contacts);
	public void editContacts(Contacts[] contacts,  int contactTopPointer, int totalNumberOfContacts);
	public int deleteContacts(Contacts[] contacts,  int contactTopPointer, int totalNumberOfContacts);
	public int createAddressBooks(String[] addressBooksNames, int addressBookCounter, int totalNumberOfAddressBooks);
}