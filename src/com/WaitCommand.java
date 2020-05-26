package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait Command
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.dezlearn.com/explicit-wait-example/");
		
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_97']")).sendKeys("Neha");
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_98']")).sendKeys("Singh");
		driver.findElement(By.xpath(" //input[@id='ninja_forms_field_100']")).sendKeys("mncklSNflkasmvcl");
		
		driver.findElement(By.xpath(" //button[@id='u_5_6']")).click();
		
		//Explicit Wait Command
		
 
       
	   WebDriverWait wait= new WebDriverWait (driver, 30);
       wait.until(ExpectedConditions.elementToBeClickable(By.id("u_5_7"))).click();
       
		driver.quit();
		
		
	}

}
