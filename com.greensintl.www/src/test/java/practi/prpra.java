package practi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prpra {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://react.greens-intl.ae/admin/catalogue/manage/");
//		driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("a");
//		driver.findElement(By.xpath("//textarea[@name='prd_description']")).sendKeys("b");
//		WebElement ele = driver.findElement(By.xpath("//button[@data-slot='trigger'][1]"));
//		ele.click();
//		driver.findElement(By.xpath("//span[text()='vat5%']")).click();
//		Thread.sleep(1000);
//		
//		WebElement ele1 = driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[2]"));
//		ele1.click();
//		driver.findElement(By.xpath("//span[text()='Dry']")).click();
//		driver.findElement(By.xpath("//textarea[@name='dimensions_and_more_info']")).sendKeys("dimensions");
//		driver.findElement(By.xpath("//textarea[@name='shipping_and_returns']")).sendKeys("shipping");
//		Thread.sleep(1000);
//		System.out.println("ss");
//		WebElement ele7 = driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[7]"));
//		ele7.click();
//		driver.findElement(By.xpath("//span[text()='Piece']")).click();
		Thread.sleep(1000);
		WebElement ele6 = driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[6]"));
		ele6.click();
		driver.findElement(By.xpath("//span[text()='Martellato']")).click();
//		Thread.sleep(1000);
//		WebElement ele5 = driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[5]"));
//		ele5.click();
//		driver.findElement(By.xpath("//span[text()='category1']")).click();
//		ele5.click();
//		System.out.println("xxx");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//textarea[@name='use_and_care']")).sendKeys("use");
//		Thread.sleep(1000);
//		System.out.println("yyy");
//		Thread.sleep(2000);
//		System.out.println("yyy");
		//88888
//		driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='tag1']")).click();
//		driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[3]")).click();
		
		
//		driver.findElement(By.xpath("//input[@placeholder='Select Date']")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, February 29th, 2024']")).click();
//		
//		driver.findElement(By.xpath("//p[normalize-space()='Show expiry on dashboard']")).click();
//		
//		driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[4]")).click();
//		driver.findElement(By.xpath("//span[text()='Returnable']")).click();
//		
//		WebElement ele5 = driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[5]"));
//		ele5.click();
//		driver.findElement(By.xpath("//span[text()='category1']")).click();
//		ele5.click();
//		WebElement ele6 = driver.findElement(By.xpath("(//div[@data-slot='base']/descendant::button[@data-slot='trigger'])[6]"));
//		ele6.click();
//		driver.findElement(By.xpath("//span[text()='Martellato']")).click();
		
	}

}
