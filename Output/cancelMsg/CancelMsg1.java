package cs586.Output.cancelMsg;

public class CancelMsg1 implements CancelMsg{

	@Override
	public void showCancelMsg() {
		System.out.println("transaction canceled, please re-start");
		System.out.println();
		
	}

}
