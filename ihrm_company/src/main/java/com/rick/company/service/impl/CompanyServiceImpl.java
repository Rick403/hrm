package com.rick.company.service.impl;

import com.rick.common.utils.IdWorker;
import com.rick.company.dao.CompanyDao;
import com.rick.company.service.CompanyService;
import com.rick.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private IdWorker idWorker;

    @Override
    public void saveCompany(Company company) {
        String id = idWorker.nextId() +"";
        company.setId(id);
        company.setName(company.getName());
        company.setManagerId(company.getManagerId());
        company.setVersion(company.getVersion());
        company.setCreateTime(new Date());
        company.setState(0); //启用
        company.setAuditState("0"); //待审核
        company.setBalance(company.getBalance());
        company.setCompanyArea(company.getCompanyArea());
        company.setManagerId(company.getManagerId());
        companyDao.save(company);
    }

    @Override
    public Company updateCompany(Company company) {
         return companyDao.save(company);
    }

    @Override
    public void deleteCompany(String id) {
        companyDao.deleteById(id);
    }

    @Override
    public Company findById(String id) {
        return companyDao.findById(id).get();
    }

    @Override
    public List<Company> findAll() {
        return companyDao.findAll();
    }
}
