package cs586.State;
import cs586.MDA_EFSM;

public class s0 extends state{
	public  s0(MDA_EFSM m){
		mda=m;
	}
	
	@Override
	public void Activate()
	{
		mda.changeState(0); //Change the state to s0.
		mda.op.storeData(); //Point to data class
	}
	
	@Override
	public void Start()
	{
		mda.changeState(1); //Change the state to s1.
		System.out.println("Welcome to Sihan Gas Station");
		System.out.println();
		mda.op.payMsg(); //Point to payMsg
		System.out.println();
	}
	
	@Override
	public void Cancel()
	{
		System.out.println("Please activate first");
		System.out.println();
	}
	
	@Override
	public void StartPump()
	{
		System.out.println("Please activate first");
		System.out.println();
	}
	
	@Override
	public void StopPump()
	{
		System.out.println("Please activate first");
		System.out.println();
	}
	
	@Override
	public void SelectGas(int g)
	{
		System.out.println("Please activate first");
		System.out.println();
	}
	
	@Override
	public void Receipt()
	{
		System.out.println("Please activate first");
		System.out.println();
	}
	
	@Override
	public void NoReceipt()
	{
		System.out.println("Please activate first");
		System.out.println();
	}
	
	@Override
	public void Pump()
	{
		System.out.println("Please activate first");
		System.out.println();
	}
	
	@Override
	public void PayType(int t)
	{
		System.out.println("Please activate first");
		System.out.println();
	}
}
