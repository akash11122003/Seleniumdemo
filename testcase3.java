package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase3
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/digital_circuits/digital_circuits_shift_registers.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"tocCollapse\"]/div/ul[1]/li[3]/a")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)","");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div/div[1]/ul/li[1]/a")).click();
		JavascriptExecutor ps=(JavascriptExecutor) driver;
		ps.executeScript("window.scrollBy(0,500","");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact")).click();
		driver.findElement(By.xpath("//*[@id=\"contactp\"]")).sendKeys("Akash");
		
		driver.quit();		
		
	}
}