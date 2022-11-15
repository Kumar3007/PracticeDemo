package CoreJavaForAT;

public class U2_KarnatakaTraffic implements U1_Interface_CentralTraffic,U3_ContinentalTraffic {
	
	public static void main(String[] args) {
		
		U1_Interface_CentralTraffic a = new U2_KarnatakaTraffic();// this line says that i have created an object for class(U2_KarnatakaTraffic) to implement methods present in interface(U1_Interface_CentralTraffic)
		a.redStop();
		a.greenGo();
		a.flashYellow();
		
		U2_KarnatakaTraffic b = new U2_KarnatakaTraffic();
		b.WalkonSymbol();
		
		
		
		U3_ContinentalTraffic c=new U2_KarnatakaTraffic();
		c.trainSymbol();
	}

	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	public void redStop() {
		System.out.println("redStop implementation");
	}

	public void flashYellow() {
		System.out.println("flashYellow implementation");
	}

	public void WalkonSymbol()
	{
		System.out.println("walking implementation");
	}

	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol implementation");
	}
}
