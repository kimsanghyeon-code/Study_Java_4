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
				System.out.println("*****채팅방을 나갑니다.*****");
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
     Socket socket; //socket객체변수를 선언함. 

     SendThread(Socket socket){
        //sendthread생성자선언
   
          this.socket = socket;
          //외부에서 들어온 socket객체매개변수를 현재 있는 sendthread객체변수의 socket필드에 할당함. 
     }
   
     public void run(){ //run메서드.
          try{                     
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//system.in 시스템에서 입력이 있으면 그것을 inputstreamreader객체를 생성해서 읽어들임
//bufferedreader클래스객체를 생성해서 우리가 전달하려고 하는 메시지를 버퍼에 담을 수 있도록 해주는 객체를 생성함. 
//그것을 reader객체변수에 할당함. 
PrintWriter writer =  new PrintWriter(socket.getOutputStream());
//socket객체변수의 getoutputstream메서드의 리턴결과를 printwriter객체변수에 매개변수로 할당함. 
//그것을 writer객체변수에 할당한다. 
                 while(true){//while문을 true로 해서 작동시킴. 
      
                       String str = reader.readLine();
                       //reader객체변수의 readline메서드가 입력글을 읽어들임
                       //그것의 결과를 str객체변수에 할당함.str은 문자열클래스로 되어있음. 
                       if(str.equals("BYE")) 
                          //만약에 str객체변수에 있는 데이터가 BYE라는 문자열과 같다면
                          //종료한다. 
                          
                             break;

                       writer.println(str);
                       //writer객체변수의 println메서드로 str에 저장된 데이터가 출력된다. 
                       writer.flush();//writer객체변수의 flush메서드가 출력된 이후의 버퍼를 비워준다. 
                 }                 
          }catch(Exception e){                //네트워킹에서 일어나는 오류에 대한 예외처리
                 System.out.println(e);        
          }finally{             //마지막에 
                try{   
                      System.out.println("******채팅방을 나갑니다.******");//메시지출력
                      socket.close();                  //socket객체를 닫아줌. 
                }catch(Exception e){ }              //이과정에 대한 예외처리를 달아줌. 
          }
    }
}
 */

