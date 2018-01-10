package cs586.Output.displayMenu;
import cs586.ssaMain;
import cs586.Data.data2;


public class DisplayMenu2 implements DisplayMenu{

	@Override
	public void showMenu() {
		System.out.println("Please Select Gas Type");
		System.out.println("Regular: $"+ssaMain.d2.a);
		System.out.println("Super: $"+ssaMain.d2.b);
		System.out.println("Premium: $"+ssaMain.d2.c);
		System.out.println();
		
	}
	
}
