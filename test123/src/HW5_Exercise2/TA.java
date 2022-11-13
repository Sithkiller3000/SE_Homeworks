package HW5_Exercise2;

public class TA {
	
	private String name;
	private Course course;
	private String contract;
	private int contractEndTime;
	private boolean hasContract;

	
	public Course getCourse() {
		return this.course;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void extendContract(Course course, int newContractEndTime, String contractContent) {
		this.course = course;
		this.contractEndTime = newContractEndTime;
		this.contract = contractContent;
		this.hasContract = true;
	}
	
	
}
