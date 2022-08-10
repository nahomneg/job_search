package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Company;
import miu.edu.eaproject.persistence.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllApplications(){
        return companyRepository.findAll();
    }
}
