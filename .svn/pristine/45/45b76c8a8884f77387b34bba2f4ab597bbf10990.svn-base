package com.hoau.hoauapp.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hoau.hoauapp.business.IVersionsManageService;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.util.AttachmentRootPath;
import com.hoau.hoauapp.util.UUIDUtil;
import com.hoau.hoauapp.vo.VersionUpdateSubInfoVo;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 *
 * @作者： wangmingzhao
 * @Title: APKUploadAction.java
 * @Package com.hoau.hoauapp.control
 * @Description: 
 * @Date: 2015-4-14 上午8:49:34
 */
public class APKUploadAction extends ActionSupport{
	public static Log logger = LogFactory.getLog(APKUploadAction.class);
	private static final long serialVersionUID = 1L;
	private File upload;        //上传的文件，在extjs 中对应 xtype:'fileuploadfield',  name:'upload'  
	private String uploadFileName;    //上传的文件名  
	private String uploadContentType; //限制上传的后缀名  
	private Boolean success = true; //json中返回的结果  
	private String resultMsg = "ok" ;  //上传失败后，返回的错误结果  
	private VersionUpdateSubInfoVo versionvo ; //版本消息
	
	private int start; //开始位置
	private int limit; //页面大小
	private List<VersionUpdateSubInfoVo>listinfo; //版本集合
	private long total ; //总数
	@Resource
	private IVersionsManageService versionsManageService;
	
	/**
	 * 
	 * 方法体说明：版本信息新增与附件添加
	 * 作者：wangmingzhao
	 * 日期：2015-4-15 上午10:40:40
	 * 
	 * @return
	 */
	public String apkUpload(){		
		int vnum =0;
		if(versionvo !=null && versionvo.getVersionCode() > 0 && versionvo.getUrl()!=null && !"".equals(versionvo.getUrl().trim()) && versionvo.getDescription()!=null &&!"".equals(versionvo.getDescription().trim()) ){
			vnum =versionvo.getVersionCode()-1;
		}else{
			success=false;
			resultMsg="版本信息不完整";
			return SUCCESS;
		}
		
		if(uploadFileName!=null){
			String str= uploadFileName.substring(uploadFileName.lastIndexOf(".")+1);
			if(!"apk".equals(str)){
				success=false;
				resultMsg="附件格式必须是（.apk）！";
				return SUCCESS;
			}
		}
		
		
		try {
			//文件名称
			uploadFileName="hoauapp.apk";
			versionvo.setApkName(uploadFileName);
			java.io.InputStream is = new FileInputStream(upload);  
			String pash = getPash();
			String pashnow = pash+"/"+"now";
			fileBackUp(pashnow,pash+"/"+vnum);
		    java.io.OutputStream os = new FileOutputStream(pashnow+"/"+uploadFileName);//上传到d盘根目录  
		    byte buffer[] = new byte[8192];  
		    int count = 0;  
		    while ((count = is.read(buffer)) > 0) {
		    	 os.write(buffer, 0, count); 
		    }     
		    os.close();  
		    is.close();  
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			logger.error(e);
			success=false;
			resultMsg="附件保存失败";
			return SUCCESS;
		}
		try {
			versionvo.setApptype(1);
			versionsManageService.addVersion(versionvo);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			success=false;
			resultMsg="版本数据更新失败";
		}
		
			
		
		return SUCCESS;
	}
	/**
	 * 
	 * 方法体说明：版本信息查询
	 * 作者：wangmingzhao
	 * 日期：2015-4-15 上午10:40:15
	 * 
	 * @return
	 */
	public String findVersions(){
		try {
			total = versionsManageService.getCount(null);
			listinfo = versionsManageService.findVersions(null, start, limit);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}	
		return SUCCESS;
	}
	
	
	
	
	
	
	/**
	 * 
	 * 方法体说明：备份历史版本附件
	 * 作者：wangmingzhao
	 * 日期：2015-4-14 上午8:55:15
	 * 
	 * @param nowPath 需要备份的文档路径
	 * @param backpath 备份到指定的文档路径
	 * @return
	 */
	private int fileBackUp(String nowPath ,String backpath ){
		File fileDirectory = new File(nowPath);
		File backfileDirectory = new File(backpath);
		
		if  (!fileDirectory.exists()  && !fileDirectory.isDirectory())      
		{  // 创建目录
			fileDirectory.mkdir();    
		} else 
		{// 删除老文件
			File[] listFile = fileDirectory.listFiles();
			//备份目录是否存在 不存在则新建
			if(!backfileDirectory.exists() && ! backfileDirectory.isDirectory()){
				backfileDirectory.mkdir(); 
			}
			
			for(int i=0; i<listFile.length; i++){
				String oldsrc =listFile[i].getPath();
				String name = UUIDUtil.getVersion()+listFile[i].getName();
				if(AttachmentRootPath.copyFile(oldsrc, backpath+"/"+name)==-1){
					return -1;
				}
				listFile[i].delete();
			}
		}
		return 0;
		
	}
	
	
	
	
	
	/**
	 * 
	 * 方法体说明：获取附件保存路径
	 * 作者：wangmingzhao
	 * 日期：2015-4-14 上午8:54:56
	 * 
	 * @return
	 */
	private String getPash(){
		// 获取本系统的os名称
		String osname = System.getProperty("os.name");
		// 获取root的路径
		String rootPath = "";
		// 如果这个系统是windows的，则获取本class所在的路径
		if (osname.contains("Windows")) {
			// 获取root路径信息
//			rootPath = APKUploadAction.class.getClassLoader().getResource("").getPath();
//			System.out.println(rootPath);
			// 取WEB-INF上层目录路径
//			rootPath = rootPath.substring(0, rootPath.lastIndexOf("target") - 1);
			rootPath ="D:/hoauapptemp/temp";
		} else {
			// 如果不是则去linuxserverpath路径
			rootPath = PropertyConstant.LINUXSERVER_VERSION_URL;
		}
				
		return rootPath;
	}
	
	
	
	
	
	
	
	

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	

	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public VersionUpdateSubInfoVo getVersionvo() {
		return versionvo;
	}

	public void setVersionvo(VersionUpdateSubInfoVo versionvo) {
		this.versionvo = versionvo;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public List<VersionUpdateSubInfoVo> getListinfo() {
		return listinfo;
	}

	public void setListinfo(List<VersionUpdateSubInfoVo> listinfo) {
		this.listinfo = listinfo;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
	

}
