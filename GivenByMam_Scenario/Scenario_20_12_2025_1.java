package GivenByMam_Scenario;

public class Scenario_20_12_2025_1 extends LoginClass {
	
	public static void main(String[] args) throws InterruptedException {
		Login();
		String ExpectedPageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		Thread.sleep(4000);
		String gettitle=driver.getTitle();	
		if(ExpectedPageTitle.equals(gettitle)) {
			System.out.println("Expected and Actual Value Matched Validation  passed > "+gettitle);
		}else {
			System.out.println("Expected and Actual Value not Matched Validation  Failed >");
		}
		
		//driver.close();
	}

}
