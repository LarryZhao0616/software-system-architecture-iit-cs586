package cs586.Output.setPrice;
import cs586.ssaMain;
import cs586.Data.data1;

public class SetPrice1 implements SetPrice{

	@Override
	public void showSetPrice(int g) {
		if(g==1){
			ssaMain.d1.price=ssaMain.d1.a;
			System.out.println("Regular Gas Price setted");
			System.out.println();
		}
		if(g==2){
			ssaMain.d1.price=ssaMain.d1.b;
			System.out.println("Super Gas Price setted");
			System.out.println();
		}
		else{
			System.out.println("You can only select Regular or Super");
			System.out.println();
		}
		
	}

}
