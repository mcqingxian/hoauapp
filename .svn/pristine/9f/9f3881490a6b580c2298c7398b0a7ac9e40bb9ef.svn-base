package com.hoau.hoauapp.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;

public class ZipFileUtil {
	
	 public static void unZipFiles(File zipFile,String descDir)throws IOException{  
	        File pathFile = new File(descDir);  
	        if(!pathFile.exists()){  
	            pathFile.mkdirs();  
	        }  
	        ZipFile zip = new ZipFile(zipFile);  
	       
	        for(Enumeration entries = zip.getEntries();entries.hasMoreElements();){  
	            ZipEntry entry = (ZipEntry)entries.nextElement();  
	            String zipEntryName = entry.getName();  
	            InputStream in = zip.getInputStream(entry);  
	            String outPath = (descDir+zipEntryName).replaceAll("\\*", "/");;  
	            //判断路径是否存在,不存在则创建文件路径  
	            File file = new File(outPath.substring(0, outPath.lastIndexOf('/')));  
	            if(!file.exists()){  
	                file.mkdirs();  
	            }  
	            //判断文件全路径是否为文件夹,如果是上面已经上传,不需要解压  
	            if(new File(outPath).isDirectory()){  
	                continue;  
	            }  
	            //输出文件路径信息  
	            System.out.println(outPath);  
	              
	            OutputStream out = new FileOutputStream(outPath);  
	            byte[] buf1 = new byte[1024];  
	            int len;  
	            while((len=in.read(buf1))>0){  
	                out.write(buf1,0,len);  
	            }  
	            in.close();  
	            out.close();  
	            }  
	        System.out.println("******************解压完毕********************");  
	    }  
	 
	 public static boolean unZip(String srcFile, String dest, boolean deleteFile) {  
         try {  
             File file = new File(srcFile);  
             if (!file.exists()) {  
                 //throw new RuntimeException("解压文件不存在!");  
                 return false;  
             }  
             ZipFile zipFile = new ZipFile(file,"gbk");  
             Enumeration e = zipFile.getEntries();  
             while (e.hasMoreElements()) {  
                 ZipEntry zipEntry = (ZipEntry) e.nextElement();  
                 if (zipEntry.isDirectory()) {  
                     String name = zipEntry.getName();  
                     name = name.substring(0, name.length() - 1);  
                     File f = new File(dest + name);  
                     f.mkdirs();  
                 } else {  
                     File f = new File(dest + zipEntry.getName());  
                     f.getParentFile().mkdirs();  
                     f.createNewFile();  
                     InputStream is = zipFile.getInputStream(zipEntry);  
                     FileOutputStream fos = new FileOutputStream(f);  
                     int length = 0;  
                     byte[] b = new byte[1024];  
                     while ((length = is.read(b, 0, 1024)) != -1) {  
                         fos.write(b, 0, length);  
                     }  
                     is.close();  
                     fos.close();  
                 }  
             }  
   
             if (zipFile != null) {  
                 zipFile.close();  
             }  
   
             if (deleteFile) {  
                 file.deleteOnExit();  
             }  
   
             return true;  
         } catch (IOException ex) {  
             return false;  
         }  
     }  
	 
	 public static String getNowDate(){
		 Date nowdate = new Date();
		 SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		 String str =  format.format(nowdate)+UUIDUtil.getUUID();
		 return str;
	 }
	 
	 public static int getNowDateofInt(){
		 Date nowdate = new Date();
		 SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		 String str =  format.format(nowdate);
		 return Integer.parseInt(str+"01");
	 }
	 
	 
}
