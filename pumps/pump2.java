package cs586.pumps;

import cs586.MDA_EFSM;
import cs586.ssaMain;
import cs586.Data.data2;

public class pump2 {
	MDA_EFSM m = new MDA_EFSM();
	data2 d2;
	public int tmp_a;
	public int tmp_b;
	public int tmp_c;
	public float tmp_cash;

	public void Activate(int a,int b,int c)
	{
		if((a>0)&&(b>0)&&(c>0)){
			ssaMain.tmp_a2=a;
			ssaMain.tmp_b2=b;
			ssaMain.tmp_c2=c;

			tmp_a=a;
			tmp_b=b;
			tmp_c=c;
			m.Activate();
		}
	}
	
	public void Start(){
		m.Start();
	}
	
	public void PayCash(float c){
		if(c>0){
			ssaMain.tmp_cash2=c;

			tmp_cash=c;
			m.PayType(2);
		}
	}
	
	public void Cancel(){
		m.Cancel();
	}
	
	public void Super(){
		m.SelectGas(2);
	}
	
	public void Regular(){
		m.SelectGas(1);
	}
	
	public void Premium(){
		m.SelectGas(3);
	}
	
	public void StartPump(){
		m.StartPump();
	}
	
	public void PumpLiter(){
		if(ssaMain.d2.cash<((ssaMain.d2.liter+1)*ssaMain.d2.price)){
			m.StopPump();
		}
		else{
			m.Pump();
		}
	}
	
	public void Stop(){
		m.StopPump();
	}
	
	public void Receipt(){
		m.Receipt();
	}
	
	public void NoReceipt(){
		m.NoReceipt();
	}
}