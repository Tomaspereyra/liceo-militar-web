package ar.com.liceopaz.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.liceopaz.app.modelo.Calificaciones;
import ar.com.liceopaz.app.service.IServiceCalificaciones;
import ar.com.liceopaz.app.utils.RestResponse;
@RestController
public class ControllerCalificaciones {
	
	@Autowired
	@Qualifier("servicioCalificaciones")
	private IServiceCalificaciones serviceCalificaciones;
	@Autowired
	private RestResponse response;
	
	/*
	 * "alumno","dni","idcurso","calificaciones"
	 * 
	 */	
	
	@RequestMapping("/alta-calificaciones")
	@PostMapping
	public RestResponse obtenerCalificaciones(@RequestBody Map<String,String> body) {
		
		
		try {
			Calificaciones calificacionesNueva = new Calificaciones();
			calificacionesNueva.setAlumno(body.get("alumno"));
			calificacionesNueva.setDni(Integer.parseInt(body.get("dni")));
			calificacionesNueva.idcurso(Integer.parseInt(body.get("idcurso")));
			response= this.serviceCalificaciones.obtenerCalificaciones(calificacionesNueva);
			
		
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}
		
		
		
		
		return response;
	}
	
	

}
