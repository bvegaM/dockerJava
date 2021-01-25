package dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import modelo.Persona;

@Stateless
public class PersonaDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Persona persona){
		this.em.persist(persona);
	}

}
