import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommunityChestReader
	{
		public static void readCommunityChest() throws FileNotFoundException
		{
			Scanner file = new Scanner(new File("communityChestCards"));
			
			while (file.hasNext())
				{
					String information = file.nextLine();
					String[] toAssess = information.split("[%]");
					
					String whatCardSays = toAssess[0];
					String operator = toAssess[1];
					int valueToChange = Integer.parseInt(toAssess[2]);
					
				
				}
		}
	}
