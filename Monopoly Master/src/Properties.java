
public class Properties extends BuyableProperties
	{
		protected int housesBought;
		protected boolean hotel;
		protected String color;
		protected boolean canPlaceHouses;
		
	public Properties(String n, int p, boolean b, int cWLO, int hB, boolean h, String c, boolean cPH)
		{
			super(n, p, b, cWLO);
			housesBought = hB;
			hotel = h;
			color = c;
			canPlaceHouses = cPH;
		}
		
		public int getHousesBought()
		{
			return housesBought;
		}


	public void setHousesBought(int housesBought)
		{
			this.housesBought = housesBought;
		}


	public boolean isHotel()
		{
			return hotel;
		}


	public void setHotel(boolean hotel)
		{
			this.hotel = hotel;
		}


	public String getColor()
		{
			return color;
		}


	public void setColor(String color)
		{
			this.color = color;
		}


	public boolean isCanPlaceHouses()
		{
			return canPlaceHouses;
		}


	public void setCanPlaceHouses(boolean canPlaceHouses)
		{
			this.canPlaceHouses = canPlaceHouses;
		}
	
	}
