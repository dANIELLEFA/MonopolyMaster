
import java.util.ArrayList;

public class Player
	{
		private String name;
		private int totalMoney;
		private int placeOnBoard;
		private ArrayList<BuyableProperties> playerProperties = new ArrayList<BuyableProperties>();
		private boolean getOutOfJail; 

		public Player(String n, int t, int p, ArrayList<BuyableProperties> pR, boolean g)
			{
				name = n;
				totalMoney = t;
				placeOnBoard = p;
				playerProperties = pR;
				getOutOfJail = g; 
				
			}

		public boolean isGetOutOfJail()
			{
				return getOutOfJail;
			}

		public void setGetOutOfJail(boolean getOutOfJail)
			{
				this.getOutOfJail = getOutOfJail;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getTotalMoney()
			{
				return totalMoney;
			}

		public void setTotalMoney(int totalMoney)
			{
				this.totalMoney = totalMoney;
			}

		public int getPlaceOnBoard()
			{
				return placeOnBoard;
			}

		public void setPlaceOnBoard(int placeOnBoard)
			{
				this.placeOnBoard = placeOnBoard;
			}

		public ArrayList<BuyableProperties> getPlayerProperties()
			{
				return playerProperties;
			}

		public void setPlayerProperties(ArrayList<BuyableProperties> playerProperties)
			{
				this.playerProperties = playerProperties;
			}
		


	}
