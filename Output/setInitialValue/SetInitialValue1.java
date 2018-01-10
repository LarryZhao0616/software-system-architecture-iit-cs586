package cs586.Output.setInitialValue;
import cs586.ssaMain;
import cs586.Data.data1;

public class SetInitialValue1 implements SetInitialValue{

	@Override
	public void showSetInitialValue() {
		ssaMain.d1.gallon=0;
		ssaMain.d1.total=0;
		System.out.println("Gallon=0 and total=0 ");
		System.out.println();
		
	}

}
