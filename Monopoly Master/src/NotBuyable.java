
public abstract class NotBuyable extends Board
	{
		protected boolean onSpace;
	public NotBuyable(String n, boolean oS)
		{
			super(n);
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
