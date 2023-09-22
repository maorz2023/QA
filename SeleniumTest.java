package test;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.xml.datatype.Duration;
import javax.xml.datatype.DatatypeConstants.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("test");
		//WebDriverManager.chromedriver().setup();
		String path = System.getProperty("user.dir");
		String temp = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", temp); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//System.out.println("test2");
		driver.navigate().to("https://www.youngliving.com/us/en");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("dropdown-cutom")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsername")));
		WebElement element = driver.findElement(By.id("loginUsername"));
	
		element.click();
		element.clear();
		element.sendKeys("yodiv24937@cdeter.com");
		
		driver.findElement(By.id("continue-btn")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginPassword")));
		element = driver.findElement(By.id("loginPassword"));
		
		element.click();
		element.clear();
		element.sendKeys("Test@123");
		
		driver.findElement(By.id("login-btn")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchInput")));
		element = driver.findElement(By.id("searchInput"));

		element.click();
		element.clear();
		element.sendKeys("oil");
		element.sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("add-to-bag-button")));
		
		driver.findElement(By.className("add-to-bag-button")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("view-cart-button")));
		
		WebElement ele= driver.findElement(By.className("view-cart-button"));
		Thread.sleep(10000);
		ele.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gtm__modal-btn-close")));
		
		driver.findElement(By.id("gtm__modal-btn-close")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[data-testid='qa-cart-checkout']")));
		
		 element = driver.findElement(By.cssSelector("button[data-testid='qa-cart-checkout']")); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("referral-code-continue")));
		
		driver.findElement(By.className("referral-code-continue")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[data-testid='qa-confirm-yes']")));
		
		driver.findElement(By.cssSelector("button[data-testid='qa-confirm-yes']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cardFirstName")));
		
		driver.findElement(By.id("cardFirstName")).click();
		driver.findElement(By.id("cardFirstName")).clear();
		driver.findElement(By.id("cardFirstName")).sendKeys("Mike");
		
		driver.findElement(By.id("cardLastName")).click();
		driver.findElement(By.id("cardLastName")).clear();
		driver.findElement(By.id("cardLastName")).sendKeys("Mike");
		
		driver.findElement(By.id("cardNumber")).click();
		driver.findElement(By.id("cardNumber")).clear();
		driver.findElement(By.id("cardNumber")).sendKeys("4111111111111111");
		
		driver.findElement(By.id("expiryMonth")).click();
		driver.findElement(By.id("expiryMonth")).clear();
		driver.findElement(By.id("expiryMonth")).sendKeys("02");
		
		driver.findElement(By.id("expiryYear")).click();
		driver.findElement(By.id("expiryYear")).clear();
		driver.findElement(By.id("expiryYear")).sendKeys("2024");
		
		driver.findElement(By.id("cardCVV")).click();
		driver.findElement(By.id("cardCVV")).clear();
		driver.findElement(By.id("cardCVV")).sendKeys("123");
	}

}
