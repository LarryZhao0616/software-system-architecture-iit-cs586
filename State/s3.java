package cs586.State;
import cs586.MDA_EFSM;

public class s3 extends state{
	public  s3(MDA_EFSM m)
	{
		mda = m;
	}

	@Override
	public void Cancel()
	{
		mda.op.cancelMsg();
		mda.op.returnCash();
		mda.changeState(0);
	}
	
	@Override
	public void SelectGas(int g)
	{
		if (g == 1)
		{
			mda.op.setPrice(1);
			mda.changeState(4);
			//System.out.println("You chose Regular gas");
			//System.out.println();
		}
		else if (g == 2)
		{
			mda.op.setPrice(2);
			mda.changeState(4);
			//System.out.println("You chose Super gas");
			//System.out.println();	
		}
		else if (g == 3)
		{
			mda.op.setPrice(3);
			mda.changeState(4);
			//System.out.println("You chose Premium gas");
			//System.out.println();	
		}
		//else
		//{
		//	System.out.println("please select a valid gas type");
		//	System.out.println();
		//}
		
	}
	
	@Override
	public void StartPump()
	{
		System.out.println("please select a gas type first");
		System.out.println();
	}
	
	@Override
	public void Pump()
	{
		System.out.println("please select a gas type first");
		System.out.println();
	}
	
	@Override
	public void StopPump()
	{
		System.out.println("please select a gas type first");
		System.out.println();
	}
	
	@Override
	public void Receipt()
	{
		System.out.println("please select a gas type first");
		System.out.println();
	}
	
	@Override
	public void NoReceipt()
	{
		System.out.println("please select a gas type first");
		System.out.println();
	}
	
	@Override
	public void Start()
	{
		System.out.println("You have already started");
		System.out.println();
	}
	
	@Override
	public void PayType(int p)
	{
		System.out.println("We have already accepted your Payment");
		System.out.println();
	}
	
	@Override
	public void Activate()
	{
		System.out.println("Can't activate right now, please select gas type");
		System.out.println();
	}
	
	
}