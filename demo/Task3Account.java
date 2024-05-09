package demo;


	
	
	
	public class Task3Account{
		
	public static void main(String[] args) {
		/*
		Scanner scan=new Scanner(System.in);
		
		System.out.println("account id: ");
		int accId=scan.nextInt();
		System.out.println("Holder name: ");
		String holdername=scan.nextLine();
		System.out.println("Initial balance ");
		double initialbalance=scan.nextDouble();
		
		Account ta=new Account(accId, holdername, initialbalance);
		
		System.out.println("deposit amount: ");
		double depositeamount=scan.nextDouble();
		ta.deposit(depositamount);
		
		
		System.out.println("withdraw amount: ");
		double withdrawamount=scan.nextDouble();
		ta.withdraw(withdrawamount);
		
		
		//System.out.println("transfer amount: ");
		//double transferamount=scan.nextDouble();
	
		
		**/
		
		Account account1=new Account(01, "AAA", 1000);
		Account account2=new Account(02, "BBB", 500);
		
		account1.deposit(500);
		account2.withdraw(200);

		account1.transferAmount(account2, 300);
		
		System.out.println("final account1 balance: " + account1.getBalance());
		System.out.println("final account2 balance: " + account2.getBalance());
		
		
	}
	
	
}
