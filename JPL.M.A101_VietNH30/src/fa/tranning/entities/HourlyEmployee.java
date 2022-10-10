package fa.tranning.entities;

public class HourlyEmployee extends Employee {
	private double rate;
	private double workingHour;
	public HourlyEmployee() {

	}
	public HourlyEmployee(String ssn, String firstName, String lastName, String address, String birthDate, String phone,
			String email, double rate,double workingHour) {
		super(ssn, firstName, lastName, address, birthDate, phone, email);
		this.rate = rate;
		this.workingHour = workingHour;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getWorkingHour() {
		return workingHour;
	}
	public void setWorkingHour(double workingHour) {
		this.workingHour = workingHour;
	}
	@Override
	public String toString() {
		return super.toString()+ ", rate=" + rate + ", workingHour=" + workingHour;
	}
	
	
}
