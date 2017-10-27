package arrays;

import java.util.Scanner;

public class Array_UserInput {
	
	static String[] first_names = new String[11];
	static String[] last_names = new String[11];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		
		first_names[0] = "Andrew";
		first_names[1] = "Bob";
		first_names[2] = "John";
		first_names[3] = "Fred";
		first_names[4] = "Alex";
		first_names[5] = "Zach";
		first_names[6] = "Alan";
		first_names[7] = "Tom";
		first_names[8] = "Jack";
		first_names[9] = "Tyler";
		first_names[10] = "Robin";
		
		System.out.println("Welcome to the name generator!");
		System.out.println("Lets start with your first name!");
		
		String userFirst_name;
		System.out.print("Choose a number from 0 to 10: ");
		userFirst_name = user_input.next();
		int newusername = Integer.parseInt(userFirst_name);
		
		String newname = first_names[newusername];
		System.out.println("Your first name is: " + newname);
		
		last_names[0] = "Bernas";
		last_names[1] = "Cena";
		last_names[2] = "Anderson";
		last_names[3] = "Holton";
		last_names[4] = "Alex";
		last_names[5] = "Hallin";
		last_names[6] = "Penn";
		last_names[7] = "Packard";
		last_names[8] = "Liu";
		last_names[9] = "Chan";
		last_names[10] = "Xu";
		
		System.out.println("Now lets do your last name!");
		
		String userLast_name;
		System.out.print("Choose a number from 0 to 10: ");
		userLast_name = user_input.next();
		int newusername1 = Integer.parseInt(userFirst_name);
		
		String newname1 = last_names[newusername1];
		System.out.println("Your last name is: " + newname1);
		
		String full_name = first_names[newusername] + " " + last_names[newusername1];
		System.out.println("Your full name is: " + full_name);
		

	}

}
