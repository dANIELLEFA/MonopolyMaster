import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndPlaceProperties
	{
		public static void readColorProperties() throws FileNotFoundException


		{
			Scanner file = new Scanner(new File("listOfProperties.txt"));
			
			// <name>, <price>, bought, <costWhenLandedOn>, housesBought, isHotel, <Color>, CanPlaceHouses, <houseCost> <Houses and Hotels>
			
			while (file.hasNext())
			{
				String propertyAbout = file.nextLine();
				String houseForProperty = file.nextLine();
				
				String[] information = propertyAbout.split("[+]");
				
				String name = information[0];
				int price = Integer.parseInt(information[1]);
				int costWhenLandedOn = Integer.parseInt(information[2]);
				String color = information[3];
				int houseCost = Integer.parseInt(information[4]);
				ArrayList<Integer> housesAndHotelCosts = getHouseAndHotels(houseForProperty);
				
				MonopolyRunner.board.add(new Properties(name, price, false, costWhenLandedOn, 0, false, color, false, houseCost, housesAndHotelCosts));
			}
		}
		
		private static ArrayList<Integer> getHouseAndHotels(String str)
		{
			String[] toSort = str.split(" ");
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			 
			for (String s: toSort)
				{
					temp.add(Integer.parseInt(s));
				}
			
			return temp;
		}

	}
