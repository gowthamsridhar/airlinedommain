import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rj {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\AirLineDomain\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rj.com");
		driver.findElement(By.xpath("//input[@id='onlineBookingorigion_flexselect']")).sendKeys("Amman, Jordan, AMM");
		driver.findElement(By.id("onlineBookingdestination_flexselect")).sendKeys("Abu Dhabi, UAE, AUH");
		driver.findElement(By.xpath("(//button[@id='button'])[1]")).click();
	}

}
