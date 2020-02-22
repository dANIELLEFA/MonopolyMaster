import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MonopolyRunner    
	{

		static ArrayList<Board> board = new ArrayList<Board>();
		static ArrayList<Player> players = new ArrayList<Player>();
		
		static Scanner userStringInput = new Scanner (System.in);
		
		//Main Change Themes VVVVVVVVVVV
		static int changeThemes = 1;
		
		public static void main(String[] args) throws FileNotFoundException
			{
				Introduction.greetPlayers();
				// Make the board
				ReadAndPlaceProperties.readColorProperties();
				MakeOtherPieces.makeChanceCards();
				MakeOtherPieces.makeCommunityChest();
				MakeOtherPieces.makeRailroads();
				MakeOtherPieces.makeUtilities();
				MakeOtherPieces.makeAllOthers();
				Collections.sort(board, new BoardSorter()); 
				Playing.play();
				
				//CommunityChestReader.readCommunityChest();
				
				
				
//				int counter = 1;
//				for(Board b: board)
//					{
//						System.out.println(counter + ": " +  b.getName() + " ---> " + b.getPlaceOnBoard());
//						counter ++;
//					}

			}

	}
