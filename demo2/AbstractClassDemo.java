package demo2;
import java.math.BigDecimal;
public class AbstractClassDemo {
	public static void main(String ...args) {
		Employee e1=new SalariedEmployee("Ramya", BigDecimal.valueOf(6000));
		System.out.println(e1);
		e1.getCompanyName();
		
		Employee e2=new CommisionEmployee("Siddhu", BigDecimal.valueOf(90));
		System.out.println(e2);
		e2.getCompanyName1();
	}
}
