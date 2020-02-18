
public class Tax extends NotBuyable
	{
		protected int amountOfTax;

		public Tax(String n, String t, int pOB, boolean oS, int aOT)
			{
				super(n, t, pOB, oS);
				amountOfTax = aOT;
			}

		public int getAmountOfTax()
			{
				return amountOfTax;
			}

		public void setAmountOfTax(int amountOfTax)
			{
				this.amountOfTax = amountOfTax;
			}

	}
