import java.util.ArrayList;

public class Player
	{
		private String name;
		private int totalMoney;
		private int placeOnBoard;
		private ArrayList<Properties> playerProperties = new ArrayList<Properties>();

		public Player(String n, int t, int p, ArrayList pR)
			{
				name = n;
				totalMoney = t;
				placeOnBoard = p;
				playerProperties = pR;
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

		public ArrayList<Properties> getPlayerProperties()
			{
				return playerProperties;
			}

		public void setPlayerProperties(ArrayList<Properties> playerProperties)
			{
				this.playerProperties = playerProperties;
			}

	}
