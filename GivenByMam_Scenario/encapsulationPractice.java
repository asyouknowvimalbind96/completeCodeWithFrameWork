package GivenByMam_Scenario;

public class encapsulationPractice {

	private String StudentFristName="Vimal";
	private String StudentLastName="Bind";
	private String StudentAddress="adampur nigoh jaunpur U.P. 222162";
	private long StudentDOB=7800628135L;
	
	public void setStudentFristName(String FristName) {
		StudentFristName=FristName;
	}

	public String getStudentFristName() {
		return StudentFristName;
	}
	public void setStudentLastName(String LastName) {
		StudentLastName=LastName;
	}

	public String getStudentLastName() {
		return StudentLastName;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress=studentAddress;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentDOB(long DOB) {
		if(StudentDOB<18) {
			StudentDOB=DOB;
		}
		
		
	}

	public long getStudentDOB() {
		return StudentDOB;
	}

}
