package cs586.AbstractFactory;

import cs586.Output.storeData.StoreData;
import cs586.Output.payMsg.PayMsg;
import cs586.Output.storeCash.StoreCash;
import cs586.Output.displayMenu.DisplayMenu;
import cs586.Output.rejectMsg.RejectMsg;
import cs586.Output.setPrice.SetPrice;
import cs586.Output.readyMsg.ReadyMsg;
import cs586.Output.setInitialValue.SetInitialValue;
import cs586.Output.pumpGasUnit.PumpGasUnit;
import cs586.Output.gasPumpedMsg.GasPumpedMsg;
import cs586.Output.stopMsg.StopMsg;
import cs586.Output.printReceipt.PrintReceipt;
import cs586.Output.cancelMsg.CancelMsg;
import cs586.Output.returnCash.ReturnCash;


public interface Pump_Factory {
	public StoreData createStoreData();
	
	public PayMsg createPayMsg();
	
	public StoreCash createStoreCash();
	
	public DisplayMenu createDisplayMenu();
	
	public RejectMsg createRejectMsg();
	
	public SetPrice createSetPrice();
	
	public ReadyMsg createReadyMsg();
	
	public SetInitialValue createSetInitialValue();
	
	public PumpGasUnit createPumpGasUnit();
	
	public GasPumpedMsg createGasPumpedMsg();
	
	public StopMsg createStopMsg();
	
	public PrintReceipt createPrintReceipt();
	
	public CancelMsg createCancelMsg();
	
	public ReturnCash createReturnCash();
	
}
