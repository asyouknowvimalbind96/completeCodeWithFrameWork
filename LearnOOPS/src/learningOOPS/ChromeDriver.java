package learningOOPS;

public class ChromeDriver implements WebDriver {
		public void GetUrl() {
			System.out.println("I Am URL of ChromeDriver ");
		}
		public void GetPageSource() {
			System.out.println("I Am GetPageSource of ChromeDriver ");
		}
		public void getText() {
			System.out.println("I am GetText of ChromeDriver");
		}
		
		public void close() {
			System.out.println("I Am Close of ChromeDriver");
		}
		@Override
		public void getCurrentUrl() {
			System.out.println("I Am getCurrentUrl of ChromeDriver");	
		}
		@Override
		public void quit() {
			System.out.println("I Am quit of ChromeDriver");
		}
		@Override
		public void GetTitle() {
			System.out.println("I Am GetTitle of ChromeDriver");
		}
		

	

}
