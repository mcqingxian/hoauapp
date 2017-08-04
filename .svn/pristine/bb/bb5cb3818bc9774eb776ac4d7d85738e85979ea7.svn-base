package com.hoau.hoauapp.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hoau.hoauapp.constant.PropertyConstant;

/**
 * @Title: AttachmentRootPath.java
 * @Package com.deppon.soa.module.attachment.server.util
 * @Description: 附件上传工具类
 */
public class AttachmentRootPath {

	// 日志打印
	public static Log logger = LogFactory.getLog(AttachmentRootPath.class);

	// linux server path
	private static String linuxServerpath;
	
	public static String cacheFilePrefix = "UserHead_";

	/**
	 * 
	 * <pre>
	 * 方法体说明：获取附件上传的root path
	 *  首先获取这个平台所属的systemos,
	 *  如果该os是linux则上传附件到系统文件中配置的path上面
	 *  如果该os是windows则上传附件到this.class.getClassLoader().getResource("")
	 *           .getPath();
	 * 作者：蒋落琛
	 * 日期：2013-7-12. 上午9:25:04
	 * </pre>
	 * 
	 * @return
	 */
	public static String getAttachRootPath() {
		// 判断该linuxpath是否存在，如果不存在则执行初始化配置
		if (StringUtil.isBlank(linuxServerpath)) {
			// 初始化配置信息
			initConfig();
		}
		// 获取本系统的os名称
		String osname = System.getProperty("os.name");
		// 获取root的路径
		String rootPath = "";
		// 如果这个系统是windows的，则获取本class所在的路径
		if (osname.contains("Windows")) {
			// 获取root路径信息
			rootPath = AttachmentRootPath.class.getClassLoader()
					.getResource("").getPath();
			// 取WEB-INF上层目录路径
			rootPath = rootPath.substring(0, rootPath.lastIndexOf("WEB-INF") - 1);
		} else {
			// 如果不是则去linuxserverpath路径
			rootPath = linuxServerpath;
		}
		// 打印存储目录路径
		logger.info("存储附件目录：" + rootPath);
		return rootPath;
	}

	/**
	 * 
	 * <pre>
	 * 方法体说明：初始化配置信息
	 * 作者：蒋落琛
	 * 日期：2013-7-13. 下午1:56:54
	 * </pre>
	 */
	public static void initConfig() {
		// 获取linux server path 的路径信息
		linuxServerpath = PropertyConstant.LINUXSERVER_URL;
	}

	/**
	 *  
	 * 方法体说明：文件复制
	 * 作者：wmz
	 * 日期：2015-4-13. 下午16:20:54
	 * @param src 源文件目录
	 * @param dst 目标文件目录
	 * @return
	 */
	public static int copyFile(String src, String dst) {
	    try {
	    	int len = 0;
	      	byte[] buf = new byte[1024];
	      	FileInputStream fis = new FileInputStream(src);
	      	FileOutputStream fos = new FileOutputStream(dst);
	      	while ( (len = fis.read(buf)) != -1) {
	    	  fos.write(buf, 0, len);
	      	}
	      	fis.close();
	      	fos.close();
	    }
	    catch (IOException e) {
	    	logger.info("附件备份失败：" + src);
	    	return -1;
	    }
	    return 0;
	  }
	
	
	
	
	
}
