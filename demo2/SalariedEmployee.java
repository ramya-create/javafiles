package demo2;
import java.math.BigDecimal;
class SalariedEmployee extends Employee{
	final BigDecimal salary;
	SalariedEmployee(String name, BigDecimal bigDecimal){
		super(name);
		this.salary=bigDecimal;
	}
	public String toString() {
		return getClass().getSimpleName() + " " + name + " " + salary + " " + getBonus();
	}
	
	@Override
	public int getBonus() {
		return 10000;
	}
}
