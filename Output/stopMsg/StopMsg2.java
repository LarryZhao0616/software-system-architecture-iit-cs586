package cs586.Output.stopMsg;

import cs586.ssaMain;

public class StopMsg2 implements StopMsg {

	@Override
	public void showStopMsg() {
		ssaMain.d2.total=((float)ssaMain.d2.liter)*ssaMain.d2.price;
		System.out.println("Stop pumping");
		System.out.println();
	}
	

}
