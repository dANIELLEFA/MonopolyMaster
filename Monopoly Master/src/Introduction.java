import java.util.Scanner; 

public class Introduction
	{
		static Scanner userStringInput = new Scanner(System.in); 
		static Scanner userIntInput = new Scanner(System.in); 
		
		public static void greetPlayers()
		{ 
			System.out.println("Hello, welcome to Monopoly, would you like the instructions?"); 
			
			
			
			
			
			System.out.println("Player 1, what is your name?"); 
			String playerOneName = userStringInput.nextLine(); 
			System.out.println("Great! hello "  + playerOneName + ", you are player 1.");
			
			
			
			
			
			
			System.out.println("Player 2, what is your name?");
			String playerTwoName = userStringInput.nextLine(); 
			System.out.println("Great! hello " + playerTwoName);
			
			
		}
		

	}
