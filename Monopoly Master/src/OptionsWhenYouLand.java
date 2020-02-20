
import java.util.Scanner; 


public class OptionsWhenYouLand
	{
		static Scanner userStringInput = new Scanner(System.in);
		
		static int place = MonopolyRunner.players.get(0).getPlaceOnBoard();
		
		public static void landOnPlace()
		{ 
			
			
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
			
			else if(MonopolyRunner.board.get(place).getType().equals("FreeParking"))
				{
					landOnFreeParking(); 
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("CommunityChest"))
				{ 
					landOnCommunityChest(); 
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("Chance"))
				{ 
					landOnChance(); 
				}
			
			else if(MonopolyRunner.board.get(place).getType().equals("GoToJail"))
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
		
		}
		
		
		
		
		public static void landOnProperty()
		{ 
			//if owned by other person - pay rent 
		
			
			String propertyName = MonopolyRunner.board.get(place).getName();  
			String propertyColor = ((Properties) MonopolyRunner.board.get(place)).getColor();
			System.out.println("You landed on " + propertyName + " property. The color of this property is " + propertyColor);
			
			if(((Properties) MonopolyRunner.board.get(place)).isBought())
				{ 
					
				}
			
			else if(((Properties) MonopolyRunner.board.get(place)).isBought())
				{
					int amountToPay = ((Properties) MonopolyRunner.board.get(place)).getCostWhenLandedOn(); 
					//fix index 
					String playerOneName = MonopolyRunner.players.get(0).getName(); 
					String playerTwoName = MonopolyRunner.players.get(1).getName(); 
					System.out.println("This property is already owned. You owe the owner $" + amountToPay);
					//fix for current player
					int currentMoneyPlayerOne = MonopolyRunner.players.get(0).getTotalMoney(); 
					int currentMoneyPlayerTwo = MonopolyRunner.players.get(0).getTotalMoney(); 
					MonopolyRunner.players.get(0).setTotalMoney(currentMoneyPlayerOne - amountToPay); 
					MonopolyRunner.players.get(0).setTotalMoney(currentMoneyPlayerTwo + amountToPay);
					System.out.println(playerOneName + ", your total money is now $" + currentMoneyPlayerOne);
					System.out.println(playerTwoName + ", your toatl money is now $" + currentMoneyPlayerTwo);
					
				}
			
			else 
				{ 
					System.out.println("Would you like to buy this property?/n(1) Yes/n(2) No");
					String chooseToBuy = userStringInput.next(); 
					
					if(chooseToBuy.equals("1") || chooseToBuy.toUpperCase().equals("YES"))
						{
							
						}
					
					if(chooseToBuy.equals("2") || chooseToBuy.toUpperCase().equals("NO"))
						{
							
						}
					
					
					
				}

		}
				
	    public static void landOnRailroad()
		{ 
						
		}
				
		public static void landOnTax()
		{ 
				
		}
		
		public static void landOnFreeParking()
		{ 
			
		}
		
		public static void landOnCommunityChest()
		{
			
		}
		
		public static void landOnChance()
		{ 
			
		}
		
		public static void landOnGoToJail()
		{
			
		}
		
		public static void passGo()
		{ 
			int previousMoney = MonopolyRunner.players.get(0).getTotalMoney();
			MonopolyRunner.players.get(0).setTotalMoney(previousMoney+ 200);
		}
		
		public static void landOnUtility()
		{ 
			
			
			
		}
		
		
		
		


	}








