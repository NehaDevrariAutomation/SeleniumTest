package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBoxElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/shashwat/Documents/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcYN4AUa6zUkeFcPOlJKUIbH1m-o85rW_HWLmfuUxjqXF4Ab7xy046wvHsmQ65ZVjvmaHy1PU_9aGYQHcp_OF_L9kKM9-o9PmbXImujpJh29g&smuh=25004&lh=Ac_mv9GuZuW_Ahk4");
		
		WebElement Day= driver.findElement(By.xpath("//select[@id='day']"));
		WebElement Month= driver.findElement(By.xpath("//select[@id='month']"));
		WebElement Year= driver.findElement(By.xpath("//select[@id='year']"));
		Select select=new Select(Day);
		select.selectByVisibleText("10");
		
		Select select1=new Select(Month);
		select1.selectByVisibleText("May");
		
		Select select2=new Select(Year);
		select2.selectByVisibleText("1995");
		
		boolean Enable=driver.findElement(By.xpath("//select[@id='month']")).isEnabled();
		System.out.print(Enable);
	}

}
