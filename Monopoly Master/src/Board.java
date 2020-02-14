
public abstract class Board
	{
		protected String name;
		protected int placeOnBoard;

		public Board(String n, int pOB)
			{
				name = n;
				placeOnBoard = pOB;
			}

		public int getPlaceOnBoard()
			{
				return placeOnBoard;
			}

		public void setPlaceOnBoard(int placeOnBoard)
			{
				this.placeOnBoard = placeOnBoard;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}
	}
