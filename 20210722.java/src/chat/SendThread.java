package chat;

import java.io.*;
import java.net.*;

public class SendThread extends Thread{
	Socket socket;
	
	SendThread(Socket socket){
		this.socket = socket;
	}
	
	public void run(){
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			while(true) {
				String str = reader.readLine();
				if(str.equals("BYE"))
					break;
				
				writer.println(str);
				writer.flush();
			}
		}catch(Exception e) {
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
package chat;

import java.io.*;
import java.net.*;

class SendThread extends Thread{
     Socket socket; //socket��ü������ ������. 

     SendThread(Socket socket){
        //sendthread�����ڼ���
   
          this.socket = socket;
          //�ܺο��� ���� socket��ü�Ű������� ���� �ִ� sendthread��ü������ socket�ʵ忡 �Ҵ���. 
     }
   
     public void run(){ //run�޼���.
          try{                     
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//system.in �ý��ۿ��� �Է��� ������ �װ��� inputstreamreader��ü�� �����ؼ� �о����
//bufferedreaderŬ������ü�� �����ؼ� �츮�� �����Ϸ��� �ϴ� �޽����� ���ۿ� ���� �� �ֵ��� ���ִ� ��ü�� ������. 
//�װ��� reader��ü������ �Ҵ���. 
PrintWriter writer =  new PrintWriter(socket.getOutputStream());
//socket��ü������ getoutputstream�޼����� ���ϰ���� printwriter��ü������ �Ű������� �Ҵ���. 
//�װ��� writer��ü������ �Ҵ��Ѵ�. 
                 while(true){//while���� true�� �ؼ� �۵���Ŵ. 
      
                       String str = reader.readLine();
                       //reader��ü������ readline�޼��尡 �Է±��� �о����
                       //�װ��� ����� str��ü������ �Ҵ���.str�� ���ڿ�Ŭ������ �Ǿ�����. 
                       if(str.equals("BYE")) 
                          //���࿡ str��ü������ �ִ� �����Ͱ� BYE��� ���ڿ��� ���ٸ�
                          //�����Ѵ�. 
                          
                             break;

                       writer.println(str);
                       //writer��ü������ println�޼���� str�� ����� �����Ͱ� ��µȴ�. 
                       writer.flush();//writer��ü������ flush�޼��尡 ��µ� ������ ���۸� ����ش�. 
                 }                 
          }catch(Exception e){                //��Ʈ��ŷ���� �Ͼ�� ������ ���� ����ó��
                 System.out.println(e);        
          }finally{             //�������� 
                try{   
                      System.out.println("******ä�ù��� �����ϴ�.******");//�޽������
                      socket.close();                  //socket��ü�� �ݾ���. 
                }catch(Exception e){ }              //�̰����� ���� ����ó���� �޾���. 
          }
    }
}
 */

