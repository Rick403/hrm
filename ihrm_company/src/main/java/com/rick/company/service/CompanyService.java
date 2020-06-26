package com.rick.company.service;

import com.rick.domain.company.Company;

import java.util.List;

public interface CompanyService {
    /**
     * 保存企业
     */
    public void saveCompany(Company company);
    /**
     * 更新企业
     */
    public Company updateCompany(Company company);
    /**
     * 删除企业
     */
    public void deleteCompany(String id);
    /**
     * 根据id查询企业
     */
    public Company findById(String id);
    /**
     * 查询企业列表
     */
    public List<Company> findAll();
}
