
public class FreeParking extends NotBuyable
	{
		protected boolean reverse;

		public FreeParking(String n, int pOB, boolean oS, boolean r)
			{
				super(n, pOB, oS);
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
