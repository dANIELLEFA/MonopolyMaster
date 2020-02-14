
public class Railroads extends BuyableProperties
	{
		protected int numberOwned;

		public Railroads(String n, int pOB, int p, boolean b, int cWLO, int nO)
			{
				super(n, pOB, p, b, cWLO);
				numberOwned = nO;
			}

		public int getNumberOwned()
			{
				return numberOwned;
			}

		public void setNumberOwned(int numberOwned)
			{
				this.numberOwned = numberOwned;
			}

	}
