package com.adactin.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver getdriver(String browserName) {
		try
		{
		if (browserName.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+("\\Driver\\ie.exe"));
			driver=new InternetExplorerDriver();
			
		}
		else
		{
			System.out.println("Error");
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void geturl(String url)
	{

		driver.get(url);
	}
	public static void getCurrentUrl()
	{
		
		driver.getCurrentUrl();
		}
	
	public static void scrollup(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
   }
	
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
   }
	
	
	public static void getTitle() {
		driver.getTitle();
}
	
	
public static void getNavigateTo(String url2) {
		driver.navigate().to(url2);

	}
	public static void getNavigateBackward() {
		
		driver.navigate().back();

	}
	public static void getNavigateForward() {
		driver.navigate().forward();

	}
	public static  void getRefresh() {
		driver.navigate().refresh();
		} 
	
	public static void getClose()
	{
		driver.close();
		System.out.println("Window closed Successfully");
	}
	public static void getQuit() {
		try
		{
			driver.quit();
		System.out.println("Quit successfully");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}
	public static void getSimpleAlert() {
		
		 driver.switchTo().alert().accept();
		 
		}
	public static void attributeGet(String value) {
		
		

	}
			
	public static void getConfirmAlert(String Ok,String Cancel) {
		if(Ok.equalsIgnoreCase("OK"))
		{
		driver.switchTo().alert().accept();
		}
		else if(Cancel.equalsIgnoreCase("Cancel"))
		{
			driver.switchTo().alert().dismiss();
		}
	}
	public static void getPromptAlert(String Ok,String Cancel,String Sendkey) {
		if(Ok.equalsIgnoreCase("OK"))
		{
		driver.switchTo().alert().sendKeys(Sendkey);
		driver.switchTo().alert().accept();
	
		}
		else if(Cancel.equalsIgnoreCase("Sendkey")) {
			driver.switchTo().alert().dismiss();
			
		}
		else 
		{
			System.out.println("Invalid Selection");
		}
	}
	public static void inputValueElement(WebElement element,String value) {
		
		element.sendKeys(value);
		

	}
	
	public static void elementOnClick(WebElement element) {
		element.click();

	}

	public static void getscreenshot(String path) throws Throwable    {
				TakesScreenshot ts =  (TakesScreenshot) driver;
				File sourcefile=ts.getScreenshotAs(OutputType.FILE);
			
                File destination = new File (path);			
				
					FileUtils.copyFile(sourcefile, destination);
				
			}
		public static void robotMthd() throws Throwable {
			
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
		}
		public static void framemthd(WebElement element,String option,String value) {
			
			if(option=="ByIndex")
			{
				int index = Integer.parseInt(value);
			driver.switchTo().frame(index);
			
			}
			else if(option=="ByElement"){
				driver.switchTo().frame(element);
				
			}
			else if(option=="ByString") {
			driver.switchTo().frame(value);
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		public void windowget(String giventitle) {
			
			Set<String> allid = driver.getWindowHandles();
			
			for (String id : allid) {
				System.out.println(id);
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
				}
			for (String id : allid) {
				if(driver.switchTo().window(id).getTitle().equalsIgnoreCase(giventitle));
				break;
			}
			

		}
		
		public static void dragdropmth(WebElement a1 ,WebElement a2) {
			Actions ac=new Actions(driver);
			ac.dragAndDrop(a1, a2).build().perform();
			}
		
		public void actionMthd(String option) {
			Actions ac=new Actions(driver);

		}
		public static void selectOption(WebElement a,String option,String value1) {
			try {
				Select s=new Select(a);
				if(option=="Byindex")
				{
					int index = Integer.parseInt(value1);
					s.selectByIndex(index);
}
				else if(option=="ByValue") {
					s.selectByValue(value1);
					
				}
				else if(option=="Visibletext")
				{
					s.selectByVisibleText(value1);
				}
				else
				{
					System.out.println("Invalid Selection");
				}
			} 
			catch (NumberFormatException e) {
				e.printStackTrace();
			}
				
		
		}
		public static void elementClick(WebElement e) {
			e.click();

		}
		public static void enableText(WebElement e) {
	
			System.out.println(e.isEnabled());
		}
		public static void displayText(WebElement e) {
			
			System.out.println(e.isDisplayed());
		}
		
		
		public void waitConcept(String option,WebElement element) {
			if(option.equalsIgnoreCase("ImplicictWait"))
			{
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			
			else if(option.equalsIgnoreCase("ExplicictWait")) {
				WebDriverWait wt=new WebDriverWait(driver, 30);
				wt.until(ExpectedConditions.visibilityOf(element));
			}

		}


		/*public static void main(String[] args) throws InterruptedException {
			getdriver("Chrome");
			geturl("https://www.facebook.com/");
			Thread.sleep(2000);
			options(driver.findElement(By.id("day")), "Byindex", "7");
			options(driver.findElement(By.id("month")), "ByValue", "11");
			options(driver.findElement(By.id("year")), "Visibletext", "2020");
			//options(a, option, value);*/
			
		}
				
		
			
		


