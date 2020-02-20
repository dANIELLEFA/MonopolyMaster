
public class Playing
	{
		
		

		static int player =1;

		static boolean playing;
		public static void play()
		{
			while(playing)
				{
					player--;
					System.out.println("Hello "+MonopolyRunner.players.get(player).getName()+" you are at  " + MonopolyRunner.board.get(MonopolyRunner.players.get(player).getPlaceOnBoard()) +".");
					Dice.rollDice();

					MonopolyRunner.players.get(player).setPlaceOnBoard(MonopolyRunner.players.get(player).getPlaceOnBoard() + Dice.diceTotal);;
					System.out.println(MonopolyRunner.players.get(player).getName()+ ", you rolled a total of " +Dice.diceTotal +". You landed on " + MonopolyRunner.board.get(MonopolyRunner.players.get(player).getPlaceOnBoard())+".");
					OptionsWhenYouLand.landOnPlace();
					player++;
					System.out.println("Hello "+MonopolyRunner.players.get(player).getName()+" are at  " + MonopolyRunner.board.get(MonopolyRunner.players.get(player).getPlaceOnBoard()) +".");

					Dice.rollDice();
					MonopolyRunner.players.get(player).setPlaceOnBoard(MonopolyRunner.players.get(player).getPlaceOnBoard() + Dice.diceTotal);;
					System.out.println(MonopolyRunner.players.get(player).getName()+ ", you rolled a total of " +Dice.diceTotal +". You landed on " + MonopolyRunner.board.get(MonopolyRunner.players.get(player).getPlaceOnBoard())+".");
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
