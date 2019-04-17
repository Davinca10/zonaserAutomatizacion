package zonaserAutomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class commands extends connections{

	String url = "https://portal.mutualser.org/ZONASER/";
	WebDriver driver;

	@BeforeTest
	public void connectionsURL() {
		super.connectionsSo();
		driver = super.driver();
		driver.get(url);

	}
	@AfterTest
	public void  close () {
		driver.close();
	}
	/**
	 * @Autor Cristian David Palomino 
	 * @param type 		= Recibe el tipo del localizador (id-xpath-name-....)
	 * @param locator 	= Recibe del enum (enumZonaser) el nombre del elemento.
	 * Metodo que genera un click sobre un elemento de la web 
	 */
	public void clickElement (String type, String locator ){

		if (type == "id") {
			driver.findElement(By.id(locator)).click();
		}else if (type == "xpath") {
			driver.findElement(By.xpath(locator)).click();
		}else if (type == "name") {
			driver.findElement(By.name(locator)).click();
		}else {
			System.out.println("El tipo ingresado no es soportado");
		}

	}
	/**
	 * @Cristian David Palomino Romero
	 * @param type		= Recibe el tipo del localizador (id-xpath-name-....)
	 * @param locator 	= Recibe del enum (enumZonaser) el nombre del elemento.
	 * @param message 	= Recibe el texto que se va escribir en el campo  
	 * Metodo que permite escribir en un campo de texto.
	 */
	public void writeText (String type,String locator,String message) {

		if (type == "id") {
			driver.findElement(By.id(locator)).clear();
			driver.findElement(By.id(locator)).sendKeys(message);
		}else if (type == "xpath") {
			driver.findElement(By.id(locator)).clear();
			driver.findElement(By.xpath(locator)).sendKeys(message);
		}else if (type == "name") {
			driver.findElement(By.id(locator)).clear();
			driver.findElement(By.name(locator)).sendKeys(message);
		}else {
			driver.findElement(By.id(locator)).clear();
			System.out.println("El tipo ingresado no es soportado");
		}
	}

}
