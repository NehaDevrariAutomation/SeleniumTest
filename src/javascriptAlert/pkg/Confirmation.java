package javascriptAlert.pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		driver.findElement(By.id(" c_alert2")).click();
		Thread.sleep(3000);
		
		Alert a= driver.switchTo().alert();
		
		a.accept();
		System.out.println(a.getText());
		
		
		driver.close();
		

	}

}
