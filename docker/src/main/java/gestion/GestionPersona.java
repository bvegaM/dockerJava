package gestion;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.PersonaDAO;
import modelo.Persona;
import modelo.Respuesta;

@Stateless
public class GestionPersona implements GestionPersonaLocal{

	@Inject
	private PersonaDAO dao;
	
	@Override
	public Respuesta crearPersona(Persona persona) {
		Respuesta respuesta= new Respuesta();
		if(persona==null) {
			respuesta.setCodigo(-1);
			respuesta.setMensaje("Error al cear persona");
		}else {
			respuesta.setCodigo(1);
			respuesta.setMensaje("Persona creada correctamente");
			dao.insert(persona);
		}
		return respuesta;
	}

}
