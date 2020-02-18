
public abstract class BuyableProperties extends Board
	{
		protected int price;
		protected boolean bought;
		protected int costWhenLandedOn;

		public BuyableProperties(String n, String t, int pOB, int p, boolean b, int cWLO)
			{
				super(n, t, pOB);
				price = p;
				bought = b;
				costWhenLandedOn = cWLO;
			}

	}
