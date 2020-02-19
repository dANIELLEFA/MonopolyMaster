import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class MonopolyRunner    
	{

		static ArrayList<Board> board = new ArrayList<Board>();
		static ArrayList<Player> players = new ArrayList<Player>();
		
		public static void main(String[] args) throws FileNotFoundException
			{
				//Introduction.greetPlayers();
				ReadAndPlaceProperties.readColorProperties();
				//CommunityChestReader.readCommunityChest();
				MakeOtherPieces.makeChanceCards();
				MakeOtherPieces.makeCommunityChest();
				MakeOtherPieces.makeRailroads();
				
				Collections.sort(board, new BoardSorter());
				
				for(Board b: board)
					{
						System.out.println(b.getName());
					}

			}

	}
