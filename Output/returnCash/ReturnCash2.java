package cs586.Output.returnCash;
import cs586.ssaMain;
import cs586.Data.data2;

public class ReturnCash2 implements ReturnCash{

	@Override
	public void showReturnCash() {
		ssaMain.d2.returnC=ssaMain.d2.cash-ssaMain.d2.total;
		System.out.println("return cash: $"+String.format("%.2f",ssaMain.d2.returnC));
		System.out.println();
	}

}
