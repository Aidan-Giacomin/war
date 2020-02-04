import java.util.Scanner;

public class Craps
	{
		//hi
		//gydg//hjhj
		public static void main(String[] args)
			{
				int balance = 1000;
				Scanner userStringInput1 = new Scanner(System.in);
				System.out.println("welcome to Craps hit enter to roll the dice.");
				String answer = userStringInput1.nextLine();
				boolean startGame = true;
				boolean Round2 = true;
				while(startGame)
					{
					int D1 = (int) (Math.random() * 6) + 1;
					int D2 = (int) (Math.random() * 6) + 1;
					int total = D1 + D2;
					System.out.println(" you rolled a " + D1 + " and a " + D2 + " for a total of " + total + ".");
					if(total == 7|| total == 11) 
						{
							System.out.println("you win");
							Round2 = false;
						}
					else if(total == 2 || total == 12)
						{
							System.out.println("you lose stupid");
							Round2 = false;
						}
					else
						{
							Round2 = true;
						while(Round2)
							{
								int D11 = (int) (Math.random() * 6) + 1;
								int D21 = (int) (Math.random() * 6) + 1;
								int total2 = D11 + D21;
								System.out.println("Hit enter to roll again.");
								answer = userStringInput1.nextLine();
								System.out.println("You rolled a " + D11 + " and a " + D21 + " for a total of " + total2 + ".");
								if(total2 == total)
									{
										System.out.println("You rolled a " + total2 + " you win.");
											Round2 = false;
									}
								else if(total2 == 7)
									{
										System.out.println("You lose");
											Round2 = false;
									}
							}
						Scanner userStringInput2 = new Scanner(System.in);
						System.out.println("Would you like to play again?");
						String playagain = userStringInput2.nextLine();
						if (playagain.equals("no"))
							{
								startGame = false;
							}
						}
					}	
				System.out.println(" have a nice day.");
							
			}
	}