package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testadvacedsearchautthorempty {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","E:\\Assignment#2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:82/library-master1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("jahidd26");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123456");	
		
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[5]/a")).click();
		
		driver.findElement(By.name("title")).sendKeys("Science and Invention Encyclopedia");

		driver.findElement(By.name("author")).sendKeys("");
		String mytitle=driver.getTitle();
		System.out.println("the title is"+mytitle);
		String expectedtitle="Online Library System";
		if(mytitle.equals(expectedtitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("not pass");
		}
		}

}
