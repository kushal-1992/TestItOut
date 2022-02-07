package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.HomePage;
import pomPages.SkillraryDemoLoginPage;

public class AddingToCart extends BaseClass {
	@Test
	
	public void tc1() {
		
		HomePage h = new HomePage(driver);
		h.gearbutton();
		h.skillrarydemoapplication();
		
		
		utilities.SwitchingTabs(driver);
		
		SkillraryDemoLoginPage s = new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver,s.getCoursebtn());
		s.selectSeleniumTraining();
		
		
		
	}
	
	
	
	
	
	
	

}
