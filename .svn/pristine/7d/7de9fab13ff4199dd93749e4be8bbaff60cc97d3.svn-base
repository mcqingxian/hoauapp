package com.hoau.hoauapp.business;

import java.util.List;
import com.hoau.hoauapp.vo.AccountBankInfoVo;
import com.hoau.hoauapp.vo.ClaimInfoVo;

public interface IClaimService {
	public void addClaim(ClaimInfoVo claimInfoVo);
	
	public void updateClaim(ClaimInfoVo claimInfoVo);
	
	public void checkMobile(String billNo,String billTel,String cityName);
	
	public ClaimInfoVo queryClaimByBillCode(String billNo,String userId);
	
	public List<ClaimInfoVo> queryClaimsByUser(String userId);
	
	public void confirmApplyMoney(String claimsNo);
	
	/**根据关键字查询开户行信息**/
	public List<AccountBankInfoVo> queryBankInfo(String bankKey);
}
