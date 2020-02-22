public class Playing
	{
		
		
		// which player is it
		static int currentPlayer = 1;
		static int notCurrentPlayer = 0;

		static boolean playing = true;
		
		public static void play()
		{
			while(playing)
				{
					SwitchPlayers.switchCurrentPlayer();
					
					System.out.println(MonopolyRunner.players.get(currentPlayer).getName() + " you are at " 
					+ MonopolyRunner.board.get(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard()).getName() +".");
					
					System.out.println("Press enter to roll the dice.");
					String enterToContinue = MonopolyRunner.userStringInput.nextLine();
					Dice.rollDice();

					MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() + Dice.diceTotal);
					
					System.out.println(MonopolyRunner.players.get(currentPlayer).getName() + ", you rolled a total of " + Dice.diceTotal +". You landed on " 
					+ MonopolyRunner.board.get(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard()).getName() + ".");
					
					OptionsWhenYouLand.landOnPlace();
					
					SwitchPlayers.switchCurrentPlayer();
					
					System.out.println(MonopolyRunner.players.get(currentPlayer).getName()+" you are at  " 
					+ MonopolyRunner.board.get(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard()).getName() +".");
					
					System.out.println("Press enter to roll the dice.");
					String enterToContinueTwo = MonopolyRunner.userStringInput.nextLine();
					Dice.rollDice();
					
					MonopolyRunner.players.get(currentPlayer).setPlaceOnBoard(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard() + Dice.diceTotal);
					
					System.out.println(MonopolyRunner.players.get(currentPlayer).getName()+ ", you rolled a total of " +Dice.diceTotal
							+". You landed on " + MonopolyRunner.board.get(MonopolyRunner.players.get(currentPlayer).getPlaceOnBoard()).getName() + ".");
					OptionsWhenYouLand.landOnPlace();
				}
		}
	}
