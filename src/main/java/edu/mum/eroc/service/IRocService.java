package edu.mum.eroc.service;

import edu.mum.eroc.domain.Company;

public interface IRocService {
String checkRocNumber(String rocNumber);
Company save(Company company);
}
