package practi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flow {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://react.greens-intl.ae/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@content='Products']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@content='Catalog']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Create Product']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("seses");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='prd_description']")).sendKeys("description");
		Thread.sleep(1000);
		FileInputStream fis =new FileInputStream("./src/test/resources/product additoin.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet4");
		String ele = sh.getRow(1).getCell(2).getStringCellValue();
		System.out.println(ele);
		Thread.sleep(1000);
		WebElement ee = driver.findElement(By.xpath("//ul[@class='w-full flex flex-col gap-0.5 outline-none']"));
		ee.click();
		Select s=new Select(ee);
		String eee="Puma";
		List<WebElement>options=s.getOptions();
		for(WebElement option: options)
		{
			System.out.println(option);
		}
		
		
	}
}
