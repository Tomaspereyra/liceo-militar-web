package ar.com.liceopaz.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.liceopaz.app.modelo.Alumno;
import ar.com.liceopaz.app.repository.IAlumnoRepository;
import ar.com.liceopaz.app.service.IServiceAlumno;
import ar.com.liceopaz.app.utils.RestResponse;

@Service("servicioAlumno")
public class ServiceAlumno implements IServiceAlumno {
	@Autowired
	private IAlumnoRepository alumnoRepository;
	
	@Autowired
	private RestResponse response;

	@Override
	public RestResponse guardarAlumno(Alumno alumno) {
		
		try{
			Alumno a = this.alumnoRepository.save(alumno);
			if(a!= null) {
				response.setCodigo("200");
				response.setMensaje("Alumno guardado");
				
				
			}
		}catch(Exception e) {
			response.setCodigo("500");
			response.setMensaje("Ocurrio un error");
			
		}
		
		
		return response;
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
