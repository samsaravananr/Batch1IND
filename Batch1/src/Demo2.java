import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		Scanner sc=new Scanner(System.in);
		String vBrowser=sc.nextLine();
		//System.out.println(vBrowser);
		
		
		if(vBrowser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Customized FT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String vTitle=driver.getTitle();
		System.out.println("The Title is :"+vTitle);
		Thread.sleep(5000);
		driver.close();
		}
		else if(vBrowser.equalsIgnoreCase("Firefox"))
		{
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Customized FT\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			String vTitle=driver.getTitle();
			System.out.println("The Title is :"+vTitle);
			Thread.sleep(5000);
			driver.close();
			
			
		}
		
		else
		{
			System.out.println("Invalid Browser Type");
		}
		

	}

}
