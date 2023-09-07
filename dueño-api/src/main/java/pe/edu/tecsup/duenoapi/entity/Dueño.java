package pe.edu.tecsup.duenoapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dueño")
public class Dueño {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	
	
	private Integer edad;
	
	private String direccion;
	
	private Integer numcontacto;
	
	
	

	public Dueño() {
		super();
	}

	public Dueño(String nombre, Integer edad, String direccion, Integer numcontacto) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.numcontacto = numcontacto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumcontacto() {
		return numcontacto;
	}

	public void setNumcontacto(Integer numcontacto) {
		this.numcontacto = numcontacto;
	}

	
}
