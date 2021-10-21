package newtest;

import java.io.*;
import java.net.*;

public class ClientTest {
	public static void main(String[] args) {
		Socket socket = null;
		//socket Ŭ����Ÿ���� Socket ��ü�� ���� �� null������ �ʱ�ȭ
		
		try {
			socket = new Socket("218.37.39.138",5050);
			//new SocketŬ������ü�� ���� �� �Ű������� ip�ּ� �ְ� socket��ü������ ����
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			//socket��ü������ getInputStream�޼���� ������ �Է¹��� �� ���ο� InputStreamReader�޼���� �Ű������� ����
			//�̰��� ���ο� BufferedReader Ŭ���� ��ü ���� �� �Ű������� �ް� BufferedReaderŬ������ ����� reader ������ �Ҵ�
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			//socket��ü�� getOutputStream �޼��尡 ����� PrintWriter�޼��带 ����۾�  ��
			writer.println("Hi, I'm client!");
			
			writer.flush();
			
			System.out.println(reader.readLine());
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				socket.close();
			}catch(Exception e) {}
		}
	}
}


/*
package newtest;

import java.io.*;

import java.net.*;

class ClientTest{
       public static void main(String[] args) {   
           Socket socket = null;
           //socketŬ����Ÿ���� socket��ü�� ������. 
           //�ΰ����� �ʱ�ȭ��. 
   
           try{   
                 socket = new Socket("119.195.234.50",5060);
                 //new socketŬ������ü�� �����ϴ� �� �Ű������� ������ ip�ּҸ� �־���. 
                 //�����ϱ����� �ش���ø����̼��� ��Ʈ��ȣ�� 5060��. 
                 //ip �ּҴ� ���ּҰ��� ����. 
                 //����Ʈ��. ���ּҷ� ���µ�. ��ȣ���� �ش��ϴ� �� ��Ʈ��ȣ�󺸽ø� �ǿ�. 
                 //socket��ü������ �Ҵ���. 
 
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//socket��ü������ getinputstream�޼���� �����͸� �Է¹ް� newŰ����� inputstreamreader�޼���� �Ű������� ����. 
//�̰��� �ٽ� bufferedReaderŬ������ü�� �����ϰ� ���� �ڵ带 �Ű������� ���� ������. ������ �ִ� 
//bufferedreaderŬ����Ÿ������� reader��ü������ �Ҵ��Ѵ�. 
         
PrintWriter writer = new PrintWriter(socket.getOutputStream());
//socket��ü�� getoutputstream�޼��带 ��½�Ʈ���� �����͸� ���� �� �ְ� ��.
//newŰ����� printwriter�޼��带 ����۾��� ��.
//�̿� ��ü�� ������ �ִ� writer��ü������ �Ҵ��� ����. 
//writer��¿� ���ؼ� �ְ��Ѵ�. 
                 
                 writer.println("Hi, I��m client!");//Ŭ���̾�Ʈ���� �޽����� ��µ�. 
         
                 writer.flush();// Ŭ���̾�Ʈ���� ���۸� �����ϴ� writer��ü������ flush�޼��带 �۵���Ŵ

                 System.out.println(reader.readLine());//reader��ü�������� readline�޼���� �ܺο��� ���� ��½�Ʈ���� �μ��ٴ����� ��.
                 

          }catch(Exception e){                
                 System.out.println(e);//�������� ������ ������ ����ó���� ����.         
          }finally{             //�������� 
                try{   
                      socket.close();  //�۾��� �������ϱ�. socket��ü�� close�޼���� �ݾƹ���. 
                
                }catch(Exception e){ }              //����ó���� ����. 
          }
    }
}
*/