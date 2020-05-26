package mouse_movement.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_MouseMovement {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement btn= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		 Actions action= new Actions(driver);
	      action.contextClick(btn).build().perform();
		 Thread.sleep(4000);
		 	action.sendKeys(Keys.ARROW_DOWN).perform();
		 	Thread.sleep(2000);
		 	action.sendKeys(Keys.ARROW_DOWN).perform();
		 	Thread.sleep(2000);
		 	action.sendKeys(Keys.RETURN).perform();
		 	Thread.sleep(2000);
		 	
		 	driver.quit();
		 	
	}

}
