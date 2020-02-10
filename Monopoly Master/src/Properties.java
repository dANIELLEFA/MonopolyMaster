
public class Properties extends Board
	{
		protected int price;
		protected int rent;
		protected int housesBought;
		protected boolean hotel;
		protected boolean sold;
		protected String color;
		protected boolean canPlaceHouses;
		
		
	public Properties(String n, int p, int r, int hB, boolean h, boolean s, String c, boolean cPH)
		{
			super(n);
			price = p;
			rent = r;
			housesBought = hB;
			hotel = h;
			sold = s;
			color = c;
			canPlaceHouses = cPH;
		}


	public int getPrice()
		{
			return price;
		}


	public void setPrice(int price)
		{
			this.price = price;
		}


	public int getRent()
		{
			return rent;
		}


	public void setRent(int rent)
		{
			this.rent = rent;
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


	public boolean isSold()
		{
			return sold;
		}


	public void setSold(boolean sold)
		{
			this.sold = sold;
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
