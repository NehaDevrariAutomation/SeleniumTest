package mouse_movement.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement source= driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(2000);
		
		Actions action= new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
//		//driver.switchTo().frame(1);
//	    driver.findElement(By.xpath("//a[contains(text(),'Development')]"));
//	    
//		
//		Actions actions= new Actions(driver);
//		actions.click();
//		System.out.println(driver.getCurrentUrl());
//	
	}
}
