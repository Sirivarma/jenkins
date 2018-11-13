package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Application;

import com.cg.entities.ProgramsScheduled;

@Repository
public class ApplyDaoImpl implements ApplyDao {
	@PersistenceContext
	EntityManager manager;

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public List<ProgramsScheduled> getAllPrograms() {
		// TODO Auto-generated method stub
		String str="select obj from ProgramsScheduled obj";
		TypedQuery<ProgramsScheduled> query=manager.createQuery(str,ProgramsScheduled.class);
		List<ProgramsScheduled> list=query.getResultList();
		return list;
	
	}

	@Override
	public Application addApplicant(Application app) {
		// TODO Auto-generated method stub
		manager.persist(app);
		return app;
	}

	/*@Override
	public Application getProgramId(int id) {
		Application application=manager.find(Application.class, id);
		return application;
	}*/

	
	

}
