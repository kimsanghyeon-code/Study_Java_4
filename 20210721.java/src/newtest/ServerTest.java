package newtest;

import java.io.*;
import java.net.*;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		//ServerSocketŬ����Ÿ���� ����� serverSocket��ü������ ����ǰ� null������ �ʱ�ȭ 
		Socket socket = null;
		//SocketŬ����Ÿ���� ����� socket��ü���� null������ �ʱ�ȭ
		try {
			serverSocket = new ServerSocket(5050);
			//ServerSocket��ü ���� (��Ʈ��ȣ 5050)
			System.out.println("ready to connect..");
			socket = serverSocket.accept();
			//����ϴٰ� Ŭ���̾�Ʈ���� �����û�� ������ �����ϴ� ���� accept�޼���
			//�̰��� �۵����Ѽ� socket��ü������ �Ҵ�
			System.out.println("connected!");
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			//socket��ü������ getinputStream�޼��带 �Ҵ�(Ű����� �Է�)
			//�װ��� ���ο� InputStreamReader�� �Ҵ�
			//�װ��� ���ο� BufferedReader��ü ���� �� �Ҵ��ϴµ�,
			//BufferedReaderŬ����Ÿ���� ����� reader�� �Ҵ�
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			System.out.println(reader.readLine());
			writer.println("Hello, I'm server!");
			writer.flush();	
		
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				socket.close();
			}catch(Exception e) {}
			try {
				serverSocket.close();
			}catch(Exception e) {}
		}
	}
}


/*
package test2000;

import java.io.*;

import java.net.*;

class ServerTest{//�����׽�ƮŬ����
       public static void main(String[] args) {   
           ServerSocket serverSocket = null;//serversocketŬ����Ÿ���� ����� serversocket��ü������ ������ �ǰ� �ΰ����� �ʱ�ȭ
    
           Socket socket = null; //socketŬ����Ÿ���� ����� socket��ü�������� �ΰ����� �ʱ�ȭ
   
           try{   
                 serverSocket = new ServerSocket(5060);//serversocket��ü�� �����Ҷ� ���α׷��� ��Ʈ��ȣ�� 5060���� ������.
                 //�װ��� serversocket��ü������ �Ҵ�

       System.out.println("ready to connect..");
                 
       socket = serverSocket.accept();//��⸦ �ϴٰ� Ŭ���̾�Ʈ���� �����û�� ������ �װ��� ����ִ� ���� accept�޼����̰� �̰��� �۵����Ѽ� socket��ü������ �־���. 

                 System.out.println("connected!");         
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//������ ������ �����͸� �о���̴� ���� ���۸���Ŭ�����̰�. �̰��� ������ reader��ü������ ����� �Բ� ������ �ִ� ������� �Ҵ�޴´�.
//socket��ü������ getInputstream�޼��带 �۵���Ŵ. �Է¹���
//�װ��� �Ű������� newŰ���� inputstreamReaderŬ������ü�� ������. �ԷµǴ� �������帧�� �о����. 
//�̰��� �Ű������� newŰ���� bufferedReaderŬ������ü�� �����ؼ� 
//�տ��� �����ߴ� reader��ü������ �Ҵ��� ��. 
         
PrintWriter writer = new PrintWriter(socket.getOutputStream());
//socket��ü�������� getoutputstream�޼��带 ���ؼ� ����� �ϴµ�, newŰ����� printwriterŬ������ü�� ������ ��. 
//�װ��� printwriterŬ����Ÿ���� ���� writer��ü������ �Ҵ���. ���� �۾��� ���� ���� writer��ü������ �۾���.
         
                 System.out.println(reader.readLine());
//����� �ϴµ� reader��ü������ readline�޼��带 �����Ͷ����� �о����. �׸��� �о���� �����͸� �����.                  
         
                 writer.println("Hello, I��m server!");
//writer��ü�������� println�޼��带 ���� ����ϴµ�. ���� ���ڿ��� ����ϴ� ����. �̰� ����Ǿ �������ְ� ������ �ȴٴ� ���� ������.                  
         
                 writer.flush();
//writer��ü�������� flush�޼���� ���ۿ� �ִ� ��Ʈ���� �����ع�����.                  
          
          }catch(Exception e){                
                 System.out.println(e);        //��������� ������ ������ ����ó���� ����.
          }finally{//���������� �۾��ϴ� ��.              
                try{   
                      socket.close(); //socket��ü�� �ݰ�. 
                
                }catch(Exception e){ }//���⼭ ���� ������. ���⿡�� ����ó���� ����.               
                try{
                       serverSocket.close();//serversocket�� �ݾ���. 

                }catch(Exception e){ }//����ó���� ����. 
         }
    }
}
*/