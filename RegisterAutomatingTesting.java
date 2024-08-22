package WebDriver.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAutomatingTesting {
	WebDriver driver;

	@Test
	public void Test1() throws InterruptedException {
		// for launch browser

		// Using Xpath Locator to find webElement
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		firstname.sendKeys("Asif");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Shaikh");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div[1]/textarea"))
				.sendKeys("BTM 2nd Stage Bangalore pin-560076");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[3]/div[1]/input"))
				.sendKeys("asif001@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div[1]/input")).sendKeys("1234567790");
		driver.findElement(By.xpath("//input[@value= 'Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();

		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='Dutch']")).click(); // Inner //a[text()='Dutch']//
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		driver.findElement(By.xpath("//label[text()='Skills']")).click();
		driver.findElement(By.id("Skills")).click();
		driver.findElement(By.xpath("//option[@value='Android']")).click();
		driver.findElement(By.id("countries")).click();

		driver.findElement(By.xpath("//option[text()='Select Country']")).click();
		try {

			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]"))));
			driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]")).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Exception catched : ");
		}

		driver.findElement(By.id("yearbox")).click();
		driver.findElement(By.xpath("//option[@value='1998']")).click();

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();
		driver.findElement(By.xpath("//option[@value='November']")).click();

		driver.findElement(By.id("daybox")).click();
		driver.findElement(By.xpath("//option[@value='11']")).click();

		driver.findElement(By.id("firstpassword")).sendKeys("Asif1234");
		driver.findElement(By.id("secondpassword")).sendKeys("Asif1234");

		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(3000);

	}

	@BeforeTest
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// For Maximize browser
		driver.manage().window().maximize();

	}

	@AfterTest
	public void after() {
		driver.quit();
	}

}
