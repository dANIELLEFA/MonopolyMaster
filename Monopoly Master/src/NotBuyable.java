
public abstract class NotBuyable extends Board
	{
		protected boolean onSpace;

		public NotBuyable(String n, String t, int pOB, boolean oS)
			{
				super(n, t, pOB);
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
