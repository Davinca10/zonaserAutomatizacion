package zonaserAutomatizacion;

public enum enumZonaser {

	//Page Loggin

	L_REGISTRAR_USUARIO			("formLogin:j_idt25"),

	//Page register user

	RU_NIT_IPS 					("registrarUusario:j_idt37"),
	RU_BOTON_CONSULTAR			("registrarUusario:loginButtonR"),
	RU_NOMBRE_IPS				("registrarUusario:nombreIPS"),
	RU_MENSAJE_EMERGENTE			("registrarUusario:messages_container");




	private String locator;

	private enumZonaser ( String locator){
		this.locator = locator;
	}

	public String getLocator() {
		return locator;
	}

}
