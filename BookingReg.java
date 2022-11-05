package firstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\my new driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/index.html?aid=1819211&label=omg&");
        
        driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a")).click();
        
       driver.findElement(By.name("username")).sendKeys("farah1199@live.com");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys("Wf1234567.");
       driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys("Wf1234567.");;
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();
      
	}

}
