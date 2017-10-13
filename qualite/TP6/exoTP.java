package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class exoTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				// Création d'une nouvelle instance du driver de firefox
		       	WebDriver driver;
					System.setProperty("webdriver.gecko.driver", "chemin ou est le driver/geckodriver");
					driver =new FirefoxDriver();

		        // visite de Google
		        driver.get("http://www.google.com");
		        // Alternatively the same thing can be done like this
		        // driver.navigate().to("http://www.google.com");

		        // Recherche d'un élément ici par son nom,
		        //peut être fait par son id, par sa classe, par css, par xpath
		        WebElement element = driver.findElement(By.name("q"));

		        // On rentre le texte suivant dans l'élément Web
		        element.sendKeys("Sébastien Salva");

		     // On sibmit le formulaire, Webriver le recherche pour vous 
		        element.submit();
		        
		     // on affiche le titre de la page
		        System.out.println("Titre : " + driver.getTitle());
		        
		        
		        // Attente de chargement, timeout après 10 seconds
		        long end = System.currentTimeMillis() + 5000;
		        while (System.currentTimeMillis() < end) {
		            
		        }

		        
		        System.out.println("2eme titre: " + driver.getTitle());
		        
		        //Fermeture de Firefox
		        driver.quit();
	}

}
