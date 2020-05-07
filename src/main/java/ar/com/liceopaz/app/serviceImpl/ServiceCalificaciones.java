package ar.com.liceopaz.app.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.liceopaz.app.modelo.Calificaciones;
import ar.com.liceopaz.app.repository.ICalificacionesRepository;
import ar.com.liceopaz.app.service.IServiceCalificaciones;
import ar.com.liceopaz.app.utils.RestResponse;

@Service("servicioCalificaciones")
public class ServiceCalificaciones implements IServiceCalificaciones {
	@Autowired
	private ICalificacionesRepository calificacionesRepository;
	
	
	@Autowired
	private RestResponse response;

	@Override
	public RestResponse obtenerCalificaciones(Calificaciones calificaciones) {
		
		try{
			Calificaciones c = this.calificacionesRepository.save(calificaciones);
			if(c!= null) {
				response.setCodigo("10");
				response.setMensaje("Calificaciones guardadas");
				
				
			}
		}catch(Exception e) {
			response.setCodigo("11");
			response.setMensaje("Ocurrio un error");
			
		}
		
		
		return response;
	}

	
}
