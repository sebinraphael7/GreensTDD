package practi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yyy {
public static void main(String[] args) throws InterruptedException {
	System.out.println("seb");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://react.greens-intl.ae/admin/catalogue/manage/?id=94");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Price')]"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).click().perform();
}
}
