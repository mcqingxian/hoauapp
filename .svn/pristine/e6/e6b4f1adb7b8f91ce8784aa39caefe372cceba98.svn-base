package com.hoau.hoauapp.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hoau.hoauapp.business.ISliderManageService;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.util.ZipFileUtil;
import com.hoau.hoauapp.vo.SlideShow;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 *
 * @作者： wangmingzhao
 * @Title: SliderManageAction.java
 * @Package com.hoau.hoauapp.control
 * @Description:  主页广告资源管理Action
 * @Date: 2015-4-20 上午10:10:30
 */
public class SliderManageAction extends ActionSupport {
	public static Log logger = LogFactory.getLog(SliderManageAction.class);
	private static final long serialVersionUID = 1L;
	private File upload;        //上传的文件，在extjs 中对应 xtype:'fileuploadfield',  name:'upload'  
	private String uploadFileName;    //上传的文件名  
	private String uploadContentType; //限制上传的后缀名  
	private Boolean success = true; //json中返回的结果  
	private String resultMsg = "ok" ;  //上传失败后，返回的错误结果  
	private List<SlideShow> slierlist;//资源明细
	private String gridlist; 
	private int start; //开始位置
	private int limit; //页面大小
	private long total ; //总数

	@Resource
	private ISliderManageService sliderManageService;
	/**
	 * 
	 * 方法体说明：主页广告资源新增
	 * 作者：wangmingzhao
	 * 日期：2015-4-20 下午3:41:07
	 * 
	 * @return
	 */
	public String addSliderFile(){
		//明细数据转换
		if(initJsonData(gridlist)==1){
			success=false;
			resultMsg="明细数据解析错误！";
			return SUCCESS;
		}
		if(uploadFileName!=null){
			String str= uploadFileName.substring(uploadFileName.lastIndexOf(".")+1);
			if(!"zip".equals(str)){
				success=false;
				resultMsg="附件格式必须是（.zip）！";
				return SUCCESS;
			}
		}
		if(slierlist ==null || slierlist.size()==0){
			success=false;
			resultMsg="明细数据不能为空！";
			return SUCCESS;
		}
		String zipurl = null;
		String pash = null;
		//上传附件
		try {
			uploadFileName=ZipFileUtil.getNowDate()+".zip";
			InputStream is = new FileInputStream(upload);  
			pash = getPash();
			String pashnow = pash+"/"+"temp";	
			File filepath = new File(pashnow);
			// 临时文件目录创建
			if(!filepath.exists()  && !filepath.isDirectory()){
				filepath.mkdir();   
			}
			zipurl =pashnow+"/"+uploadFileName;
		    OutputStream os = new FileOutputStream(zipurl);//上传到d盘根目录  
		    byte buffer[] = new byte[8192];  
		    int count = 0;  
		    while ((count = is.read(buffer)) > 0) {
		    	 os.write(buffer, 0, count); 
		    }     
		    os.close();  
		    is.close(); 
		} catch (Exception e) {
			e.printStackTrace();
			success=false;
			resultMsg="附件上传失败！";
			return SUCCESS;
		}
		//添加明细信息
		try {
			sliderManageService.addSliderMsg(slierlist, zipurl, pash);
		} catch (Exception e) {
			e.printStackTrace();
			success=false;
			resultMsg="失败 "+e.getMessage();
		}
		
		System.out.println(slierlist);
		for(SlideShow s:slierlist){
			System.out.println(s.getTitle());
			System.out.println(s.getImageUrl());
			System.out.println(s.getLink());
		}

		return SUCCESS;
	}
	
	/**
	 * 
	 * 方法体说明：查询所有资源明细
	 * 作者：wangmingzhao
	 * 日期：2015-4-22 下午6:02:10
	 * 
	 * @return
	 */
	public String findSlider(){
		try {
			total = sliderManageService.getCount(null);
			Map map = new HashMap();
			map.put("start", start);
			map.put("limit", limit);
			slierlist = sliderManageService.findSliderMsg(map);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}	
		return SUCCESS;
	}
	
	
	
	/**
	 * 
	 * 方法体说明：明细数据转换
	 * 作者：wangmingzhao
	 * 日期：2015-4-21 上午9:54:20
	 * 
	 * @param list
	 * @return
	 */
	private int initJsonData(String list){
		try {
			List<SlideShow> l = new ArrayList<SlideShow>();
			if(list !=null && !"".equals(list.trim())){
				//JSONObject jodata =JSONObject.fromObject(slierlist);
				JSONArray ja=JSONArray.fromObject(list);
				for(int i=0;i<ja.size();i++){
					SlideShow s = new SlideShow();
					JSONObject o=ja.getJSONObject(i);
					String title =(String)o.get("title");
					String imageUrl =(String)o.get("imageUrl");
					String link =(String)o.get("link");
					s.setTitle(title);
					s.setImageUrl(imageUrl);
					s.setLink(link);
					l.add(s);
				}			
			}
			setSlierlist(l);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			return 1;
		}
		
		return 0;
	}
	
	
	/**
	 * 
	 * 方法体说明：获取附件保存路径
	 * 作者：wangmingzhao
	 * 日期：2015-4-22 上午8:54:56
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
			rootPath ="D:/hoauapptemp/temp";
		} else {
			// 如果不是则去linuxserverpath路径
			rootPath = PropertyConstant.LINUXSERVER_SLIDERURL;
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
	public List<SlideShow> getSlierlist() {
		return slierlist;
	}
	public void setSlierlist(List<SlideShow> slierlist) {
		this.slierlist = slierlist;
	}
	public String getGridlist() {
		return gridlist;
	}
	public void setGridlist(String gridlist) {
		this.gridlist = gridlist;
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
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
	
	
	
	

}
