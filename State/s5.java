package cs586.State;
import cs586.MDA_EFSM;

public class s5 extends state{
	public  s5(MDA_EFSM m)
	{
		mda = m;
	}
	
	@Override
	public void Pump()
	{
		mda.op.pumpGasUnit();
		mda.op.gasPumpedMsg();	
		//System.out.println("please select a gas type first");
		//System.out.println();
	}
	
	@Override
	public void StopPump()
	{
		mda.op.stopMsg();	
		mda.changeState(6);
		//System.out.println("please select a gas type first");
		//System.out.println();
	}
	
	@Override
	public void SelectGas(int g)
	{
		System.out.println("You have already selected a gas");
		System.out.println();
	}
	
	@Override
	public void StartPump()
	{
		System.out.println("You have already started pump");
		System.out.println();
	}
	
	@Override
	public void Start()
	{
		System.out.println("You have already started");
		System.out.println();
	}
	
	@Override
	public void PayType(int t)
	{
		System.out.println("You have already chosen a payment");
		System.out.println();
	}
	
	@Override
	public void Receipt()
	{
		System.out.println("You havn't stopped pump yet");
		System.out.println();
	}
	
	@Override
	public void NoReceipt()
	{
		System.out.println("You havn't stopped pump yet");
		System.out.println();
	}
	
	@Override
	public void Cancel()
	{
		System.out.println("Can't cancel, You havn started pumping");
		System.out.println();
	}
	
	@Override
	public void Activate()
	{
		System.out.println("Can't activate right now, pumping");
		System.out.println();
	}
}