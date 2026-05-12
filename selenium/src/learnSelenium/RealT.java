package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RealT {

	public static void main(String[] args) throws InterruptedException {

		VerifyCreateLeadsFuctionality();

	}
	public static void VerifyCreateLeadsFuctionality() throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		String ExpectedTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String actualTitle= driver.getTitle();
		if(ExpectedTitle.equals(actualTitle)) {
			System.out.println("If Login Page Visible then ----  Validation is passed  ");
		}else {
			System.out.println("If Login Page Visible then ----  Validation is Failed  ");
		}

///////////////////////////////////////////User_Name_InputBox//////////////////////////////////////////////////////////
		WebElement weUsername= driver.findElement(By.xpath("//input[@name='user_name']"));

		if(weUsername.isDisplayed()) {
			System.out.println("username input box is display   - Validation Passed-");
		}else {
			System.out.println("username input box is not display   - Validation failed -");
		}

		if(weUsername.isEnabled()) {
			System.out.println("UserName input box is Enabled   -Validation Passed-");
		}else {
			System.out.println("UserName input box is not Enabled   - Validation failed-");
		}

		String BlankUsername=weUsername.getAttribute("value");
		if (BlankUsername.equals("")) {
			System.out.println("username text box is Blank - Validation Passed");
		}else {
			System.out.println("username text box is not Blank - Validation failed");
		}

		String ExpectedUserName="admin";
		weUsername.sendKeys("Admin");
		String ActualUserName=weUsername.getAttribute("value");
		if(ExpectedUserName.equals(ActualUserName)) {
			System.out.println("Expected and actual username matched  --Validation Passed");
		}else {
			System.out.println("Expected and actual username not matched - Validation failed ");
		}

		weUsername.clear();
		weUsername.sendKeys("admin");
		String rightUsername1=weUsername.getAttribute("value");
		if(ExpectedUserName.equals(rightUsername1)) {
			System.out.println("Expected and actual username matched   -Validation Passed");
		}else {
			System.out.println("Expected and actual username not matched--Validation failed ");
		}

///////////////////////////////////////User_Password///////////////////////////////////////////////////////////////////

		WebElement weUserPassword=driver.findElement(By.xpath("//input[@name='user_password']"));

		if(weUserPassword.isDisplayed()) {
			System.out.println("UserPassword Input Box is Display   -Validation Passed");
		}else {
			System.out.println("UserPassword Input Box is not Display   - Validation failed");
		}

		if(weUserPassword.isEnabled()) {
			System.out.println("UserPassword Input Box is Enable   -Validation Passed");
		}else {
			System.out.println("UserPassword Input Box is not Enable   -Validation failed");
		}

		String BlankUserPassword= weUserPassword.getAttribute("value");
		if(BlankUserPassword.equals("")) {
			System.out.println("UserPassword input box is blank   - Validation Passed");		
		}else {
			System.out.println("UserPassword input box is not blank   -Validation failed ");
		}

		String ExpectedUserPassword="admin1";
		weUserPassword.sendKeys("Admin1");
		String actualUserPassword1=weUserPassword.getAttribute("value");
		if(actualUserPassword1.equals(ExpectedUserPassword)) {
			System.out.println("(wrong sending )Expected and actual userPassword matched   - Validation Passed");
		}else {
			System.out.println("Expected and actual userPassword not matched   - Validation failed ");
		}
		String ExpectedPass="password";
		String maskedPassType= weUserPassword.getAttribute("type");

		if(maskedPassType.equals(ExpectedPass)) {
			System.out.println("-- Password is masked ");
		}else {
			System.out.println("Password is not Masked");
		}

		weUserPassword.clear();

		weUserPassword.sendKeys("admin1");
		String ActualUserPassword2=weUserPassword.getAttribute("value");
		if(ExpectedUserPassword.equalsIgnoreCase(ActualUserPassword2)) {
			System.out.println("(right sending)Expected and actual userPassword matched   - Validation Passed");
		}else {
			System.out.println("Expected and actual userPassword Not matched   - Validation failed ");
		}
////////////////////////////////////////////we_Login//////////////////////////////////////////////////////////////

		WebElement weLogin=driver.findElement(By.xpath("//input[@type='submit']"));
		
		
		
		
		if(weLogin.isDisplayed()) {
			System.out.println("Login button is display   - Validation Passed ");
		}else {
			System.out.println("Login button is not display  -Validation failed");
		}

		if(weLogin.isEnabled()) {
			System.out.println("Login button is Enable   - Validation Passed ");
		}else {
			System.out.println("Login button is not Enable   - Validation failed ");
		}
		int Expected_Login_X_Cordinate=20;
		int Expected_Y_Cordinate=354;
		Point LoginButtonL=weLogin.getLocation();
		int Actual_Login_X_Cordinate=LoginButtonL.getX();

		if(Actual_Login_X_Cordinate==Expected_Login_X_Cordinate) {
			System.out.println("Expected and Actual X cordinate matched  --- Validation is Passed ");
		}else{
			System.out.println("Expected and Actual X cordinate not matched  --- Validation is Failed ");
		}


		int Actual_Login_Y_Cordinate=LoginButtonL.getY();

		if(Expected_Y_Cordinate==Actual_Login_Y_Cordinate) {
			System.out.println("Expected and Actual Y cordinate matched  --- Validation is Passed ");
		}else{
			System.out.println("Expected and Actual Y cordinate not matched  --- Validation is Failed ");
		}
		weLogin.click();

		String Expected_homePage_Title="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String Home_Page_Title=driver.getTitle();
		if(Expected_homePage_Title.equalsIgnoreCase(Home_Page_Title)) {
			System.out.println("If Home page Title is show then   -- ---Validation is  Passed ");
		}else {
			System.out.println("If Home page Title is not show then   -- ---Validation is  Failed ");
		}

		//#####################################################################################################################//
//////////////////////////////////////////////we_Leads////////////////////////////////////////////////////////////////////	
		WebElement weLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		if(weLeads.isDisplayed()) {
			System.out.println("Leads Button is Display - Validation Passed");
		}else {
			System.out.println("Leads Button is Not Display -  Failed ");
		}

		if(weLeads.isEnabled()) {
			System.out.println("Leads button is Enabled  -Validation Passed ");
		}else {
			System.out.println("Leads Button is Enabled   - Validation failed");
		}
		weLeads.click();
		String ExpextedLeadsPageTitle="Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
		String ActualLeadsPageTitle=driver.getTitle();
		if(ExpextedLeadsPageTitle.equals(ActualLeadsPageTitle)) {
			System.out.println("Expected and actual Leads Page title  is Matched   -- Validation   Paseed ");
		}else {
			System.out.println("Expected and actual Leads Page title  is not Matched   -- Validation   Failed ");
		}


////////////////////////////////////////////we_Plus//////////////////////////////////////////////////////////////

		WebElement wePlus=driver.findElement(By.xpath("//img[@alt='Create Lead...']"));
		if(wePlus.isDisplayed()) {
			System.out.println("Plus Button in Leads Pages is Display  -Validation Passed ");
		}else {
			System.out.println("Plus Button in Leads Pages is Display  -Validation Failed ");
		}

		if(wePlus.isEnabled()) {
			System.out.println("Plus Button in Leads Pages is Enable  -Validation Passed ");
		}else {
			System.out.println("Plus Button in Leads Pages is Enable  -Validation Failed ");
		}
		wePlus.click();
/////////////////////////////////////////**Name_of_Title_DropDown_List**/////////////////////////////////////////////////////////////////
	System.out.println("/////////////////////////////////////////**Name_of_Title_DropDown_List**/////////////////////////////////////");
		WebElement we_Name_of_Title=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		if(we_Name_of_Title.isDisplayed()) {
			System.out.println("Name of Title DropDown list is Display   --Validation Passed");
		}else {
			System.out.println("Name of Title DropDown list is not Display   --Validation Failed");
		}
		if(we_Name_of_Title.isEnabled()) {
			System.out.println("Name of Title DropDown list is Enabled   --Validation Passed");
		}else {
			System.out.println("Name of Title DropDown list is not Enabled   --Validation Failed");
		}

		String ExpectedNameofTitle="--None--";
		String ActualNameofTitle=we_Name_of_Title.getAttribute("value");
		if(ExpectedNameofTitle.equals(ActualNameofTitle)) {
			System.out.println("Expected and Actual Name of Title DropDown list is matched   --Validation Passed");
		}else {
			System.out.println("Expected and Actual Name of Title DropDown list is not Matched   --Validation Failed");
		}
		
		
		
		Select NameofTitleDropdownList=new Select(we_Name_of_Title);
		NameofTitleDropdownList.selectByVisibleText("Mr.");

		String RightExpectednameofTitle="Mr.";
		String RightActualnameofTitle=we_Name_of_Title.getAttribute("value");
		if(RightExpectednameofTitle.equals(RightActualnameofTitle)) {
			System.out.println("Expected and Actual Name of Title DropDown list is Value matched   --Validation Passed");
		}else {
			System.out.println("Expected and Actual Name of Title DropDown list is Value not Matched   --Validation Failed");
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
System.out.println("/////////////////////////////////////////*we_First_Name*/////////////////////////////////////////////////////////////////");
		WebElement weFirstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		if(weFirstName.isDisplayed()) {
			System.out.println("FirstName text box is Display  - Validation Pass  ");
		}else {
			System.out.println("FirstName text box is not Display  - Validation Failed");
		}

		if(weFirstName.isEnabled()) {
			System.out.println("FirstName text box is Enable  - Validation Pass  ");
		}else {
			System.out.println("FirstName text box is Not Enable  - Validation Failed  ");
		}
		String Blank2=	weFirstName.getAttribute("value");
		if(Blank2.equals("")) {
			System.out.println("FirstName text box is Blank  - Validation Pass");
		}else {
			System.out.println("FirstName text box is not Blank  - Validation Failed");
		}
		int ExFirstNameInputBoxheight=89;
		int ExFirstNameInputBoxwidth=89;
		Dimension FirstnameInputBox= weFirstName.getSize();
		int ActualFirstnameHeight=FirstnameInputBox.getHeight();	
		int ActualFirstnamewidth=FirstnameInputBox.getWidth();	

		if(ExFirstNameInputBoxheight==ActualFirstnameHeight) {
			System.out.println("Expected and Actual First name input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual First name input Box height is not  matched    --Validation Failed ");
		}

		if(ExFirstNameInputBoxwidth==ActualFirstnamewidth) {
			System.out.println("Expected and Actual First name input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual First name input Box Width is not matched    --Validation Failed ");
		}


		String ExpectedFirstName="Vimal";
		weFirstName.sendKeys("vimal");

		String ActualFirstName=weFirstName.getAttribute("value");
		if(ExpectedFirstName.equals(ActualFirstName)) {
			System.out.println("Expected and Actual FirstName Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual FirstName Value Not Matched   - Validation  Failed  ");
		}
		weFirstName.clear();
		weFirstName.sendKeys("Vimal");
		String ActualFirstName2=weFirstName.getAttribute("value");
		if(ExpectedFirstName.equals(ActualFirstName2)) {
			System.out.println("nameCase lettle matched  - Vadition Passed ");
		}else {
			System.out.println("nameCase lettle not matched  - Vadition Failed ");
		}

		///////////////////////////////////////////////////weLastName//////////////////////////////////////////////////////////
		WebElement weLastName=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		if(weLastName.isDisplayed()) {
			System.out.println("LastName TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("LastName TextBox is Not Display --  Validation Failed ");
		}
		if(weLastName.isEnabled()) {
			System.out.println("LastName TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("LastName TextBox is Not Enable --  Validation Failed ");
		}
		String BlankLastName=weLastName.getAttribute("value");
		if(BlankLastName.equals("")) {
			System.out.println("LastName TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("LastName TextBox is Not Blank --  Validation Failed ");
		}


		int ExLastNameInputBoxheight=89;//16
		int ExLastNameInputBoxwidth=89;//187
		Dimension LastnameInputBox= weLastName.getSize();
		int ActualLastnameHeight=LastnameInputBox.getHeight();	
		int ActualLastnamewidth=LastnameInputBox.getWidth();	

		if(ExLastNameInputBoxheight==ActualLastnameHeight) {
			System.out.println("Expected and Actual Last name input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Last name input Box height is not  matched    --Validation Failed ");
		}

		if(ExLastNameInputBoxwidth==ActualLastnamewidth) {
			System.out.println("Expected and Actual Last name input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Last name input Box Width is not matched    --Validation Failed ");
		}

		String ExpectedLastName="Bind";
		weLastName.sendKeys("bind");

		String ActualLastName=weLastName.getAttribute("value");
		if(ExpectedLastName.equals(ActualLastName)) {
			System.out.println("Expected and Actual LastName Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual LastName Value Not Matched   - Validation  Failed  ");
		}
		weLastName.clear();
		weLastName.sendKeys("Bind");
		String ActualLastName2=weLastName.getAttribute("value");
		if(ExpectedLastName.equals(ActualLastName2)) {
			System.out.println("After right sending nameCase lettle matched  - Validation Passed ");
		}else {
			System.out.println("After right sending nameCase lettle not matched  - Validation Failed ");
		}
		// Thread.sleep(2000);

		/////////////////////////////////////////////////we_Company//////////////////////////////////////////////////////////////////		

		WebElement weCompany=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		if(weCompany.isDisplayed()) {
			System.out.println("Company TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Company TextBox is Not Display --  Validation Failed ");
		}
		if(weCompany.isEnabled()) {
			System.out.println("Company TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Company TextBox is Not Enable --  Validation Failed ");
		}
		String BlankCompany=weCompany.getAttribute("value");
		if(BlankCompany.equals("")) {
			System.out.println("Company TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Company TextBox is Not Blank --  Validation Failed ");
		}



		int ExCompanyInputBoxheight=16;//16
		int ExCompanyInputBoxwidth=187;//187
		weCompany.getSize();
		int ActualCompanynameInputBoxHeight=LastnameInputBox.getHeight();	
		int ActualCompanynameInputBoxwidth=LastnameInputBox.getWidth();	

		if(ExCompanyInputBoxheight==ActualCompanynameInputBoxHeight) {
			System.out.println("Expected and Actual Company input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Company input Box height is not  matched    --Validation Failed ");
		}

		if(ExCompanyInputBoxwidth==ActualCompanynameInputBoxwidth) {
			System.out.println("Expected and Actual Company input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Company input Box Width is not matched    --Validation Failed ");
		}

		String ExpectedCompany="BN Yarn Dyers";
		weCompany.sendKeys("bn Yarn Dyers");

		String ActualCompany=weCompany.getAttribute("value");
		if(ExpectedCompany.equals(ActualCompany)) {
			System.out.println("Expected and Actual Company Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Company Value Not Matched   - Validation  Failed  ");
		}
		weCompany.clear();
		weCompany.sendKeys("BN Yarn Dyers");
		String ActualCompany2=weCompany.getAttribute("value");
		if(ExpectedCompany.equals(ActualCompany2)) {
			System.out.println(" Company nameCase lettle matched  - Validation Passed ");
		}else {
			System.out.println(" Company nameCase lettle not matched  - Validation Failed ");
		}


		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		WebElement weTitleTextBox=driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		if(weTitleTextBox.isDisplayed()) {
			System.out.println("Title TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Display --  Validation Failed ");
		}
		if(weTitleTextBox.isEnabled()) {
			System.out.println("Title TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Enable --  Validation Failed ");
		}
		String BlankTitleBox=weTitleTextBox.getAttribute("value");
		if(BlankTitleBox.equals("")) {
			System.out.println("Title TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Blank --  Validation Failed ");
		}

		int ExTitleInputBoxheight=16;//16
		int ExTitleInputBoxwidth=189;//187
		 weTitleTextBox.getSize();
		int ActualTitleInputBoxHeight=LastnameInputBox.getHeight();	
		int ActualTitleInputBoxwidth=LastnameInputBox.getWidth();	

		if(ExTitleInputBoxheight==ActualTitleInputBoxHeight) {
			System.out.println("Expected and Actual Title input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Title input Box height is not  matched    --Validation Failed ");
		}

		if(ExTitleInputBoxwidth==ActualTitleInputBoxwidth) {
			System.out.println("Expected and Actual Title input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Title input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedTittle="Make software Tester in company";
		weTitleTextBox.sendKeys("bn Yarn Dyers");

		String ActualTitle=weTitleTextBox.getAttribute("value");
		if(ExpectedTittle.equals(ActualTitle)) {
			System.out.println("Expected and Actual Title Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Title Value Not Matched   - Validation  Failed  ");
		}
		weTitleTextBox.clear();
		weTitleTextBox.sendKeys("Make software Tester in company");
		String ActualTitle2=weTitleTextBox.getAttribute("value");
		if(ExpectedTittle.equals(ActualTitle2)) {
			System.out.println(" Title nameCase lettle matched  - Validation Passed ");
		}else {
			System.out.println(" Title nameCase lettle not matched  - Validation Failed ");
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		WebElement we_Leads_Source=driver.findElement(By.xpath("//select[@name='leadsource']"));
		if(we_Leads_Source.isDisplayed()) {
			System.out.println("Lead Source input Box is Display   --   Validation Passed ");
		}else{
			System.out.println("TLead Source input Box Not Display --  Validation Failed ");
		}
		if(we_Leads_Source.isEnabled()) {
			System.out.println("Lead Source input Box is Enable   --   Validation Passed ");
		}else{
			System.out.println("Lead Source input Box is Not Enable --  Validation Failed ");
		}
		String BlankLeadsSource=we_Leads_Source.getAttribute("value");
		if(BlankLeadsSource.equals("")) {
			System.out.println("Lead Source input Box is Blank   --   Validation Passed ");
		}else{
			System.out.println("Lead Source input Box is Not Blank --  Validation Failed ");
		}

		String ExpectedLeadSource="Employee";
		we_Leads_Source.sendKeys("employee");

		String ActualLeadSource=we_Leads_Source.getAttribute("value");
		if(ExpectedLeadSource.equals(ActualLeadSource)) {
			System.out.println("Expected and Actual Lead source  Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Lead source value Not Matched   - Validation  Failed  ");
		}
		//		we_Leads_Source.clear();
		//		we_Leads_Source.sendKeys("Self Generater");
		//		String ActualLeadSource2=we_Leads_Source.getAttribute("value");
		//		if(ExpectedLeadSource.equals(ActualLeadSource2)) {
		//			System.out.println(" 1 Expected and Actual Lead source  Value Matched   - Validation  Pass  ");
		//		}else {
		//			System.out.println(" 2 Expected and Actual Lead source  Value is not Matched   - Validation  Failed  ");
		//		}

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		WebElement weIndustry=driver.findElement(By.xpath("//select[@name='industry']"));
		if(weIndustry.isDisplayed()) {
			System.out.println("Lead Source input Box is Display   --   Validation Passed ");
		}else{
			System.out.println("Lead Source input Box Not Display --  Validation Failed ");
		}
		if(weIndustry.isEnabled()) {
			System.out.println("Industry input Box is Enable   --   Validation Passed ");
		}else{
			System.out.println("Industry input Box is Not Enable --  Validation Failed ");
		}
		String BlankIndustry=weIndustry.getAttribute("value");
		if(BlankIndustry.equals("")) {
			System.out.println("Industry input Box is Blank   --   Validation Passed ");
		}else{
			System.out.println("Industry input Box is Not Blank --  Validation Failed ");
		}

		String ExpectedIndustry="Banking";
		weIndustry.sendKeys("banking");

		String ActualIndustry=weIndustry.getAttribute("value");
		if(ExpectedIndustry.equals(ActualIndustry)) {
			System.out.println("Industry and Actual Title Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Industry and Actual Title Value Not Matched   - Validation  Failed  ");
		}
		//		weIndustry.clear();
		//		weIndustry.sendKeys("Banking");
		//		String ActualIndustry2=weIndustry.getAttribute("value");
		//		if(ExpectedIndustry.equals(ActualIndustry2)) {
		//			System.out.println(" Industry nameCase lettle matched  - Validation Passed ");
		//		}else {
		//			System.out.println(" Industry nameCase lettle not matched  - Validation Failed ");
		//		}


		///////////////////////////////////////Annual Revenue/////////////////////////////////////////////////////////////////////////////////		
		WebElement weAnnualRevenue=driver.findElement(By.xpath("//input[@name='annualrevenue']"));
		if(weAnnualRevenue.isDisplayed()) {
			System.out.println("AnnualRevenue TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("AnnualRevenue TextBox is Not Display --  Validation Failed ");
		}
		if(weAnnualRevenue.isEnabled()) {
			System.out.println("AnnualRevenue TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("AnnualRevenue TextBox is Not Enable --  Validation Failed ");
		}
		String BlankAnnualRevenueTextBox=weAnnualRevenue.getAttribute("value");
		if(BlankAnnualRevenueTextBox.equals("")) {
			System.out.println("AnnualRevenue TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("AnnualRevenue TextBox is Not Blank --  Validation Failed ");
		}

		int ExAnnualRevenueInputBoxheight=16;//16
		int ExAnnualRevenueInputBoxwidth=189;//187
		Dimension AnnualRevenueInputBoxSize= weAnnualRevenue.getSize();
		int ActualAnnualRevenueInputBoxHeight=AnnualRevenueInputBoxSize.getHeight();	
		int ActualAnnualRevenueInputBoxwidth=AnnualRevenueInputBoxSize.getWidth();	

		if(ExAnnualRevenueInputBoxheight==ActualAnnualRevenueInputBoxHeight) {
			System.out.println("Expected and Actual AnnualRevenue input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual AnnualRevenue input Box height is not  matched    --Validation Failed ");
		}

		if(ExAnnualRevenueInputBoxwidth==ActualAnnualRevenueInputBoxwidth) {
			System.out.println("Expected and Actual AnnualRevenue input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual AnnualRevenue input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedAnnualRevenue="2025";
		weAnnualRevenue.sendKeys("1000");

		String ActualAnnualRevenue=weAnnualRevenue.getAttribute("value");
		if(ExpectedTittle.equals(ActualAnnualRevenue)) {
			System.out.println("Expected and Actual AnnualRevenue Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual AnnualRevenue Value Not Matched   - Validation  Failed  ");
		}
		weAnnualRevenue.clear();
		weAnnualRevenue.sendKeys("2025");
		String ActualAnnualRevenue2=weAnnualRevenue.getAttribute("value");
		if(ExpectedAnnualRevenue.equals(ActualAnnualRevenue2)) {
			System.out.println(" AnnualRevenue of inputBox value matched  - Validation Passed ");
		}else {
			System.out.println(" AnnualRevenue of inputBox value not matched  - Validation Failed ");
		}

		/////////////////////////////////////No_of_employee///////////////////////////////////////////////////////////////////////////////		

		WebElement we_No_of_employee=driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		if(we_No_of_employee.isDisplayed()) {
			System.out.println("No_of_employee TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("No_of_employee TextBox is Not Display --  Validation Failed ");
		}
		if(we_No_of_employee.isEnabled()) {
			System.out.println("No_of_employee TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("No_of_employee TextBox is Not Enable --  Validation Failed ");
		}
		String BlankNo_of_employeeBox=we_No_of_employee.getAttribute("value");
		if(BlankNo_of_employeeBox.equals("")) {
			System.out.println("No_of_employee TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("No_of_employee TextBox is Not Blank --  Validation Failed ");
		}

		int ExNo_of_employeeInputBoxheight=16;//16
		int ExNo_of_employeeInputBoxwidth=189;//187
		Dimension No_of_employeeInputBoxSize=we_No_of_employee.getSize();
		int ActualNo_of_employeeInputBoxHeight=No_of_employeeInputBoxSize.getHeight();	
		int ActualNo_of_employeeInputBoxwidth=No_of_employeeInputBoxSize.getWidth();	

		if(ExNo_of_employeeInputBoxheight==ActualNo_of_employeeInputBoxHeight) {
			System.out.println("Expected and Actual No_of_employee input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual No_of_employee input Box height is not  matched    --Validation Failed ");
		}

		if(ExNo_of_employeeInputBoxwidth==ActualNo_of_employeeInputBoxwidth) {
			System.out.println("Expected and Actual No_of_employee input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual No_of_employee input Box of size Width is not matched    --Validation Failed ");
		}


		// we_No_of_employee.clear();
		String Expected_No_of_employee="100";
		we_No_of_employee.sendKeys("19");

		String ActualNo_of_employee=we_No_of_employee.getAttribute("value");
		if(Expected_No_of_employee.equals(ActualNo_of_employee)) {
			System.out.println("Expected and Actual No_of_employee Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual No_of_employee Value Not Matched   - Validation  Failed  ");
		}
		we_No_of_employee.clear();
		we_No_of_employee.sendKeys("100");
		String ActualNo_of_employee2=we_No_of_employee.getAttribute("value");
		if(Expected_No_of_employee.equals(ActualNo_of_employee2)) {
			System.out.println(" No_of_employee Value matched  - Validation Passed ");
		}else {
			System.out.println(" No_of_employee value not matched  - Validation Failed ");
		}




		////////////////////////////////////////Secondry Email/////////////////////////////////////////////////////////////////

		WebElement weSecondryEmail=driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		if(weSecondryEmail.isDisplayed()) {
			System.out.println("Title TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Display --  Validation Failed ");
		}
		if(weSecondryEmail.isEnabled()) {
			System.out.println("Title TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Enable --  Validation Failed ");
		}
		String BlankSecondryEmailBox=weSecondryEmail.getAttribute("value");
		if(BlankSecondryEmailBox.equals("")) {
			System.out.println("Title TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Blank --  Validation Failed ");
		}

		int ExSecondryEmailInputBoxheight=16;//16
		int ExSecondryEmailInputBoxwidth=189;//187
		Dimension SecondryEmailInputBoxSize= weSecondryEmail.getSize();
		int ActualSecondryEmailInputBoxHeight=SecondryEmailInputBoxSize.getHeight();	
		int ActualSecondryEmailInputBoxwidth=SecondryEmailInputBoxSize.getWidth();	

		if(ExSecondryEmailInputBoxheight==ActualSecondryEmailInputBoxHeight) {
			System.out.println("Expected and Actual Title input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Title input Box height is not  matched    --Validation Failed ");
		}

		if(ExSecondryEmailInputBoxwidth==ActualSecondryEmailInputBoxwidth) {
			System.out.println("Expected and Actual SecondryEmail input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual SecondryEmail input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedSecondryEmail="Ramvimal8419@gmail.com";
		weSecondryEmail.sendKeys("Ram8419@gmail.com");

		String ActualSecondryEmail=weSecondryEmail.getAttribute("value");
		if(ExpectedSecondryEmail.equals(ActualSecondryEmail)) {
			System.out.println("Expected and Actual SecondryEmail Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual SecondryEmail Value Not Matched   - Validation  Failed  ");
		}
		weSecondryEmail.clear();
		weSecondryEmail.sendKeys("Ramvimal8419@gmail.com");
		String ActualSecondryEmail2=weSecondryEmail.getAttribute("value");
		if(ExpectedSecondryEmail.equals(ActualSecondryEmail2)) {
			System.out.println(" SecondryEmail nameCase lettle matched  - Validation Passed ");
		}else {
			System.out.println(" SecondryEmail nameCase lettle not matched  - Validation Failed ");
		}
		///////////////////////////////////////////////// -Phone-  //////////////////////////////////////////////////////////////////
		WebElement wePhone=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		if(wePhone.isDisplayed()) {
			System.out.println("Phone TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Phone TextBox is Not Display --  Validation Failed ");
		}
		if(wePhone.isEnabled()) {
			System.out.println("Phone TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Phone TextBox is Not Enable --  Validation Failed ");
		}
		String BlankPhoneBox=wePhone.getAttribute("value");
		if(BlankPhoneBox.equals("")) {
			System.out.println("Title TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Blank --  Validation Failed ");
		}

		int ExPhoneInputBoxheight=16;//16
		int ExPhoneInputBoxwidth=189;//187
		Dimension PhoneInputBoxSize= weTitleTextBox.getSize();
		int ActualPhoneInputBoxHeight=PhoneInputBoxSize.getHeight();	
		int ActualPhoneInputBoxwidth=PhoneInputBoxSize.getWidth();	

		if(ExPhoneInputBoxheight==ActualPhoneInputBoxHeight) {
			System.out.println("Expected and Actual Phone input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Phone input Box height is not  matched    --Validation Failed ");
		}

		if(ExPhoneInputBoxwidth==ActualPhoneInputBoxwidth) {
			System.out.println("Expected and Actual Phone input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Phone input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedPhone="021-789962-09";
		wePhone.sendKeys("021-223-789923-09");

		String ActualPhone=wePhone.getAttribute("value");
		if(ExpectedPhone.equals(ActualPhone)) {
			System.out.println("Expected and Actual Phone Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Phone Value Not Matched   - Validation  Failed  ");
		}
		wePhone.clear();
		wePhone.sendKeys("021-789962-09");
		String ActualPhone2=wePhone.getAttribute("value");
		if(ExpectedPhone.equals(ActualPhone2)) {
			System.out.println(" Phone nameCase lettle matched  - Validation Passed ");
		}else {
			System.out.println(" Phone nameCase lettle not matched  - Validation Failed ");
		}

		/////////////////////////////////////////////////////Mobile///////////////////////////////////////////////////////////////

		WebElement weMobile=driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		if(weMobile.isDisplayed()) {
			System.out.println("Mobile TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Mobile TextBox is Not Display --  Validation Failed ");
		}
		if(weMobile.isEnabled()) {
			System.out.println("Mobile TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Mobile TextBox is Not Enable --  Validation Failed ");
		}
		String BlankMobileBox=weMobile.getAttribute("value");
		if(BlankMobileBox.equals("")) {
			System.out.println("Mobile TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Mobile TextBox is Not Blank --  Validation Failed ");
		}

		int ExMobileInputBoxheight=16;//16
		int ExMobileInputBoxwidth=189;//187
		Dimension MobileInputBoxSize= weMobile.getSize();
		int ActualMobileInputBoxHeight=MobileInputBoxSize.getHeight();	
		int ActualMobileInputBoxwidth=MobileInputBoxSize.getWidth();	

		if(ExMobileInputBoxheight==ActualMobileInputBoxHeight) {
			System.out.println("Expected and Actual Mobile input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Mobile input Box height is not  matched    --Validation Failed ");
		}

		if(ExMobileInputBoxwidth==ActualMobileInputBoxwidth) {
			System.out.println("Expected and Actual Mobile input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Mobile input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedMobile="7800628135";
		weMobile.sendKeys("7237014308");

		String ActualMobile=weMobile.getAttribute("value");
		if(ExpectedMobile.equals(ActualMobile)) {
			System.out.println("Expected and Actual Mobile Number Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Mobile Number Not Matched   - Validation  Failed  ");
		}
		weMobile.clear();
		weMobile.sendKeys("7800628135");
		String ActualMobile2=weMobile.getAttribute("value");
		if(ExpectedMobile.equals(ActualMobile2)) {
			System.out.println("Mobile Number matched  - Validation Passed ");
		}else {
			System.out.println("Mobile Number not matched  - Validation Failed ");
		}

		////////////////////////////////////////////////////////Fax///////////////////////////////////////////////////////////
		//
		WebElement weFax=driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		if(weFax.isDisplayed()) {
			System.out.println("Title TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Display --  Validation Failed ");
		}
		if(weFax.isEnabled()) {
			System.out.println("Title TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Enable --  Validation Failed ");
		}
		String BlankFaxBox=weFax.getAttribute("value");
		if(BlankFaxBox.equals("")) {
			System.out.println("Title TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Blank --  Validation Failed ");
		}

		int ExFaxInputBoxheight=16;//16
		int ExFaxInputBoxwidth=189;//187
		Dimension FaxInputBoxSize= weFax.getSize();
		int ActualFaxInputBoxHeight=FaxInputBoxSize.getHeight();	
		int ActualFaxInputBoxwidth=FaxInputBoxSize.getWidth();	

		if(ExFaxInputBoxheight==ActualFaxInputBoxHeight) {
			System.out.println("Expected and Actual Fax input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Fax input Box height is not  matched    --Validation Failed ");
		}

		if(ExFaxInputBoxwidth==ActualFaxInputBoxwidth) {
			System.out.println("Expected and Actual Fax input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Fax input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedFax="Vimal123@fax.com";
		weFax.sendKeys("Vimal12223@fax.com");

		String ActualFax=weFax.getAttribute("value");
		if(ExpectedFax.equals(ActualFax)) {
			System.out.println("Expected and Actual Fax Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Fax Value Not Matched   - Validation  Failed  ");
		}
		weFax.clear();
		weFax.sendKeys("Vimal123@fax.com");
		String ActualFax2=weFax.getAttribute("value");
		if(ExpectedFax.equals(ActualFax2)) {
			System.out.println(" 2nd time Expected and Actual Fax Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual Fax Value not Matched   - Validation  Failed   ");
		}



		//
		/////////////////////////////////////////////////////Email///////////////////////////////////////////////////////////////

		WebElement weEmail=driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		if(weEmail.isDisplayed()) {
			System.out.println("Email TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Email TextBox is Not Display --  Validation Failed ");
		}
		if(weEmail.isEnabled()) {
			System.out.println("Email TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Email TextBox is Not Enable --  Validation Failed ");
		}
		String BlankEmailBox=weEmail.getAttribute("value");
		if(BlankEmailBox.equals("")) {
			System.out.println("Email TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Email TextBox is Not Blank --  Validation Failed ");
		}

		int ExEmailInputBoxheight=16;//16
		int ExEmailInputBoxwidth=189;//187
		Dimension EmailInputBoxSize= weEmail.getSize();
		int ActualEmailInputBoxHeight=EmailInputBoxSize.getHeight();	
		int ActualEmailInputBoxwidth=EmailInputBoxSize.getWidth();	

		if(ExEmailInputBoxheight==ActualEmailInputBoxHeight) {
			System.out.println("Expected and Actual Title input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Title input Box height is not  matched    --Validation Failed ");
		}

		if(ExEmailInputBoxwidth==ActualEmailInputBoxwidth) {
			System.out.println("Expected and Actual Title input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Title input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedEmail="ramvimal7800@gmail.com";
		weEmail.sendKeys("admin123@gamil.com");

		String ActualEmail=weEmail.getAttribute("value");
		if(ExpectedEmail.equals(ActualEmail)) {
			System.out.println("Expected and Actual Email Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Email Value Not Matched   - Validation  Failed  ");
		}
		weTitleTextBox.clear();
		weTitleTextBox.sendKeys("ramvimal7800@gmail.com");
		String ActualEmail2=weEmail.getAttribute("value");
		if(ExpectedEmail.equals(ActualEmail2)) {
			System.out.println("2nd time Expected and Actual Email Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual Email Value Matched   - Validation  Pass  ");
		}
		//
		///////////////////////////////////////////////////////////////////-Website-/////////////////////////////////////////////////////

		WebElement weWebsite=driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		if(weWebsite.isDisplayed()) {
			System.out.println("Website TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Website TextBox is Not Display --  Validation Failed ");
		}
		if(weWebsite.isEnabled()) {
			System.out.println("Website TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Website TextBox is Not Enable --  Validation Failed ");
		}
		String BlankWebsiteBox=weWebsite.getAttribute("value");
		if(BlankWebsiteBox.equals("")) {
			System.out.println("Website TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Website TextBox is Not Blank --  Validation Failed ");
		}

		int ExWebsiteInputBoxheight=16;//16
		int ExWebsiteInputBoxwidth=189;//187
		Dimension WebsiteInputBoxSize= weWebsite.getSize();
		int ActualWebsiteInputBoxHeight=WebsiteInputBoxSize.getHeight();	
		int ActualWebsiteInputBoxwidth=WebsiteInputBoxSize.getWidth();	

		if(ExWebsiteInputBoxheight==ActualWebsiteInputBoxHeight) {
			System.out.println("Expected and Actual Website input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Website input Box height is not  matched    --Validation Failed ");
		}

		if(ExWebsiteInputBoxwidth==ActualWebsiteInputBoxwidth) {
			System.out.println("Expected and Actual Website input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Website input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedWebsite="www.vimalbind.com";
		weWebsite.sendKeys("www.Vimalbind.com");

		String ActualWebsite=weWebsite.getAttribute("value");
		if(ExpectedWebsite.equals(ActualWebsite)) {
			System.out.println("Expected and Actual Website Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Website Value Not Matched   - Validation  Failed  ");
		}
		weWebsite.clear();
		weWebsite.sendKeys("www.vimalbind.com");
		String ActualWebsite2=weWebsite.getAttribute("value");
		if(ExpectedWebsite.equals(ActualWebsite2)) {
			System.out.println(" Website Alfabet matched  - Validation Passed ");
		}else {
			System.out.println(" Website Alfabet not matched  - Validation Failed ");
		}
		////////////////////////////////////////////////Land_Status//////////////////////////////////////////////////////	

		WebElement weLand_Status=driver.findElement(By.xpath("//select[@name='leadstatus']"));
		if(weLand_Status.isDisplayed()) {
			System.out.println("Land_Status TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Land_Status TextBox is Not Display --  Validation Failed ");
		}
		if(weLand_Status.isEnabled()) {
			System.out.println("Land_Status TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Land_Status TextBox is Not Enable --  Validation Failed ");
		}
		String BlankLand_StatusInputBox=weLand_Status.getAttribute("value");
		if(BlankLand_StatusInputBox.equals("")) {
			System.out.println("Land_Status TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Land_Status TextBox is Not Blank --  Validation Failed ");
		}

		int ExLand_StatusInputBoxheight=16;//16
		int ExLand_StatusInputBoxwidth=189;//187
		Dimension Land_StatusInputBoxSize= weFax.getSize();
		int ActualLand_StatusInputBoxHeight=Land_StatusInputBoxSize.getHeight();	
		int ActualLand_StatusInputBoxwidth=Land_StatusInputBoxSize.getWidth();	

		if(ExLand_StatusInputBoxheight==ActualLand_StatusInputBoxHeight) {
			System.out.println("Expected and Actual Land_Status input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Land_Status input Box height is not  matched    --Validation Failed ");
		}

		if(ExLand_StatusInputBoxwidth==ActualLand_StatusInputBoxwidth) {
			System.out.println("Expected and Actual Land_Status input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Land_Status input Box of size Width is not matched    --Validation Failed ");
		}

		Select LandSelect=new Select(weLand_Status);
		LandSelect.selectByVisibleText("--None--");

		String ExpectedLandStatusVal="--None--";
		String ActualLandStatusVal=weLand_Status.getAttribute("value");
		if(ExpectedLandStatusVal.equals(ActualLandStatusVal)) {
			System.out.println("Actual and Expected Land_Status Value matched    --Validation  Passed");
		}else{
			System.out.println("Actual and Expected Land_Status Value Not matched    --Validation  Failed");
		}


		LandSelect.selectByIndex(0);
		String ExpectedLandStatusInduxing="--None--";
		String ActualLandStatusInduxing=weLand_Status.getAttribute("value");
		if(ExpectedLandStatusInduxing.equals(ActualLandStatusInduxing)) {
			System.out.println("Actual and Expected Land_Status Induxing Value matched    --Validation  Passed");
		}else{
			System.out.println("Actual and Expected Land_Status Induxing Value Not matched    --Validation  Failed");
		}

		LandSelect.selectByVisibleText("Qualified");
		String ExpLandStatusQualified="Qualified";
		String ActualLand_StatusQualified=weLand_Status.getAttribute("value");
		if(ActualLand_StatusQualified.equals(ExpLandStatusQualified)) {
			System.out.println("Actual and Expected Land_Status Text Value matched    --Validation  Passed");
		}else {
			System.out.println("Actual and Expected Land_Status Text Value not matched    --Validation  Failed");
		}

		/////////////////////////////////////-Rating-//////////////////////////////////////////////////////////////////

		WebElement weRating=driver.findElement(By.xpath("//select[@name='rating']"));
		if(weRating.isDisplayed()) {
			System.out.println("Rating TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Rating TextBox is Not Display --  Validation Failed ");
		}
		if(weRating.isEnabled()) {
			System.out.println("Rating TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Rating TextBox is Not Enable --  Validation Failed ");
		}
		String BlankRatingBox=weRating.getAttribute("value");
		if(BlankRatingBox.equals("")) {
			System.out.println("Rating TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Rating TextBox is Not Blank --  Validation Failed ");
		}

		int ExRatingInputBoxheight=16;//16
		int ExRatingInputBoxwidth=189;//187
		Dimension RatingInputBoxSize= weRating.getSize();
		int ActualRatingInputBoxHeight=RatingInputBoxSize.getHeight();	
		int ActualRatingInputBoxwidth=RatingInputBoxSize.getWidth();	

		if(ExRatingInputBoxheight==ActualRatingInputBoxHeight) {
			System.out.println("Expected and Actual Rating input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Rating input Box height is not  matched    --Validation Failed ");
		}

		if(ExRatingInputBoxwidth==ActualRatingInputBoxwidth) {
			System.out.println("Expected and Actual Rating input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Rating input Box of size Width is not matched    --Validation Failed ");
		}

		Select RatingSelect=new Select(weRating);
		RatingSelect.selectByVisibleText("--None--");

		String ExpectedRatingVal="--None--";
		String ActualRatingVal=weLand_Status.getAttribute("value");
		if(ExpectedRatingVal.equals(ActualRatingVal)) {
			System.out.println("Actual and Expected Rating Text Value matched    --Validation  Passed");
		}else{
			System.out.println("Actual and Expected Rating Text Value Not matched    --Validation  Failed");
		}


		RatingSelect.selectByIndex(0);
		String ExpectedRatingInduxing="--None--";
		String ActualRatingInduxing=weRating.getAttribute("value");
		if(ExpectedRatingInduxing.equals(ActualRatingInduxing)) {
			System.out.println("Actual and Expected Rating Induxing Value matched    --Validation  Passed");
		}else{
			System.out.println("Actual and Expected Rating Induxing Value Not matched    --Validation  Failed");
		}

		RatingSelect.selectByVisibleText("Active");
		String ExpRatingActive="Active";
		String ActualRatingActive=weLand_Status.getAttribute("value");
		if(ActualRatingActive.equals(ExpRatingActive)) {
			System.out.println("Actual and Expected Rating Text Value matched    --Validation  Passed");
		}else {
			System.out.println("Actual and Expected Rating Text Value not matched    --Validation  Failed");
		}
		//////////////////////////////////////*Assigned To*/////////////////////////////////////////////////////////////////////

		WebElement we_Assigned_To=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		if(we_Assigned_To.isDisplayed()) {
			System.out.println("Assigned Radio Button is Display   --   Validation Passed ");
		}else{
			System.out.println("Assigned Radio Button is Display   --   Validation Passed ");
		}
		if(we_Assigned_To.isEnabled()) {
			System.out.println("Assigned Radio Button is Display   --   Validation Passed ");
		}else{
			System.out.println("Assigned Radio Button is Display   --   Validation Passed ");
		}

		System.out.println("==================================**Important Result DownSide**===========================================");
		if(we_Assigned_To.isSelected()) {
			System.out.println("If Radio Button of Assigned Checked  then    --Validation is Passed ");
		}else {
			System.out.println("If Radio button of Assigned  Not Checked then --Validation is Failed ");
		}
		System.out.println("==================================**Important Result UpSide**===========================================");

		WebElement we_Assigned_To2=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		if(we_Assigned_To2.isDisplayed()) {
			System.out.println("Assigned Radio Button 2 is Display   --   Validation Passed ");
		}else{
			System.out.println("Assigned Radio Button 2 is Display   --   Validation Passed ");
		}
		if(we_Assigned_To2.isEnabled()) {
			System.out.println("Assigned Radio Button 2 is Enabled   --   Validation Passed ");
		}else{
			System.out.println("Assigned Radio Button 2 is Enabled   --   Validation Passed ");
		}


		System.out.println("==================================**Important Result DownSide**===========================================");
		if(we_Assigned_To2.isSelected()) {
			System.out.println("If Radio Button 2 of Assigned Checked  then    --Validation is Passed ");
		}else {
			System.out.println("If Radio button 2 of Assigned  Not Checked then --Validation is Failed ");
		}
		System.out.println("==================================**Important Result UpSide**===========================================");

		we_Assigned_To2.click();

		System.out.println("==================================**Important Result DownSide**===========================================");
		if(we_Assigned_To2.isSelected()) {
			System.out.println("If Radio Button 2 of Assigned Checked  then    --Validation is Passed ");
		}else {
			System.out.println("If Radio button 2 of Assigned  Not Checked then --Validation is Failed ");
		}
		System.out.println("==================================**Important Result UpSide**===========================================");

		WebElement AssignDropDown=driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
		Select AssignList=new Select(AssignDropDown);
		AssignList.selectByIndex(1);




		//////////////////////////////////////////////Street////////////////////////////////////////////////////////////		

		WebElement weStreet=driver.findElement(By.xpath("//textarea[@name='lane']"));
		if(weStreet.isDisplayed()) {
			System.out.println("Street TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Street TextBox is Not Display --  Validation Failed ");
		}
		if(weStreet.isEnabled()) {
			System.out.println("Street TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Street TextBox is Not Enable --  Validation Failed ");
		}
		String BlankStreetBox=weStreet.getAttribute("value");
		if(BlankStreetBox.equals("")) {
			System.out.println("Street TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Street TextBox is Not Blank --  Validation Failed ");
		}

		int ExStreetInputBoxheight=16;//16
		int ExStreetInputBoxwidth=189;//187
		Dimension StreetInputBoxSize= weStreet.getSize();
		int ActualStreetInputBoxHeight=StreetInputBoxSize.getHeight();	
		int ActualStreetInputBoxwidth=StreetInputBoxSize.getWidth();	

		if(ExStreetInputBoxheight==ActualStreetInputBoxHeight) {
			System.out.println("Expected and Actual Street input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Street input Box height is not  matched    --Validation Failed ");
		}

		if(ExStreetInputBoxwidth==ActualStreetInputBoxwidth) {
			System.out.println("Expected and Actual Street input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Street input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedStreet="Adampur Nigoh jaunpur";
		weStreet.sendKeys("adampur nigoh jaunpur u.p");

		String ActualStreet=weStreet.getAttribute("value");
		if(ExpectedStreet.equals(ActualStreet)) {
			System.out.println("Expected and Actual Street Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Street Value Not Matched   - Validation  Failed  ");
		}
		weStreet.clear();
		weStreet.sendKeys("Adampur Nigoh jaunpur");
		String ActualStreet2=weStreet.getAttribute("value");
		if(ExpectedStreet.equals(ActualStreet2)) {
			System.out.println(" 2nd time Expected and Actual Street Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual Street Value not Matched   - Validation  Failed   ");
		}
		//////////////////////////////////////////////*PO Box*////////////////////////////////////////////////////////////		

		WebElement wePO_Box=driver.findElement(By.xpath("(//input[@type='text'])[15]"));
		if(wePO_Box.isDisplayed()) {
			System.out.println("PO_Box TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("PO_Box TextBox is Not Display --  Validation Failed ");
		}
		if(wePO_Box.isEnabled()) {
			System.out.println("PO_Box TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("PO_Box TextBox is Not Enable --  Validation Failed ");
		}
		String BlankPOBox=wePO_Box.getAttribute("value");
		if(BlankPOBox.equals("")) {
			System.out.println("PO_Box TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("PO_Box TextBox is Not Blank --  Validation Failed ");
		}

		int ExPO_BoxInputBoxheight=16;//16
		int ExPO_BoxInputBoxwidth=189;//187
		Dimension PO_BoxInputBoxSize= wePO_Box.getSize();
		int ActualPO_BoxInputBoxHeight=PO_BoxInputBoxSize.getHeight();	
		int ActualPO_BoxInputBoxwidth=PO_BoxInputBoxSize.getWidth();	

		if(ExPO_BoxInputBoxheight==ActualPO_BoxInputBoxHeight) {
			System.out.println("Expected and Actual PO_Box input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual PO_Box input Box height is not  matched    --Validation Failed ");
		}

		if(ExPO_BoxInputBoxwidth==ActualPO_BoxInputBoxwidth) {
			System.out.println("Expected and Actual PO_Box input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual PO_Box input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedPOBox="Barsathi Nigoh";
		wePO_Box.sendKeys("barsathi nigoh jaunur");

		String ActualPOBox=wePO_Box.getAttribute("value");
		if(ExpectedPOBox.equals(ActualPOBox)) {
			System.out.println("Expected and Actual PO_Box Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual PO_Box Value Not Matched   - Validation  Failed  ");
		}
		wePO_Box.clear();
		wePO_Box.sendKeys("Barsathi Nigoh");
		String ActualPOBox2=wePO_Box.getAttribute("value");
		if(ExpectedPOBox.equals(ActualPOBox2)) {
			System.out.println(" 2nd time Expected and Actual PO_Box Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual PO_Box Value not Matched   - Validation  Failed   ");
		}


		///////////////////////////////////////////////*Postal Code*///////////////////////////////////////////////		
		WebElement wePostal_Code=driver.findElement(By.xpath("(//input[@type='text'])[16]"));
		if(wePostal_Code.isDisplayed()) {
			System.out.println("Title TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Display --  Validation Failed ");
		}
		if(wePostal_Code.isEnabled()) {
			System.out.println("Title TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Enable --  Validation Failed ");
		}
		String BlankPostal_CodeBox=wePostal_Code.getAttribute("value");
		if(BlankPostal_CodeBox.equals("")) {
			System.out.println("Title TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Title TextBox is Not Blank --  Validation Failed ");
		}

		int ExPostal_CodeInputBoxheight=16;//16
		int ExPostal_CodeInputBoxwidth=285;//285
		 wePostal_Code.getSize();
		int ActualPostal_CodeInputBoxHeight=FaxInputBoxSize.getHeight();	
		int ActualPostal_CodeInputBoxwidth=FaxInputBoxSize.getWidth();	

		if(ExPostal_CodeInputBoxheight==ActualPostal_CodeInputBoxHeight) {
			System.out.println("Expected and Actual Fax input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Fax input Box height is not  matched    --Validation Failed ");
		}

		if(ExPostal_CodeInputBoxwidth==ActualPostal_CodeInputBoxwidth) {
			System.out.println("Expected and Actual Fax input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Fax input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedPostal_Code="222162";
		wePostal_Code.sendKeys("222163");

		String ActualPostal_Code=wePostal_Code.getAttribute("value");
		if(ExpectedPostal_Code.equals(ActualPostal_Code)) {
			System.out.println("Expected and Actual Fax Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Fax Value Not Matched   - Validation  Failed  ");
		}
		wePostal_Code.clear();
		wePostal_Code.sendKeys("222162");
		String ActualPostal_Code2=wePostal_Code.getAttribute("value");
		if(ExpectedPostal_Code.equals(ActualPostal_Code2)) {
			System.out.println(" 2nd time Expected and Actual Fax Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual Fax Value not Matched   - Validation  Failed   ");
		}	
		///////////////////////////////////////////////*City*//////////////////////////////////////////////////////		
		WebElement we_City=driver.findElement(By.xpath("(//input[@type='text'])[17]"));
		if(we_City.isDisplayed()) {
			System.out.println("City TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("City TextBox is Not Display --  Validation Failed ");
		}
		if(we_City.isEnabled()) {
			System.out.println("City TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("City TextBox is Not Enable --  Validation Failed ");
		}
		String BlankCityBox=we_City.getAttribute("value");
		if(BlankCityBox.equals("")) {
			System.out.println("City TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("City TextBox is Not Blank --  Validation Failed ");
		}

		int ExCityInputBoxheight=16;//16
		int ExCityInputBoxwidth=189;//187
		Dimension CityInputBoxSize= we_City.getSize();
		int ActualCityInputBoxHeight=CityInputBoxSize.getHeight();	
		int ActualCityInputBoxwidth=CityInputBoxSize.getWidth();	

		if(ExCityInputBoxheight==ActualCityInputBoxHeight) {
			System.out.println("Expected and Actual City input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual City input Box height is not  matched    --Validation Failed ");
		}

		if(ExCityInputBoxwidth==ActualCityInputBoxwidth) {
			System.out.println("Expected and Actual City input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual City input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedCity="Jaunpur";
		we_City.sendKeys("jaunpur");

		String ActualCity=weFax.getAttribute("value");
		if(ExpectedCity.equals(ActualCity)) {
			System.out.println("Expected and Actual City Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual City Value Not Matched   - Validation  Failed  ");
		}
		we_City.clear();
		we_City.sendKeys("Jaunpur");
		String ActualCity2=we_City.getAttribute("value");
		if(ExpectedCity.equals(ActualCity2)) {
			System.out.println(" 2nd time Expected and Actual City Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual City Value not Matched   - Validation  Failed   ");
		}
		///////////////////////////////////////////////*State*/////////////////////////////////////////////////////		
		WebElement we_State=driver.findElement(By.xpath("(//input[@type='text'])[19]"));
		if(we_State.isDisplayed()) {
			System.out.println("State TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("State TextBox is Not Display --  Validation Failed ");
		}
		if(we_State.isEnabled()) {
			System.out.println("State TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("State TextBox is Not Enable --  Validation Failed ");
		}
		String BlankStateBox=we_State.getAttribute("value");
		if(BlankStateBox.equals("")) {
			System.out.println("State TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("State TextBox is Not Blank --  Validation Failed ");
		}

		int ExStateInputBoxheight=16;//16
		int ExStateInputBoxwidth=189;//187
		Dimension StateInputBoxSize= we_State.getSize();
		int ActualStateInputBoxHeight=StateInputBoxSize.getHeight();	
		int ActualStateInputBoxwidth=StateInputBoxSize.getWidth();	

		System.out.println(ActualStateInputBoxHeight);
		System.out.println(ActualStateInputBoxwidth);

		if(ExStateInputBoxheight==ActualStateInputBoxHeight) {
			System.out.println("Expected and Actual State input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual State input Box height is not  matched    --Validation Failed ");
		}

		if(ExStateInputBoxwidth==ActualStateInputBoxwidth) {
			System.out.println("Expected and Actual State input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual State input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedState="Uttar Pradesh";
		we_State.sendKeys("uttar pradesh");

		String ActualState=we_State.getAttribute("value");
		if(ExpectedState.equals(ActualState)) {
			System.out.println("Expected and Actual State Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual State Value Not Matched   - Validation  Failed  ");
		}

		we_State.clear();
		we_State.sendKeys("Uttar Pradesh");
		String ActualState2=we_State.getAttribute("value");
		if(ExpectedState.equals(ActualState2)) {
			System.out.println(" 2nd time Expected and Actual State Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual State Value not Matched   - Validation  Failed   ");
		}
		////////////////////////////////////////////////*Country*///////////////////////////////////////////////////		
		WebElement we_Country=driver.findElement(By.xpath("(//input[@type='text'])[18]"));
		if(we_Country.isDisplayed()) {
			System.out.println("Country TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Country TextBox is Not Display --  Validation Failed ");
		}
		if(we_Country.isEnabled()) {
			System.out.println("Country TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Country TextBox is Not Enable --  Validation Failed ");
		}
		String BlankCountryBox=we_Country.getAttribute("value");
		if(BlankCountryBox.equals("")) {
			System.out.println("Country TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Country TextBox is Not Blank --  Validation Failed ");
		}

		int ExCountryInputBoxheight=16;//16
		int ExCountryInputBoxwidth=189;//187
		Dimension CountryInputBoxSize= we_Country.getSize();
		int ActualCountryInputBoxHeight=CountryInputBoxSize.getHeight();	
		int ActualCountryInputBoxwidth=CountryInputBoxSize.getWidth();

		System.out.println(ActualCountryInputBoxHeight);
		System.out.println(ActualCountryInputBoxwidth);

		if(ExCountryInputBoxheight==ActualCountryInputBoxHeight) {
			System.out.println("Expected and Actual Country input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Country input Box height is not  matched    --Validation Failed ");
		}

		if(ExCountryInputBoxwidth==ActualCountryInputBoxwidth) {
			System.out.println("Expected and Actual Country input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Country input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedCountry="INDIA";
		we_Country.sendKeys("India");

		String ActualCountry=we_Country.getAttribute("value");
		if(ExpectedCountry.equals(ActualCountry)) {
			System.out.println("Expected and Actual Country Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Country Value Not Matched   - Validation  Failed  ");
		}
		we_Country.clear();
		we_Country.sendKeys("INDIA");
		String ActualCountry2=we_Country.getAttribute("value");
		if(ExpectedCountry.equals(ActualCountry2)) {
			System.out.println(" 2nd time Expected and Actual Country Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual Country Value not Matched   - Validation  Failed   ");
		}
		////////////////////////////////////////////////*Discription*//////////////////////////////////////////////
		WebElement we_Discription=driver.findElement(By.xpath("(//textarea[@class='detailedViewTextBox'])[2]"));
		if(we_Discription.isDisplayed()) {
			System.out.println("Discription TextBox is Display   --   Validation Passed ");
		}else{
			System.out.println("Discription TextBox is Not Display --  Validation Failed ");
		}
		if(we_Discription.isEnabled()) {
			System.out.println("Discription TextBox is Enable   --   Validation Passed ");
		}else{
			System.out.println("Discription TextBox is Not Enable --  Validation Failed ");
		}
		String BlankDiscriptionBox=we_Discription.getAttribute("value");
		if(BlankDiscriptionBox.equals("")) {
			System.out.println("Discription TextBox is Blank   --   Validation Passed ");
		}else{
			System.out.println("Discription TextBox is Not Blank --  Validation Failed ");
		}

		int ExDiscriptionInputBoxheight=75;//75
		int ExDiscriptionInputBoxwidth=798;//798
		Dimension DiscriptionInputBoxSize= we_Discription.getSize();
		int ActualDiscriptionInputBoxHeight=DiscriptionInputBoxSize.getHeight();	
		int ActualDiscriptionInputBoxwidth=DiscriptionInputBoxSize.getWidth();	

		System.out.println(ActualDiscriptionInputBoxHeight);
		System.out.println(ActualDiscriptionInputBoxwidth);

		if(ExDiscriptionInputBoxheight==ActualDiscriptionInputBoxHeight) {
			System.out.println("Expected and Actual Discription input Box height is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Discription input Box height is not  matched    --Validation Failed ");
		}

		if(ExDiscriptionInputBoxwidth==ActualDiscriptionInputBoxwidth) {
			System.out.println("Expected and Actual Discription input Box Width is matched    --Validation Passed ");
		}else {
			System.out.println("Expected and Actual Discription input Box of size Width is not matched    --Validation Failed ");
		}



		String ExpectedDiscription="Today i practice other topic by given sir and i want fill\"\r\n"
				+ "				+ \" deatil right to right and i need clicnt detail becouse i can good practice \"\r\n"
				+ "				+ \"and i want made good learner after that i good work in company and good parformace\"\r\n"
				+ "				+ \"and i should be appeare good worker ";
		we_Discription.sendKeys("Vimal12223@fax.com");

		String ActualDiscription=we_Discription.getAttribute("value");
		if(ExpectedDiscription.equals(ActualDiscription)) {
			System.out.println("Expected and Actual Discription Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("Expected and Actual Discription Value Not Matched   - Validation  Failed  ");
		}
		we_Discription.clear();
		we_Discription.sendKeys("Today i practice other topic by given sir and i want fill\\\"\\r\\n\"\r\n"
				+ "             + \" deatil right to right and i need clicnt detail becouse i can good practice \\\"\\r\\n\"\r\n"
				+ "				+ \"and i want made good learner after that i good work in company and good parformace\\\"\\r\\n\"\r\n"
				+ "				+ \"and i should be appeare good worker ");

		String ActualDiscription2=we_Discription.getAttribute("value");
		if(ExpectedDiscription.equals(ActualDiscription2)) {
			System.out.println(" 2nd time Expected and Actual Discription Value Matched   - Validation  Pass  ");
		}else {
			System.out.println("2nd time Expected and Actual Discription Value not Matched   - Validation  Failed   ");
		}
		////////////////////////////////////////////////*Save*/////////////////////////////////////////////////////		
		WebElement weSaveButton=driver.findElement(By.xpath("(//input[@accesskey='S'])[2]"));
		if(weSaveButton.isDisplayed()) {
			System.out.println("Save Button is Display   --   Validation Passed ");
		}else{
			System.out.println("Save Button is Not Display --  Validation Failed ");
		}
		if(weSaveButton.isEnabled()) {
			System.out.println("Save Button is Enable   --   Validation Passed ");
		}else{
			System.out.println("Save Button is Not Enable --  Validation Failed ");
		}
		int ExpectedSaveButtonHeight=16;//16
		//int ExpectedSaveButtonHWidth=285;//285
		Dimension SaveButoonSize= weSaveButton.getSize();
		int ActualSaveButtonHeight=SaveButoonSize.getHeight();
		//int ActualSaveButtonwidth=SaveButoonSize.getWidth();

		if(ExpectedSaveButtonHeight==ActualSaveButtonHeight) {
			System.out.println("Height of Save button value matched  -- Validation Passed ");
		}else {
			System.out.println("Width of Save button value not matched  -- Validation Failed ");
		}
		int ExpectedSave_X_Cordinate=12;//862
		int ExpectedSave_Y_Cordinate=134;// 361
		Point SaveButtonLocation=weSaveButton.getLocation();
		int Actual_X_Cordinate=SaveButtonLocation.getX();
		int Actual_Y_Cordinate=SaveButtonLocation.getY();
		if(ExpectedSave_X_Cordinate==Actual_X_Cordinate) {
			System.out.println("Save Button X cordinate matched  -- Validation Passed");
		}else {
			System.out.println("Save Button X cordinate Not matched  -- Validation Failed");
		}


		if(ExpectedSave_Y_Cordinate==Actual_Y_Cordinate) {
			System.out.println("Save Button Y cordinate matched  -- Validation Passed");
		}else {
			System.out.println("Save Button Y cordinate Not matched  -- Validation Failed");
		}
	
		//weSaveButton.click();
		// driver.close();
		// driver.quit();
	}		
}								