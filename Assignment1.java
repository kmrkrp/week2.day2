package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
	    // Maximize the window
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("kumar.testleaf@gmail.com");
	    driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("leaf@12");
	    driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	    System.out.println("Login Successfull");
	    String getTitle = driver.findElement(By.xpath("//a[@class = 'navbar-brand']")).getText();
	    System.out.println("Title of the Page: "+getTitle);
	    driver.findElement(By.xpath("//a[contains (text(),'Log Out')]")).click();	   
	    System.out.println("Clicking LogOut");
	    driver.close();
	}

}
