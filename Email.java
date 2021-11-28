package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String mailId;
	private int defaultLength=8;
	private String department;
	private String companySuffix="abccompany.in";
	private String AlternateEmail;
	private int mailBoxCapacity=500;


public Email(String fname,String lname){
	this.firstName=fname;
	this.lastName=lname;
//	System.out.println("X-mail created "+ firstName+ " "+lastName);
	department=getDepartment();
	mailId=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	password=getPassword(defaultLength);
}

public void display() {
	System.out.println("Welcome "+getName()+"\nYour e-mail id is :"+mailId+"\nPassword :"+password+"\nMail Box Capacity: "+mailBoxCapacity);
}

public String getDepartment( ){
	System.out.println("Department Codes: \n1 Accounts\n2 Develpoment \n3 Security\n4 None\nEnter your department code:");
	Scanner in=new Scanner(System.in);
	int code=in.nextInt();
	switch(code) {
	case 1:
		return "acc";
	case 2:
		return "dev";
	case 3:
		return "sec";
	case 4:
		return "";
		default: return "";
	}
}

public String getPassword(int length) {
	String alp="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$*&";
	char[] password=new char[length];
	for(int i=0;i<length;i++)
	{
		int random=(int)(Math.random()*alp.length());
		password[i]=alp.charAt(random);
//		System.out.println(random +" "+(int)Math.random());
	}
	return new String (password);
}

public void setPassword(String newPassword) {
	this.password=newPassword;
}
public void setAlternateXmail(String alternate) {
	this.AlternateEmail=alternate;
}
public void setMailBoxCapacity(int n) {
	this.mailBoxCapacity=n;
}
public String getName() {
	return firstName+" "+lastName;
}
public String getXmail() {
	return mailId;
}
public int getMailBoxCapacity() {
	return mailBoxCapacity;
}
}
