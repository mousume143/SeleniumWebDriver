package abc;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Agilibo_LogIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://agilibo.com");
		 driver.findElement(By.xpath("//a[@class='nav-link btn js-scroll']")).click();
		 
		 driver.findElement(By.id("inputEmail")).sendKeys("shofiqul.alam@gmail.com");
			
		 driver.findElement(By.id("inputPassword")).sendKeys("1234");
		
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//button[@class='btn btn-primary px-4']")).click();

		 String actualString = driver.findElement(By.xpath("//div[contains(text(),'shofiqul.alam@gmail.com')]")).getText();
		 Assert.assertTrue(actualString.contains("shofiqul.alam@gmail.com"));
		Thread.sleep(8000);
		driver.quit();
		System.out.println("Email is "+actualString);

	}

}
