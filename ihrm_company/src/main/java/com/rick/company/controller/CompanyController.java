package com.rick.company.controller;

import com.rick.common.entity.Result;
import com.rick.common.entity.ResultCode;
import com.rick.company.service.CompanyService;
import com.rick.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("")
    public Result saveCompany(@RequestBody Company company) {
        companyService.saveCompany(company);
        return new Result(ResultCode.SUCCESS);
    }

    @GetMapping("/findAll")
    public Result findAll() {
        List<Company> companyList = companyService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(companyList);
        return result;
    }
}