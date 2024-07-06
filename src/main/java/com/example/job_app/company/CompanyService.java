package com.example.job_app.company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();
    void addCompany(Company company);
    boolean updateCompany(Long id,Company company);
    Company getCompanyById(Long id);
    boolean deleteCompanyById(Long id);
}
