package cs586.State;
import cs586.MDA_EFSM;

public class s2 extends state{
	public  s2(MDA_EFSM m)
	{
		mda=m;
	}
	
	@Override
	public void Reject()
	{
		mda.op.rejectMsg();
		mda.changeState(0);
	}
	
	@Override
	public void Approved()
	{
		mda.op.displayMenu();
		mda.changeState(3);
	}
	
	@Override
	public void Cancel()
	{
		System.out.println("The card hasn't been approved");
		System.out.println();
	}
	
	@Override
	public void StartPump()
	{
		System.out.println("The card hasn't been approved");
		System.out.println();
	}
	
	@Override
	public void StopPump()
	{
		System.out.println("The card hasn't been approved");
		System.out.println();
	}
	
	@Override
	public void SelectGas(int g)
	{
		System.out.println("The card hasn't been approved");
		System.out.println();
	}
	
	@Override
	public void Receipt()
	{
		System.out.println("The card hasn't been approved");
		System.out.println();
	}
	
	@Override
	public void NoReceipt()
	{
		System.out.println("The card hasn't been approved");
		System.out.println();
	}
	
	@Override
	public void Pump()
	{
		System.out.println("The card hasn't been approved");
		System.out.println();
	}
	
	@Override
	public void Start()
	{
		System.out.println("You have already started");
		System.out.println();
	}
	
	@Override
	public void Activate()
	{
		System.out.println("Can't activate right now,verifying card...");
		System.out.println();
	}
	
	@Override
	public void PayType(int p)
	{
		System.out.println("We have already accepted your Payment");
		System.out.println();
	}

}
