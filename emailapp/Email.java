package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName,
		   		   lastName,
		   		   password,
		   		   department,
		   		   alternateEmail,
		   		   email,
		   		   companySuffix = "emailapp.com";
	private int mailboxCapacity = 500, defaultPasswordLength=8;
	
	// Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// Call a method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		//System.out.println("Your email is: " + email);
	}
	
	// Ask for department
	private String setDepartment() {
		System.out.println("Departments\n 1.Sales\n 2.Development\n 3.Accounting\n 0.None\n Enter Department: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		
		if(deptChoice == 1) {
			return "Sales";
		}
		else if (deptChoice == 2) {
			return "Development";
		}
		else if (deptChoice == 3) {
			return "Accounting";
		}
		else
		{
			return "";
		}
	}
	
	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		char[] password = new char[length];
		
		for(int i=0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		System.out.println("Your new email capacity is: " + capacity);
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		System.out.println("Your alternate email is:" + altEmail);
	}
	
	// Change the password
	public void changePassword(String newPassword) {
		this.password = newPassword;
		System.out.println("Your new password is: " + newPassword);
	}
	
	// Get Mailbox Capacity
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	// Get Alternate Email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	// Get Password
	public String getPassword() {
		return password;
	}
	
	// Get All Info
	public String showInfo() {
		return ("Display Name: " + firstName + " " + lastName + 
				"\nCompany Email: " + email +
				"\nMailbox Capacity: " + mailboxCapacity + " mb");
		
	}
}
