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
//						System.out.println("You landed on " + propertyName + " property. The color of this property is "
//								+ propertyColor);
						if (!BuyableProperties.isBought())
							{
								System.out.println("Would you like to buy this property? (\"Yes or no\")");
								String answer = userStringInput.nextLine();
								String proofAnswer = answer.toUpperCase();
								BuyableProperties property = ((Properties) MonopolyRunner.board.get(OptionsWhenYouLand.place));
								
								if (proofAnswer.equals("YES"))
									{
									System.out.println("test");
									
										MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().add(property);
										((Properties) MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(true);
									}
								
							}

					}
				else if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Railroad"))
					{
						String railroadName = MonopolyRunner.board.get(OptionsWhenYouLand.place).getName();
						System.out.println("You landed on " + railroadName + ".");
						if (!BuyableProperties.isBought())
							{
								System.out.println("Would you like to buy this railroad? (\"Yes or no\")");
								String answer = userStringInput.nextLine();
								String proofAnswer = answer.toUpperCase();
								Railroads railroad = ((Railroads) MonopolyRunner.board.get(OptionsWhenYouLand.place));
								if (proofAnswer.equals("YES"))
									{
										MonopolyRunner.players.get(0).getPlayerProperties().add(railroad);
										((Railroads) MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(true);
									}
								
							}

					}
				else if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Utility"))
					{
						String utilityName = MonopolyRunner.board.get(OptionsWhenYouLand.place).getName();
						System.out.println("You landed on " + utilityName + ".");
						if (!BuyableProperties.isBought())
							{
								System.out.println("Would you like to buy this utility? (\"Yes or no\")");
								String answer = userStringInput.nextLine();
								String proofAnswer = answer.toUpperCase();
								Utilities utility = ((Utilities) MonopolyRunner.board.get(OptionsWhenYouLand.place));
								if (proofAnswer.equals("YES"))
									{
										MonopolyRunner.players.get(0).getPlayerProperties().add(utility);
										((Utilities) MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(true);
									}
								
							}

					}
			}
	}
