package javascriptAlert.pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		driver.findElement(By.xpath("//button[@id='s_alert1']")).click();
		
		Thread.sleep(2000);
		
		Alert a =driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		a.accept();
		

	}

}
