import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MonopolyRunner    
	{

		static ArrayList<Board> board = new ArrayList<Board>();
		static ArrayList<Player> players = new ArrayList<Player>();
		
		public static void main(String[] args) throws FileNotFoundException
			{
				//Introduction.greetPlayers();
				ReadAndPlaceProperties.readColorProperties();
				//CommunityChestReader.readCommunityChest();
				
				for(Board b: board)
					{
						System.out.println(b.getName());
					}

			}

	}
