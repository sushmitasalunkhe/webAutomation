package BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	public void Browser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/home/ankur-loktra/eclipse-workspace/automation/Drivers/geckodriver/geckodriver");
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "/home/ankur-loktra/eclipse-workspace/automation/Drivers/chromedriver/chromedriver");
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.instafinancials.com/company/cbl-data-science-private-limited/U72501KA2016PTC092387"); 
		Thread.sleep(5000);
		
		
	WebElement popup1=driver.findElement(By.xpath("//button[contains(.,'Later')]"));
	popup1.click();
	WebElement sidebar=driver.findElement(By.xpath("//a[@class='sidebar-close'][contains(.,'Hide')]"));
	sidebar.click();
	WebElement SearchBox=driver.findElement(By.xpath("//input[contains(@name,'top-search')]"));
	SearchBox.sendKeys("Wishbook");
	WebDriverWait wait = new WebDriverWait(driver,05);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='search-results']//li")));
	
	List<WebElement> list = driver.findElements(By.xpath("//ul[@id='search-results']//li"));
	
	System.out.println("Auto Suggest List ::" + list.size());
	
	for(int i = 0 ;i< list.size();i++)
	{
		System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().equalsIgnoreCase("wishbook infoservices private limited"))
		{
			list.get(i).click();
			break;
		}
	}
	//WebElement SelectSuggestion=driver.findElement(By.xpath("//li[contains(@onclick='setCompanyName(this);')]"));
	//SelectSuggestion.click();
	//WebElement Selectcompanys= driver.findElement(By.className("ddlbox"));
	//*[@class='acResults']/ul/li[1]/span
	
	//WebElement from= driver.findElement(By.className("vmenu"));
    //from.clear();
    //from.sendKeys(FromCity);
	//Actions builder=new Actions(driver);
	//WebElement dropdown =driver.findElement(By.xpath("//*[@class='vmenu']/li[1]"));
	//dropdown.click();
	/*WebElement dropdown = driver.findElement(By.className("vmenu"));
     List<WebElement> options = dropdown.findElements(By.tagName("li"));
     System.out.println(options);
     for (WebElement option : options)
     {
    	 String id=option.getText();
    	// System.out.println(id);
    	 		if (option.getText().equalsIgnoreCase("wishbook infoservices private limited")){
    	 			option.click();
    	 			
    	 			
    	 		}

     }*/
     
    /* WebDriverWait wait = new WebDriverWait(driver,05);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='listbox']//li")));
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='listbox']//li"));
		
		System.out.println("Auto Suggest List ::" + list.size());
		
		for(int i = 0 ;i< list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equalsIgnoreCase("wishbook infoservices private limited"))
			{
				list.get(i).click();
				break;
			}
		}*/
	
	/*List<WebElement> Selectcompanys= driver.findElements(By.xpath("//div[@id=’listbox’]//*[@id='search-results’]//descendant::li"));
	
	for (WebElement Selectcompany :Selectcompanys) {
		String id=Selectcompany.getAttribute("onclick");
System.out.println(id);
		if (Selectcompany.getText().equalsIgnoreCase("wishbook infoservices private limited")){
			Selectcompany.click();
			
			
		}
	}*/
	//driver.close();
	
	
	

	//Alert alert=driver.switchTo().alert();
	
	//alert.dismiss();
	
		//driver.findElement(By.xpath("(//button[@href='javascript:void(0)'])[2]")).click();
		//@FindBy(xpath = "//button[@onclick='_izooto.closeDialog();'][contains(.,'Later')]")
		//WebElement popUpLater;
	}

}
