package com.hoau.hoauapp.util.serverfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;
import com.hoau.hoauapp.util.StringUtil;
import com.zcsoft.docs.vo.FileEntity;
import com.zcsoft.docs.vo.FileResult;


/**
 * <p>Title: 官网APP</p>
 * <p>Description: 本地操作文件服务器的方法</p>
 * @author 田育林
 * @version 1.0
 */

public class DocPictureManager{
   /**
    * 从文档服务器中删除图片信息
    * @param pic 图片信息
    * @return 结果反馈信息
    */
   public void delete(DocPicture pic)
   {
	   String groupFlag = pic.getGroupFlag();
	   if(StringUtil.isEmpty(groupFlag))
	   {
		   throw new RuntimeException("非法请求！");
	   }
	   String serverUrl = DocConnector.findServerUrlByGroupFlag(groupFlag);
	   if(StringUtil.isEmpty(serverUrl))
	   {
		   throw new RuntimeException("无法找到文档服务器地址：groupFlag="+groupFlag);
	   }
	   DocsConnectClinet dcc = new DocsConnectClinet(serverUrl);
	   FileResult fr = null;
	   try {
		   fr = dcc.deleteFiles(groupFlag);
	   } catch (Exception e) {
		   throw new RuntimeException("从文档服务器读取图片异常！"+e);
	   }
	   if(!fr.isSuccess())
	   {
		   throw new RuntimeException("从文档服务器读取图片错误！\n错误信息="+fr.getErrorMsg());
	   }
   }
   
   /**
    * 从文档服务器中读取图片信息
    * @param pic 图片信息
    * @return 结果反馈信息
    */
   public Vector<DocPic> get(DocPicture pic){
	   String typeCode = pic.getYwlx();
	   String groupFlag = pic.getGroupFlag();
	   //NULL表示已经初始化过，但是没有图片的
	   if(!StringUtil.isEmpty(groupFlag) && !"NULL".equalsIgnoreCase(groupFlag))
	   {
		   String serverUrl = null;
		   if(!StringUtil.isEmpty(groupFlag))
		   {
			   serverUrl = DocConnector.findServerUrlByGroupFlag(groupFlag);
		   }
		   if(StringUtil.isEmpty(serverUrl))
		   {
			   serverUrl = DocConnector.findServerUrlByType(typeCode, false);
		   }
		   if(StringUtil.isEmpty(serverUrl))
		   {
			   throw new RuntimeException("无法找到文档服务器地址：typeCode="+typeCode+",groupFlag="+groupFlag);
		   }
		   DocsConnectClinet dcc = new DocsConnectClinet(serverUrl);
		   FileResult fr = null;
		   try {
			   fr = dcc.readFiles(groupFlag);
		   } catch (Exception e) {
			   throw new RuntimeException("从文档服务器读取图片异常！"+e);
		   }
		   if(!fr.isSuccess())
		   {
			   throw new RuntimeException("从文档服务器读取图片错误！\n错误信息="+fr.getErrorMsg());
		   }
		   ArrayList<FileEntity> storeFiles = fr.getStoreFiles();
		   if(storeFiles != null && storeFiles.size() > 0)
		   {
			   Vector<DocPic> pics = new Vector<DocPic>(storeFiles.size());
			   for (FileEntity fe : storeFiles)
			   {
				   if(fe.getData() == null)
				   {
					   throw new RuntimeException("从文档服务器无法读取图片文件["+fe.getFileName()+"]！");
				   }
				   DocPic dp = new DocPic(fe.getData());
				   dp.setPicID(fe.getDocID());
				   dp.setName(fe.getFileName());
				   dp.setFrom(fe.getClassID());
				   pics.add(dp);
			   }
			   return pics;
		   }
	   }
	   return new Vector<DocPic>();
   }
   
   public static void main(String[] args) throws Exception {
	   DocPicture pic = new DocPicture();
	   pic.setYwlx("11");
	   pic.setGroupFlag("010000010905");
	   Vector<DocPic> dps = new DocPictureManager().get(pic);
	   if(dps.size() > 0) {
		   DocPic p = dps.get(0);
		   File file = new File("D:/" + p.getPicID() + ".jpg");
		   OutputStream os = new FileOutputStream(file);
		   os.write(p.getBytes());
		   os.flush();
		   os.close();
	   }
	   System.out.println(dps);
   }
}