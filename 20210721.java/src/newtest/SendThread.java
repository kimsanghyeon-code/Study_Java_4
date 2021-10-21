package newtest;

import java.io.*;
import java.net.*;

public class SendThread extends Thread{
	Socket socket;
	//SocketŬ����Ÿ���� ������ socket��ü����
	
	SendThread(Socket socket){
		//socket��ü�� �Ű������� �ް�, SendThread��ü�� �ʵ忡 �Ű������� �Ҵ�
		
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			//System.in�޼��带 ���ؼ� �����͸� �Է¹޴� InputStreamReader�� ���� �� 
			//BufferedReader�� �Ҵ�
			//�װ��� BufferedReader Ŭ����Ÿ���� ����� reader�� �Ҵ�
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			//socket��ü�� getoutputStream�޼��带 ���� ����ϴ� ������ �ϴ� �Ű������� 
			//PrintWriter�� �Ҵ�
			//�װ��� PrintWriterŬ����Ÿ���� ����� writer�� �Ҵ�
			while(true) {
				
				String str = reader.readLine();
				//reader��ü������ readLine�� �����͸� �о ���ڿ� str��ü������ �Ҵ�
				if(str.equals("BYE"))
					//���� str��ü������ equals�޼��尡 BYE�� ���ٸ� 
					//Break
					break;
				writer.println(str);
				writer.flush();
			}
					
		}catch(Exception e) {
			//����ó��
			System.out.println(e);
		}finally {
			try {
				System.out.println("*****ä�ù��� �����ϴ�.*****");
				socket.close();
			}catch(Exception e) {}
		}
	}
}

/*
package newtest;

import java.io.*;
import java.net.*;
//ä�����α׷��� �ۼ��Ҷ��� �ְ� �޴� ������ ���ҿ� ���ؼ� Ŭ������ �ۼ��� ��. 
class SendThread extends Thread{//������κ��� ����� ���� sendthreadŬ����
     Socket socket; //socketŬ����Ÿ���� ������ socket��ü��������

     SendThread(Socket socket){//������. socket��ü�� �Ű������� �ް�,
        //���� sendThread��ü�� �ʵ忡 �Ű������� �Ҵ��� ��. 
   
          this.socket = socket;
     }
   
     public void run(){ //run�޼���
          try{                     
BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
//system.in�޼��带 ���ؼ� �����͸� �Է¹޵��� �ϴµ�. �̰��� inputsteramreaderŬ������ü�� �Ű������� �Ǿ���. 
//�Էµ� ��Ʈ���� �ڹ����α׷����� �о���ϼ� �ֵ��� ����Ʈ�ڵ�� ��ȯ�Ͽ� ���ۿ� �о���̰� �ϴ� ��
//buffredreaderŬ������. �̰��� �Ű������μ� �ٷ����� ����� �ڵ尡 �Ű������� ��. 
//readerŬ������ü������ �Ҵ�ȴ�. 
//reader��ü������ �Է¿� ���� �۾��� �ٷ�� �ְ� ��. 

PrintWriter writer =    new PrintWriter(socket.getOutputStream());
//socket��ü�� getoutputstream�޼��带 ���ؼ� ����� ���� �����͸� �ۼ���
//�̰��� �Ű������� printwriterŬ������ ��ü�� ����� , �̰��� wirter��ü������ �Ҵ���.
//writer���⿡ ���� �۾��� �ٷ���ְ� ��. 

                 while(true){
      
                       String str = reader.readLine();
//reader��ü������ readline������ �����͸� �о� �鿩�� str���ڿ���ü������ �Ҵ��Ѵ�.                        
                       if(str.equals("BYE")) 
//���࿡ str��ü������ equals�޼��尡 BYE�� ���ٸ�                          
//������ whilie���� �����Ѵ�. break������.                          
                             break;

                       writer.println(str);         
//if���� �߰�ȣ�� ������ �ٷ� �ؿ� ������ ������. �׷��� �ƴϸ� BYE�ƴϸ�
//writer��ü������ println�޼��忡�� str��ü������ ����� ������ ����Ѵ�. 
                       writer.flush();
//����� ������ writer��ü������ ���۸� ����ش�. flush�޼���.                       
                 }                 
          }catch(Exception e){                //�۾������� ������ ������ ����ó���� ����. 
                 System.out.println(e);        
          }finally{             
                try{   //���������� 
                      System.out.println("******ä�ù��� �����ϴ�.******");
                      //���ῡ ���� �޽����� �������. 
                      socket.close();         //socket��ü�� �ݾƹ���.          
                }catch(Exception e){ }              //�̿ܿ��� ����ó��
          }
    }
}
*/