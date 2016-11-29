package edu.mum.eroc.repository.Impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.eroc.domain.Company;
import edu.mum.eroc.repository.IRocRepository;
@Repository
public class RocRepositoryImpl implements IRocRepository {
	
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public String checkRocNumber(String rocNumber) {
		try
		{
		Query query = entitymanager.createQuery("select c from Company c  where c.regId=:regId");
		
		Company com=(Company)query.setParameter("regId", rocNumber).getSingleResult();	
		if(com==null)
		return "NO";
		else return "YES";
		}
		catch(NoResultException ex){
			return "NO";
		}
	}

	@Override
	public Company save(Company company) {
		entitymanager.persist(company);
		return company;
	}

}
