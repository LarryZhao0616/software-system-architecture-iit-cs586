package cs586;

import cs586.AbstractFactory.Pump_Factory;

public class output {
	
	public Pump_Factory pf;

	public void storeData()
	{
		pf = ssaMain.pf;
		pf.createStoreData().saveData();
	}
	
	public void payMsg()
	{
		pf = ssaMain.pf;
		pf.createPayMsg().showPayMsg();
	}
	
	public void storeCash()
	{
		pf = ssaMain.pf;
		pf.createStoreCash().showStoreCash();
	}
	
	public void displayMenu()
	{
		pf = ssaMain.pf;
		pf.createDisplayMenu().showMenu();
	}
	
	public void rejectMsg()
	{
		pf = ssaMain.pf;
		pf.createRejectMsg().showRejectMsg();
	}
	
	public void setPrice(int g)
	{
		pf = ssaMain.pf;
		pf.createSetPrice().showSetPrice(g);
	}
	
	public void readyMsg()
	{
		pf = ssaMain.pf;
		pf.createReadyMsg().showReadyMsg();
	}
	
	public void setInitialValue()
	{
		pf = ssaMain.pf;
		pf.createSetInitialValue().showSetInitialValue();
	}
	
	public void pumpGasUnit()
	{
		pf = ssaMain.pf;
		pf.createPumpGasUnit().showPumpGasUnit();
	}
	
	public void gasPumpedMsg()
	{
		pf = ssaMain.pf;
		pf.createGasPumpedMsg().showGasPumpedMsg();
	}
	
	public void stopMsg()
	{
		pf = ssaMain.pf;
		pf.createStopMsg().showStopMsg();
	}
	
	public void printReceipt()
	{
		pf = ssaMain.pf;
		pf.createPrintReceipt().showPrintReceipt();
	}
	
	public void cancelMsg()
	{
		pf = ssaMain.pf;
		pf.createCancelMsg().showCancelMsg();
	}
	
	public void returnCash()
	{
		pf = ssaMain.pf;
		pf.createReturnCash().showReturnCash();
	}
}
