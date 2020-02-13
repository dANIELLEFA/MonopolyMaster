import java.util.Scanner; 

public class Introduction
	{
		static Scanner userStringInput = new Scanner(System.in); 
		static Scanner userIntInput = new Scanner(System.in); 
		
		public static void greetPlayers()
		{ 
			System.out.println("Hello, welcome to Monopoly, would you like the instructions? \n(1) Yes \n(2) No");    
			int wantInstructions = userIntInput.nextInt();
			
			boolean wrongNumber = true; 
		
			while(wrongNumber)
				{ 
			if(wantInstructions == 1)
				{ 
					wrongNumber = false; 
					giveInstructions(); 
				}
			
			else if(wantInstructions == 2)
				{ 
					wrongNumber = false; 
					System.out.println("Great, it's time to play some monopoy.");
				}
			
			else
				{ 
				  System.out.println("Please pick 1 or 2");
				  wrongNumber = true;  
				}
				}
			
			System.out.println("Player 1, what is your name?"); 
			String playerOneName = userStringInput.nextLine(); 
			System.out.println("Great! hello "  + playerOneName + ", you are player 1.");
			
			Player playerOne = new Player(playerOneName, 1500, 0, null); 
			
			
			
			
			
			
			
			System.out.println("Player 2, what is your name?");
			String playerTwoName = userStringInput.nextLine(); 
			System.out.println("Great! hello " + playerTwoName);
			Player playerTwo = new Player(playerTwoName, 1500, 0, null); 

		}
		
		public static void giveInstructions()
		{ 
			System.out.println("Here are the instructions: ");
			//System.out.println("(1) You will start the game with $1500");
			
		}
		

	}
