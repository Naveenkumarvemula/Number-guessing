package Maths;

import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static int number, guess, MaxValue;
	public static Scanner scan;
	public static Random rand;
	
	public static void main(String args[])
	{
		scan = new Scanner(System.in);
		rand = new Random();
		System.out.println("Please enter a max range: ");
		MaxValue = scan.nextInt();
		number = rand.nextInt(MaxValue);
		System.out.println("Please enter a guess: ");
		while (guess != number)
		{
			guess = scan.nextInt();
			if (guess > number) {
				System.out.println("You guess is too high");
			}
			
			if (guess < number) {
				System.out.println("You guess is too low");
			}
		}
		System.out.println("You Won!");
		
	}
}