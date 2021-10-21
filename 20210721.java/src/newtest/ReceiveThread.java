package newtest;

import java.io.*;
import java.net.*;

public class ReceiveThread extends Thread {
	//threadŬ������ ����� ���� ReceiveThreadŬ����
	Socket socket;
	
	ReceiveThread(Socket socket){
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			//socket��ü�� getinputStream�޼���� �Էµ����͸� ���� ���� InputStreamReader�� �о���̰�
			//�װ��� BufferedReaderŬ������ü�� �Ű������� �޾Ƶ��̰�
			//BufferedReader Ŭ����Ÿ���� ����� reader�� �Ҵ�
			while(true) {
				
				String str = reader.readLine();
				//reader������ readLine�޼��尡 �����͸� �о���̰�(Ű�����)
				//�� ���� ���ڿ�Ŭ����Ÿ���� ����� str�� �Ҵ�
				if(str == null)
					//���� str���� null �϶��� 
					//break
					
					break;
				
				System.out.println("[����]" + str);
			}
		}catch(Exception e) {
	}
}
}

/*
package newtest;

import java.io.*;
import java.net.*;

class ReceiveThread extends Thread{//threadŬ������ ����� ���� receivethreadŬ����
     Socket socket;//���ϼ���

     ReceiveThread(Socket socket){
        //�����ڿ��� �ܺο��� �Ű������� �޾Ƽ�
        //���� ���ú꽺������ socket�ʵ忡 �Ű������� ������ ������ �Ҵ����ش�. 
   
          this.socket = socket;
     }
   
     public void run(){ //���޼���.
          try{                     
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//socket��ü�� getinputstream�޼���� �Էµ����͸� �Էµ���. 
//newŰ����� inputstreamreader�޼����. �Էµ����ͽ�Ʈ���� �о���δ�.
//newŰ����� bufferedreaderŬ������ü�� �Ű������� �޾Ƶ鿩��. �ڹپ��ø����̼��� ���� �� �ִ� ����Ʈ�ڵ�� ��ȯ�� ���� ���ۿ��� �е��� ����. �װ��� ��ü�� �����
//������ �ִ� reader��ü������ �Ҵ��Ѵ�. 
                 while(true){   
//while��                    
   
String str = reader.readLine();
//reader��ü������ readLine�޼��尡 �����͸� �а� 
//Ű����� ����. �������̽����� �����͸� �дµ�. �װ� ���������ϸ�
//reader��ü������ ��. 
//�� �о���� ��� ���ڿ�Ŭ����Ÿ���� ����� str��ü������ �Ҵ�ȴ�. 

                       if(str == null)
                          //���࿡ str�� ������ ������ ���϶��� 
                          //break ���ᰡ �Ǵ°���. 
                          //while�̱⶧���� �Է��� �ִµ��ȿ��� ��� �о����. 
                             break;

                  System.out.println("[����]"+str);//����� ����. �����̶�� �۾��� str���� ����� �����Ͱ� ��µȴ�.          
                 }       
          }catch(Exception e){//�����߻��� ����ó�� .          
          } 
     }
}
*/