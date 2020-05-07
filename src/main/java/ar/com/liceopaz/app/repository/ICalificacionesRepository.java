package ar.com.liceopaz.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.com.liceopaz.app.modelo.Calificaciones;

public interface ICalificacionesRepository  extends JpaRepository<Calificaciones,Integer>{
	
	@Query("SELECT calificaciones from Calificaciones c WHERE c.calificaciones = ?1")
	public Calificaciones obtenerCalificaciones(Integer calificaciones);

}
