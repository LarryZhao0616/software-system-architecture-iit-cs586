package cs586.State;
import cs586.MDA_EFSM;

public class s4 extends state{
	public  s4(MDA_EFSM m)
	{
		mda = m;
	}
	
	@Override
	public void StartPump()
	{
		mda.op.setInitialValue();
		mda.op.readyMsg();	
		mda.changeState(5);
	}

	@Override
	public void SelectGas(int g)
	{
		System.out.println("You have already selected a gas");
		System.out.println();
	}
	
	@Override
	public void StopPump()
	{
		System.out.println("You havn't started pump yet");
		System.out.println();
	}
	
	@Override
	public void Pump()
	{
		System.out.println("You havn't started pump yet");
		System.out.println();
	}
	
	@Override
	public void Receipt()
	{
		System.out.println("You havn't started pump yet");
		System.out.println();
	}
	
	@Override
	public void NoReceipt()
	{
		System.out.println("You havn't started pump yet");
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
	public void Cancel()
	{
		System.out.println("Can't cancel right now");
		System.out.println();
	}
	
	@Override
	public void Activate()
	{
		System.out.println("Can't activate right now, please start pump now");
		System.out.println();
	}
	
	
}