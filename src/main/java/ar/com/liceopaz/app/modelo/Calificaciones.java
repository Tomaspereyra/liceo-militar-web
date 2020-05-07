package ar.com.liceopaz.app.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="calificaciones")
public class Calificaciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String alumno;
	private Integer dni;
	private Integer idcurso;
	private Integer calificaciones;
	
	public Calificaciones() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAlumno() {
		return alumno;
	}


	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public Integer getCalificaciones() {
		return calificaciones;
	}


	public void setCalificaciones(Integer calificaciones) {
		this.calificaciones = calificaciones;
	}

	public Integer getIdcurso() {
		return idcurso;
	}


	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}




	@Override
	public String toString() {
		return "Calificaciones [id=" + id + ", alumno=" + alumno + ", dni=" + dni + ", idcurso="
				+ idcurso + ", calificaciones=" + calificaciones + "]";
	}
	

}
