package myClass;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class myClass {
public static void main(String[]args) {
	Scanner user_input = new Scanner(System.in);
	String userName;
	System.out.print("Enter your first name: ");
	userName = user_input.next();
	
	int ContactDetails;
	System.out.print("Please enter your contact details:");
	ContactDetails =user_input.nextInt();
	
	Date now = new Date();
        System.out.println(now);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        dateFormat.format(now);
        System.out.println(now);

        Date birth = dateFormat.parse("");
        System.out.println(birth);
	
}

        
   
}
