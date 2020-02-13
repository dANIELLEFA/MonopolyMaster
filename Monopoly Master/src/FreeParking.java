
public class FreeParking extends NotBuyable
	{
		protected boolean reverse;

		public FreeParking(String n, boolean oS, boolean r)
			{
				super(n, oS);
				reverse = r;

			}

		public boolean isReverse()
			{
				return reverse;
			}

		public void setReverse(boolean reverse)
			{
				this.reverse = reverse;
			}

	}
