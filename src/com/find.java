package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class find {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    String Title=driver.getTitle();	
	    System.out.println("Title"+Title);
	    String URL= driver.getCurrentUrl();
	    System.out.println("page url is-"+URL);
	     
	  driver.findElement(By.name("email")).sendKeys("nehadevrari");
	   driver.findElement(By.name("pass")).sendKeys("papa");
	   driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	   
	}
}
