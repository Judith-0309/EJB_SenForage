package sn.forage.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.forage.entities.Client;

@Stateless
public class ClientDao  implements IClientLocal {
	
    @PersistenceContext(unitName="SenForage_UP")
    private EntityManager em;
	@Override
	public List<Client> liste() {
	
		return em.createQuery("SELECT c FROM  Client c").getResultList();
		
	}

	@Override
	public int add(Client client) {
	int ok = 0;	
	try {
//		em.getTransaction().begin();
		em.persist(client);
//		em.getTransaction().commit();
		ok= 1;
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		return ok;
	}

}
