package cs586.Output.rejectMsg;

public class RejectMsg1 implements RejectMsg{
	@Override
	public void showRejectMsg()
	{
		System.out.println("Rejected, please re-start");
		System.out.println();
	}

}
