package com.hoau.hoauapp.util.serverfile;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentProducer;
import org.apache.http.entity.EntityTemplate;

import com.zcsoft.docs.vo.FileEntity;
import com.zcsoft.docs.vo.FileResult;

/**
 * 文档服务器连接客户端
 * @author hsw
 */
public class DocsConnectClinet
{
	private String serviceUrl = null;

	public DocsConnectClinet(String url)
	{
		this.serviceUrl = url;
	}
	
	/**
	 * 读取一组文件
	 * @param groupFlag 组号
	 * @return 一组文件信息
	 * @throws Exception
	 */
	public FileResult readFiles(String groupFlag) throws Exception
	{
		return (FileResult)sendObjToServer(
				new Object[]{"readFiles", new Object[]{groupFlag, true}});
	}
	
	/**
	 * 删除一组文件
	 * @param groupFlag 组号
	 * @throws Exception
	 */
	public FileResult deleteFiles(String groupFlag) throws Exception
	{
		return (FileResult)sendObjToServer(
				new Object[]{"deleteFiles", new Object[]{groupFlag}});
	}
	
	/**
	 * 添加文件信息
	 * @param typeCode 业务类型标记，业务类型标记：01—卸车异常图片02—拆笼异常图片03—始发车装车图片04—途经地发车装车图片
	 * 05-签收人签名图片06-客户账务登记卡07-理赔扫描图片08-投诉一级公司复议图片
	 * 09-丢货查找图片10-质检图片(*)
	 * @param files 保存的文件集合
	 * @param groupFlag 允许为NULL，则表示完全新建。不为null则表示追加往此分组中写入文件
	 * @return 操作结果
	 */
	public FileResult addFiles(String typeCode, ArrayList<FileEntity> files, String groupFlag) throws Exception
	{
		return (FileResult)sendObjToServer(
				new Object[]{"addFiles", new Object[]{typeCode, files, groupFlag}});
	}
	
	/**
	 * 更新一组文件
	 * @param typeCode 业务类型标记，业务类型标记：01—卸车异常图片02—拆笼异常图片03—始发车装车图片04—途经地发车装车图片
	 * 05-签收人签名图片06-客户账务登记卡07-理赔扫描图片08-投诉一级公司复议图片
	 * 09-丢货查找图片10-质检图片(*)
	 * @param groupFlag 文件系统分配的分组标记，在保存文件的时候返回。
	 * @param filesForDelete 需求删除的文件列表，为null或者空表示不需要删除，否则使用FileEntity的docID来删除之前的文件。
	 * @param filesForInsert 需求新增加的文件列表，为null或者空表示不需要增加，否则使用FileEntity的信息来增加这些文件。
	 * @return 操作结果
	 */
	public FileResult updateFiles(String typeCode, String groupFlag, ArrayList<FileEntity> filesForDelete, 
			ArrayList<FileEntity> filesForInsert) throws Exception
	{
		return (FileResult)sendObjToServer(
				new Object[]{"updateFiles", new Object[]{typeCode, groupFlag, filesForDelete, filesForInsert}});
	}
	
	

	/**
	 * 给服务端发送一个对象.
	 *
	 */
	protected Object sendObjToServer(final Object obj)
	throws Exception
	{
		try
		{
			HttpClient httpClient = HttpConnectionManager.getHttpClient();
			HttpPost httpPost = new HttpPost(serviceUrl);

	        ContentProducer cp = new ContentProducer() {
				public void writeTo(OutputStream outputstream) throws IOException {
	                ObjectOutputStream writer = new ObjectOutputStream(outputstream);
	                writer.writeObject(obj);
	                writer.flush();
				}
	        };
	        httpPost.setEntity(new EntityTemplate(cp));
	        HttpResponse response = httpClient.execute(httpPost);
			System.out.println("DOCS请求已发出！("+serviceUrl+",_obj="+obj);
			Object objIn = null;
			if (response != null) {
				HttpEntity result = response.getEntity();
				InputStream instr = result.getContent();
				ObjectInputStream inputFromServlet = new ObjectInputStream(instr);
				objIn = inputFromServlet.readObject();
				System.out.println("DOCS得到反馈是："+objIn);
				inputFromServlet.close();
				instr.close();
			} else {
				System.out.println("请求出错，返回NULL！");
			}
			return objIn;
		}
		catch (Exception e) {
			DocConnector.serverNotAvailable(serviceUrl);
			throw e;
		}
	}
}
