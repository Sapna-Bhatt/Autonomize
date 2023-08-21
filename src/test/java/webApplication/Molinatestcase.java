/**
 * 
 */
package webApplication;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.Molina;
import resources.Base;

/**
 * @author sapna
 *
 */
public class Molinatestcase extends Base {
	
	@BeforeClass
	public void setUp() throws Exception {
		String applicationUrl = prop.getProperty("AppUrl");
		
		driver = initDriver();
		driver.get(applicationUrl);
		System.out.println("Navigated to :"+applicationUrl);
		driver.manage().window().maximize();
			
	}
	
	
	@Test
	public void MolinaTestcase() throws InterruptedException {
		Molina D1 = new Molina(driver);
		String pass1 = prop.getProperty("passwd");
		String email1 = prop.getProperty("email"); 
		D1.Loginpage(email1,pass1);
		D1.view();
		D1.projectname();
		D1.ClinicalChartInsights();

	}
	}