package com.bridgelabz.addressbookassessment;

import java.util.Scanner;

public class AddressBookUC1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookUC1 addressBook = new AddressBookUC1();
        addressBook.createContact();
    }

    public void createContact() {
        Scanner scan = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("enter first name");
        String firstName = scan.next();
        contact.setFirstName(firstName);
        System.out.println("enter last name");
        String lastName = scan.next();
        contact.setLastName(lastName);
        System.out.println("enter address");
        String address = scan.next();
        contact.setAddress(address);
        System.out.println("enter city");
        String city = scan.next();
        contact.setCity(city);
        System.out.println("enter state");
        String state = scan.next();
        contact.setState(state);
        System.out.println("enter zip code");
        int zip = scan.nextInt();
        contact.setZip(zip);
        System.out.println("enter phone number");
        long phoneNumber = scan.nextLong();
        contact.setPhoneNumber(phoneNumber);
        System.out.println("enter email id");
        String email = scan.next();
        contact.setEmail(email);
        System.out.println(contact);
    }
}
