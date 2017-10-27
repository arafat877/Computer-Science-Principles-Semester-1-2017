package arrays;

import java.util.Scanner;

public class UserInput {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		
		String first_name;
		System.out.print("Write your first name here:");
		first_name = user_input.next();
		
		String last_name;
		System.out.print("Write you last name here:");
		last_name = user_input.next();
		
		String full_name;
		full_name = first_name + " " + last_name;
		
		System.out.println("Your name is: " + full_name);

	}

}
