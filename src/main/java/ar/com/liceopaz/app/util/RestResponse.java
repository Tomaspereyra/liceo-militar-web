package ar.com.liceopaz.app.util;

import java.util.Map;

public class RestResponse {
	
	private Integer cod;
	private String mensaje;
	private Map<String,Object> datos;
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Map<String, Object> getDatos() {
		return datos;
	}
	public void setDatos(Map<String, Object> datos) {
		this.datos = datos;
	}
	
	
	

}
