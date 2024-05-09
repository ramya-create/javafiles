package demo3;
import java.util.Scanner;
public class creditCardApproval {
	 public static void main(String[] args) {
	        int creditScore ; double debtAmount,income;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your credit score");
	        creditScore = sc.nextInt();
	        System.out.println("Enter your debt amount");
	        debtAmount = sc.nextDouble();
	        System.out.println("Enter your income amount");
	        income = sc.nextDouble();
	        System.out.println("Did you go bankrupt within the last 5 years ");
	        boolean bnkStatus = sc.nextBoolean();
	        float dbtincRatio = (float)((debtAmount*100)/income);
	        try {
	            cardApproval(creditScore,dbtincRatio,bnkStatus);
	        }
	        catch(Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	        sc.close();
	    }
	    public static void cardApproval(int creditScore ,float dbtincRatio,boolean bnkStatus) throws Exception{
	        if((creditScore<700) || (dbtincRatio>30)||bnkStatus)
	            throw new Exception("Not approved for credit card");
	        else
	            System.out.println("Approved for credit card");
	     }
}
