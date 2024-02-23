package week3.day1;

public class SafariBrowser extends BrowserInheritance {
		
	public void readerMode() {
		System.out.println("Switched to ReaderMode");

	}
	public void fullScreenMode() {
		System.out.println("Entered in to Fullscreen Mode");

	}
	public void browserName() {
		System.out.println("Browser name is Edge");
		
	}
	public void browserVersion() {
		System.out.println("Browser Version is 121.0.6167.185");
		
	}
	
	public static void main(String[] args) {
		SafariBrowser safari= new SafariBrowser();
		safari.browserName();
		safari.browserVersion();
		safari.readerMode();
		safari.fullScreenMode();
		safari.openUrl();
		safari.navigateBack();
		safari.closeBrowser();

	}


}
