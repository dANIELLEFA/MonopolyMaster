
public class Dice
	{
		static int diceTotal;
		static boolean isDoubles;

		public static int rollDice()
		{
			boolean isDoubles = false;
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			diceTotal = dice1 + dice2;
			if (dice1 == dice2)
				{
					isDoubles = true;
				}
			return diceTotal;
			
		}
	}
