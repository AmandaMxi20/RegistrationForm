
package registration;
import java.util.*;// imports their entire java.util package
import java.util.Scanner;//imports the scanner class


public class MzamomtshaRegistration {
public static void main(String[]args) {
	//(System.in)tells Java that this will be the system input
		//input will be given to the system

	Scanner user_input = new Scanner(System.in);// declaring the user_input as an object of Scanner class
	//Learner no:
	System.out.println("Please enter your Learner no:");
	int number;
	number= user_input.nextInt(); // number is the object of the scanner class
	//nextInt() is the method of the object number of the scanner class
	System.out.println("Learner No: " + number);

	//Name and surname of the Learner
	System.out.println("Please enter your name:");
	System.out.println("Please enter your surname:"); 
	String name= user_input.nextLine();
	String surname =user_input.nextLine();
	System.out.println("Your name and Surname is:" + name + "  " +  surname);
	// Learner Date of birth
	System.out.print("What is your date of birth?:");

	int day= user_input.nextInt();
	String month= user_input.nextLine();
	int year = user_input.nextInt();
	if(day>31) {
		System.out.println("A day greater than 31 does not exist");
	}
	else {
	System.out.println("Your date of birth:" + day + "/" + month +"/" + year);
	}
	// Contact details
	System.out.println("Enter your Parent's contact details:");
	int contact;
	contact = user_input.nextInt();
	if(contact!=10) {
		System.out.println("Try again");
		}
	else {
		System.out.println("Your parents contact details" + contact);	
		}

	//Physical address
	System.out.print("Enter your physical address:");
	int streetNo= user_input.nextInt();
	String streetName = user_input.nextLine();
	String suburb= user_input.nextLine();
	String city = user_input.nextLine();
	int postcode = user_input.nextInt();
	if(postcode<4) {
		System.out.println("Postcode is a 4 digit code. TRY AGAIN");
	}
	else {
	System.out.println("Your Address:" + streetNo + " " + streetName + "\n " + suburb
			+ " \n" + city + "\n " + postcode );
	}
	
	//Parents Citizenship
	System.out.print("Enter your citizenship");
	String citizenship = user_input.nextLine();
	
	
	
	
	
	
	//parent document status
	//name
	System.out.println("Enter your Parent's or Guardian name");
	String pname = user_input.nextLine();
	System.out.println("Name:" + pname);
	
	//surname 
	System.out.println("Enter surname:");
	String psurname= user_input.nextLine();
	System.out.println("Surname: " + psurname);
	
	//gender
	String gender = user_input.nextLine();
	boolean female = true;
	boolean male = true;
	
	if(female) {
		System.out.println("You are a female" + gender);
	}
	else {
		System.out.println("You are a Male "+ gender);
	}
	
	
	
}
	

}
