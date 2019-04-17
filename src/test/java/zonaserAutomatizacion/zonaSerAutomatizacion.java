
package zonaserAutomatizacion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import junit.framework.Assert;



public class zonaSerAutomatizacion extends commands {


	/**
	 * @throws InterruptedException 
	 * @Autor Cristian David Palomino Romero
	 * 
	 * Este test valida que al ingresar un numero en el campo Nit IPS,  el campo IPS genere el nombre de la IPS.
	 */
	@Test(description = "testNombreIps")
	public void nombreIps() throws InterruptedException  {
		try {
			clickElement("id", enumZonaser.L_REGISTRAR_USUARIO.getLocator());
			Thread.sleep(300);
			writeText("name", enumZonaser.RU_NIT_IPS.getLocator(),"891800857");
			clickElement("id",enumZonaser.RU_BOTON_CONSULTAR.getLocator());
			Thread.sleep(300);
			String nameIps = driver.findElement(By.id(enumZonaser.RU_NOMBRE_IPS.getLocator())).getText();
			Assert.assertEquals("ESE HOSPITAL BAUDILIO ACERO", nameIps);
		} catch (Exception e) {
			System.err.println("*****INFOMACION DEL FALLO *******:"+ e );
		}	
	}
	/**
	 * @throws InterruptedException 
	 * @Autor Cristian David Palomino Romero
	 * 
	 * Este test valida que al dar click en el boton consulta se genere un mensaje de error .
	 */
	@Test(description = "testConsultaVacia")
	public void consultaVacia() throws InterruptedException  {
		try {
			clickElement("id", enumZonaser.L_REGISTRAR_USUARIO.getLocator());
			Thread.sleep(300);
			clickElement("id",enumZonaser.RU_BOTON_CONSULTAR.getLocator());
			Thread.sleep(300);
			String massage = driver.findElement(By.id(enumZonaser.RU_MENSAJE_EMERGENTE.getLocator())).getText();
			Assert.assertEquals("Registrar Usuario\nCampo Nit esta vacío, favor diligenciar información", massage);
		} catch (Exception e) {
			System.err.println("*****INFOMACION DEL FALLO *******:"+ e );
		}	
	}

}


