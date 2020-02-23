import java.util.Scanner;

public class BuyThings
	{
		static Scanner userStringInput = new Scanner(System.in);

		public static void buyPlaces()
			{

				if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Property"))
					{
						if (!BuyableProperties.isBought())
							{
								System.out.println("Would you like to buy this property?\n(1) Yes\n(2) No");
								String answer = userStringInput.nextLine();
								BuyableProperties myPropertyToAdd = ((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place));
								
								if (answer.equals("1") || answer.toUpperCase().equals("YES"))
									{
										MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().add(myPropertyToAdd);
										((BuyableProperties)MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(true);
									}
							}
						
System.out.println("TEST!!!: ---> ");
			
						for(BuyableProperties p : MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties())
						{
							System.out.println(p.getName() + " " + p.getPrice()); 
						}

					}
				
				else if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Railroad"))
					{
						if (!BuyableProperties.isBought())
							{
								System.out.println("Would you like to buy this property?\n(1) Yes\n(2) No");
								String answer = userStringInput.nextLine();
	
								BuyableProperties myRailroadToAdd = ((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place));
								
								if (answer.equals("1") || answer.toUpperCase().contentEquals("YES"))
									{
										MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().add(myRailroadToAdd);
										((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(true);
									}
								
								System.out.println("TEST!!!: ---> ");
								
								for(BuyableProperties p : MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties())
								{
									System.out.println(p.getName() + " " + p.getPrice()); 
								}
								
							}

					}
				else if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Utility"))
					{
					
						if (!BuyableProperties.isBought())
							{
								System.out.println("Would you like to buy this property?\n(1) Yes\n(2) No");
								String answer = userStringInput.nextLine();
								
								BuyableProperties myUtilityToAdd = ((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place));
								
								if (answer.equals("YES"))
									{
										MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().add(myUtilityToAdd);

										((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(true);

									}
								System.out.println("TEST!!!: ---> ");
								
								for(BuyableProperties p : MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties())
								{
									System.out.println(p.getName() + " " + p.getPrice()); 
								}
								
							}

					}
			}
	}
