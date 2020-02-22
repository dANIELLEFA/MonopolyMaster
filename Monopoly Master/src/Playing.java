public class Playing
	{
		
		
		// which player is it
		static int currentPlayer = 1;
		static int notCurrentPlayer = 0;

		static boolean playing = true;
		
		static int diceRoll;
		
		public static void play()
		{
			while(playing)
				{
					SwitchPlayers.switchCurrentPlayer();
					
					if (checkJail())
					{
						//do jail
					}
					else
					{
						introduceTurn();
					}
					
					diceRoll = Dice.rollDice();
					
					if (checkReverse())
					{
						moveBackwards();
					}
					else
					{
						moveForward();
					}
					
					System.out.println(MonopolyRunner.players.get(currentPlayer).getName() + ", you rolled a total of " + diceRoll + ". You landed on " 
					+ MonopolyRunner.board.get(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard()).getName() + ".");
					
					OptionsWhenYouLand.landOnPlace();
				}
		}
		
		private static void introduceTurn()
		{
			System.out.println(MonopolyRunner.players.get(currentPlayer).getName() + ", you are at " 
					+ MonopolyRunner.board.get(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard()).getName() +".");
			System.out.println("Press enter to roll the dice.");
			String enterToContinue = MonopolyRunner.userStringInput.nextLine();
		}
		
		private static boolean checkJail()
		{
			if(MonopolyRunner.players.get(currentPlayer).isInJail())
				return true;
			
			return false;
			
		}
		
		private static boolean checkReverse()
		{
			if (MonopolyRunner.players.get(currentPlayer).isInReverse())
				return true;
			
			return false;
		}
		
		private static void moveForward()
		{
			MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() + diceRoll);
		}
		
		private static void moveBackwards()
		{
			MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() - diceRoll);
		}
	}
