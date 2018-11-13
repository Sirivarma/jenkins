package com.cg.service;

import java.util.List;

import com.cg.entities.Application;
import com.cg.entities.ProgramsScheduled;

public interface ApplyService {
	public List<ProgramsScheduled> getAllPrograms();
	public Application addApplicant(Application app);
	/*public Application getProgramId(int id);*/
}
