package testing;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup4 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","E:\\Assignment#2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:82/library-master1/student_form.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("gg");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("q");
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("t");
		
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys(" e");
		
	
		driver.findElement(By.name("roll")).clear();
		driver.findElement(By.name("roll")).sendKeys("hj");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("anything' OR 'x'='x");
		
		driver.findElement(By.name("contact")).clear();
		driver.findElement(By.name("contact")).sendKeys("4444444");
		
		
		Select dropdown12 = new Select (driver.findElement(By.className("year_level")));
		 dropdown12.selectByVisibleText("cc");
		
		 Select dropdown1 = new Select (driver.findElement(By.className("type")));
		 dropdown1.selectByVisibleText("ee");
		
		 Select dropdown = new Select (driver.findElement(By.id("gi")));
		 dropdown.selectByVisibleText("qq");
		
		
		
		driver.findElement(By.name("submit")).click();
		}

}


