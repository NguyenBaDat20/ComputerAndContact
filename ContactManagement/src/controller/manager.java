/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import model.Contact;
import view.Menu;

public class manager extends Menu {

    public manager(String title, String[] options) {
        super(title, options);
    }
    ArrayList<Contact> cs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public String getValue(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public int getID() {
        int id = 0;
        if (cs.size() == 0) {
            id = 1;
        } else {
            id = cs.size() + 1;
        }
        return id;
    }

    public void addContact() {
        int id = getID();

        String fullname = getValue("Enter name:");
        String group = getValue("Enter group:");
        String address = getValue("Enter address:");
        String phone = getValue("Enter phone:");
        Contact c = new Contact(id, fullname, group, address, phone);
        cs.add(c);

    }

    public void displayContact() {
        System.out.printf("%-5s%-10s%-15s%-15s%-15s%-15s%-10s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        for (Contact contact : cs) {
            String[] a = contact.getFullname().split(" ");
            String b = a[0];
            String c = a[1];
            System.out.printf("%-5s%-10s%-15s%-15s%-15s%-15s%-10s\n",
                    contact.getId(), contact.getFullname(),
                    b, c,
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }
public void deleted() {
    int id = Integer.parseInt(getValue("Enter ID you want to remove:"));
    ArrayList<Contact> result = new ArrayList<>();
    int check = 0;
    for (Contact contact : cs) {
        if (contact.getId() == id) {
            check++;
            result.add(contact);
        }
    }   
    cs.removeAll(result);   
    if (check > 0) {
        System.out.println("Contact(s) removed successfully.");
    } else {
        System.out.println("No contact found with ID " + id);
    }
}

    @Override
    public void excuted(int n) {
        if (n==options.length) {
            check = false;
            System.out.println("Exit Successful !");
        } 
            switch (n) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContact();
                    break;
                case 3:
                    deleted();
                    break;
            
        }
    }

}
