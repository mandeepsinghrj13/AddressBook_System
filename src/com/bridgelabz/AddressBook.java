package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook 
{
	private String firstname;
	private String lastname;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip= zip;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber =phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email =email;
	}
	
	@Override
	public String toString() {
		return "AddressBook [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	public static void main(String[] args) {
	   
	   System.out.println("Welcome to Address Book Program....!!!");
	   User();
		
	}
	public static void User() {
		try {
			
			//AddressBook addressbook1 = new AddressBook();
			ArrayList<AddressBook> l=new ArrayList<AddressBook>();
			
			Scanner sc = new Scanner(System.in);
			 	for(int i = 0; i < 2; i++) {
			 		AddressBook addressbook = new AddressBook();
				 System.out.println("Enter your name:");
			     addressbook.setFirstname(sc.next());
			     
				 System.out.println("Enter your Last Name:");
				 addressbook.setLastname(sc.next());
			 
				 System.out.println("Enter your City:");
				 addressbook.setCity(sc.next());
			
				 System.out.println("Enter your State:");
				 addressbook.setState(sc.next());
				 
				 System.out.println("Enter your Zip:");
				 addressbook.setZip(sc.next());
				 
				 System.out.println("Enter your PhoneNumber:");
				 addressbook.setPhoneNumber(sc.next());
						 
				 System.out.println("Enter your email:");
				 addressbook.setEmail(sc.next());
				 l.add(addressbook);
			 	}	
			 	
			 	System.out.println("All list" +l.toString());
			 	boolean choice=true;
			 	while(choice) {
			 	 System.out.println("Enter your command:(1 for edit and 2 for remove)");
			 	 int command=sc.nextInt();
			 	switch(command) {
			 	  case 1:edit(l);
			 	    break;
			 	  case 2:remove(l);
			 	    break;
			 	  default: System.out.println("command not found");
			 	    break;
			 	 }
			 	System.out.println("Do you want to cont for edit or remove..(y/n)");
			 	String s=sc.next();
			 	if(s.equals("n")) {
			 		choice=false;
			 		System.out.println("exit..");
			 	}
			 	}
		}catch(Exception e) {
			System.out.println(e);
		}
			
	}
	private static void remove(List l1) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("remove record");
		 System.out.println("Enter name to remove:");
		 String name=sc.next();
		 int c=0;
		for(int m=0;m<l1.size();m++){
			AddressBook addressbook=(AddressBook) l1.get(m);
			 if(name.equals(addressbook.firstname)) {
				 l1.remove(addressbook);
				 System.out.println("List After removing"+l1.toString());
				 c++;
				 break;
				 
			 }
		}
		if(c==0) {
			System.out.println("User not found");
		}
	}
	private static void edit(List l1) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Edit record");
		 System.out.println("Enter name to edit:");
		 String name=sc.next();
		 int c=0;
		for(int m=0;m<l1.size();m++){
			AddressBook	addressbook=(AddressBook) l1.get(m);
			 if(name.equals(addressbook.firstname)) {
				 boolean choice=true;
				 	while(choice) {
				 	 System.out.println("Which data you want to edit ::(city,state,zip,phone,email) ");
				 	String command=sc.next();
				 	switch(command) {
				 	  case "city":System.out.println("Enter new city:");
					        addressbook.setCity(sc.next());
				 	  break;
				 	  case "state":System.out.println("Enter new state:");
					        addressbook.setState(sc.next());
				 	  break;
				 	  case "zip":System.out.println("Enter new zip:");
					        addressbook.setZip(sc.next());
			 	      break;
				 	  case "phone":System.out.println("Enter new phone:");
					        addressbook.setPhoneNumber(sc.next());
			 	      break;
				 	  case "email":System.out.println("Enter new email:");
			                addressbook.setEmail(sc.next());
			 	      break;
				 	  default: System.out.println("command not found");
				 	  break;
				 	 }
				 	System.out.println("Do you want to any other data..(y/n)");
				 	String s=sc.next();
				 	if(s.equals("n")) {
				 		choice=false;
				 		System.out.println("exit..");
				 	}
				 	}
			
				 System.out.println("List After editing is"+l1.toString());
				 c++;
				 break;
			 }
		}
		if(c==0) {
			System.out.println("User not found");
		}
	}
}
