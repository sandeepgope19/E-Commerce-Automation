package testBase;

import java.time.Duration;

import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j

public class BaseClass {

	public WebDriver driver;
	public Logger logger;
	
	
	@BeforeClass
	@Parameters({"os", "browser"})
	public void setup(String os, String br)
	
	{
	
		logger=LogManager.getLogger(this.getClass());//Log4j
		
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); 
		break;
		
		case "edge": driver=new EdgeDriver(); 
		break;
		
		default: System.out.println("No matching browser..");
		return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	

	public String randomString() {
		RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
		return generator.generate(5);
	}

	public String randomNumber() {
		RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('0', '9').build();
		return generator.generate(10);
	}

	public String randomAlphaNumeric() {
		RandomStringGenerator alphaGen = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
		RandomStringGenerator numGen = new RandomStringGenerator.Builder().withinRange('0', '9').build();
		return alphaGen.generate(3) + "@" + numGen.generate(3);
	}
}
