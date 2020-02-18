
public class Playing
	{
		static boolean playing;
		public static void play()
		{
			while(playing)
				{
					System.out.println("Hello "+Introduction.playerOne.getName()+" are at  " + MonopolyRunner.board.get(Introduction.playerOne.getPlaceOnBoard()) +".");
					Dice.rollDice();
					Introduction.playerOne.setPlaceOnBoard(Introduction.playerOne.getPlaceOnBoard() + Dice.diceTotal);;
					System.out.println(Introduction.playerOne.getName()+ ", you rolled a total of " +Dice.diceTotal +". You landed on " + MonopolyRunner.board.get(Introduction.playerOne.getPlaceOnBoard())+".");
					OptionsWhenYouLand.landOnPlace();
					System.out.println("Hello "+Introduction.playerTwo.getName()+" are at  " + MonopolyRunner.board.get(Introduction.playerTwo.getPlaceOnBoard()) +".");
					Dice.rollDice();
					Introduction.playerTwo.setPlaceOnBoard(Introduction.playerTwo.getPlaceOnBoard() + Dice.diceTotal);;
					System.out.println(Introduction.playerTwo.getName()+ ", you rolled a total of " +Dice.diceTotal +". You landed on " + MonopolyRunner.board.get(Introduction.playerTwo.getPlaceOnBoard())+".");
				}
		}
//		public static void landOnProperty()
//		{
//			
//		}
//		public static void landOnTax()
//		{
//				
//		}
//		public static void communityCard()
//		{
//			
//		}
//		public static void chanceCard()
//		{
//				
//		}
	}
