package ar.com.liceopaz.app.service;


import ar.com.liceopaz.app.modelo.Calificaciones;
import ar.com.liceopaz.app.utils.RestResponse;

public interface IServiceCalificaciones {
	
	public RestResponse obtenerCalificaciones(Calificaciones calificaciones);

	
}