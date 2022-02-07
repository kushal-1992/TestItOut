package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
    {
	    public WebDriver driver;
	    public PropertyFile p = new PropertyFile();
	    public WebDriverUtilities utilities = new WebDriverUtilities(); 
	
	    @BeforeMethod
	    public void openApp() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	}
	
	          @AfterMethod
              public void closeApp(ITestResult t) throws IOException
	{
		      int status = t.getStatus();
	          String name = t.getName();	
			  if(status==2) {
			  Photo p = new Photo();
			  p.getPhoto(driver, name);		
	}		
				driver.quit();		
	}
    }