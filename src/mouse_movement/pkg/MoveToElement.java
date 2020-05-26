package mouse_movement.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {


	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		
		WebElement blog= driver.findElement(By.xpath("//a[contains(text(),'Blog')]"));
		// Create a Action Class
        Actions action = new Actions(driver);
        action.moveToElement(blog).perform();
        
        Thread.sleep(3000);// visual see purpose
        
    	WebElement fun= driver.findElement(By.xpath("//a[contains(text(),'Fun')]"));
    	      
    	 fun.click();
    	 System.out.println(driver.getCurrentUrl());
	     System.out.println(driver.getTitle());
	     
	     driver.quit();
    		

	}

}
