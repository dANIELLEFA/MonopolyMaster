
import java.util.Scanner; 


public class OptionsWhenYouLand
	{
		static Scanner userStringInput = new Scanner(System.in);
		
		static int place = MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard();
		
		
		public static void landOnPlace()
		{ 
			place = MonopolyRunner.players.get(Playing.currentPlayer).getPlaceOnBoard();
			
			if(MonopolyRunner.board.get(place).getType().equals("Property"))
				{
					landOnProperty();  
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("Railroad"))
				{
					landOnRailroad(); 
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("Tax"))
				{
					landOnTax(); 
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("Free Parking"))
				{
					landOnFreeParking(); 
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("Community Chest"))
				{ 
					landOnCommunityChest(); 
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("Chance"))
				{ 
					landOnChance(); 
				}
			
			else if(MonopolyRunner.board.get(place).getName().equals("Go to Jail"))
				{ 
					landOnGoToJail(); 				
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("PassGo"))
				{ 
					passGo(); 
				}
					
			else if(MonopolyRunner.board.get(place).getType().equals("Utility"))
				{ 
					landOnUtility(); 
				}
			
			else if(MonopolyRunner.board.get(place).getName().equals("Jail"))
				{
					justVisitingJail(); 
				}
		
		}
		
		
		
		
		public static void landOnProperty()
			{ 
				
			String propertyName = MonopolyRunner.board.get(place).getName();  
			String propertyColor = ((Properties) MonopolyRunner.board.get(place)).getColor();

			System.out.println("The Color Of this property is " + propertyColor + ".");
			
			if(((BuyableProperties) MonopolyRunner.board.get(place)).isBought())
				{
					
					//check if current player owns it 
					if(MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().contains(propertyName))
						{
							System.out.println("You currently own this property.");
						}
					
					//check if not current player owns it 
					else if(MonopolyRunner.players.get(Playing.notCurrentPlayer).getPlayerProperties().contains(propertyName))
						{
							int amountToPay = ((Properties) MonopolyRunner.board.get(place)).getCostWhenLandedOn(); 
							
							String playerOneName = MonopolyRunner.players.get(Playing.currentPlayer).getName(); 
							
							String playerTwoName = MonopolyRunner.players.get(Playing.notCurrentPlayer).getName(); 
							
							System.out.println("This property is already owned. " + playerOneName + ", you owe the owner $" + amountToPay);
							
							int currentMoneyPlayerOne = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
							
							int currentMoneyPlayerTwo = MonopolyRunner.players.get(Playing.notCurrentPlayer).getTotalMoney(); 
							
							MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(currentMoneyPlayerOne - amountToPay); 
							
							MonopolyRunner.players.get(Playing.notCurrentPlayer).setTotalMoney(currentMoneyPlayerTwo + amountToPay);
							
							System.out.println(playerOneName + ", your total money is now $" + currentMoneyPlayerOne);
							
							System.out.println(playerTwoName + ", your toatl money is now $" + currentMoneyPlayerTwo);
							
						}
				}
			
			else 
				{ 
					BuyThings.buyPlaces();
				}

		}
				
	    public static void landOnRailroad()
		{ 
			String railroadName = ((Railroads) MonopolyRunner.board.get(place)).getName();
		
			if(((Railroads) MonopolyRunner.board.get(place)).isBought())
				{
					

					if(MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().contains(railroadName))
						{
							System.out.println("Thankfully you own this railroad.");
							Playing.play();
						}
					else
						{
							// takes away current player money
							// adds to other player ok
							int amountToPay = ((Railroads) MonopolyRunner.board.get(place)).getCostWhenLandedOn(); 
							((Player) MonopolyRunner.players.get(Playing.currentPlayer)).setTotalMoney(((Player) MonopolyRunner.players.get(Playing.currentPlayer)).getTotalMoney() - amountToPay);
							((Player) MonopolyRunner.players.get(Playing.notCurrentPlayer)).setTotalMoney(((Player) MonopolyRunner.players.get(Playing.notCurrentPlayer)).getTotalMoney() + amountToPay);
							System.out.println(((Railroads) MonopolyRunner.board.get(place)).getName()+" is already owned. You have to pay $" + amountToPay +". You now have $" +((Player) MonopolyRunner.players.get(Playing.currentPlayer)).getTotalMoney()+"." );
							Playing.play();
						}
				}
			
			else
				{
					BuyThings.buyPlaces();
					
				}

		}
				
		public static void landOnTax()
		{ 
			System.out.println("LandOnTax method test");
			
				
		}
		
		public static void landOnFreeParking()
		{ 
			System.out.println("You are now going to go around the board in reverse!");
			if (!MonopolyRunner.players.get(Playing.currentPlayer).isInReverse())
				MonopolyRunner.players.get(Playing.currentPlayer).setInReverse(true);
			else
				MonopolyRunner.players.get(Playing.currentPlayer).setInReverse(false);
		}
		//test commit
		public static void landOnCommunityChest()
		{
			System.out.println("\n<<<This is still a work in progress.>>>\n");
		}
		
		public static void landOnChance()
		{ 
			System.out.println("\n<<<This is still a work in progress.>>>\n");
		}
		
		public static void landOnGoToJail()
		{
			System.out.println("You landed on GO TO JAIL, now moving you to jail...");
			
			MonopolyRunner.players.get(Playing.currentPlayer).setPlaceOnBoard(40);
			MonopolyRunner.players.get(Playing.currentPlayer).setInJail(true);
			
			//still have to add stay for one turn
		}
		
		public static void passGo()
		{ 
			int previousMoney = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney();
			MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(previousMoney + 200);
		}
		
		public static void landOnUtility()
		{ 
			
			BuyThings.buyPlaces();  
			
		}
		
		public static void justVisitingJail()
		{ 
			System.out.println("land on just visiting jail test");
		}
		
		
		
		


	}








