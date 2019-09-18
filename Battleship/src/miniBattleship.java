import java.util.Scanner;

public class miniBattleship
{
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner userStringInput = new Scanner(System.in);
	static int row;
	static int col;
	static int[][] battleship = new int[6][6];
	public static void main(String[] args)
	{
		askName();
		chooseShips();
		aiPlay();
	}
	
	public static void askName()
	{
		System.out.println("Hello! What is your name?");
		String name = userStringInput.nextLine();
		System.out.println("Hello, " + name + "! Let's play a game of Battleship!");
	}
	
	public static void chooseShips()
	{
			System.out.println("You have three ships, which you can make any length you want.");
			System.out.println("Pick a row (A - F) for your Carrier to start.");
			String carrierStartRow = userStringInput.nextLine();
			System.out.println("Pick a column (1 - 6) for your Carrier to start.");
			int carrierStartCol = userIntInput.nextInt();
			int carrierRow0;
			int carrierCol0;
			switch (carrierStartRow)
			{
				case "A": carrierRow0 = 0;
				break;
				case "B": carrierRow0 = 1;
				break;
				case "C": carrierRow0 = 2;
				break;
				case "D": carrierRow0 = 3;
				break;
				case "E": carrierRow0 = 4;
				break;
				case "F": carrierRow0 = 5;
				default: carrierRow0 = -1;
				System.exit(0);
				break;
			}
			switch (carrierStartCol)
			{
				case 1: carrierCol0 = 0;
				break;
				case 2: carrierCol0 = 1;
				break;
				case 3: carrierCol0 = 2;
				break;
				case 4: carrierCol0 = 3;
				break;
				case 5: carrierCol0 = 4;
				break;
				case 6: carrierCol0 = 5;
				default: carrierCol0 = -1;
				System.exit(0);
				break;
			}
			System.out.println("Pick a row (A - F) for your Carrier to end.");
			String carrierEndRow = userStringInput.nextLine();
			System.out.println("Pick a column(1 - 6) for your Carrier to end.");
			int carrierEndCol = userIntInput.nextInt();
			int carrierRow1;
			int carrierCol1;
			switch (carrierStartRow)
			{
				case "A": carrierRow1 = 0;
				break;
				case "B": carrierRow1 = 1;
				break;
				case "C": carrierRow1 = 2;
				break;
				case "D": carrierRow1 = 3;
				break;
				case "E": carrierRow1 = 4;
				break;
				case "F": carrierRow1 = 5;
				default: carrierRow1 = -1;
				System.exit(0);
				break;
			}
			switch (carrierStartCol)
			{
				case 1: carrierCol1 = 0;
				break;
				case 2: carrierCol1 = 1;
				break;
				case 3: carrierCol1 = 2;
				break;
				case 4: carrierCol1 = 3;
				break;
				case 5: carrierCol1 = 4;
				break;
				case 6: carrierCol1 = 5;
				default: carrierCol1 = -1;
				System.exit(0);
				break;
			}
				System.out.println("Pick a row (A - F) for your Battlesip to start.");
				String battleshipStartRow = userStringInput.nextLine();
				System.out.println("Pick a column(1 - 6) for your Battleship to start.");
				int battleshipStartCol = userIntInput.nextInt();
				int battleshipRow0;
				int battleshipCol0;
				switch (battleshipStartRow)
				{
					case "A": battleshipRow0 = 0;
					break;
					case "B": battleshipRow0 = 1;
					break;
					case "C": battleshipRow0 = 2;
					break;
					case "D": battleshipRow0 = 3;
					break;
					case "E": battleshipRow0 = 4;
					break;
					case "F": battleshipRow0 = 5;
					default: battleshipRow0 = -1;
					System.exit(0);
					break;
				}
				switch (battleshipStartCol)
				{
					case 1: battleshipCol0 = 0;
					break;
					case 2: battleshipCol0 = 1;
					break;
					case 3: battleshipCol0 = 2;
					break;
					case 4: battleshipCol0 = 3;
					break;
					case 5: battleshipCol0 = 4;
					break;
					case 6: battleshipCol0 = 5;
					default: battleshipCol0 = -1;
					System.exit(0);
					break;
				}
				System.out.println("Pick a row (A - F) for your Battlesip to end.");
				String battleshipEndRow = userStringInput.nextLine();
				System.out.println("Pick a column(1 - 6) for your Battleship to end.");
				int battleshipEndCol = userIntInput.nextInt();
				int battleshipRow1;
				int battleshipCol1;
				switch (battleshipStartRow)
				{
					case "A": battleshipRow1 = 0;
					break;
					case "B": battleshipRow1 = 1;
					break;
					case "C": battleshipRow1 = 2;
					break;
					case "D": battleshipRow1 = 3;
					break;
					case "E": battleshipRow1 = 4;
					break;
					case "F": battleshipRow1 = 5;
					default: battleshipRow1 = -1;
					System.exit(0);
					break;
				}
				switch (battleshipStartCol)
				{
					case 1: battleshipCol1 = 0;
					break;
					case 2: battleshipCol1 = 1;
					break;
					case 3: battleshipCol1 = 2;
					break;
					case 4: battleshipCol1 = 3;
					break;
					case 5: battleshipCol1 = 4;
					break;
					case 6: battleshipCol1 = 5;
					default: battleshipCol1 = -1;
					System.exit(0);
					break;
				}
					System.out.println("Pick a row (A - F) for your Cruiser to start.");
					String cruiserStartRow = userStringInput.nextLine();
					System.out.println("Pick a column(1 - 6) for your Cruiser to start.");
					int cruiserStartCol = userIntInput.nextInt();
					int cruiserRow0;
					int cruiserCol0;
					switch (cruiserStartRow)
					{
						case "A": cruiserRow0 = 0;
						break;
						case "B": cruiserRow0 = 1;
						break;
						case "C": cruiserRow0 = 2;
						break;
						case "D": cruiserRow0 = 3;
						break;
						case "E": cruiserRow0 = 4;
						break;
						case "F": cruiserRow0 = 5;
						default: cruiserRow0 = -1;
						System.exit(0);
						break;
					}
					switch (cruiserStartCol)
					{
						case 1: cruiserCol0 = 0;
						break;
						case 2: cruiserCol0 = 1;
						break;
						case 3: cruiserCol0 = 2;
						break;
						case 4: cruiserCol0 = 3;
						break;
						case 5: cruiserCol0 = 4;
						break;
						case 6: cruiserCol0 = 5;
						default: cruiserCol0 = -1;
						System.exit(0);
						break;
					}
					System.out.println("Pick a row (A - F) for your Cruiser to end.");
					String cruiserEndRow = userStringInput.nextLine();
					System.out.println("Pick a column(1 - 6) for your Cruiser to end.");
					int cruiserEndCol = userIntInput.nextInt();
					int cruiserRow1;
					int cruiserCol1;
					switch (cruiserStartRow)
					{
						case "A": cruiserRow1 = 0;
						break;
						case "B": cruiserRow1 = 1;
						break;
						case "C": cruiserRow1 = 2;
						break;
						case "D": cruiserRow1 = 3;
						break;
						case "E": cruiserRow1 = 4;
						break;
						case "F": cruiserRow1 = 5;
						default: cruiserRow1 = -1;
						System.exit(0);
						break;
					}
					switch (cruiserStartCol)
					{
						case 1: cruiserCol1 = 0;
						break;
						case 2: cruiserCol1 = 1;
						break;
						case 3: cruiserCol1 = 2;
						break;
						case 4: cruiserCol1 = 3;
						break;
						case 5: cruiserCol1 = 4;
						break;
						case 6: cruiserCol1 = 5;
						default: cruiserCol1 = -1;
						System.exit(0);
						break;
					}
//					for(int numNum = 0; numNum < 10; numNum++)
//					{
//						int ranNum1 = (int)(Math.random() * 6 + 1);
//						int ranNum2 = (int)(Math.random() * 6 + 1);
//						int x = ranNum1;
//						int y = ranNum2;
//						if(x >= battleship[battleshipRow0][battleshipCol0] && y >= battleship[battleshipRow0][battleshipCol0] && x <= battleship[battleshipRow1][battleshipCol1] && y <= battleship[battleshipRow1][battleshipCol1])
//						{
//							battleship[x][y] = 1;
//						}
//						else
//						{
//							battleship[x][y] = 0;
//						}
//					}
					int[] carrier = {battleship[battleshipRow0][battleshipCol0],battleship[battleshipRow1][battleshipCol1]};
					carrier[0] = 1;
					carrier[1] = 1;
	}
	
	public static void aiPlay()
	{
		int ranNum1 = (int)(Math.random() * 6);
		int ranNum2 = (int)(Math.random() * 6);
		int caStart = battleship[ranNum1][ranNum2];
		int ranNum3 = (int)(Math.random() * 6);
		int ranNum4 = (int)(Math.random() * 6);
		int caEnd = battleship[ranNum3][ranNum4];
		int ranNum5 = (int)(Math.random() * 6);
		int ranNum6 = (int)(Math.random() * 6);
		int baStart = battleship[ranNum5][ranNum6];
		int ranNum7 = (int)(Math.random() * 6);
		int ranNum8 = (int)(Math.random() * 6);
		int baEnd = battleship[ranNum7][ranNum8];
		int ranNum9 = (int)(Math.random() * 6);
		int ranNum10 = (int)(Math.random() * 6);
		int caStart = battleship[ranNum1][ranNum2];
		int ranNum11 = (int)(Math.random() * 6);
		int ranNum12 = (int)(Math.random() * 6);
		int caEnd = battleship[ranNum3][ranNum4];
	}
}
