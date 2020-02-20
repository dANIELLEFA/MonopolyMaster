
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
			
			else 
				{ 
					System.out.println("Would you like to buy this property?");
					String chooseToBuy = userStringInput.next(); 
					
					
				}
//			
//			if(MonopolyRunner.board.get(place).)
//				{ 
//					
//				}
			
			
			//if owned by you (buy house) 
			//if not owned - option to buy property 
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








