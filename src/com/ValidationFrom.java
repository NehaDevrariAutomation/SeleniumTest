package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationFrom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// VALIDATION
		String Title= driver.getTitle();
		System.out.println("Title is - "+Title);
		
        try {
        	Boolean Linktest=driver.findElement(By.linkText("LoIn")).isDisplayed();
        	
         System.out.println(Linktest);
       
        }
        catch(Exception e) {
        	System.out.println("Linktext is not available");
        	
        }
        try {
       //String Select= driver.findElement(By.id("birthday_wrapper")).getAttribute("Value");
       //System.out.println("Value is -"+Select);
        	Boolean SearchBar=driver.findElement(By.linkText("Searchbar")).isDisplayed();
        	  System.out.println(SearchBar);
        }
        catch(Exception e) {
        	System.out.println("SearchBar is not available");
        }
	}

}
