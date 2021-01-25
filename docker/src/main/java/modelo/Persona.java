package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1506137238836933115L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String genero;
	private int edad;
	

}
