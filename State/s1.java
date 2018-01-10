package cs586.State;
import cs586.MDA_EFSM;

public class s1 extends state{
	public  s1(MDA_EFSM m)
	{
		mda = m;
	}
	
	@Override
	public void PayType(int t)
	{
		if (t == 1)
		{
			mda.changeState(2);
			System.out.println("verifying card......");
			System.out.println();
		}
		else if (t == 2)
		{
			mda.changeState(3);
			mda.op.storeCash();
			mda.op.displayMenu();	
		}
		else
		{
			System.out.println("please insert card or cash first");
			System.out.println();
		}
	}
	
	@Override
	public void Reject()
	{
		System.out.println("Please select a payment first");
		System.out.println();
	}
	
	@Override
	public void Start()
	{
		System.out.println("You have already started");
		System.out.println();
	}
	
	@Override
	public void Approved()
	{
		System.out.println("Please select a payment first");
		System.out.println();
	}
	
	@Override
	public void Cancel()
	{
		System.out.println("Please select a payment first");
		System.out.println();
	}
	
	@Override
	public void SelectGas(int g)
	{
		System.out.println("Please select a payment first");
		System.out.println();
	}
	
	@Override
	public void StartPump()
	{
		System.out.println("Please select a payment first");
		System.out.println();
	}
	
	@Override
	public void Pump()
	{
		System.out.println("Please select a payment first");
		System.out.println();
	}
	
	@Override
	public void StopPump()
	{
		System.out.println("Please select a payment first");
		System.out.println();
	}
	
	@Override
	public void Receipt()
	{
		System.out.println("Please select payment first");
		System.out.println();
	}
	
	@Override
	public void NoReceipt()
	{
		System.out.println("Please select payment first");
		System.out.println();
	}
	
	@Override
	public void Activate()
	{
		System.out.println("Can't activate right now");
		System.out.println();
	}
}
