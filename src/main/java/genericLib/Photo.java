package genericLib;

import java.io.File;
import java.io.IOException;
import java.sql.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo implements AutoConstant {
	
	    public File getPhoto(WebDriver driver,String name) throws IOException
	    {
		Date d = new Date(0);
		String date = d.toString().replaceAll(":","-");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(photoPath+date+name+".png");
		FileUtils.copyFile(src, dest);
		return dest;
			
	}	
}
