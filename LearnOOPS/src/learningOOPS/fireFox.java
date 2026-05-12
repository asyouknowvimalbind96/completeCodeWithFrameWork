package learningOOPS;
public class fireFox implements WebDriver {

	public void getText() {
		System.out.println("I am GetText of fireFox");
	}
	public void close() {
		System.out.println("I Am Close of fireFox");
	}
	public void getCurrentUrl() {
		System.out.println("I Am GetCurrentURL of fireFox");
	}
	@Override
	public void GetUrl() {
		System.out.println("I Am GetURL of fireFox");	
	}
	@Override
	public void GetPageSource() {
		System.out.println("I Am GetPageSource of fireFox");	
	}
	@Override
	public void quit() {
		System.out.println("I Am quit of fireFox");
	}
	@Override
	public void GetTitle() {
		System.out.println("I Am GetTitle of fireFox");
	}

}
