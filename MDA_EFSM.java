claspackage cs586;

import cs586.State.*;

public class MDA_EFSM {
	public state s;
	public state[] sList = new state[7];
	public output op = new output();

	public MDA_EFSM()
	{
		sList[0] = new s0(this);
		sList[1] = new s1(this);
		sList[2] = new s2(this);
		sList[3] = new s3(this);
		sList[4] = new s4(this);
		sList[5] = new s5(this);
		sList[6] = new s6(this);
		s = sList[0];
	}
	
	public void changeState(int state)
	{
		s = sList[state];
	}
	public void Activate()
	{
		s.Activate();
	}
	public void Start()
	{
		s.Start();
	}
	public void PayType(int t)
	{
		s.PayType(t);
	}
	public void Reject()
	{
		s.Reject();
	}
	public void Cancel()
	{
		s.Cancel();
	}
	public void Approved()
	{
		s.Approved();
	}
	public void SelectGas(int g)
	{
		s.SelectGas(g);
	}
	public void StartPump()
	{
		s.StartPump();
	}
	public void Pump()
	{
		s.Pump();
	}
	public void StopPump()
	{
		s.StopPump();
	}
	public void Receipt()
	{
		s.Receipt();
	}
	public void NoReceipt()
	{
		s.NoReceipt();
	}

}
