package service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import gestion.GestionPersonaLocal;
import modelo.Persona;
import modelo.Respuesta;

@Path("/docker")
public class ServiceRest {
	
	@Inject
	private GestionPersonaLocal gpl;
	
	@POST
	@Path("/crear")
	@Consumes("application/json")
	@Produces("application/json")
	public Respuesta crearPersona(Persona persona) {
		System.out.println(persona);
		Respuesta respuesta = this.gpl.crearPersona(persona);
		return respuesta;
	}

}
