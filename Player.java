import java.util.Scanner;
public class Player {
	static Room rm1 ,rm2 ,rm3 ,rm4 ,rm5 ,rm6 ,rm7 ,rm8;
	static int[] Visited = new int[8];
	static double[] moneyEarned = new double[8];
	static Scanner sc=new Scanner(System.in);
	static String[] ItemsSeen = new String[8];
	
    public static void main(String[]args)
 {
		
		String response;
		String res = "play";

		initializeRooms();

		for (int i = 0; i < Visited.length; i++) {
			Visited[i] = 0;
			moneyEarned[i] = 0.0;
			ItemsSeen[i]="not visited";
		}
		System.out.println("Welcome Player");
		System.out.println("Type 'Foyer' to continue");
		while (res.equalsIgnoreCase("play")) {
			response = sc.nextLine();
			switch (response.toLowerCase()) {
			case "foyer": {

				Visited[0] = 1;
				moneyEarned[0] = rm1.getMoney();
				System.out.println(rm1.toString());
				sum();
				ItemsSeen[0]=rm1.getThings();
				System.out.println("Type 'front room' ");

				break;

			}
			case "front room": {

				Visited[1] = 1;
				System.out.println(rm2.toString());
				moneyEarned[1] = rm2.getMoney();
				sum();
				ItemsSeen[1]=rm2.getThings();
				System.out.println("Type 'library' or 'kitchen' ");
				break;

			}
			case "library": {

				Visited[2] = 1;
				System.out.println(rm3.toString());
				moneyEarned[2] = rm3.getMoney();
				sum();
				ItemsSeen[2]=rm3.getThings();
				System.out.println("Type 'dining room' or 'front room' ");
				break;

			}
			case "kitchen": {

				Visited[3] = 1;
				System.out.println(rm4.toString());
				moneyEarned[3] = rm4.getMoney();
				ItemsSeen[3]=rm4.getThings();
				sum();
				System.out.println("Type 'front room' or 'kitchen' ");
				break;
			}
			case "dining room": {

				Visited[4] = 1;
				System.out.println(rm5.toString());
				moneyEarned[4] = rm5.getMoney();
				ItemsSeen[4]=rm5.getThings();
				sum();
				System.out.println("Type 'library' ");
				break;

			}
			case "vault": {

				Visited[5] = 1;
				System.out.println(rm6.toString());
				moneyEarned[5] = rm6.getMoney();
				ItemsSeen[5]=rm6.getThings();
				sum();
				System.out.println("Type 'secret room' or 'parlor' ");
				break;

			}
			case "parlor": {
				Visited[6] = 1;
				ItemsSeen[6]=rm7.getThings();
				System.out.println(rm7.toString());
				moneyEarned[6] = rm7.getMoney();
				sum();
				System.out.println("Type 'vault' or 'kitchen' ");
				break;

			}
			case "secret room": {
                System.out.println("Enter a number from 1 to 4");
                response=sc.next();
                if(response.equalsIgnoreCase("4"))
                {
                	 System.out.println("Welcome to the Secret Room");
					Visited[7] = 1;
					ItemsSeen[7]=rm8.getThings();
					System.out.println(rm8.toString());
					moneyEarned[7] = rm8.getMoney();
					sum();
                }
                else
                {
                	 System.out.println("Better Luck next time!!!");
                }
				System.out.println("Type 'vault' ");
				break;
			}
			case "exit":
			{
				System.out.println("You have chosen to exit!!");
				sum();
				roomsVisited();
				thingsSeen();
				System.out.println("Beware !!!! You are being STALKED by YOUR AXE");
				System.exit(0);
				
			}

			}
		}
	}

	private static void initializeRooms() {
		rm1 = new Room("Foyer", 50, "You are in the foyer", "dead scorpion");
		rm2 = new Room("Front Room", 63, "you are in the front room", "piano");
		rm3 = new Room("Library", 60, "You r in d library", "Spiders");
		rm4 = new Room("Kitchen", 20, "You r in d kitchen", "Bats");
		rm5 = new Room("Dining Room", 50, "You r in d Dining Room", "Dust and boxes");
		rm6 = new Room("Vault", 90, "You r in d vault", "walking Skeleton");
		rm7 = new Room("Parlor", 60, "You r in d parlor", "treasure chest");
		rm8 = new Room("Secret", 10000, "You r in d secret room", "piles of Gold");

	}
	private static void sum()
	{
		double sum = 0;
		for(int i =0;i<moneyEarned.length;i++)
		{
			sum +=moneyEarned[i];
		}
		System.out.println("Money Earned :"+sum);
	}
	private static void roomsVisited()
	{
		double count = 0;
		for(int i =0;i<Visited.length;i++)
		{
			count +=Visited[i];
		}		
		System.out.println("Number of Rooms Visited :"+count);
	}
	private static void thingsSeen()
	{
		
		for(int i =0;i<ItemsSeen.length;i++)
		{
				System.out.println("You saw this :"+(i+1)+"." +ItemsSeen[i]);
		}		
		
	}
}
