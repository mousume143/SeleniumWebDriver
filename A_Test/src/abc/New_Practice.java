package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class New_Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(8000);
		driver.quit();


	}

}
