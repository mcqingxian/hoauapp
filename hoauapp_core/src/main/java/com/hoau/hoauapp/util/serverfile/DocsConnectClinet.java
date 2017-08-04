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
 * �ĵ����������ӿͻ���
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
	 * ��ȡһ���ļ�
	 * @param groupFlag ���
	 * @return һ���ļ���Ϣ
	 * @throws Exception
	 */
	public FileResult readFiles(String groupFlag) throws Exception
	{
		return (FileResult)sendObjToServer(
				new Object[]{"readFiles", new Object[]{groupFlag, true}});
	}
	
	/**
	 * ɾ��һ���ļ�
	 * @param groupFlag ���
	 * @throws Exception
	 */
	public FileResult deleteFiles(String groupFlag) throws Exception
	{
		return (FileResult)sendObjToServer(
				new Object[]{"deleteFiles", new Object[]{groupFlag}});
	}
	
	/**
	 * ����ļ���Ϣ
	 * @param typeCode ҵ�����ͱ�ǣ�ҵ�����ͱ�ǣ�01��ж���쳣ͼƬ02�������쳣ͼƬ03��ʼ����װ��ͼƬ04��;���ط���װ��ͼƬ
	 * 05-ǩ����ǩ��ͼƬ06-�ͻ�����Ǽǿ�07-����ɨ��ͼƬ08-Ͷ��һ����˾����ͼƬ
	 * 09-��������ͼƬ10-�ʼ�ͼƬ(*)
	 * @param files ������ļ�����
	 * @param groupFlag ����ΪNULL�����ʾ��ȫ�½�����Ϊnull���ʾ׷�����˷�����д���ļ�
	 * @return �������
	 */
	public FileResult addFiles(String typeCode, ArrayList<FileEntity> files, String groupFlag) throws Exception
	{
		return (FileResult)sendObjToServer(
				new Object[]{"addFiles", new Object[]{typeCode, files, groupFlag}});
	}
	
	/**
	 * ����һ���ļ�
	 * @param typeCode ҵ�����ͱ�ǣ�ҵ�����ͱ�ǣ�01��ж���쳣ͼƬ02�������쳣ͼƬ03��ʼ����װ��ͼƬ04��;���ط���װ��ͼƬ
	 * 05-ǩ����ǩ��ͼƬ06-�ͻ�����Ǽǿ�07-����ɨ��ͼƬ08-Ͷ��һ����˾����ͼƬ
	 * 09-��������ͼƬ10-�ʼ�ͼƬ(*)
	 * @param groupFlag �ļ�ϵͳ����ķ����ǣ��ڱ����ļ���ʱ�򷵻ء�
	 * @param filesForDelete ����ɾ�����ļ��б�Ϊnull���߿ձ�ʾ����Ҫɾ��������ʹ��FileEntity��docID��ɾ��֮ǰ���ļ���
	 * @param filesForInsert ���������ӵ��ļ��б�Ϊnull���߿ձ�ʾ����Ҫ���ӣ�����ʹ��FileEntity����Ϣ��������Щ�ļ���
	 * @return �������
	 */
	public FileResult updateFiles(String typeCode, String groupFlag, ArrayList<FileEntity> filesForDelete, 
			ArrayList<FileEntity> filesForInsert) throws Exception
	{
		return (FileResult)sendObjToServer(
				new Object[]{"updateFiles", new Object[]{typeCode, groupFlag, filesForDelete, filesForInsert}});
	}
	
	

	/**
	 * ������˷���һ������.
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
			System.out.println("DOCS�����ѷ�����("+serviceUrl+",_obj="+obj);
			Object objIn = null;
			if (response != null) {
				HttpEntity result = response.getEntity();
				InputStream instr = result.getContent();
				ObjectInputStream inputFromServlet = new ObjectInputStream(instr);
				objIn = inputFromServlet.readObject();
				System.out.println("DOCS�õ������ǣ�"+objIn);
				inputFromServlet.close();
				instr.close();
			} else {
				System.out.println("�����������NULL��");
			}
			return objIn;
		}
		catch (Exception e) {
			DocConnector.serverNotAvailable(serviceUrl);
			throw e;
		}
	}
}
