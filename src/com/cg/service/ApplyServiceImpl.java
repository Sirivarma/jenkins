package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ApplyDao;
import com.cg.entities.Application;
import com.cg.entities.ProgramsScheduled;

@Service
@Transactional
public class ApplyServiceImpl implements ApplyService{

	@Autowired
	ApplyDao dao;
	public ApplyDao getDao() {
		return dao;
	}
	public void setDao(ApplyDao dao) {
		this.dao = dao;
	}
	@Override
	public List<ProgramsScheduled> getAllPrograms() {
		// TODO Auto-generated method stub
		return dao.getAllPrograms();
	}
	@Override
	public Application addApplicant(Application app) {
		// TODO Auto-generated method stub
		return dao.addApplicant(app);
	}
	/*@Override
	public Application getProgramId(int id) {
		// TODO Auto-generated method stub
		return dao.getProgramId(id);
	}
	*/
}
