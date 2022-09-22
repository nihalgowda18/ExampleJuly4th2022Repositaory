package com.sgtesting.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static WebDriver obj=null;
	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		login();
		Minimizeflywindow();
		createcustomer();
		logout();

	}
	public static void launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\ECLIPSE\\ExampleAutomation\\Automation\\WEB_AUTOMATION\\Selenium\\Driver\\chromedriver.exe");
			obj = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			obj.get("http://localhost:81/login.do");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			obj.manage().window().maximize();
			Thread.sleep(1000);
			obj.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			obj.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Minimizeflywindow()
	{
		try {
			obj.findElement(By.className("gettingStartedShortcutsLabel")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createcustomer()
	{
		try {
			obj.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			obj.findElement(By.className("plusIcon")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			obj.findElement(By.id("customerLightBox_nameField")).sendKeys("user");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();		}
	}

	private static void logout()
	{
		try {
			obj.findElement(By.xpath("//*[@id='logoutLink']")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

