package practi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class productcre2 {
	@Test
	public void tes() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://react.greens-intl.ae/admin/");
		driver.findElement(By.xpath("//p[@content='Products']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[@content='Catalog']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Create Product']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("ProductName");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//textarea[@id='react-aria5515227265-:ra:']")).sendKeys("Description");
	}

}
