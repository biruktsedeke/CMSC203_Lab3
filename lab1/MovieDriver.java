package lab1;

import java.util.Scanner;

public class MovieDriver {
	public static void main(String[]args) {
		String movie;
		String number;
		int ticket;
		String answer;
		
		Scanner Input = new Scanner(System.in);
		Movie x1 = new Movie();
		do {
		System.out.println("Enter movie title: ");
		movie=Input.nextLine();
		x1.setTitle(movie);
		System.out.println("Enter movie rating: ");
		number = Input.nextLine();
		x1.setRating(number);
		System.out.println("Enter the number of tickets that are sold: ");
		 ticket = Input.nextInt();
		 x1.setSoldTickets(ticket);
		 System.out.println(x1.toString());
		 System.out.println("Do you want to try again?; ");
		 answer = Input.nextLine();
		 	Input.nextLine();
		} while(answer.equals("yes"));
			
	}

}
