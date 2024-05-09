package demo2;
import java.math.BigDecimal;
class CommisionEmployee extends Employee{
	CommisionEmployee(String name, BigDecimal percentage){
		super(name);
		this.percentage=percentage;
	}
	public String toString() {
		return getClass().getSimpleName() + " " + name + " " + percentage + "% " + getBonus();
	//	return getClass().getSimpleName() + " " + name + " " + salary + " " + getBonus();
	}
	final BigDecimal percentage;
	@Override
	public int getBonus() {
		return 5000;
	}
	
}
