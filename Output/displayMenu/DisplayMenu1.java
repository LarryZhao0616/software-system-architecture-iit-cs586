package cs586.Output.displayMenu;
import cs586.ssaMain;
import cs586.Data.data1;


public class DisplayMenu1 implements DisplayMenu{

	@Override
	public void showMenu() {
		System.out.println("Please Select Gas Type");
		System.out.println("Regular: $"+ssaMain.d1.a);
		System.out.println("Super: $"+ssaMain.d1.b);
		System.out.println();
		
	}
	
}
