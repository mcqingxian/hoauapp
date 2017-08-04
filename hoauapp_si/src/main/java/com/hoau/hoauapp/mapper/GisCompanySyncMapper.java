package com.hoau.hoauapp.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.entity.CompanyEntity;
import com.hoau.hoauapp.entity.GisCompanyEntity;
@Repository
public interface GisCompanySyncMapper {


	void clearGisCompany();

	void saveGisCompany(List<GisCompanyEntity> companyEntitys);

}
