package Test.pierwszy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	WebDriver driver;
	//JavaScriptExecutor jse;
	
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Programy\\Chrome\\chromedriver.exe");
			
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://mklr.pl/");
			
			searchCar();
			
			
			
				 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	 public void searchCar() {
		 try {
			//TEST LOGOWANIA I WYLOGOWANIA
			driver.findElement(By.className("mmg-cmp-close")).click();
			driver.findElement(By.id("msearch")).click();
			driver.findElement(By.id("m7")).click();
			driver.findElement(By.id("m10")).click();
			driver.findElement(By.id("m3")).click();
			driver.findElement(By.linkText("Zaloguj siê")).click();
			driver.findElement(By.name("username")).sendKeys("Damian511");
			driver.findElement(By.name("password")).sendKeys("Damian5111");
			driver.findElement(By.name("btn-submit")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("user-logout")).click();
			Thread.sleep(2000);
			driver.quit();

			//TEST REJESTRACJI MKLR
//			driver.findElement(By.className("mmg-cmp-close")).click();
//			driver.findElement(By.id("m1")).click();
//			driver.findElement(By.linkText("Za³ó¿ konto")).click();
//			driver.findElement(By.id("username")).sendKeys("Damian511");
//			driver.findElement(By.id("email")).sendKeys("piotr06660@wp.pl");
//			driver.findElement(By.id("password")).sendKeys("Damian5111");
//			driver.findElement(By.id("password2")).sendKeys("Damian5111");
//			driver.findElement(By.id("accepts_rules")).click();
//			driver.findElement(By.id("rejestruj")).click();
			
			
			
			
			
		
		 } catch (Exception e) {
			
			e.printStackTrace();
		}
		 
	 }
	

	public static void main(String[] args) {
		
//		Test1 newObj = new Test1();
//		newObj.invokeBrowser();
		
		System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
		
	}

}
