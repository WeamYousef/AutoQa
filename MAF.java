package firstpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\my new driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://teamsstg.maf.ae/");
		
		String  Title = driver.getTitle();
		System.out.println(Title);
	}

}
