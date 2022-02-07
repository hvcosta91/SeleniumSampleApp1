import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.model.NavigationEntry;
import org.testng.Assert;


@DisplayName("Testando Sample APP")
public class SampleApp
{
	Services services = new Services();

	@Test
	@DisplayName("Enter Vehicle Data")
	public void testForm()
	{
		//abrir browser
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chrome\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();

		//maximizar
		navegador.manage().window().maximize();

		navegador.get("http://sampleapp.tricentis.com/101/app.php");


		//make
		// //*[@id="make"]
		navegador.findElement(By.id("make")).click();
		navegador.findElement(By.xpath("//*[@id=\"make\"]/option[@value='Audi']")).click();

		String title = navegador.getTitle();
		Assert.assertEquals("Enter Vehicle Data", title);

		//Model
		// //*[@id="model"]
		navegador.findElement(By.id("make")).click();
		navegador.findElement(By.xpath("//*[@id=\"model\"]/option[@value='Scooter']")).click();

		//Cylinder Capacity
		// //*[@id="cylindercapacity"]
		navegador.findElement(By.xpath("//*[@id=\"cylindercapacity\"]")).sendKeys(services.RandomNumber(1, 2000));



		//engine performance
		// //*[@id="engineperformance"]
		navegador.findElement(By.xpath("//*[@id=\"engineperformance\"]")).sendKeys(services.RandomNumber(1, 2000));

		//date of manufacture
		// //*[@id="dateofmanufacture"]

		//number of seats
		// //*[@id="numberofseats"]

		//fuel type
		// //*[@id="fuel"]


	}

}
