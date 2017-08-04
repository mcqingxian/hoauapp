package com.hoau.hoauapp.business;

import java.util.List;

import com.hoau.hoauapp.vo.CompanyVo;

public interface INearDeptsService {

	List<CompanyVo> queryNearDeptsByLnglat(double lng, double lat);

}
