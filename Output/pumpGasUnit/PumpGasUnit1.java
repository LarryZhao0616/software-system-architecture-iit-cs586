package cs586.Output.pumpGasUnit;
import cs586.ssaMain;
import cs586.Data.data1;

public class PumpGasUnit1 implements PumpGasUnit{

	@Override
	public void showPumpGasUnit() {
		ssaMain.d1.gallon=ssaMain.d1.gallon+1;	
	}

}
