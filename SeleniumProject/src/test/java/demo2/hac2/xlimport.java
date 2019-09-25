package demo2.hac2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class xlimport {
	WebDriver driver;
	 @BeforeTest
	    public void BeforeTest() {
	  	  driver=BrowserClass.openBrowser("chrome");
	  	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  	  String a=driver.getCurrentUrl();
	  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	 }

		@Test
		public void testAut() throws InterruptedException {
			readWriteExcel();
		}
		
  
 /* @AfterTest
	public void afterTest() {
		driver.close();
			}*/
	
  
  public void readWriteExcel() throws InterruptedException {
	  File file=new File("C:\\Users\\Training_c2a.04.30\\Desktop\\indxl");
	  try {
		  InputStream is= new FileInputStream(file);
		  XSSFWorkbook wb=new XSSFWorkbook(is);
		  XSSFSheet sheet1=wb.getSheet("Sheet1");
		  for(int i=1;i<=sheet1.getLastRowNum();i++)
		  {
			  String username=sheet1.getRow(i).getCell(0).getStringCellValue();
			  System.out.println(username);
			  String password=sheet1.getRow(i).getCell(1).getStringCellValue();
			  String result=login(username,password);
			  sheet1.getRow(i).createCell(2).setCellValue(result);

	  }
		  is.close();
		  OutputStream os= new FileOutputStream(file);
		  wb.write(os);
		  wb.close();
		  os.close();
		  	  }
	  catch(FileNotFoundException e) {
		  e.printStackTrace();
	  }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
	  }
 
  public String login(String username,String password) {
	  driver.findElement(By.name("userName")).sendKeys(username);
  	  driver.findElement(By.xpath("//input[@name='password'and @type='password']")).sendKeys(password);
  	  driver.findElement(By.name("Login")).click();
  	  String d=driver.getCurrentUrl();
		
		Object a = null;
		if(a.equals(d))
  		  {
			return "invalid user";
  		  }
		else
		{
			driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
  		  return "valid user";
  	  }
  	  
  }
  
}
