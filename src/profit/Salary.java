package profit;

public class Salary {
	public double salary ;
	public double commission ;
	public Salary(double salary, double commission) {
		this.salary = salary;
		this.commission = commission;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public String toString() {
		return "Salary [salary=" + salary + ", commission=" + commission + ", getSalary()=" + getSalary()
				+ ", getCommission()=" + getCommission() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
