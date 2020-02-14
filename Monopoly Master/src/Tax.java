
public class Tax extends NotBuyable
	{
		protected int amountOfTax;

		public Tax(String n, int pOB, boolean oS, int aOT)
			{
				super(n, pOB, oS);
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
