package JenkinIntegrationFlow1.JenkinIntegrationFlow1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {

		System.out.println("Execution started");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Program%20Files/Git/ReleaseNotes.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
