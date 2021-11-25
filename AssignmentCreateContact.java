package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCreateContact {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver=new EdgeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
		
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Create Contact")).click();

			driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Akilan");
			driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("J");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();

			String title=driver.getTitle();
			System.out.println("The title = " +title);

			String fname=driver.findElement(By.xpath("//span[@id='viewContact_firstName_sp']")).getText();
			System.out.println("The First name is = "  +fname);

			Thread.sleep(10000);
			driver.close();
		
	}
}
