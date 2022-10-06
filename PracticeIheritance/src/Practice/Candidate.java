package Practice;

public class Candidate extends Person {
	double gpa;
	public Candidate() {
	
	}
	public Candidate(int id, String Name, String gender, String birthDate, String email,double gpa) {
		super(id, Name, gender, birthDate, email);
		this.gpa = gpa;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}
