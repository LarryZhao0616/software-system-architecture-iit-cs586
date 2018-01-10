package cs586.AbstractFactory;

import cs586.Output.storeData.StoreData;
import cs586.Output.storeData.StoreData1;
import cs586.Output.cancelMsg.CancelMsg;
import cs586.Output.cancelMsg.CancelMsg1;
import cs586.Output.displayMenu.DisplayMenu;
import cs586.Output.displayMenu.DisplayMenu1;
import cs586.Output.gasPumpedMsg.GasPumpedMsg;
import cs586.Output.gasPumpedMsg.GasPumpedMsg1;
import cs586.Output.payMsg.PayMsg;
import cs586.Output.payMsg.PayMsg1;
import cs586.Output.printReceipt.PrintReceipt;
import cs586.Output.printReceipt.PrintReceipt1;
import cs586.Output.pumpGasUnit.PumpGasUnit;
import cs586.Output.pumpGasUnit.PumpGasUnit1;
import cs586.Output.readyMsg.ReadyMsg;
import cs586.Output.readyMsg.ReadyMsg1;
import cs586.Output.rejectMsg.RejectMsg;
import cs586.Output.rejectMsg.RejectMsg1;
import cs586.Output.returnCash.ReturnCash;
import cs586.Output.returnCash.ReturnCash1;
import cs586.Output.setInitialValue.SetInitialValue;
import cs586.Output.setInitialValue.SetInitialValue1;
import cs586.Output.setPrice.SetPrice;
import cs586.Output.setPrice.SetPrice1;
import cs586.Output.stopMsg.StopMsg;
import cs586.Output.stopMsg.StopMsg1;
import cs586.Output.storeCash.StoreCash;


public class Pump_Factory1 implements Pump_Factory{
	
	@Override
	public StoreData createStoreData()
	{
		return new StoreData1();
	}

	@Override
	public PayMsg createPayMsg() {
		return new PayMsg1();
	}

	@Override
	public DisplayMenu createDisplayMenu() {
		return new DisplayMenu1();
	}

	@Override
	public RejectMsg createRejectMsg() {
		return new RejectMsg1();
	}

	@Override
	public SetPrice createSetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice1();
	}

	@Override
	public ReadyMsg createReadyMsg() {
		// TODO Auto-generated method stub
		return new ReadyMsg1();
	}

	@Override
	public SetInitialValue createSetInitialValue() {
		// TODO Auto-generated method stub
		return new SetInitialValue1();
	}

	@Override
	public PumpGasUnit createPumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit1();
	}

	@Override
	public GasPumpedMsg createGasPumpedMsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg1();
	}

	@Override
	public StopMsg createStopMsg() {
		// TODO Auto-generated method stub
		return new StopMsg1();
	}

	@Override
	public PrintReceipt createPrintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt1();
	}

	@Override
	public CancelMsg createCancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg1();
	}

	@Override
	public ReturnCash createReturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash1();
	}

	@Override
	public StoreCash createStoreCash() {
		// TODO Auto-generated method stub
		return null;
	}

}
