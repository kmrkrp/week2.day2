package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	    // Maximize the window
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    System.out.println("Login successfull");
	    //driver.wait(60);
	    driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
	    //driver.wait(30);
	    //driver.notifyAll();
	    System.out.println("clicking CRMSFA");
	    driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    //driver.wait(30);
	    //driver.notifyAll();
	    System.out.println("clicking LEADS");
	    driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	    //driver.wait(30);
	    //driver.notifyAll();
	    System.out.println("clicking Create Lead");
	    //driver.findElement(By.xpath("//a[@id ='ext-gen858']")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DXC");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MADHAN RAJ");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KALIMUTHU");
	    driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
	    String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText().toString();
	    System.out.println("leadId: "+leadId);
	    driver.close();
	   

	}

}
