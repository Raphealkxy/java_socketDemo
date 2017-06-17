package java_socketDemo;

import java.net.MalformedURLException;
import java.net.URL;
/**
 * url基本实现
 * @author Timmy
 *
 */
public class Test02 {

	public static void main(String[] args) {
           try {
			URL imooc=new URL("http://www.imooc.com");
			URL url=new URL(imooc,"/index.html?username=tom#test");
			System.out.println("协议："+url.getProtocol());
			System.out.println("主机："+url.getHost());
			System.out.println("端口号："+url.getPort());
			System.out.println("文件路径："+url.getPath());
			System.out.println("文件名："+url.getFile());
			System.out.println("相对地址"+url.getRef());
			System.out.println("查询语句"+url.getQuery());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
	}

}
