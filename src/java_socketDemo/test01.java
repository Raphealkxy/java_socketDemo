package java_socketDemo;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class test01 {

	public static void main(String[] args) throws UnknownHostException{
		//��ȡ������InetAddressʵ������
          InetAddress address=InetAddress.getLocalHost();
          System.out.println("�������ǣ�"+address.getHostName());
          System.out.println("������ַ�ǣ�"+address.getHostAddress());
          byte [] bytes=address.getAddress();
          System.out.println(Arrays.toString(bytes));
          System.out.println(address);
          
          //���ݻ�������ȡInetAddressʵ������
          InetAddress address2=InetAddress.getByName("Timmy-Kxy");
          System.out.println("�������ǣ�"+address.getHostName());
          System.out.println("������ַ�ǣ�"+address.getHostAddress());
          byte [] bytes1=address.getAddress();
          System.out.println(Arrays.toString(bytes1));
          System.out.println(address);
          
          //����IP��ַ��ȡ����InetAdress����
          InetAddress address3=InetAddress.getByName("10.49.198.223");
          System.out.println("�������ǣ�"+address.getHostName());
          System.out.println("������ַ�ǣ�"+address.getHostAddress());
          byte [] bytes2=address.getAddress();
          System.out.println(Arrays.toString(bytes2));
          System.out.println(address);
          
          
          
	}

}
