package test;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ExoTP {
	WebDriver driver;
	public int i=0;
	public ExoTP() {
		System.setProperty("webdriver.chrome.driver", "/home/etud/pipetit1/LICENCE/qualite/TP6/chromedriver");
		driver = new ChromeDriver();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void test() {
		this.driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("pp8");
        element.submit();
        
        System.out.println("Titre : " + driver.getTitle());
        
        long end = System.currentTimeMillis() + 5000;
        
        while (System.currentTimeMillis() < end) {
          List<WebElement> element2 = driver.findElements(By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a"));
          element2.forEach((lien)-> {
        	lien.sendKeys(Keys.CONTROL +"t");
        	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	     // Now you can do whatever you need to do with it, for example copy somewhere
    	     try {
    	    	 System.out.println("screen sa mere");
    	    	 FileUtils.copyFile(scrFile, new File("screenshot"+i+".png"));
    	    } catch (IOException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    }
    	     i++;
          });
          
          
          
          System.out.println(driver.getCurrentUrl());
        }
        
        //driver.quit();
	}
	public void screen() {
		
	}
}