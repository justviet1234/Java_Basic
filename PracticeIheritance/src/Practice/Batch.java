package Practice;

public class Batch {
	String batchName;
	String batchDate;
	Interviewer interviewer;
	Candidate candidates;
	public Batch() {
		// TODO Auto-generated constructor stub
	}
	public Batch(String batchName, String batchDate, Interviewer interviewer, Candidate candidates) {
		super();
		this.batchName = batchName;
		this.batchDate = batchDate;
		this.interviewer = interviewer;
		this.candidates = candidates;
	}
	
	public Batch(String batchName, String batchDate) {
		super();
		this.batchName = batchName;
		this.batchDate = batchDate;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchDate() {
		return batchDate;
	}
	public void setBatchDate(String batchDate) {
		this.batchDate = batchDate;
	}
	public Interviewer getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(Interviewer interviewer) {
		this.interviewer = interviewer;
	}
	public Candidate getCandidates() {
		return candidates;
	}
	public void setCandidates(Candidate candidates) {
		this.candidates = candidates;
	}
	
	
}
