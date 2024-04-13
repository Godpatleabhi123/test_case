package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logiinpage {
	
	private static String ap_password;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.geckodriver", "C:\\Users\\Abhishek\\Desktop\\amazon\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(100);
		

	
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(100);
		
	driver.findElement(By.id("ap_email")).sendKeys("godpatlea@gmail.com");
	Thread.sleep(100);
	
	driver.findElement(By.id("continue")).click();	
	Thread.sleep(100);
	
	driver.findElement(By.id("ap_password")).sendKeys("Abhiiiii");
	Thread.sleep(100);

	driver.findElement(By.id("auth-signin-button")).click();
	Thread.sleep(100);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	Thread.sleep(100);
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(100);
	
	driver.findElement(By.id("a-autoid-1-announce")).click();
	Thread.sleep(100);
	
	driver.findElement(By.id("nav-cart-count")).click();
	Thread.sleep(100);	
	}
	
	

}
