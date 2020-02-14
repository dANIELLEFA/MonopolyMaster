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
					
					for(String s: toAssess)
						System.out.print(s + " : ");
					
					System.out.println();
				}
		}
	}
