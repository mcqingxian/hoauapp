package com.hoau.hoauapp.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.hoau.hoauapp.util.AttachmentRootPath;

/**
 * Servlet implementation class UploadFileServlet
 */
public class UploadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public UploadFileServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			// 上传图片
			FileItem item = null;
			String userId = null;
			if (isMultipart) {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				// factory.setSizeThreshold(1024 * 1024 * 2);
				ServletFileUpload upload = new ServletFileUpload(factory);
				// upload.setFileSizeMax(1024 * 1024 * 50);
				// upload.setFileSizeMax(1024 * 1024 * 6);
				List items = upload.parseRequest(request);
				for (int i = 0; i < items.size(); i++) {
					FileItem curItem = (FileItem) items.get(i);
					// 文件流
					if (!curItem.isFormField() && curItem.getFieldName().equals("photo")) {
						item = curItem;
					} else if (curItem.isFormField()
							&& curItem.getFieldName().equals("userId")) {
						// 普通表单数据，用户名
						userId = curItem.getString();
					}
				}
			}/*
			 * else { Enumeration en = request.getParameterNames(); while
			 * (en.hasMoreElements()) { String paramName = (String)
			 * en.nextElement(); String paramValue =
			 * request.getParameter(paramName); } }
			 */
			if (item != null) {
				fileUpload(item, userId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 文件上传
	 * 
	 * @Title: fileUpload
	 * @throws
	 */
	private void fileUpload(FileItem item, String userId) {
		try {
			// 此用户头像上传根目录
			String rootPath = AttachmentRootPath.getAttachRootPath() + "/" + userId;
			String xdfilePath = "/" + item.getName();
			String newAttachPath = rootPath + xdfilePath;
			// 判断用户目录是否存在，没有则创建
			File fileDirectory = new File(rootPath);
			if  (!fileDirectory.exists()  && !fileDirectory.isDirectory())      
			{       
				// 创建目录
				fileDirectory.mkdir();    
			} else 
			{
				// 删除老文件
				File[] listFile = fileDirectory.listFiles();
				for(int i=0; i<listFile.length; i++){
					listFile[i].delete();
				}
			}
			// 获取前台传输文件流并写入后台文件
			InputStream ins = item.getInputStream();
			OutputStream os = new FileOutputStream(new File(newAttachPath));
			int bytesRead = 0;
			byte[] buffer = new byte[8192];
			while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
			os.close();
			ins.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
