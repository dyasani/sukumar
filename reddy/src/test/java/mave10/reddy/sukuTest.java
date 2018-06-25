package mave10.reddy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class sukuTest {
	WebDriver driver;
  
	@Test
  public void logi() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	 
	 
  }
  
  @BeforeClass
  public void Browser () {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\laharika\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.elixiraid.com");
		driver.manage().window().maximize();
		
	}

}
