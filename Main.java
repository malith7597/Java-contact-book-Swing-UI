package com.company;

public class Main
{
    public static void main(String[] args)
    {
       int windowWidth = 450, windowHeight = 600,               // Overall frame dimensions
                windowLocationX = 200, windowLocationY = 100;        //     and position
        AddressBook contacts = new AddressBook();
        contacts.setSize(windowWidth, windowHeight);
        contacts.setLocation(windowLocationX, windowLocationY);
        contacts.setTitle("My address book: 1234567");
        contacts.setUpAddressBook();
        contacts.setUpGUI();
        contacts.setVisible(true);
    }


}
