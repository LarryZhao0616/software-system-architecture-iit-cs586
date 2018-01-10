package cs586.Output.printReceipt;
import cs586.ssaMain;
import cs586.Data.data1;

public class PrintReceipt1 implements PrintReceipt{

	@Override
	public void showPrintReceipt() {
		ssaMain.d1.total=ssaMain.d1.price*ssaMain.d1.gallon;
		System.out.println("total Price: $"+(String.format("%.2f", ssaMain.d1.total))+" Printing the receipt...");
		System.out.println();
	}

}
