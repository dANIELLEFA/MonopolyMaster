
public class Dice
	{
		public static int rollDice()
		{
			boolean isDoubles = false;
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int diceTotal = dice1 + dice2;
			if (dice1 == dice2)
				{
					isDoubles = true;
				}
			return diceTotal;
			
		}
	}
