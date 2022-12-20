package mobieworldsignup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


	public class siggnup {
		@Test(dataProvider="credentials")
		public void verifyLogincredentials(String scenario,String firstname, String lastname,String mail, String Password,String mobilenumber, String shortbio,String dob )
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\deekshith.ks\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://qualicoach.org/mwapp/signup.html");
            
            
            
            
            
			driver.findElement(By.id("myName")).sendKeys(firstname);
			driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[1]/div[3]/input")).sendKeys(lastname);
			driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[2]/div[2]/input[1]")).sendKeys(mail);
			driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[2]/div[2]/input[2]")).sendKeys(Password);
			driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[4]/div[2]/input")).sendKeys(mobilenumber);
			driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[5]/div[2]/textarea")).sendKeys(shortbio);
			driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[3]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[2]/input")).sendKeys(dob);
		    driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[6]/div[3]/button")).click();
	
			
			
			
		}
			@DataProvider(name="credentials")
			public Object[][] getdata()  {
				return new Object[][]
		{
				{"bothcorrect","deekshith","gowda","Deekshith@24","errrrrrrr","73874845885","hii my name is deekshith","04/24/200"},
				
				{"bothcorrect","dhanush","gowda","Deekshith@24","errrrrrrr","73874845885","hii my name is dhanush","04/24/200"},
				

			};
			}
			}
		
	
