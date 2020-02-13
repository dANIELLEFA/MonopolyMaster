import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MonopolyRunner
	{

		static ArrayList<Board> board = new ArrayList<Board>();
		
		public static void main(String[] args) throws FileNotFoundException
			{
				//Introduction.greetPlayers();
				ReadAndPlaceProperties.readColorProperties();
				
				for(Board b: board)
					{
						System.out.println(b.getName());
					}

			}

	}
