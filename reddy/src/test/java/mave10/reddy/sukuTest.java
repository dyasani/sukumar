package mave10.reddy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class sukuTest {
	WebDriver driver;
  
	@Test
  public void logi() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  
		Thread.sleep(3000);
	

	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	}
	  @Test
	  public void settingsdropdown()
	  {
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[3]/ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospital_code\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospital_code\"]")).sendKeys("01");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospitalname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_hospitalname\"]")).sendKeys("Evergreen Hospital");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_address\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_address\"]")).sendKeys("10-2-42,KR Puram");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_yearofestablishment\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_yearofestablishment\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_country\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_state\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_state\"]")).sendKeys("telangana");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_phone\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_phone\"]")).sendKeys("7093044363");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_email\"]")).sendKeys("sukumar521@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_fax\"]")).clear();
	    driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_fax\"]")).sendKeys("234567");
	    driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_noofbuildings\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_noofbuildings\"]")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_contactperson\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_contactperson\"]")).sendKeys("sukumar");
		driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_promotedby\"]")).clear();
	    driver.findElement(By.xpath("//*[@id=\"Hospitalregistration_promotedby\"]")).sendKeys("devayani");
	    driver.findElement(By.xpath("//*[@id=\"hospitalregistration-form\"]/div[2]/div/div[2]/div[7]/button")).click();
	  
	  
	  
	  
	  
	  
	  
	  }
	
  
  @BeforeClass
  public void Browser () {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\laharika\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.elixiraid.com");
		driver.manage().window().maximize();
		
	}

}
