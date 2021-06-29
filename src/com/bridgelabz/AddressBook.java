package com.bridgelabz;
import java.util.ArrayList;
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
	
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	
	
	public String getZip() 
	{
		return zip;
	}
	public void setZip(String zip) 
	{
		this.zip = zip;
	}
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	@Override
	public String toString() 
	{
		return "AddressBook [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

    public static void main(String[] args) 
    {
         System.out.println("Welcome to Address Book Program....!!!");
     	 AddressBook addressbook = new AddressBook();
		 AddressBook addressbook1 = new AddressBook();
		 ArrayList<AddressBook> p=new ArrayList<AddressBook>();
 		 ArrayList<AddressBook> totalarray=new ArrayList<AddressBook>();
 		 Scanner sc = new Scanner(System.in);
 			 System.out.println("Enter your name:");
 			 String s=sc.nextLine();
 			 addressbook.setFirstname(s);
 			 String fname= addressbook. getFirstname();
 			 System.out.println(fname);
 		
 			 System.out.println("Enter your Last Name:");
 			 addressbook.setLastname(sc.nextLine());
 			 String lname= addressbook.getLastname();
 			 System.out.println(lname);
 		 
 			 System.out.println("Enter your City:");
 			 addressbook.setCity(sc.nextLine());
 			 String city= addressbook. getCity();
 			 System.out.println(city);
 		
 			 System.out.println("Enter your State:");
 			 addressbook.setState(sc.nextLine());
 			 String state= addressbook. getState();
 			 System.out.println(state);
 				 
 			 System.out.println("Enter your Zip:");
 			 addressbook.setZip(sc.next());
 			 String zip= addressbook. getZip();
 			 System.out.println(zip);
 				
 			 System.out.println("Enter your PhoneNumber:");
 			 addressbook.setPhoneNumber(sc.next());
 			 String  PhoneNumber= addressbook.getPhoneNumber();
 			 System.out.println( PhoneNumber);
 					 
 			 System.out.println("Enter your email:");
 			 addressbook.setEmail(sc.next());
 			 String email= addressbook. getEmail();
 			 System.out.println( email );
 			 
 			 
 			 System.out.println("Enter your name:");
			 String s1=sc.nextLine();
			 addressbook1.setFirstname(sc.nextLine());
			 String fname1= addressbook1. getFirstname();
			 System.out.println(fname1);
		
			 System.out.println("Enter your Last Name:");
			 addressbook1.setLastname(sc.nextLine());
			 String lname1= addressbook1.getLastname();
			 System.out.println(lname1);
		 
			 System.out.println("Enter your City:");
			 addressbook1.setCity(sc.nextLine());
			 String city1= addressbook1. getCity();
			 System.out.println(city1);
		
			 System.out.println("Enter your State:");
			 addressbook1.setState(sc.nextLine());
			 String state1= addressbook1. getState();
			 System.out.println(state1);
				 
			 System.out.println("Enter your Zip:");
			 addressbook1.setZip(sc.next());
			 String zip1= addressbook1. getZip();
			 System.out.println(zip1);
			 
			 System.out.println("Enter your PhoneNumber:");
			 addressbook1.setPhoneNumber(sc.next());
			 String  PhoneNumber1= addressbook1.getPhoneNumber();
			 System.out.println( PhoneNumber1);
					 
			 System.out.println("Enter your email:");
			 addressbook1.setEmail(sc.next());
			 String email1= addressbook1. getEmail();
			 System.out.println(email1);
 			p.add(addressbook);
 			p.add(addressbook1);
 			totalarray.addAll(p);
 			System.out.println(""+totalarray );
    }

}
