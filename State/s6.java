package cs586.State;
import cs586.MDA_EFSM;

public class s6 extends state{
	public  s6(MDA_EFSM m)
	{
		mda = m;
	}
	
	@Override
	public void Receipt()
	{
		mda.op.printReceipt();
		mda.op.returnCash();	
		mda.changeState(0);
		//System.out.println("You havn't started pump yet");
		//System.out.println();
	}
	
	@Override
	public void NoReceipt()
	{
		mda.op.returnCash();	
		mda.changeState(0);
		//System.out.println("You havn't started pump yet");
		//System.out.println();
	}
	
	@Override
	public void SelectGas(int g)
	{
		System.out.println("You have already stoped pump");
		System.out.println();
	}
	
	@Override
	public void StartPump()
	{
		System.out.println("You have already stoped pump");
		System.out.println();
	}
	
	@Override
	public void Start()
	{
		System.out.println("You have already started");
		System.out.println();
	}
	
	@Override
	public void StopPump()
	{
		System.out.println("You have already stoped pump");
		System.out.println();
	}
	
	@Override
	public void PayType(int t)
	{
		System.out.println("You have already stoped pump");
		System.out.println();
	}
	
	public void Pump()
	{
		System.out.println("You have already stoped pump");
		System.out.println();
	}
	
	public void Cancel()
	{
		System.out.println("Can't cancel, you can only cancel before pumping gas");
		System.out.println();
	}
	
	@Override
	public void Activate()
	{
		System.out.println("Can't activate right now, Receipt or NoPeceipt?");
		System.out.println();
	}
	
	
}
