package sn.forage.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.forage.entities.Village;

@Stateless
public class VillageDao implements IVillageLocal {
	
	 @PersistenceContext(unitName="SenForage_UP")
	    private EntityManager em;

	@Override
	public List<Village> liste() {
		return em.createQuery("SELECT v FROM  Village v").getResultList();
		
	}

	@Override
	public int add(Village village) {
		int ok = 0;	
		try {
//			em.getTransaction().begin();
			em.persist(village);
//			em.getTransaction().commit();
			ok= 1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			return ok;
		}
		
		
	}


