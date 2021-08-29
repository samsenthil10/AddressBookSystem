package com.bridgelabz.addressbooksystem;

public class AddressBookSystemImpl implements AddressBookSystemIF {
	
	@Override
	public void createContacts(Contacts contacts) {

		System.out.print("Enter First Name: ");
		contacts.setFirstName(AddressBookMain.scanner.nextLine());
		System.out.print("Enter Last Name: ");
		contacts.setLastName(AddressBookMain.scanner.nextLine());
		System.out.print("Enter Address: ");
		contacts.setAddress(AddressBookMain.scanner.nextLine());
		System.out.print("Enter City: ");
		contacts.setCity(AddressBookMain.scanner.nextLine());
		System.out.print("Enter State: ");
		contacts.setState(AddressBookMain.scanner.nextLine());
		System.out.print("Enter Zip Code: ");
		contacts.setZip(AddressBookMain.scanner.nextInt());
		System.out.print("Enter Phone Number: ");
		AddressBookMain.scanner.nextLine();
		contacts.setPhoneNumber(AddressBookMain.scanner.nextInt());
		AddressBookMain.scanner.nextLine();
		System.out.print("Enter E Mail ID: ");
		contacts.setEmail(AddressBookMain.scanner.nextLine());
	}

	@Override
	public void editContacts(Contacts[] contacts, int contactTopPointer, int totalNumberOfContacts) {

		if(contactTopPointer == -1) {
			System.out.println("Contacts Empty!");
		}
		else {
			System.out.print("Enter the Phone Number of contact to be edited: ");
			int phoneNumber = AddressBookMain.scanner.nextInt();
			int editIndex = -1;
			for(int index = 0; index <= contactTopPointer && contactTopPointer < totalNumberOfContacts ; index++) {
				if((phoneNumber == contacts[index].getPhoneNumber()))
					editIndex = index;
			}
			if(editIndex == -1) {
				System.out.println("Contact Not found");
			}
			else {
				System.out.print("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip Code\n7.Phone Number\n8.Email ID\nSelect the field to edit: ");
				int choice = AddressBookMain.scanner.nextInt();
				AddressBookMain.scanner.nextLine();
				switch(choice) {
				case 1:System.out.print("Enter First Name: ");
				contacts[editIndex].setFirstName(AddressBookMain.scanner.nextLine());
				break;
				case 2:System.out.print("Enter Last Name: ");
				contacts[editIndex].setLastName(AddressBookMain.scanner.nextLine());
				break;
				case 3:System.out.print("Enter Address: ");
				contacts[editIndex].setAddress(AddressBookMain.scanner.nextLine());
				break;
				case 4:System.out.print("Enter City: ");
				contacts[editIndex].setCity(AddressBookMain.scanner.nextLine());
				break;
				case 5:System.out.print("Enter State: ");
				contacts[editIndex].setState(AddressBookMain.scanner.nextLine());
				break;
				case 6:System.out.print("Enter Zip Code: ");
				contacts[editIndex].setZip(AddressBookMain.scanner.nextInt());
				AddressBookMain.scanner.nextLine();
				break;
				case 7:System.out.print("Enter Phone Number: ");
				contacts[editIndex].setPhoneNumber(AddressBookMain.scanner.nextInt());
				AddressBookMain.scanner.nextLine();
				break;
				case 8:System.out.print("Enter E Mail ID: ");
				contacts[editIndex].setEmail(AddressBookMain.scanner.nextLine());
				break;
				default:System.out.println("Invalid Option!");
				}
			}
		}
	}

	@Override
	public int deleteContacts(Contacts[] contacts, int contactTopPointer, int totalNumberOfContacts) {
		if(contactTopPointer == -1) {
			System.out.println("Contacts Empty!");
		}
		else {
			System.out.print("Enter the Phone Number of contact to be edited: ");
			int phoneNumber = AddressBookMain.scanner.nextInt();
			int deleteIndex = -1;
			for(int index = 0; index <= contactTopPointer && contactTopPointer<totalNumberOfContacts; index++) {
				if((phoneNumber == contacts[index].getPhoneNumber()))
					deleteIndex = index;
			}
			if(deleteIndex == -1) {
				System.out.println("Contact Not found");
			}
			else {
				if(deleteIndex == 0) {
					contacts[deleteIndex]=null;
					System.out.println("Successfully Deleted Record");
				    contactTopPointer--;
				}
				else {
					contacts[deleteIndex]=null;
					for(int index = deleteIndex; index < contactTopPointer; index++)
						contacts[index]=contacts[index+1];
					System.out.println("Successfully Deleted Record");
					contactTopPointer--;
				}
			}
		}
		return contactTopPointer;
	}
}