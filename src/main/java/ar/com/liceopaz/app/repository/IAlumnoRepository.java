package ar.com.liceopaz.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.com.liceopaz.app.modelo.Alumno;

public interface IAlumnoRepository  extends JpaRepository<Alumno,Integer>{
	
	@Query("SELECT nombre from Alumno a WHERE a.nombre = ?1")
	public Alumno traerAlumnoPorNombre(String nombre);

}
