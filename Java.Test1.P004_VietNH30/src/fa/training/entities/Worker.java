package fa.training.entities;

import java.time.LocalDate;
import java.util.Date;

public class Worker extends Manager {
	private int ID;
	private String fullname;
	private Date dateOfBirth;
	private String gender;
	private String address;
	private int workerLevel;
	public Worker() {

	}
	
	
	public Worker(int iD, String fullname, Date dateOfBirth, String gender, String address, int workerLevel) {
		super();
		ID = iD;
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.workerLevel = workerLevel;
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


	public String getGender() {
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


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getWorkerLevel() {
		return workerLevel;
	}
	public void setWorkerLevel(int workerLevel) {
		this.workerLevel = workerLevel;
	}
	
	
}
