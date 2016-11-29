package edu.mum.eroc.repository;

import edu.mum.eroc.domain.Company;

public interface IRocRepository  {
	String checkRocNumber(String rocNumber);
	Company save(Company company);
}
