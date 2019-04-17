package zonaserAutomatizacion;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Connections {


	protected  void  connectionsSo () {
		/**
		 * Valida desde que sistema operativo se esta ejecutando la prueba
		 * y determina que driver debe cargar 
		 */

		String so = System.getProperty("os.name").toLowerCase();
		if (so.contains("mac")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver");
		}else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
		}
	}


	protected WebDriver driver(){
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}

