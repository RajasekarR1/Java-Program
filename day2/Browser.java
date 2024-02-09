package week1.day2;

public class Browser {

public String launchBrowser(String browserName) {
	System.out.println(browserName+ ":Browser Launched Succesfully ");
	return(browserName);

}
public void loadUrl(String Name) {
	System.out.println("Application URL loaded Succesfully");

}
public static void main(String[] args) {
	Browser B= new Browser();
	B.launchBrowser("Edge");
	B.loadUrl(null);
}

}
