package cs586.Output.gasPumpedMsg;
import cs586.ssaMain;
import cs586.Data.data2;

public class GasPumpedMsg2 implements GasPumpedMsg{

	@Override
	public void showGasPumpedMsg() {
		System.out.println("Gas Pumped: "+ssaMain.d2.liter+" Liters");
		System.out.println();
	}

}