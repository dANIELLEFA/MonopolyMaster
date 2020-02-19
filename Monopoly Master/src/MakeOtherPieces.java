
public class MakeOtherPieces
	{
		public static void makeChanceCards()
			{
				MonopolyRunner.board.add(new ChanceCards("Chance", "Chance", 7, false, false));
				MonopolyRunner.board.add(new ChanceCards("Chance", "Chance", 22, false, false));
				MonopolyRunner.board.add(new ChanceCards("Chance", "Chance", 36, false, false));
			}

		public static void makeCommunityChest()
			{
				MonopolyRunner.board.add(new ChanceCards("Community Chest", "Community Chest", 2, false, false));
				MonopolyRunner.board.add(new ChanceCards("Community Chest", "Community Chest", 17, false, false));
				MonopolyRunner.board.add(new ChanceCards("Community Chest", "Community Chest", 33, false, false));
			}

		public static void makeRailroads()
			{
				if (MonopolyRunner.changeThemes == 1)
					{
						MonopolyRunner.board
								.add(new Railroads("Narrow Gauge Railroad", "Railroad", 5, 200, false, 0, 0));
						MonopolyRunner.board.add(
								new Railroads("The Chesapeake and Ohio Railroad", "Railroad", 15, 200, false, 0, 0));
						MonopolyRunner.board.add(new Railroads("The Nashville and Chattanooga Railroad", "Railroad", 25,
								200, false, 0, 0));
						MonopolyRunner.board
								.add(new Railroads("The Scenic Railroad", "Railroad", 35, 200, false, 0, 0));
					} else if (MonopolyRunner.changeThemes == 0)
					{
						MonopolyRunner.board
								.add(new Railroads("Reading Railroad", "Railroad", 5, 200, false, 0, 0));
						MonopolyRunner.board.add(
								new Railroads("Pennsylvania Railroad", "Railroad", 15, 200, false, 0, 0));
						MonopolyRunner.board.add(new Railroads("B & O Railroad", "Railroad", 25,
								200, false, 0, 0));
						MonopolyRunner.board
								.add(new Railroads("Short Line Railroad", "Railroad", 35, 200, false, 0, 0));
					}
			}
		public static void makeUtilities()
		{
			MonopolyRunner.board.add(new Utilities("Water Works", "Utility", 12, 150, false, 0 , false));
		}
	}
