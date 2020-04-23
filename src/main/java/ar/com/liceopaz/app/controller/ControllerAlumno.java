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

import ar.com.liceopaz.app.modelo.Alumno;
import ar.com.liceopaz.app.service.IServiceAlumno;
@RestController
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
	
	@RequestMapping("/alta-alumno")
	@PostMapping
	public String guardarAlumno(@RequestBody Map<String,String> body) {
		
		
		try {
			Alumno alumnoNuevo = new Alumno();
			alumnoNuevo.setNombre(body.get("nombre"));
			alumnoNuevo.setApellido(body.get("apellido"));
			alumnoNuevo.setDni(Integer.parseInt(body.get("dni")));
			alumnoNuevo.setMatricula(Integer.parseInt(body.get("matricula")));
			alumnoNuevo.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse(body.get("fecha")));
			this.serviceAlumno.guardarAlumno(alumnoNuevo);
			
		
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}
		
		
		
		
		return "Alumno cargada";
	}
	
	

}
