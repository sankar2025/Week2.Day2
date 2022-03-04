package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
		driver.findElement(By.xpath("(//ul[@class='wp-categories-list']//a)[4]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='row']//img)[2]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("(//div[@class='row']//img)[2]")).getAttribute("src"));
		driver.findElement(By.xpath("(//div[@class='row']//img)[3]")).sendKeys(Keys.ENTER);

	}

}
