package edu.mum.eroc.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.eroc.domain.Company;
import edu.mum.eroc.repository.IRocRepository;
import edu.mum.eroc.service.IRocService;
@Transactional
@Service
public class RocServiceImpl implements IRocService {
    @Autowired
    IRocRepository rocRepository;
	@Override
	public String checkRocNumber(String rocNumber) {
		return rocRepository.checkRocNumber(rocNumber);
	}
	@Override
	public Company save(Company company) {
		
		return rocRepository.save(company);
	}

}
