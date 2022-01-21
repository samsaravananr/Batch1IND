import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception 
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Customized FT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String vTitle=driver.getTitle();
		//System.out.println("The Title is :"+vTitle);
		
		
		if(vTitle.contains("Facebook"))
		{
			System.out.println("PASS: Title Verification");
		}
		
		else
		{
			System.out.println("FAIL: Title Verification");
		}
		
		String vCURL=driver.getCurrentUrl();
		System.out.println("The Current URL is : "+vCURL);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("samsaravananr");
		driver.findElement(By.name("pass")).sendKeys("12345");
		
        takeSnapShot(driver, "D://test.png") ;     

		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		

	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

	

}
