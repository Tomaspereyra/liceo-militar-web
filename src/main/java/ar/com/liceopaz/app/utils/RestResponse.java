package ar.com.liceopaz.app.utils;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class RestResponse {
	
	private String codigo;
	private String mensaje;
	private Map<String, ? extends Object> data;

	public RestResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Map<String, ? extends Object> getData() {
		return data;
	}

	public void setData(Map<String, ? extends Object> data) {
		this.data = data;
	}
	

}
