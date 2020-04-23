package ar.com.liceopaz.app.service;

import java.util.List;

import ar.com.liceopaz.app.modelo.Alumno;
import ar.com.liceopaz.app.utils.RestResponse;

public interface IServiceAlumno {
	
	public RestResponse guardarAlumno(Alumno alumno);
	
	public Alumno traerAlumnoPorID(Integer id);
	
	public List<Alumno> traerAlumnos();

}
