package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	    @FindBy (xpath="//a[text()=' GEARS ']")
		private WebElement clickinggearsbtn;

	    
	    @FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	    private WebElement clickingdemoskillrarybtn;
	    
	    public  HomePage(WebDriver driver) {
	    	PageFactory.initElements(driver,this);
	    }
	    
	    public void gearbutton() {
	    	clickinggearsbtn.click();
	    }
	    public void skillrarydemoapplication() {
	    	clickingdemoskillrarybtn.click();
	    }	    
	    
	    
	    
	    
		
	}
	
	
	
