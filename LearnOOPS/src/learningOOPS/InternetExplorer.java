package learningOOPS;
public class InternetExplorer implements WebDriver{
public void getText() {
	System.out.println("I am GetText of InternetExplorer");
}
public void close() {
	System.out.println("I Am Close of InternetExplorer");
}
@Override
public void getCurrentUrl() {
	System.out.println("I Am getCurrentUrl of InternetExplorer");	
}
@Override
public void GetUrl() {
	System.out.println("I Am GetUrl of InternetExplorer");	
}
@Override
public void GetPageSource() {
	System.out.println("I Am GetPageSource of InternetExplorer");	
}
@Override
public void quit() {
	System.out.println("I Am quit of InternetExplorer");	
}
@Override
public void GetTitle() {
	System.out.println("I Am GetTitle of InternetExplorer");	
}
	
}
