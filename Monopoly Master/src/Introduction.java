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
       
				while (wrongNumber)
					{
						if (wantInstructions == 1)
							{
								wrongNumber = false;
								giveInstructions();
							}

						else if (wantInstructions == 2)
							{
								wrongNumber = false;
								System.out.println("Great, it's time to play some Monopoly.");
							}

						else
							{
								System.out.println("Please pick 1 or 2");
							}
					}
				
				System.out.println("What theme would you like to use? \n(1) Standard \n(2) National Parks");
				
				int choosingTheme = userIntInput.nextInt();
				
				if (choosingTheme == 1)
					MonopolyRunner.changeThemes = 0;
				else if (choosingTheme == 2)
					MonopolyRunner.changeThemes = 1;

				System.out.println("Player 1, what is your name?");
				String playerOneName = userStringInput.nextLine();
				System.out.println("Great! hello " + playerOneName + ", you are player 1.");
				MonopolyRunner.players.add(new Player(playerOneName, 1500, 0, null, false));

				System.out.println("Player 2, what is your name?");
				String playerTwoName = userStringInput.nextLine();
				System.out.println("Great! hello " + playerTwoName);
				MonopolyRunner.players.add(new Player(playerTwoName, 1500, 0, null, false));

			}


		public static void giveInstructions()

		{ 
			System.out.println("This is a work in progress...");
			System.exit(0);
			
			//System.out.println("Instructions....");
		}


	}
