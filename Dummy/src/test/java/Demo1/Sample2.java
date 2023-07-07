package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Sample2{
	
	WebDriver driver;
	public void test() throws Throwable
	{
		/*System.out.println("hi");
		WebDriver driver=new ChromeDriver();
   driver.get("https://www.flipkart.com/");*/
   
   
   String BROWSER=System.getProperty("browser");
   String URL=System.getProperty("url");
	
	// driver;
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	
	else if(BROWSER.equalsIgnoreCase("edge"))
	{
		
		driver=new EdgeDriver();
	}
	
	else
	{
		driver=new ChromeDriver();
	}
	
	 driver.get(URL);  
}
}