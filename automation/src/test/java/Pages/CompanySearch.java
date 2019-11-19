package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanySearch {
	WebElement Searchbox=null;
	
	public WebElement Searchbox(WebDriver driver) {
		WebElement Searchbox=driver.findElement(By.xpath("//input[contains(@name,'top-search')]"));
		 return Searchbox;
		 
		 
	}

}
