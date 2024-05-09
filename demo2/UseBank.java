package demo2;

public class UseBank {
	public static void main(String[] args) {
		IciciBank ic=new IciciBank();
		System.out.println("rate of intererst of IciciBank: " + ic.getInterest());
		
		SBIBank sbi=new SBIBank();
		System.out.println("rate of intererst of SBIBank: " + sbi.getInterest());
	}
}
