package java_socketDemo;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class test01 {

	public static void main(String[] args) throws UnknownHostException{
		//获取本机的InetAddress实例对象
          InetAddress address=InetAddress.getLocalHost();
          System.out.println("主机名是："+address.getHostName());
          System.out.println("主机地址是："+address.getHostAddress());
          byte [] bytes=address.getAddress();
          System.out.println(Arrays.toString(bytes));
          System.out.println(address);
          
          //根据机器名获取InetAddress实例对象
          InetAddress address2=InetAddress.getByName("Timmy-Kxy");
          System.out.println("主机名是："+address.getHostName());
          System.out.println("主机地址是："+address.getHostAddress());
          byte [] bytes1=address.getAddress();
          System.out.println(Arrays.toString(bytes1));
          System.out.println(address);
          
          //根据IP地址获取本机InetAdress对象
          InetAddress address3=InetAddress.getByName("10.49.198.223");
          System.out.println("主机名是："+address.getHostName());
          System.out.println("主机地址是："+address.getHostAddress());
          byte [] bytes2=address.getAddress();
          System.out.println(Arrays.toString(bytes2));
          System.out.println(address);
          
          
          
	}

}
