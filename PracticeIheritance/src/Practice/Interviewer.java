package Practice;

public class Interviewer extends Person  {
	private int experience;
	public Interviewer() {
		
	}
	public Interviewer(int id, String Name, String gender, String birthDate, String email,int experience) {
		super(id, Name, gender, birthDate, email);
		this.experience = experience;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
}
