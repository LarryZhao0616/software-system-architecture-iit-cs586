package cs586.Output.pumpGasUnit;
import cs586.ssaMain;
import cs586.Data.data2;

public class PumpGasUnit2 implements PumpGasUnit{

	@Override
	public void showPumpGasUnit() {
		ssaMain.d2.liter=ssaMain.d2.liter+1;	
	}

}