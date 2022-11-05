package firstpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisualCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\my new driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/home.html");

		String SingleOption = driver.findElements(By.tagName("option")).get(2).getText();
		System.out.println(SingleOption);
		
		List <WebElement>  AllOptions = driver.findElements(By.tagName("option"));
		System.out.println(AllOptions.size());
		
		for (int i=0; i<AllOptions.size(); i++)
		{ System.out.println(AllOptions.get(i).getText());
	}
	

}
}