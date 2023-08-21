/**
 * 
 */
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;

/**
 * @author sapna
 *
 */
public class Molina {

	WebDriver driver; // Local driver for this class

	public  Molina(WebDriver driver) {
		this.driver = driver; // WebDriver is assigned to the local driver
		PageFactory.initElements(driver, this); // Invoke the objects of this class
	}
	
	@FindBy(css ="img.brand-logo-img")
	WebElement logo;
	@FindBy(css = "#normal_login_username")
	WebElement Userid;
	@FindBy(css = "#normal_login_password")
	WebElement Password;
	@FindBy(css = "button.ant-btn.login-button")
	WebElement login;
	@FindBy(css = "svg.view-control.cursor-pointer:nth-child(2)")
	WebElement hamburger;
	@FindBy(css = "svg.view-control.cursor-pointer:nth-child(1)")
	WebElement Gridview;
	@FindBy(css = "button.ant-btn.ant-btn-default.outline[ant-click-animating-without-extra-node=\"false\"]")
	WebElement AddProject;
	@FindBy(css = "input#name.ant-input")
	WebElement AddProjectName;
	@FindBy(css = "div.ql-editor[data-placeholder='Please enter and style project description here']")
	WebElement AddProjectdes;
	@FindBy(css = "#bucketName")
	WebElement locationsource;
	@FindBy(css = "div.addClient-content form div.ant-form-item.tr.mandatory-text button")
	WebElement Addprojectsubmit;
	@FindBy(css = "div.project-card-view-dis h5[title*='National Demo Group']")
	WebElement clickonproject;
	@FindBy(xpath = ".//div[@id='rc-tabs-1-tab-Assigned Subjects']")
	WebElement assignedSubjectsElement;
	@FindBy(css = ".ant-tabs-tab-btn[aria-controls='rc-tabs-1-panel-Documents']")
	WebElement Document;
	@FindBy(xpath = "//td[@class='ant-table-cell' and text()='1101']")
	WebElement Subject1101;
	@FindBy(css = "div.ant-tabs-tab-btn[aria-controls='rc-tabs-5-panel-Clinical Insights']")
	WebElement clinicalinsight;
	@FindBy(css = "UL#dropdowncitycomms li:nth-child(2)")
	WebElement Bastrop;
	@FindBy(css= "#btnsearchcomms")
	WebElement search;
	@FindBy(css= "div.dropdown homes-sort-dropdown")
	WebElement SortByH;
	@FindBy(css= "UL#homes-sort-dropdown  li:nth-child(2)")
	WebElement LTOH;
	@FindBy(css= "div.collapsible-button.collapsible-1510765112.collapse-right")
	WebElement crossfilterH;
	
	
	

	// Methods
	public  void Loginpage(String user, String password) throws InterruptedException {		
		logo.isDisplayed();
		Userid.sendKeys(user);
		Password.sendKeys(password);
		login.click();
		Thread.sleep(8000);

	}
	
	public void view() throws InterruptedException {	
		 // Verify whether the hamburger menu is displayed
        if (hamburger.isDisplayed()) {
            System.out.println("Hamburger menu is displayed.");
        } else {
            System.out.println("Hamburger menu is not displayed.");
        }
    Gridview.click();
	Thread.sleep(2000);

      // Verify whether the grid view is displayed
    if (Gridview.isDisplayed()) {
        System.out.println("Grid view is displayed.");
    } else {
        System.out.println("Grid view is not displayed.");
    }

	}
   /*
	public void AddNewProject() throws InterruptedException {	
	   AddProject.click();
	   ProjectName.sendKeys("TestProject");
	   Projectdesadd.sendKeys("describe the project details");
	   locationsource.sendKeys("test");

}
*/	public  void projectname() throws InterruptedException {	
	
	try  {		
	clickonproject.isDisplayed();
	clickonproject.click();}
	catch  (NoSuchElementException e) {
    }}

     public  void ClinicalChartInsights() throws InterruptedException {	
	Thread.sleep(15000);
	assignedSubjectsElement.click();
	System.out.println("assigned project");
	Thread.sleep(8000);
	Subject1101.click();
	
}}

/*
	
public void Prange_click()throws InterruptedException {
	Actions action=new Actions(driver);
	action.clickAndHold(Prange);
	action.moveByOffset(30, 0).release().build().perform();
    System.out.print(Prange);
}
 
public void Searchcard_Details() 
{
	city.click();
	Bastrop.click();
	search.click();
	SortByH.click();
	LTOH.click();
	crossfilterH.click();
	*/
	
	




