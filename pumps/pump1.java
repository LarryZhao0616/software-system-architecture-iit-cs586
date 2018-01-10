package cs586.pumps;

import cs586.MDA_EFSM;
import cs586.ssaMain;
import cs586.Data.data1;

public class pump1 {
	MDA_EFSM m = new MDA_EFSM();
	data1 d1;
	public float tmp_a;
	public float tmp_b;
	
	

	public void Activate(float a,float b)
	{
		if((a>0)&&(b>0.0)){
			ssaMain.tmp_a1=a;
			ssaMain.tmp_b1=b;
			

			tmp_a=a;
			tmp_b=b;
			
			m.Activate();
		}
	}
	
	public void Start(){
		m.Start();
	}
	
	public void PayCredit(){
		m.PayType(1);
	}
	
	public void Reject(){
		m.Reject();
	}
	
	public void Cancel(){
		m.Cancel();
	}
	
	public void Approved(){
		m.Approved();
	}
	
	public void Super(){
		m.SelectGas(2);
	}
	
	public void Regular(){
		m.SelectGas(1);
	}
	
	public void StartPump(){
		m.StartPump();
	}
	
	public void PumpGallon(){
		m.Pump();
	}
	
	public void StopPump(){
		m.StopPump();
		m.Receipt();
	}
}
