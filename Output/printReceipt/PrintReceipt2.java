package cs586.Output.printReceipt;
import cs586.ssaMain;
import cs586.Data.data2;

public class PrintReceipt2 implements PrintReceipt{

	@Override
	public void showPrintReceipt() {
		//data2.total=data2.price*data2.liter;
		System.out.println("total Price: $"+ssaMain.d2.total+" Printing the receipt...");
		System.out.println();
	}

}