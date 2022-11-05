package firstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "C:\\my new driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        driver.findElement(By.className("_6lti")).click();
        		
	

}}
//a[normalize-space()='Forgot password?']