import java.util.Scanner;

public class BuyThings
	{
		static Scanner userStringInput = new Scanner(System.in);

		public static void buyPlaces()
			{

				if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Property"))
					{
						String propertyName = MonopolyRunner.board.get(OptionsWhenYouLand.place).getName();
						String propertyColor = ((Properties) MonopolyRunner.board.get(OptionsWhenYouLand.place)).getColor();
						System.out.println("You landed on " + propertyName + " property. The color of this property is "
								+ propertyColor);
						if (!BuyableProperties.isBought())
							{
								System.out.println("Would you like to buy this property? (\"Yes or no\")");
								String answer = userStringInput.nextLine();
								String proofAnswer = answer.toUpperCase();
								Properties property = ((Properties) MonopolyRunner.board.get(OptionsWhenYouLand.place));
								if (proofAnswer.equals("YES"))
									{
										MonopolyRunner.players.get(0).getPlayerProperties().add(property);
										((Properties) MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(false);
									}
								
							}

					}
			}
	}
