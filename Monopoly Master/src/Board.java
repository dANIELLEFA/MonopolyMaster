
public abstract class Board
	{
		protected String name;

		public Board(String n)
			{
				name = n;
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
