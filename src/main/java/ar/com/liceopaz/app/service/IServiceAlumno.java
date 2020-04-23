package ar.com.liceopaz.app.service;

import java.util.List;

import ar.com.liceopaz.app.modelo.Alumno;

public interface IServiceAlumno {
	
	public Alumno guardarAlumno(Alumno alumno);
	
	public Alumno traerAlumnoPorID(Integer id);
	
	public List<Alumno> traerAlumnos();

}
