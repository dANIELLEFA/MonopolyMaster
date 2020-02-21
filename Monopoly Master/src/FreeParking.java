
public class FreeParking extends NotBuyable
	{
		protected boolean reverse;

		// name, type, place on board, on space, reverse
		public FreeParking(String n, String t, int pOB, boolean oS, boolean r)
			{
				super(n, t, pOB, oS);
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
