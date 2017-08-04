package com.hoau.hoauapp.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.entity.CompanyEntity;
@Repository
public interface CompanySyncMapper {


	void clearCompany();

	void saveCompany(List<CompanyEntity> companyEntitys);

}
