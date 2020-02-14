
public abstract class NotBuyable extends Board
	{
		protected boolean onSpace;

		public NotBuyable(String n, int pOB, boolean oS)
			{
				super(n, pOB);
				onSpace = oS;
			}

		public boolean isOnSpace()
			{
				return onSpace;
			}

		public void setOnSpace(boolean onSpace)
			{
				this.onSpace = onSpace;
			}

	}
