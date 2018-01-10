package cs586.AbstractFactory;

import cs586.Output.cancelMsg.CancelMsg;
import cs586.Output.cancelMsg.CancelMsg1;
import cs586.Output.displayMenu.DisplayMenu;
import cs586.Output.displayMenu.DisplayMenu2;
import cs586.Output.gasPumpedMsg.GasPumpedMsg;
import cs586.Output.gasPumpedMsg.GasPumpedMsg2;
import cs586.Output.payMsg.PayMsg;
import cs586.Output.payMsg.PayMsg2;
import cs586.Output.printReceipt.PrintReceipt;
import cs586.Output.printReceipt.PrintReceipt2;
import cs586.Output.pumpGasUnit.PumpGasUnit;
import cs586.Output.pumpGasUnit.PumpGasUnit2;
import cs586.Output.readyMsg.ReadyMsg;
import cs586.Output.readyMsg.ReadyMsg1;
import cs586.Output.rejectMsg.RejectMsg;
import cs586.Output.rejectMsg.RejectMsg1;
import cs586.Output.returnCash.ReturnCash;
import cs586.Output.returnCash.ReturnCash2;
import cs586.Output.setInitialValue.SetInitialValue;
import cs586.Output.setInitialValue.SetInitialValue2;
import cs586.Output.setPrice.SetPrice;
import cs586.Output.setPrice.SetPrice2;
import cs586.Output.stopMsg.StopMsg;
import cs586.Output.stopMsg.StopMsg2;
import cs586.Output.storeCash.StoreCash;
import cs586.Output.storeCash.StoreCash1;
import cs586.Output.storeData.StoreData;
import cs586.Output.storeData.StoreData2;

public class Pump_Factory2 implements Pump_Factory{

	@Override
	public StoreData createStoreData() {
		return new StoreData2();
	}

	@Override
	public PayMsg createPayMsg() {
		return new PayMsg2();
	}

	@Override
	public StoreCash createStoreCash() {
		return new StoreCash1();
	}

	@Override
	public DisplayMenu createDisplayMenu() {
		return new DisplayMenu2();
	}

	@Override
	public RejectMsg createRejectMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetPrice createSetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice2();
	}

	@Override
	public ReadyMsg createReadyMsg() {
		// TODO Auto-generated method stub
		return new ReadyMsg1();
	}

	@Override
	public SetInitialValue createSetInitialValue() {
		// TODO Auto-generated method stub
		return new SetInitialValue2();
	}

	@Override
	public PumpGasUnit createPumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit2();
	}

	@Override
	public GasPumpedMsg createGasPumpedMsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg2();
	}

	@Override
	public StopMsg createStopMsg() {
		// TODO Auto-generated method stub
		return new StopMsg2();
	}

	@Override
	public PrintReceipt createPrintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt2();
	}

	@Override
	public CancelMsg createCancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg1();
	}

	@Override
	public ReturnCash createReturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash2();
	}

}
