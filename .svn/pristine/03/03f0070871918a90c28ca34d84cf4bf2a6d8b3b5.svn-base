package com.hoau.hoauapp.business.impl;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import com.hoau.hoauapp.business.IClaimService;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.exception.BusinessException;
import com.hoau.hoauapp.si.bank.AccountBankInfo;
import com.hoau.hoauapp.si.claim.ClaimsAttachmentInfo;
import com.hoau.hoauapp.si.claim.ClaimsInfo;
import com.hoau.hoauapp.si.claim.ClaimsTrack;
import com.hoau.hoauapp.si.claim.QueryClaimsDetail;
import com.hoau.hoauapp.si.claim.QueryClaimsInfo;
import com.hoau.hoauapp.si.claim.QueryCorpResult;
import com.hoau.hoauapp.si.claim.ReqClaimsObject;
import com.hoau.hoauapp.si.claim.ResponseClaimsObject;
import com.hoau.hoauapp.si.claim.ResponseQueryClaims;
import com.hoau.hoauapp.si.claim.ResponseQueryFiles;
import com.hoau.hoauapp.util.AccountInfoServiceFactory;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.ClaimServiceFactory;
import com.hoau.hoauapp.util.DateTimeUtil;
import com.hoau.hoauapp.util.FileUtil;
import com.hoau.hoauapp.util.serverfile.DocConnector;
import com.hoau.hoauapp.util.serverfile.DocPic;
import com.hoau.hoauapp.util.serverfile.DocPicture;
import com.hoau.hoauapp.util.serverfile.DocPictureManager;
import com.hoau.hoauapp.vo.AccountBankInfoVo;
import com.hoau.hoauapp.vo.ClaimInfoVo;
import com.hoau.hoauapp.vo.ClaimTraceInfo;
import net.sf.json.JSONObject;

@Service
public class ClaimService implements IClaimService {
	public static final Log log = LogFactory.getLog(ClaimService.class);
	public void addClaim(ClaimInfoVo claimInfoVo) {
		ClaimsInfo claimsInfo = new ClaimsInfo();
		//将运单号中的所有小写字母转换为大写，田育林，2016-05-23
		claimsInfo.setBillNo(claimInfoVo.getWaybillNo().toUpperCase());
		claimsInfo.setAccidentType(claimInfoVo.getAccidentType());
		/**设置银行卡图片，田育林，2016-06-07**/
		List<byte[]> bcfs = new ArrayList<byte[]>();
		bcfs.add(claimInfoVo.getBankCardFiles());
		claimsInfo.setBankCardPicFiles(bcfs);
		/**-------------------------**/
		claimsInfo.setBillTel(claimInfoVo.getWaybillPhone());
		/**设置到货签收凭证图片，田育林，2016-06-07**/
		List<byte[]> crfs = new ArrayList<byte[]>();
		crfs.add(claimInfoVo.getCargoReceiptFiles());
		claimsInfo.setCargoReceiptPicFiles(crfs);
		/**-----------------------------**/
		claimsInfo.setCargoType(claimInfoVo.getCargoName());
		//校验理赔金额在(0,3000]范围内，田育林，2016-05-23
		if(claimInfoVo.getApplyMoney()>3000 || claimInfoVo.getApplyMoney()<=0){
			throw new BusinessException("理赔申请金额必须在3000元及以下");
		}
		claimsInfo.setClaimsAmount(new BigDecimal(claimInfoVo.getApplyMoney()));
		claimsInfo.setClaimsOwner(claimInfoVo.getClaimApplicant());
		claimsInfo.setContactName(claimInfoVo.getContactName());
		claimsInfo.setContactTel(claimInfoVo.getContactPhone());
		claimsInfo.setCreateBy(claimInfoVo.getUserId());
		claimsInfo.setExceptionCount((long) claimInfoVo.getExceptionPieces());
		/**设置身份证图片，田育林，2016-06-07**/
		List<byte[]> icfs = new ArrayList<byte[]>();
		icfs.add(claimInfoVo.getIdentificationCardFiles());
		claimsInfo.setIdentificationCardPicFiles(icfs);
		/**--------------------------**/
		/**设置发票图片，田育林，2016-06-07**/
		List<byte[]> ifs = new ArrayList<byte[]>();
		ifs.add(claimInfoVo.getInvoiceFiles());
		claimsInfo.setInvoicePicFiles(ifs);
		/**------------------------**/
		String cityName = claimInfoVo.getClaimCity()==null ? "" : claimInfoVo.getClaimCity();
		claimsInfo.setPayeeName(cityName);
		//校验理赔申请原因不能超过200个字，田育林，2016-05-23
		if(claimInfoVo.getClaimReason().length()>200){
			throw new BusinessException("申请原因描述不能超过200个字");
		}
		claimsInfo.setReason(claimInfoVo.getClaimReason());
		/**
		 * 设置渠道为app
		 * add
		 * huyuzhou 2015-01015
		 */
		claimsInfo.setChannel(AppUtil.CLAIM_CHANNEL_APP);
		/**
		 * end
		 */
		/**设置货损图片，田育林，2016-06-07**/
		List<byte[]> dfs = new ArrayList<byte[]>();
		dfs.add(claimInfoVo.getGoodsBadFiles());
		claimsInfo.setDamagePicFiles(dfs);
		/**------------------------**/
		/**设置索赔函或授权书图片，田育林，2016-06-07**/
		List<byte[]> clfs = new ArrayList<byte[]>();
		clfs.add(claimInfoVo.getClaimLetterFiles());
		claimsInfo.setClaimOrderPicFiles(clfs);
		/**------------------------**/
		claimsInfo.setShippingOrderPicFiles(new ArrayList<byte[]>());//设置理赔单
		/**设置开户行信息，田育林，2016-06-07**/
		claimsInfo.setBankAccount(claimInfoVo.getBankAccount()); //开户行账号
		claimsInfo.setBankAccountName(claimInfoVo.getBankAccountName()); //开户名
		claimsInfo.setBankProvince(claimInfoVo.getBankProvince()); //开户行省份
		claimsInfo.setBankCity(claimInfoVo.getBankCity()); //开户行市县
		claimsInfo.setBankName(claimInfoVo.getBankName()); //开户行名称
		/**--------------------------**/
		
		log.info("新增理赔信息："+JSONObject.fromObject(claimsInfo).toString());
		ResponseClaimsObject res = ClaimServiceFactory.getClaimsWSService().uploadClaims(claimsInfo);
		if (!res.isSuccess()) {
			throw new BusinessException(res.getErrorMessage());
		}
	}

	public void updateClaim(ClaimInfoVo claimInfoVo) {
		ClaimsInfo claimsInfo = new ClaimsInfo();
		// 更新理赔单需要添加理赔单号参数
		claimsInfo.setClaimsNo(claimInfoVo.getClaimNo());
		claimsInfo.setClaimsId(Long.valueOf(claimInfoVo.getClaimId()));
		claimsInfo.setAccidentType(claimInfoVo.getAccidentType());
		/**设置银行卡图片，田育林，2016-06-07**/
		List<byte[]> bcfs = new ArrayList<byte[]>();
		bcfs.add(claimInfoVo.getBankCardFiles());
		claimsInfo.setBankCardPicFiles(bcfs);
		/**-------------------------**/
		//将运单号中的所有小写字母转换为大写，田育林，2016-05-23
		claimsInfo.setBillNo(claimInfoVo.getWaybillNo().toUpperCase());
		claimsInfo.setBillTel(claimInfoVo.getWaybillPhone());
		/**设置到货签收凭证图片，田育林，2016-06-07**/
		List<byte[]> crfs = new ArrayList<byte[]>();
		crfs.add(claimInfoVo.getCargoReceiptFiles());
		claimsInfo.setCargoReceiptPicFiles(crfs);
		/**-----------------------------**/
		claimsInfo.setCargoType(claimInfoVo.getCargoName());
		//校验理赔金额在(0,3000]范围内，田育林，2016-05-23
		if(claimInfoVo.getApplyMoney()>3000 || claimInfoVo.getApplyMoney()<=0){
			throw new BusinessException("理赔申请金额必须在3000以下");
		}
		claimsInfo.setClaimsAmount(new BigDecimal(claimInfoVo.getApplyMoney()));
		claimsInfo.setClaimsOwner(claimInfoVo.getClaimApplicant());
		claimsInfo.setContactName(claimInfoVo.getContactName());
		claimsInfo.setContactTel(claimInfoVo.getContactPhone());
		claimsInfo.setCreateBy(claimInfoVo.getUserId());
		claimsInfo.setExceptionCount((long) claimInfoVo.getExceptionPieces());
		/**设置身份证图片，田育林，2016-06-07**/
		List<byte[]> icfs = new ArrayList<byte[]>();
		icfs.add(claimInfoVo.getIdentificationCardFiles());
		claimsInfo.setIdentificationCardPicFiles(icfs);
		/**--------------------------**/
		/**设置发票图片，田育林，2016-06-07**/
		List<byte[]> ifs = new ArrayList<byte[]>();
		ifs.add(claimInfoVo.getInvoiceFiles());
		claimsInfo.setInvoicePicFiles(ifs);
		/**------------------------**/
		claimsInfo.setPayeeName(claimInfoVo.getClaimCity());
		//校验理赔申请原因不能超过200个字，田育林，2016-05-23
		if(claimInfoVo.getClaimReason().length()>200){
			throw new BusinessException("申请原因描述不能超过200个字");
		}
		claimsInfo.setReason(claimInfoVo.getClaimReason());
		/**
		 * 设置渠道为app
		 * add
		 * huyuzhou 2015-01015
		 */
		claimsInfo.setChannel(AppUtil.CLAIM_CHANNEL_APP);
		/**
		 * end
		 */
		/**设置货损图片，田育林，2016-06-07**/
		List<byte[]> dfs = new ArrayList<byte[]>();
		dfs.add(claimInfoVo.getGoodsBadFiles());
		claimsInfo.setDamagePicFiles(dfs);
		/**------------------------**/
		/**设置索赔函或授权书图片，田育林，2016-06-07**/
		List<byte[]> clfs = new ArrayList<byte[]>();
		clfs.add(claimInfoVo.getClaimLetterFiles());
		claimsInfo.setClaimOrderPicFiles(clfs);
		/**-------------------------------**/
		claimsInfo.setShippingOrderPicFiles(new ArrayList<byte[]>());//设置理赔单
		/**设置开户行信息，田育林，2016-06-07**/
		claimsInfo.setBankAccount(claimInfoVo.getBankAccount()); //开户行账号
		claimsInfo.setBankAccountName(claimInfoVo.getBankAccountName()); //开户名
		claimsInfo.setBankProvince(claimInfoVo.getBankProvince()); //开户行省份
		claimsInfo.setBankCity(claimInfoVo.getBankCity()); //开户行市县
		claimsInfo.setBankName(claimInfoVo.getBankName()); //开户行名称
		/**--------------------------**/
		
		log.info("修改理赔信息："+JSONObject.fromObject(claimsInfo).toString());
		ResponseClaimsObject res = ClaimServiceFactory.getClaimsWSService().uploadClaims(claimsInfo);
		if (!res.isSuccess()) {
			throw new BusinessException(res.getErrorMessage());
		}
	}

	public List<ClaimInfoVo> queryClaimsByUser(String userId) {
		ResponseQueryClaims res = ClaimServiceFactory.getClaimsWSService().getClaims(userId);
		List<ClaimInfoVo> claimInfos = new ArrayList<ClaimInfoVo>();
		if (res.isSuccess()) {
			List<QueryClaimsInfo> queryClaimsInfos = res.getQueryClaimsInfos();
			for (QueryClaimsInfo queryClaimsInfo : queryClaimsInfos) {
				ClaimInfoVo claimInfo = new ClaimInfoVo();
				claimInfo.setWaybillNo(queryClaimsInfo.getBillNo());
				claimInfo.setApplyMoney(queryClaimsInfo.getClaimsAmount());
				claimInfo.setClaimNo(queryClaimsInfo.getClaimsNo());
				claimInfo.setClaimApplicant(queryClaimsInfo.getClaimsOwner());
				claimInfo.setStatus(queryClaimsInfo.getDcEventDesc());
				List<ClaimTraceInfo> traceInfos = new ArrayList<ClaimTraceInfo>();
				for (ClaimsTrack claimsTrack : queryClaimsInfo.getClaimsTrackList()) {
					ClaimTraceInfo claimTraceInfo = new ClaimTraceInfo();
					claimTraceInfo.setOperateTime(claimsTrack.getOprDay() + " " + claimsTrack.getOprTime());
					claimTraceInfo.setTraceInfo(claimsTrack.getOprRemark());
					claimTraceInfo.setStatus(claimsTrack.getOprTypeDesc());
					traceInfos.add(claimTraceInfo);
				}
				if (traceInfos.size() > 0) {
					Collections.sort(traceInfos, Collections.reverseOrder(new Comparator<ClaimTraceInfo>() {
						public int compare(ClaimTraceInfo o1, ClaimTraceInfo o2) {
							return o1.getOperateTime().compareTo(o2.getOperateTime());
						}
					}));
					traceInfos.get(0).setNewStatus(true);
				}

				claimInfo.setTraceInfos(traceInfos);
				claimInfo.setShowConfrimBtn(queryClaimsInfo.isShowConfirmBtn());
				claimInfo.setShowModifyBtn(queryClaimsInfo.isShowmodifyBtn());
				claimInfo.setCreateTime(DateTimeUtil.formatDate(new Date(queryClaimsInfo.getCreateTime()), "yyyy-MM-dd HH:mm:ss"));
				/**设置开户行信息，田育林，2016-06-07**/
				claimInfo.setBankAccount(queryClaimsInfo.getBankAccount());
				claimInfo.setBankAccountName(queryClaimsInfo.getBankAccountName());
				claimInfo.setBankProvince(queryClaimsInfo.getBankProvince());
				claimInfo.setBankCity(queryClaimsInfo.getBankCity());
				claimInfo.setBankName(queryClaimsInfo.getBankName());
				/**--------------------------**/
				claimInfos.add(claimInfo);
			}
		} else {
			throw new BusinessException(res.getErrorMessage());
		}
		return claimInfos;
	}

	/*public static void main(String[] args) {
		List<ClaimTraceInfo> traceInfos = new ArrayList<ClaimTraceInfo>();
		ClaimTraceInfo claimTraceInfo = new ClaimTraceInfo();
		claimTraceInfo.setOperateTime("2015-05-07 11:00:00");
		traceInfos.add(claimTraceInfo);
		ClaimTraceInfo claimTraceInfo1 = new ClaimTraceInfo();
		claimTraceInfo1.setOperateTime("2015-05-07 12:00:00");
		traceInfos.add(claimTraceInfo1);
		ClaimTraceInfo claimTraceInfo2 = new ClaimTraceInfo();
		claimTraceInfo2.setOperateTime("2015-05-07 13:00:00");
		traceInfos.add(claimTraceInfo2);
		Collections.sort(traceInfos, Collections
				.reverseOrder(new Comparator<ClaimTraceInfo>() {
					public int compare(ClaimTraceInfo o1,
							ClaimTraceInfo o2) {
						return o1.getOperateTime().compareTo(
								o2.getOperateTime());
					}
				}));
		System.out.println(traceInfos);
	}*/

	//增加cityName参数，可以同时校验理赔公司在地是否输入正确，田育林，2016-06-24
	public void checkMobile(String billNo, String billTel, String cityName) {
		billNo = billNo.toUpperCase();
		ReqClaimsObject reqClaimsObject = new ReqClaimsObject();
		//将运单号中的小写字母转换为大写，田育林，2016-06-13
		reqClaimsObject.setBillNo(billNo);
		reqClaimsObject.setBillTel(billTel);
		ResponseClaimsObject res = ClaimServiceFactory.getClaimsWSService().queryCheck(reqClaimsObject);
		if (!res.isSuccess()) {
			throw new BusinessException(res.getErrorMessage());
		}
		if(cityName!=null && !"".equals(cityName)){
			String requestMsg = checkClaimCity(cityName, billNo, billTel);
			if(!"success".equals(requestMsg)){
				throw new BusinessException(requestMsg);
			}
		}
	}

	public ClaimInfoVo queryClaimByBillCode(String billNo, String userId) {
		ResponseQueryFiles res = ClaimServiceFactory.getClaimsWSService().findByClaims(null, billNo);
		if (res.isSuccess()) {
			QueryClaimsDetail queryClaimsDetial = res.getQueryClaimsDetail();
			QueryClaimsInfo queryClaimsInfo = res.getQueryClaimsInfo();
			ClaimInfoVo claimInfoVo = new ClaimInfoVo();
			claimInfoVo.setWaybillNo(queryClaimsDetial.getBillNo());
			claimInfoVo.setClaimApplicant(queryClaimsDetial.getPayeeName());
			claimInfoVo.setClaimNo(queryClaimsDetial.getClaimsNo());
			claimInfoVo.setClaimId(String.valueOf(queryClaimsInfo.getClaimsId()));
			claimInfoVo.setClaimApplicant(queryClaimsDetial.getPayeeName());
			/**-----从图片服务器取出图片缓存在本地，田育林，2016-06-20-----**/
			if(queryClaimsInfo.getIdentificationCardPicFiles()!=null){
				String icpfUrl = DocConnector.picdir + File.separator + queryClaimsInfo.getClaimsNo() + "/id.jpg";
				if(!(new File(icpfUrl).exists())){
					byte[] icpf = getPicToService(queryClaimsInfo.getIdentificationCardPicFiles());
					if(icpf!=null){
						FileUtil.saveByteArrayToFile(icpfUrl, icpf);
					}
				}
				claimInfoVo.setIdentificationCardUrl(PropertyConstant.RESOURCES_URL + "claim/" + queryClaimsInfo.getClaimsNo() + "/id.jpg");
			}
			if(queryClaimsInfo.getBankCardPicFiles()!=null){
				String bcpfUrl = DocConnector.picdir + File.separator + queryClaimsInfo.getClaimsNo() + "/bank.jpg";
				if(!(new File(bcpfUrl).exists())){
					byte[] bcpf = getPicToService(queryClaimsInfo.getBankCardPicFiles());
					if(bcpf!=null){
						FileUtil.saveByteArrayToFile(bcpfUrl, bcpf);
					}
				}
				claimInfoVo.setBankCardUrl(PropertyConstant.RESOURCES_URL + "claim/" + queryClaimsInfo.getClaimsNo() + "/bank.jpg");
			}
			if(queryClaimsInfo.getInvoicePicFiles()!=null){
				String ipfUrl = DocConnector.picdir + File.separator + queryClaimsInfo.getClaimsNo() + "/invoice.jpg";
				if(!(new File(ipfUrl).exists())){
					byte[] ipf = getPicToService(queryClaimsInfo.getInvoicePicFiles());
					if(ipf!=null){
						FileUtil.saveByteArrayToFile(ipfUrl, ipf);
					}
				}
				claimInfoVo.setInvoiceUrl(PropertyConstant.RESOURCES_URL + "claim/" + queryClaimsInfo.getClaimsNo() + "/invoice.jpg");
			}
			if(queryClaimsInfo.getCargoReceiptPicFiles()!=null){
				String crpfUrl = DocConnector.picdir + File.separator + queryClaimsInfo.getClaimsNo() + "/cargo.jpg";
				if(!(new File(crpfUrl).exists())){
					byte[] crpf = getPicToService(queryClaimsInfo.getCargoReceiptPicFiles());
					if(crpf!=null){
						FileUtil.saveByteArrayToFile(crpfUrl, crpf);
					}
				}
				claimInfoVo.setCargoReceiptUrl(PropertyConstant.RESOURCES_URL + "claim/" + queryClaimsInfo.getClaimsNo() + "/cargo.jpg");
			}
			/**设置货损图片，田育林，2016-06-07**/
			if(queryClaimsInfo.getDamagePicFiles()!=null){
				String dpfUrl = DocConnector.picdir + File.separator + queryClaimsInfo.getClaimsNo() + "/damage.jpg";
				if(!(new File(dpfUrl).exists())){
					byte[] dpf = getPicToService(queryClaimsInfo.getDamagePicFiles());
					if(dpf!=null){
						FileUtil.saveByteArrayToFile(dpfUrl, dpf);
					}
				}
				claimInfoVo.setGoodsBadUrl(PropertyConstant.RESOURCES_URL + "claim/" + queryClaimsInfo.getClaimsNo() + "/damage.jpg");
			}
			/**-------------------------**/
			/**设置索赔函或授权书图片，田育林，2016-06-07**/
			if(queryClaimsInfo.getClaimOrderPicFiles()!=null){
				String copfUrl = DocConnector.picdir + File.separator + queryClaimsInfo.getClaimsNo() + "/claimOrder.jpg";
				if(!(new File(copfUrl).exists())){
					byte[] copf = getPicToService(queryClaimsInfo.getClaimOrderPicFiles());
					if(copf!=null){
						FileUtil.saveByteArrayToFile(copfUrl, copf);
					}
				}
				claimInfoVo.setClaimLetterUrl(PropertyConstant.RESOURCES_URL + "claim/" + queryClaimsInfo.getClaimsNo() + "/claimOrder.jpg");
			}
			/**-------------------------**/
			claimInfoVo.setAccidentType(queryClaimsInfo.getAccidentType());
			claimInfoVo.setApplyMoney(queryClaimsInfo.getPayAmount());
			claimInfoVo.setCargoName(queryClaimsInfo.getGoodsName());
			claimInfoVo.setClaimCity(queryClaimsInfo.getCityName());
			claimInfoVo.setClaimReason(queryClaimsInfo.getReason());
			claimInfoVo.setContactName(queryClaimsInfo.getContactName());
			claimInfoVo.setContactPhone(queryClaimsInfo.getContactTel());
			claimInfoVo.setCreateTime(DateTimeUtil.formatDate(new Date(queryClaimsInfo.getCreateTime()), "yyyy-MM-dd HH:mm:ss"));
			claimInfoVo.setExceptionPieces((int) queryClaimsInfo.getExceptionCount());
			claimInfoVo.setStatus(queryClaimsInfo.getDcEventDesc());
			claimInfoVo.setWaybillNo(queryClaimsInfo.getBillNo());
			claimInfoVo.setWaybillPhone(queryClaimsInfo.getBillTel());
			/**设置开户行信息，田育林，2016-06-07**/
			claimInfoVo.setBankAccount(queryClaimsInfo.getBankAccount());
			claimInfoVo.setBankAccountName(queryClaimsInfo.getBankAccountName());
			claimInfoVo.setBankProvince(queryClaimsInfo.getBankProvince());
			claimInfoVo.setBankCity(queryClaimsInfo.getBankCity());
			claimInfoVo.setBankName(queryClaimsInfo.getBankName());
			/**-------------------------**/
			return claimInfoVo;
		} else {
			throw new BusinessException(res.getErrorMessage());
		}
	}

	@Override
	public void confirmApplyMoney(String claimsNo) {
		ResponseClaimsObject res = ClaimServiceFactory.getClaimsWSService().confirmClaimsAmount(claimsNo);
		if(!res.isSuccess()){
			throw new BusinessException(res.getErrorMessage());
		}
	}
	
	/**根据图片ID到图片服务器上取得图片，缓存在本地，返回图片地址链接，田育林，2016-06-17**/
	private byte[] getPicToService(ClaimsAttachmentInfo cai){
		byte[] resPicDate = null;
		if(cai!=null){
			String groupId = cai.getGroupIds()!=null && cai.getGroupIds().size()>0 ? cai.getGroupIds().get(0) : "";
			String type = cai.getServiceType()!=null && !"".equals(cai.getServiceType()) ? cai.getServiceType() : "";
			DocPicture pic = new DocPicture();
			pic.setYwlx(type);
			pic.setGroupFlag(groupId);
			Vector<DocPic> dps = new DocPictureManager().get(pic);
			if(dps!=null && dps.size()>0){
				DocPic dp = dps.get(0);
				if(dp.getBytes()!=null){
					resPicDate = dp.getBytes();
				}
			}
		}
		return resPicDate;
	}

	/* 
	 * 校验理赔公司所在城市是否输入正确
	 * 田育林
	 * 2016-06-24
	 */
	private String checkClaimCity(String cityName, String billNo, String billTel) {
		String cn = "";
		String requestMsg = "校验失败";
		if(billNo==null || "".equals(billNo)){
			requestMsg = "请先输入运单号";
		}else if(billTel==null || "".equals(billTel)){
			requestMsg = "请先输入电话号码";
		}else/* if(cityName!=null && !"".equals(cityName))*/{
			//根据运单号和手机号，查询理赔公司所在城市
			List<QueryCorpResult> qcrs = ClaimServiceFactory.getClaimsWSService().findClaimsPlace(billNo, billTel);
			if(qcrs!=null && qcrs.size()>0){
				for(QueryCorpResult qcr : qcrs){
					cn += qcr.getCsmc() + "、";
					if(cityName.equals(qcr.getCsmc())){
						requestMsg = "success";
						break;
					}
				}
			}
		}
		if("校验失败".equals(requestMsg)){
			requestMsg = requestMsg + "；输入的城市名称只能是" + cn.substring(0, cn.length()-1) + "其中之一。";
		}
		return requestMsg;
	}
	
	/**根据用户输入的关键字，查询开户行银行的信息，田育林，2016-06-27**/
	public List<AccountBankInfoVo> queryBankInfo(String bankKey){
		List<AccountBankInfoVo> abvos = new ArrayList<AccountBankInfoVo>();
		if(bankKey!=null && !"".equals(bankKey)){
			List<AccountBankInfo> abis = AccountInfoServiceFactory.getAccountInfoService().getAccountBankInfoList(bankKey);
			if(abis!=null && abis.size()>0){
				int cnt = abis.size() > 15 ? 15 : abis.size();
				for(int i=0; i<cnt; i++){
					AccountBankInfoVo abvo = new AccountBankInfoVo();
					abvo.setBankInfoCode(abis.get(i).getAccountBankInfoCode());
					abvo.setBankInfoName(abis.get(i).getAccountBankInfoName());
					abvos.add(abvo);
				}
			}
		}
		return abvos;
	}
	
}
