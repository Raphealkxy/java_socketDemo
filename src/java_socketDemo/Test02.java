package java_socketDemo;

import java.net.MalformedURLException;
import java.net.URL;
/**
 * url����ʵ��
 * @author Timmy
 *
 */
public class Test02 {

	public static void main(String[] args) {
           try {
			URL imooc=new URL("http://www.imooc.com");
			URL url=new URL(imooc,"/index.html?username=tom#test");
			System.out.println("Э�飺"+url.getProtocol());
			System.out.println("������"+url.getHost());
			System.out.println("�˿ںţ�"+url.getPort());
			System.out.println("�ļ�·����"+url.getPath());
			System.out.println("�ļ�����"+url.getFile());
			System.out.println("��Ե�ַ"+url.getRef());
			System.out.println("��ѯ���"+url.getQuery());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
	}

}
