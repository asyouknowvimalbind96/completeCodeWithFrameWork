package learningOOPS;

public class MicrosoftEdge implements WebDriver {
	public void GetUrl() {
		System.out.println("I Am GetURL of MicrosoftEdge ");
	}
	public void GetPageSource() {
		System.out.println("I Am GetPageSource of MicrosoftEdge ");
	}
	public void getText() {
		System.out.println("I am GetText of MicrosoftEdge");
	}
	public void getCurrentUrl() {
		System.out.println("I Am getCurrentUrl of MicrosoftEdge");	
	}
	public void quit() {
		System.out.println("I Am quit of MicrosoftEdge");	
	}
	@Override
	public void close() {
		System.out.println("I Am close of MicrosoftEdge");
	}
	@Override
	public void GetTitle() {
		System.out.println("I Am GetTitle of MicrosoftEdge");
	}
}
