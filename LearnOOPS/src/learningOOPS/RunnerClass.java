package learningOOPS;
public class RunnerClass {
	public static void main(String[] args) {
		a2();






	}
	public static void a1() {
		WebDriver chromedriver=new InternetExplorer();
		chromedriver.GetUrl();
		chromedriver.GetPageSource();
		chromedriver.getText();
		chromedriver.getCurrentUrl();
		chromedriver.close();
		chromedriver.quit();
		chromedriver.GetTitle();	
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void a2() {
		for(int i=0;i<10;i++) {
			for(int j=1;j<9;j++) {
				System.out.println(j);
			
			}
			System.out.println(i+","+(i+1));

		}



	}






}
