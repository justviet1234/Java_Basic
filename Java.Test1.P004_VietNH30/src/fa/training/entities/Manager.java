package fa.training.entities;

import java.time.LocalDate;
import java.util.Date;

public class Manager {
	private int ID;
	private String fullname;
	private Date dateOfBirth;
	private String gender;
	private String address;
	private String department;
	public Manager() {
	
	}
	public Manager(int iD, String fullname, Date dateOfBirth, String gender, String address, String department) {
		super();
		this.ID = iD;
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.department = department;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getGender() {
		return gender;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
