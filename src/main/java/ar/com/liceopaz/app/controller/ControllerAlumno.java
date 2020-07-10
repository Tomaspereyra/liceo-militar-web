package ar.com.liceopaz.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.liceopaz.app.modelo.Alumno;
import ar.com.liceopaz.app.service.IServiceAlumno;
import ar.com.liceopaz.app.util.RestResponse;
@RestController
@CrossOrigin(origins = "*")
public class ControllerAlumno {
	
	@Autowired
	@Qualifier("servicioAlumno")
	private IServiceAlumno serviceAlumno;
	
	/*
	 * "nombre","apellido","dni","nroMatricula","fecha"
	 * 
	 */
	@RequestMapping("/hola")
	public String hola() {
		return "hola";
	}
	
	
	@PostMapping("/alta-alumno")
	public RestResponse guardarAlumno(@RequestBody Map<String,String> body) {
		RestResponse response = new RestResponse ();
		
		try {
			Alumno alumnoNuevo = new Alumno();
			alumnoNuevo.setNombre(body.get("nombre"));
			alumnoNuevo.setApellido(body.get("apellido"));
			alumnoNuevo.setDni(Integer.parseInt(body.get("dni")));
			alumnoNuevo.setMatricula(Integer.parseInt(body.get("matricula")));
			alumnoNuevo.setFechaNacimiento(new SimpleDateFormat("yyyy-MM-dd").parse(body.get("fecha")));
			alumnoNuevo = this.serviceAlumno.guardarAlumno(alumnoNuevo);
			
			Map<String,Object> datos = new HashMap<>();
			datos.put("datos", alumnoNuevo);
			response.setCod(200);
			response.setDatos(datos);
			response.setMensaje("Alumno creado");
			
			
		
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			
			response.setCod(502);
			response.setDatos(null);
			response.setMensaje("Ocurrio un problema al guardar el alumno");
		
		}
		
		
		
		
		return response;
	}
	
	

}
