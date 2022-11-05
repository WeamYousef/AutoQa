package firstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookingSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "C:\\my new driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/index.html?aid=1819211&label=omg&");
        
      
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        
        
        driver.findElement(By.id("ss")).sendKeys("Amman");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[1]/td[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
	}
	

}
