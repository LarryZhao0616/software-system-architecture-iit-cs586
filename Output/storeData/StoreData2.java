package cs586.Output.storeData;
import cs586.ssaMain;
import cs586.Data.data2;

public class StoreData2 implements StoreData{
	@Override
	public void saveData()
	{
		ssaMain.d2.a =ssaMain.tmp_a2;
		ssaMain.d2.b =ssaMain.tmp_b2;
		ssaMain.d2.c =ssaMain.tmp_c2;
		System.out.println("Gas Price Updated");
		System.out.println();
	}

}