package chat;

import java.io.*;
import java.net.*;

public class ClientChatTest {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("218.37.39.138",7050);
			System.out.println("*****ä�ù濡 ���Խ��ϴ�.*****");
			SendThread st = new SendThread(socket);
			ReceiveThread rt = new ReceiveThread(socket);
			st.start();
			rt.start();
					
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


/*
package chat;

import java.io.*;
import java.net.*;

class ClientChatTest{

       public static void main(String[] args) {   
           
           Socket socket = null;   //socketŬ����Ÿ���� ������ socket��ü������ �ΰ����� �ʱ�ȭ��.

           try{   
                 socket = new Socket("127.0.0.1",7050);
                 //socket��ü�� ������ �ϴµ�. �Ű������� ����ip�� ��Ʈ��ȣ�� ����ְ� ���ϰ�ü�� ����� socket��ü������ �Ҵ�.

                 System.out.println("******ä�ù濡 ���Խ��ϴ�.******"); 

                 SendThread st = new SendThread(socket); //sendthreadŬ������ ��ü�� ������ �ϰ� �Ű�������
                 //��Ʈ��ȣ�� ���������� ���� socket��ü������ ����ϰ� ������ �ִ� st��ü������ ��ü�� �Ҵ�
                 //�޽������޿� ��ü����
                 ReceiveThread rt = new ReceiveThread(socket);
                 //receivethreadŬ������ ��ü�� ������ �ϰ� ���������� �ִ� socket��ü������ �Ű������� �ִ´�. �׸��� 
                 //������ �ִ� rt��ü������ �Ҵ��� ��.
                 //����� ��ü����

                 st.start();//���彺������ start�޼��带 �۵���Ű��
         
                 rt.start();//���ú꽺������ start�޼��带 �۵���Ų��. 

           }catch(Exception e){                
                 System.out.println(e);        
           }
      }
}
*/