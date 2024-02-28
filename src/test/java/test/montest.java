package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class montest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver23.exe");
		  WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(634, 400));
		driver.get("https://www.selenium.dev/");
		//String titre = driver.getTitle();
		//System.out.println(titre);
		System.out.println(driver.getTitle());
		//String urlActuel = driver.getCurrentUrl();
		//System.out.println(urlActuel);
		
		//String codeSurceHtmlPage = driver.getPageSource();
		//System.out.println(codeSurceHtmlPage);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.cypress.io/");
		System.out.println(driver.getTitle());
		
		//driver.navigate().back();
		//System.out.println(driver.getTitle());
		
		//driver.navigate().forward();
		//System.out.println(driver.getTitle());
		
		driver.close();
		//driver.quit();

	}

}
