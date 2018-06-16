package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","E:\\Assignment#2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:82/library-master1/contact_form.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys("");
		
		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("");
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("");
		
		driver.findElement(By.name("message")).clear();
		driver.findElement(By.name("message")).sendKeys(" ");
		
		
		driver.findElement(By.name("submit")).click();
		}

}
