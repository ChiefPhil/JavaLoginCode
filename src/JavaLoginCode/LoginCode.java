package JavaLoginCode;

import java.util.Scanner;

public class LoginCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner input = new Scanner(System.in);

	        String name = "InternShala"; 
	        String paswword = "philip";
	 
	        int count = 0;
	        while (count < 3) {
	            System.out.println("Enter Username");
	            String inputUsername = input.next();
	            System.out.println("Enter password");
	            String inputPassword = input.next();

	            if (inputUsername.equals(name) && inputPassword.equals(paswword)) {
	                System.out.println("You are now logged in");
	                break;
	            } else {
	                System.out.println("Wrong Username or Password. Please try again");
	            }

	            count++;
	        }

	        if (count >= 3) {
	            System.out.println("You have entered wrong three times. Please try again in a few hours");
	            System.exit(0);
	        }

	        input.close();
	    }

	}


