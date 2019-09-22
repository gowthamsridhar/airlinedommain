import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Juneyao {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\AirLineDomain\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://global.juneyaoair.com/");
	WebElement btn = driver.findElement(By.xpath("(//span[@class='el-radio__inner'])[2]"));
	btn.click();
	WebElement from = driver.findElement(By.xpath("(//input[@placeholder='From'])[1]"));
	from.sendKeys("SHANGHAI(SHA) , China(CN)");
	WebElement to = driver.findElement(By.xpath("(//input[@placeholder='To'])[1]"));
	to.sendKeys("BANGKOK(BKK) , Thailand(TH)");
	WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	date.sendKeys("2019-11-29");
	
	WebElement se = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	se.click(); 
	
	
	
	
	
	
	}

}
