package practi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class finale {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fis= new FileInputStream("./src/test/resources/product additoin.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
//	String url=wb.getSheet("Sheet4").getRow(0).getCell(2).getStringCellValue();
//	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();	
//	driver.get(url);
//	driver.findElement(By.xpath("//p[@content='Products']")).click();
//	Thread.sleep(1000);
//	System.out.println("*");
//	driver.findElement(By.xpath("//p[@content='Catalog']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//div[normalize-space()='Create Product']")).click();
//	String ProductName=wb.getSheet("Sheet4").getRow(4).getCell(1).getStringCellValue();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys(ProductName);
//	Thread.sleep(1000);
//	String Description=wb.getSheet("Sheet4").getRow(4).getCell(2).getStringCellValue();
//	driver.findElement(By.xpath("//textarea[@name='prd_description']")).sendKeys(Description);
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//button[@data-slot='trigger'])[1]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//span[text()='vat5%']")).click();
//	String StorageType=wb.getSheet("Sheet4").getRow(4).getCell(4).getStringCellValue();
//	
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//div[@data-slot='innerWrapper'])[2]")).click();
//	Thread.sleep(1000);
//List<WebElement> liss = driver.findElements(By.xpath("//li[@role='option']"));
//	for (int i = 0; i < liss.size(); i++) 
//	{
//		WebElement lee=liss.get(i);
//		if(StorageType.equals(lee.getText()))
//		{
//			lee.click();
//		}
//	}
//	String Dimensions = wb.getSheet("Sheet4").getRow(4).getCell(5).getStringCellValue();
//	driver.findElement(By.xpath("//textarea[@name='dimensions_and_more_info']")).sendKeys(Dimensions);
//	
//	String Shipping = wb.getSheet("Sheet4").getRow(4).getCell(6).getStringCellValue();
//	driver.findElement(By.xpath("//textarea[@name='shipping_and_returns']")).sendKeys(Shipping);
//	
//	Thread.sleep(1000);
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scrollTo(0,0);");
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//div[@data-slot='mainWrapper'])[3]")).click();
//	Thread.sleep(1000);
//	String Tags=wb.getSheet("Sheet4").getRow(4).getCell(7).getStringCellValue();
//	List<WebElement> tag = driver.findElements(By.xpath("//li[@role='option']"));
//	for(int i=0;i<tag.size();i++)
//	{
//		WebElement ta = tag.get(i);
//		if(Tags.equalsIgnoreCase(ta.getText()))
//			ta.click();
//	}
//	Thread.sleep(1000);
//	
//	driver.findElement(By.xpath("//p[text()='Show expiry on dashboard']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//div[@data-slot='innerWrapper'])[4]")).click();
//	String ReturnType=wb.getSheet("Sheet4").getRow(4).getCell(10).getStringCellValue();
//	 List<WebElement> returnlist = driver.findElements(By.xpath("//li[@role='option']"));
//	 for(int i=0;i<returnlist.size();i++)
//	 {
//		 WebElement ret=returnlist.get(i);
//		 if(ReturnType.equals(ret.getText()));
//		  ret.click();
//	 }
//	Thread.sleep(1000);
//
//	String category = wb.getSheet("Sheet4").getRow(4).getCell(11).getStringCellValue();
//	Thread.sleep(1000);
//	WebElement listbox = driver.findElement(By.xpath("(//div[@data-slot='mainWrapper'])[5]"));
//	listbox.click();
//	Thread.sleep(1000);
//	List<WebElement>lis=driver.findElements(By.xpath("//li[@role='option']"));
//	
//	for (WebElement le:lis)
//	{
//		if(category.equals(le.getText()))
//		{
//		le.click();
//		}
//	}
//	listbox.click();
//	 Thread.sleep(1000);
//	driver.findElement(By.xpath("(//div[@data-slot='innerWrapper'])[6]")).click();
//	String Brand=wb.getSheet("Sheet4").getRow(4).getCell(12).getStringCellValue();
//	List<WebElement> lissst = driver.findElements(By.xpath("//li[@role='option']"));
//	for(int i=0;i<lissst.size();i++)
//	{
//		WebElement br = lissst.get(i);
//		if(Brand.equalsIgnoreCase(br.getText()))
//			br.click();
//	}
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//div[@data-slot='innerWrapper'])[7]")).click();
//	String SalesUnit=wb.getSheet("Sheet4").getRow(4).getCell(13).getStringCellValue();
//	List<WebElement> lisst = driver.findElements(By.xpath("//li[@role='option']"));
//	for(int i=0;i<lisst.size();i++)
//	{
//		WebElement leee=lisst.get(i);
//		if(SalesUnit.equalsIgnoreCase(leee.getText()))
//			leee.click();
//	}
//	Thread.sleep(1000);
//	String Use=wb.getSheet("Sheet4").getRow(4).getCell(14).getStringCellValue();
//	driver.findElement(By.xpath("(//textarea[@data-slot='input'])[4]")).sendKeys(Use);
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//div[text()='Save Changes']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
//	Thread.sleep(1000);
//	WebElement pr=driver.findElement(By.xpath("//div[text()='Price']"));
//	Actions a= new Actions(driver);
//	a.click(pr).perform();
//	Thread.sleep(1000);
//	DataFormatter df=new DataFormatter();
//	String price=df.formatCellValue(wb.getSheet("Sheet4").getRow(4).getCell(15));
//	System.out.println(price);
//	WebElement prr = driver.findElement(By.xpath("//input[@placeholder='Price']"));
//	Thread.sleep(500);
//	prr.clear();
//	Thread.sleep(500);
//	prr.sendKeys(price);
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//p[text()='Inactive']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//div[text()='Save Changes']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
//	Thread.sleep(1000);
//	WebElement inv=driver.findElement(By.xpath("//div[text()='Inventory']"));
//	Actions a2= new Actions(driver);
//	a2.click(inv).perform();
//	Thread.sleep(1000);
//	String sku=df.formatCellValue(wb.getSheet("Sheet4").getRow(4).getCell(17));
//	System.out.println(sku);
//	driver.findElement(By.xpath("//input[@placeholder='SKU']")).sendKeys(sku);
//	Thread.sleep(1000);
//	String einCode=df.formatCellValue(wb.getSheet("Sheet4").getRow(4).getCell(18));
//	driver.findElement(By.xpath("//input[@placeholder='EIN Code']")).sendKeys(einCode);
//	Thread.sleep(1000);
//	String itemCode=df.formatCellValue(wb.getSheet("Sheet4").getRow(4).getCell(19));
//	System.out.println(itemCode);
//	driver.findElement(By.xpath("//input[@placeholder='Item Code']")).sendKeys(itemCode);
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//div[@data-slot='innerWrapper'])[1]")).click();
//	Thread.sleep(1000);
//	
//	String invManagement=df.formatCellValue(wb.getSheet("Sheet4").getRow(4).getCell(20));
//	System.out.println(invManagement);
//	 List<WebElement> invlist = driver.findElements(By.xpath("//li[@role='option']"));
//	 Thread.sleep(1000);
//	 for(int i=0;i<invlist.size();i++)
//	 {
//		 WebElement trackinv = invlist.get(i);
//		 if(invManagement.equalsIgnoreCase(trackinv.getText()))
//		 {
//			 trackinv.click();
//		 }
//	 }
//	 Thread.sleep(1000);
//	 String minqty=df.formatCellValue(wb.getSheet("Sheet4").getRow(4).getCell(22));
//	 String maxqty=df.formatCellValue(wb.getSheet("Sheet4").getRow(4).getCell(23));
//	 System.out.println(minqty);
//	 System.out.println(maxqty);
//	 driver.findElement(By.xpath("//input[@placeholder='Minimum Qty']")).clear();
//	 driver.findElement(By.xpath("//input[@placeholder='Minimum Qty']")).sendKeys(minqty);
//	 Thread.sleep(1000);
//	 driver.findElement(By.xpath("//input[@placeholder='Maximum Qty']")).clear();
//	 driver.findElement(By.xpath("//input[@placeholder='Maximum Qty']")).sendKeys(maxqty);
//	 Thread.sleep(1000);
//	 
//	 driver.findElement(By.xpath("(//div[@data-slot])[16]")).click();
//	 Thread.sleep(1000);
//	 String StockAvailability=df.formatCellValue(wb.getSheet("Sheet4").getRow(4).getCell(24));
//	 System.out.println(StockAvailability);
//	 List<WebElement> stockList = driver.findElements(By.xpath("//li[@role='option']"));
//	 for(int i=0;i<stockList.size();i++)
//	 {
//		 WebElement trackstlist = stockList.get(i);
//		 if(StockAvailability.equalsIgnoreCase(trackstlist.getText()))
//			 trackstlist.click();
//		 
//	 }
//	 driver.findElement(By.xpath("(//div[@data-slot])[16]")).click();
//
//	 Thread.sleep(1000);
//	 driver.findElement(By.xpath("//div[text()='Save Changes']")).click();
//	 Thread.sleep(1000);
//	 driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	
	driver.manage().window().maximize();
	driver.get("https://react.greens-intl.ae/admin/catalogue/manage/?id=86");
	Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='custom-calender-input']")).clear();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@class='custom-calender-input']")).sendKeys("01-02-2025");
		}
}
