package gestion;

import javax.ejb.Local;

import modelo.Persona;
import modelo.Respuesta;

@Local
public interface GestionPersonaLocal {

	public Respuesta crearPersona(Persona p);
}
