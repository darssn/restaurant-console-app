package dev.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.entite.Plat;

@Repository

public class PlatDaoJpa implements IPlatDao{

	@PersistenceContext private EntityManager em;
	
	@Override
	public List<Plat> listerPlats() {
		
	return  em.createQuery("select p from Plat p",Plat.class).getResultList();
		
		
	}

	@Override
	@Transactional
	public void ajouterPlat(String nomPlat, Integer prixPlat) {
		
		em.persist(new Plat(nomPlat,prixPlat));
	
	}

}
