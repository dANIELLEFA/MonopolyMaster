
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
					String currentPropertyName = ((Properties) MonopolyRunner.board.get(place)).getName(); 
					int counter = 0; 
					
					for(int i = 0; i < MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().size(); i++)
					{ 
						//check if current player owns property
						if((MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().get(i).getName()).equals(currentPropertyName))
								{ 
									counter++; 
								}
					}
					
					if(counter>0)
					{
						System.out.println("You already own this property");
					}
						//other player must own the property then 
						else 
						{
							int amountToPay = ((Properties) MonopolyRunner.board.get(place)).getCostWhenLandedOn(); 
							
							String playerOneName = MonopolyRunner.players.get(Playing.currentPlayer).getName(); 
							
							String playerTwoName = MonopolyRunner.players.get(Playing.notCurrentPlayer).getName(); 
							
							System.out.println(playerOneName + ", you owe the owner $" + amountToPay);
							
							int currentMoneyPlayerOne = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
							
							int currentMoneyPlayerTwo = MonopolyRunner.players.get(Playing.notCurrentPlayer).getTotalMoney(); 
							
							int updatedMoneyOne = currentMoneyPlayerOne - amountToPay; 
							
							int updatedMoneyTwo = currentMoneyPlayerTwo + amountToPay; 
							
							MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(updatedMoneyOne); 
							
							MonopolyRunner.players.get(Playing.notCurrentPlayer).setTotalMoney(updatedMoneyTwo);
							
							System.out.println(playerOneName + ", your total money is now $" + updatedMoneyOne);
							
							System.out.println(playerTwoName + ", your toatl money is now $" + updatedMoneyTwo);
						}
					
				}

			else 
				{ 
				
				BuyThings.buyPlaces();
				

				}
		
	}
				
		
		
		
		
		
	    public static void landOnRailroad()
		{ 
			String currentRailroadName = ((Railroads) MonopolyRunner.board.get(place)).getName();
		
			if(((BuyableProperties) MonopolyRunner.board.get(place)).isBought())
				{
				
				int counter = 0; 
				
				for(int i = 0; i < MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().size(); i++)
				{
					if((MonopolyRunner.players.get(Playing.currentPlayer).getPlayerProperties().get(i).getName()).equals(currentRailroadName))
					{ 
						counter++; 
					}
				}
				
				if(counter>0)
				{ 
					System.out.println("You already own this property.");
				}
					
					else 
					{ 
						int amountToPay = ((Railroads) MonopolyRunner.board.get(place)).getCostWhenLandedOn(); 
						
						String playerOneName = MonopolyRunner.players.get(Playing.currentPlayer).getName(); 
						
						String playerTwoName = MonopolyRunner.players.get(Playing.notCurrentPlayer).getName(); 
						
						System.out.println(playerOneName + ", you owe the owner $" + amountToPay);
						
						int currentMoneyPlayerOne = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney(); 
						
						int currentMoneyPlayerTwo = MonopolyRunner.players.get(Playing.notCurrentPlayer).getTotalMoney(); 
						
						int updatedMoneyOne = currentMoneyPlayerOne - amountToPay; 
						
						int updatedMoneyTwo = currentMoneyPlayerTwo + amountToPay; 
						
						MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(updatedMoneyOne); 
						
						MonopolyRunner.players.get(Playing.notCurrentPlayer).setTotalMoney(updatedMoneyTwo);
						
//						System.out.println(playerOneName + ", your total money is now $" + currentMoneyPlayerOne);
//						
//						System.out.println(playerTwoName + ", your toatl money is now $" + currentMoneyPlayerTwo);
//						
//						((Player) MonopolyRunner.players.get(Playing.currentPlayer)).setTotalMoney(((Player) MonopolyRunner.players.get(Playing.currentPlayer)).getTotalMoney() - amountToPay);
//						((Player) MonopolyRunner.players.get(Playing.notCurrentPlayer)).setTotalMoney(((Player) MonopolyRunner.players.get(Playing.notCurrentPlayer)).getTotalMoney() + amountToPay);
//						System.out.println(((Railroads) MonopolyRunner.board.get(place)).getName()+" is already owned. You have to pay $" + amountToPay +". You now have $" +((Player) MonopolyRunner.players.get(Playing.currentPlayer)).getTotalMoney()+"." );
					}
				
				}
			
			else
				{
				BuyThings.buyPlaces(); 
				}

		}
				
	    
	    
	    
	    
	    
		public static void landOnTax()
		{ 
			int previousMoney = MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney();
			MonopolyRunner.players.get(Playing.currentPlayer).setTotalMoney(previousMoney - (((Tax) MonopolyRunner.board.get(place)).getAmountOfTax()));
			System.out.println("You now have to pay tax! You had $" + previousMoney + " you paid $" + ((Tax) MonopolyRunner.board.get(place)).getAmountOfTax() + " in taxes. You now have  $" + MonopolyRunner.players.get(Playing.currentPlayer).getTotalMoney());
			
				
		}
		
		
		
		
		
		public static void landOnFreeParking()
		{ 
			System.out.println("You are now going to go around the board in reverse!");
			
			if (!MonopolyRunner.players.get(Playing.currentPlayer).isInReverse())
			{
				MonopolyRunner.players.get(Playing.currentPlayer).setInReverse(true);
			}
			else
			{
				MonopolyRunner.players.get(Playing.currentPlayer).setInReverse(false);
			}
		}
		
		
		
		
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
			System.out.println("Now moving you to jail...");
			
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
			//add pay rent thing based on dice roll
			BuyThings.buyPlaces();  
			
		}
		
		
		
		public static void justVisitingJail()
		{ 
			System.out.println("Don't worry, you are Just Visiting");
		}
		
		
		
		
		
		
		


	}








