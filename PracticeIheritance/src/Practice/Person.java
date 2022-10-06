package Practice;

public class Person {
	private int id;
	private String Name;
	private String gender;
	private String birthDate;
	private String email;
	public Person() {
	}
	public Person(int id, String Name, String gender, String birthDate, String email) {
		super();
		this.id = id;
		this.Name = Name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setCandidateName(String Name) {
		this.Name = Name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
