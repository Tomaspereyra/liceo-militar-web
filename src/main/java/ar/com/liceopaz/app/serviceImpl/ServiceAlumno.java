package ar.com.liceopaz.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.liceopaz.app.modelo.Alumno;
import ar.com.liceopaz.app.repository.IAlumnoRepository;
import ar.com.liceopaz.app.service.IServiceAlumno;

@Service("servicioAlumno")
public class ServiceAlumno implements IServiceAlumno {
	@Autowired
	private IAlumnoRepository alumnoRepository;

	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		Alumno a = this.alumnoRepository.save(alumno);		
		
		return a;
	}

	@Override
	public Alumno traerAlumnoPorID(Integer id) {
		Alumno a = this.alumnoRepository.getOne(id);
		return a;
	}

	@Override
	public List<Alumno> traerAlumnos() {
		return this.alumnoRepository.findAll();
	}

}
