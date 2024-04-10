package practi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tttt {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://react.greens-intl.ae/admin/catalogue/manage/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[3]")).click();
	driver.findElement(By.xpath("//span[text()='tag1']")).click();
	driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Select Date']")).click();
	driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, February 29th, 2024']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//p[normalize-space()='Show expiry on dashboard']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[4]")).click();
	driver.findElement(By.xpath("//span[text()='Returnable']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[5]")).click();
	driver.findElement(By.xpath("//span[text()='category1']")).click();
	driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[5]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[6]")).click();
	driver.findElement(By.xpath("//span[text()='Martellato']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[7]")).click();
	driver.findElement(By.xpath("//span[text()='Piece']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@name='use_and_care']")).sendKeys("use");
	
	driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("prod99");
	driver.findElement(By.xpath("//textarea[@name='prd_description']")).sendKeys("b");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@data-slot='trigger'][1]")).click();
	driver.findElement(By.xpath("//span[text()='vat5%']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Dry']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@name='dimensions_and_more_info']")).sendKeys("dimensions");
	driver.findElement(By.xpath("//textarea[@name='shipping_and_returns']")).sendKeys("shipping");
	driver.findElement(By.xpath("//div[@class='custombtn-label']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Price')]"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).click().perform();
	driver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys("199");
	driver.findElement(By.xpath("//p[normalize-space()='Inactive']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='custombtn-label'])[1]")).click();
	Thread.sleep(1000);
	driver .findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
	Thread.sleep(1000);
	WebElement ele2 = driver.findElement(By.xpath("//div[normalize-space()='Inventory']"));
	Actions a2=new Actions(driver);
	a2.moveToElement(ele2).click().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='SKU']")).sendKeys("121212");
	driver.findElement(By.xpath("//input[@placeholder='EIN Code']")).sendKeys("12129");
	driver.findElement(By.xpath("//input[@placeholder='Item Code']")).sendKeys("9999");
	driver.findElement(By.xpath("//div[@class='custombtn-label']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='custombtn-label']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
	Thread.sleep(1000);
//	driver.findElement(By.xpath("//div[@class='btn']")).click();
	WebElement elee=driver.findElement(By.xpath("//div[@class='btn']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(elee).click().build().perform();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[name()='svg'])[4]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Track Inventory']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[normalize-space()='Update Stock']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Qty']")).sendKeys("15");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[normalize-space()='Add Stock']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Minimum Qty']")).sendKeys("5");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='custombtn-label']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
	
	
	
//	driver.close();
}
}
