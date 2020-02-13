
public class Utilities extends BuyableProperties
	{
		protected boolean both;

		public Utilities(String n, int p, boolean b, int cWLO, boolean bo)
			{
				super(n, p, b, cWLO);
				both = bo;
			}

		public boolean isBoth()
			{
				return both;
			}

		public void setBoth(boolean both)
			{
				this.both = both;
			}

	}
