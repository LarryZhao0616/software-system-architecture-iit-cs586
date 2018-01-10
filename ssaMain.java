package cs586;

import java.util.Scanner;

import cs586.AbstractFactory.Pump_Factory;
import cs586.AbstractFactory.Pump_Factory1;
import cs586.AbstractFactory.Pump_Factory2;
import cs586.Data.data1;
import cs586.Data.data2;
import cs586.pumps.pump1;
import cs586.pumps.pump2;


public class ssaMain {
	public static Pump_Factory 	pf;
	public static data1				d1;
	public static data2				d2;
	public static int				ch;
	public static float tmp_a1;
	public static float tmp_b1;
	public static int tmp_a2;
	public static int tmp_b2;
	public static int tmp_c2;
	public static float tmp_cash2;
	
	
	
	public static void main(String[] args)
	{
		System.out.println("CS586 - Final Project - 2017Spring ");
		System.out.println("Sihan Zhao     A20351458");
		System.out.println();
		System.out.println();
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			System.out.println("Press 1 for Pump1");
			System.out.println("Press 2 for Pump2");
			System.out.println("Press 0 to quit from the program");
			System.out.println();
			System.out.println("Enter the value:");

			ch = scan.nextInt();
			if (ch == 0)
			{
				System.out.println("quiting from the program");
				System.out.println();
				break;
			}
			else
			{
				if (ch == 1)
				{
					pump1 p1 = new pump1();
					pf = new Pump_Factory1();
					d1 = new data1();

					float a;
					float b;

					System.out.println();
					System.out.println("      GasPump-1");
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. Activate(float,float)");
					System.out.println("   1. Start()");
					System.out.println("   2. PayCredit()");
					System.out.println("   3. Reject()");
					System.out.println("   4. Cancel()");
					System.out.println("   5. Approved()");
					System.out.println("   6. Super()");
					System.out.println("   7. Regular()");
					System.out.println("   8. StartPump()");
					System.out.println("   9. PumpGallon()");
					System.out.println("   10. StopPump()");
					System.out.println("   111. Quit the program");
					System.out.println("Please make a note of these operations");
					System.out.println("   GasPump-1 Execution");
					System.out.println();

					while (ch != 111)
					{
						System.out.println("  Select Operation:");
						System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved");
						System.out.println("6-Super,7-Regular,8-StartPump,9-PumpGallon,10-StopPump,111-Quit the program");

						ch = scan.nextInt();
						System.out.println();
						switch (ch)
						{
						case 0:
							System.out.print("Operation:  Activate(float,float) ");
							System.out.println();
							System.out.print("Enter value of the a:");
							a=scan.nextFloat();
							System.out.print("Enter value of the b:");
							b=scan.nextFloat();
							//System.out.print("aaaa:"+a);
							//System.out.print("bbbbbbb:"+b);
							p1.Activate(a,b);
							scan.nextLine();
							System.out.println();
							break;
														
						case 1:
							System.out.print("Operation:  Start() ");
							System.out.println();
							p1.Start();
							scan.nextLine();
							System.out.println();
							break;
							
						case 2:
							System.out.print("Operation:  PayCredit()");
							System.out.println();
							p1.PayCredit();
							scan.nextLine();
							System.out.println();
							break;
							
						case 3:
							System.out.print("Operation:  Reject() ");
							System.out.println();
							p1.Reject();
							scan.nextLine();
							System.out.println();
							break;
							
						case 4:
							System.out.print("Operation:  Cancel() ");
							System.out.println();
							p1.Cancel();
							scan.nextLine();
							System.out.println();
							break;
							
						case 5:
							System.out.print("Operation:  Approved() ");
							System.out.println();
							p1.Approved();
							scan.nextLine();
							System.out.println();
							break;
														
						case 6:
							System.out.print("Operation:  Super() ");
							System.out.println();
							p1.Super();
							scan.nextLine();
							System.out.println();
							break;
							
						case 7:
							System.out.print("Operation:  Regular() ");
							System.out.println();
							p1.Regular();
							scan.nextLine();
							System.out.println();
							break;
							
						case 8:
							System.out.print("Operation: StartPump()");
							System.out.println();
							p1.StartPump();
							System.out.println();
							break;
							
						case 9:
							System.out.print("Operation: PumpGallon()");
							System.out.println();
							p1.PumpGallon();
							System.out.println();
							break;
							
						case 10:
							System.out.print("Operation: StopPump()");
							System.out.println();
							p1.StopPump();
							System.out.println();
							break;
						}
					}
				}
				else if (ch == 2)
				{
					pump2 p2 = new pump2();
					pf = new Pump_Factory2();
					d2 = new data2();

					System.out.println();
					System.out.println("      GasPump-2");
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. Activate(int,int,int)");
					System.out.println("   1. Start()");
					System.out.println("   2. PayCash()");
					System.out.println("   3. Cancel()");
					System.out.println("   4. Super()");
					System.out.println("   5. Premium()");
					System.out.println("   6. Regular()");
					System.out.println("   7. StartPump()");
					System.out.println("   8. PumpLiter()");
					System.out.println("   9. Stop()");
					System.out.println("   10. Receipt()");
					System.out.println("   11. NoReceipt");
					System.out.println("   111. Quit the program");
					System.out.println("Please make a note of these operations");
					System.out.println("   GasPump-2 Execution");
					System.out.println();

					int a;
					int b;
					int c;
					float cash;

					while (ch != 111)
					{
				
						System.out.println("     Select Operation:");
						System.out.println("0-Activate,1-Start,2-PayCash,3-Cancel,4-Super,5-Premium,6-Regular");
						System.out.println("7-StartPump,8-PumpLiter,9-Stop,10-Receipt,11-NoReceipt,111-quit");

						ch = scan.nextInt();
						System.out.println();
						switch (ch)
						{
						case 0:
							System.out.print("Operation:  Activate(float,float) ");
							System.out.println();
							System.out.print("Enter value of the a:");
							a=scan.nextInt();
							System.out.print("Enter value of the b:");
							b=scan.nextInt();
							System.out.print("Enter value of the c:");
							c=scan.nextInt();
							p2.Activate(a,b,c);
							scan.nextLine();
							System.out.println();
							break;
														
						case 1:
							System.out.print("Operation:  Start() ");
							System.out.println();
							p2.Start();
							scan.nextLine();
							System.out.println();
							break;
							
						case 2:
							System.out.print("Operation:  PayCash()");
							System.out.println();
							System.out.print("Enter value of the cash: ");
							cash=scan.nextFloat();
							p2.PayCash(cash);
							scan.nextLine();
							System.out.println();
							break;
							
						case 3:
							System.out.print("Operation:  Cancel() ");
							System.out.println();
							p2.Cancel();
							scan.nextLine();
							System.out.println();
							break;
							
						case 4:
							System.out.print("Operation:  Super() ");
							System.out.println();
							p2.Super();
							scan.nextLine();
							System.out.println();
							break;
							
						case 5:
							System.out.print("Operation:  Premium() ");
							System.out.println();
							p2.Premium();
							scan.nextLine();
							System.out.println();
							break;
														
						case 6:
							System.out.print("Operation:  Regular() ");
							System.out.println();
							p2.Regular();
							scan.nextLine();
							System.out.println();
							break;
							
						case 7:
							System.out.print("Operation:  StartPump() ");
							System.out.println();
							p2.StartPump();
							scan.nextLine();
							System.out.println();
							break;
							
						case 8:
							System.out.print("Operation: PumpLiter()");
							System.out.println();
							p2.PumpLiter();
							System.out.println();
							break;
							
						case 9:
							System.out.print("Operation: Stop()");
							System.out.println();
							p2.Stop();
							System.out.println();
							break;
							
						case 10:
							System.out.print("Operation: Receipt()");
							System.out.println();
							p2.Receipt();
							System.out.println();
							break;
							
						case 11:
							System.out.print("Operation: NoReceipt()");
							System.out.println();
							p2.NoReceipt();
							System.out.println();
							break;
						}
					}
				}
			}

		}
	}

}
