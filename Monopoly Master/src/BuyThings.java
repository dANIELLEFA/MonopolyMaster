import java.util.Scanner;

public class BuyThings
	{
		static Scanner userStringInput = new Scanner(System.in);
		
		 

		public static void buyPlaces()
			{
			
			
			
				//buy property
				if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Property"))
					{
					
					int currentPlace = MonopolyRunner.board.get(Playing.currentPlayer).getPlaceOnBoard();
					int currentPrice = ((Properties)MonopolyRunner.board.get(OptionsWhenYouLand.place)).getPrice();
					int currentMoney = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
					
								System.out.println("The price of this Property is $" + currentPrice +   ", would you like to buy this property?\n(1) Yes\n(2) No");
								
								String answer = userStringInput.nextLine();
								
								BuyableProperties myPropertyToAdd = ((BuyableProperties) MonopolyRunner.board.get(currentPlace));
								
								if (answer.equals("1") || answer.toUpperCase().equals("YES"))
									{
										MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().add(myPropertyToAdd);
										int updatedMoney = currentMoney - currentPrice; 
										MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(updatedMoney);
										((Properties)MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(true);
										int currentMoneyUpdated = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
										
										System.out.println("You now have a total of $" + currentMoneyUpdated);
									
									}

					}
				
				
				//buy railroad
				else if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Railroad"))
					{
					
					int currentPlace = MonopolyRunner.board.get(Playing.currentPlayer).getPlaceOnBoard();
					int currentPriceTwo = ((Railroads)MonopolyRunner.board.get(OptionsWhenYouLand.place)).getPrice();
					int currentMoneyTwo = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
					
								System.out.println("The price of this Railroad is $" + currentPriceTwo + ", would you like to buy this Railroad\n(1) Yes\n(2) No");
		
								String answer = userStringInput.nextLine(); 
								
								BuyableProperties myRailroadToAdd = ((BuyableProperties) MonopolyRunner.board.get(currentPlace));
								
								if (answer.equals("1") || answer.toUpperCase().contentEquals("YES"))
									{
										MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().add(myRailroadToAdd);
										int updatedMoney = currentMoneyTwo - currentPriceTwo; 
										MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(updatedMoney);
										((Railroads) MonopolyRunner.board.get(Playing.currentPlayer)).setBought(true);
										int currentMoneyUpdated = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
										
										System.out.println("You now have a total of $" + currentMoneyUpdated);
									}
					}
				
				
				
				//buy utility
				else if (MonopolyRunner.board.get(OptionsWhenYouLand.place).getType().equals("Utility"))
					{
					
					int currentPlace = MonopolyRunner.board.get(Playing.currentPlayer).getPlaceOnBoard();
					int currentPriceThree = ((Properties)MonopolyRunner.board.get(OptionsWhenYouLand.place)).getPrice();
					int currentMoneyThree = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
					
					
					int currentPlaceThree = MonopolyRunner.board.get(Playing.currentPlayer).getPlaceOnBoard();
								System.out.println("The price of this Utility is $" + currentPriceThree + ", would you like to buy this Utility\n(1) Yes\\n(2) No");
					
								String answer = userStringInput.nextLine();
								
								BuyableProperties myUtilityToAdd = ((BuyableProperties) MonopolyRunner.board.get(currentPlaceThree));
								
								if (answer.equals("1") || answer.toUpperCase().equals("YES"))
									{
										MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().add(myUtilityToAdd);
										int updatedMoney = currentMoneyThree - currentPriceThree; 
										MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(updatedMoney);
										((BuyableProperties) MonopolyRunner.board.get(OptionsWhenYouLand.place)).setBought(true);
										int currentMoneyUpdated = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
										
										System.out.println("You now have a total of $" + currentMoneyUpdated);

									}
								
							}

					
			}
	}
