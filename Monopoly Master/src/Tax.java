
public class Tax extends NotBuyable
	{
		protected int amountOfTax;

		public Tax(String n, boolean oS, int aOT)
			{
				super(n, oS);
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
