
public abstract class BuyableProperties extends Board
	{
		protected int price;
		protected boolean bought;
		protected int costWhenLandedOn;

		public BuyableProperties(String n, int p, boolean b, int cWLO)
			{
				super(n);
				price = p;
				bought = b;
				costWhenLandedOn = cWLO;
			}

	}
