import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class MonopolyRunner    
	{

		static ArrayList<Board> board = new ArrayList<Board>();
		static ArrayList<Player> players = new ArrayList<Player>();
		
		//Main Change Themes VVVVVVVVVVV
		static int changeThemes = 1;
		
		public static void main(String[] args) throws FileNotFoundException
			{
				//Introduction.greetPlayers();
				ReadAndPlaceProperties.readColorProperties();
				//CommunityChestReader.readCommunityChest();
				
				// Make the other pieces on board
				MakeOtherPieces.makeChanceCards();
				MakeOtherPieces.makeCommunityChest();
				MakeOtherPieces.makeRailroads();
				MakeOtherPieces.makeUtilities();
				MakeOtherPieces.makeAllOthers();
				
				SwitchPlayers.switchCurrentPlayer();
				
				Collections.sort(board, new BoardSorter());
				
				int counter = 1;
				for(Board b: board)
					{
						System.out.println(counter + ": " +  b.getName() + " ---> " + b.getPlaceOnBoard());
						counter ++;
					}

			}

	}
