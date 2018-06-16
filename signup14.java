package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup14 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","E:\\Assignment#2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:82/library-master1/student_form.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
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
