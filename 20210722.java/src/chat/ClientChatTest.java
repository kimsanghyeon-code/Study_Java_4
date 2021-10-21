package chat;

import java.io.*;
import java.net.*;

public class ClientChatTest {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("218.37.39.138",7050);
			System.out.println("*****채팅방에 들어왔습니다.*****");
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
           
           Socket socket = null;   //socket클래스타입을 적용한 socket객체변수에 널값으로 초기화함.

           try{   
                 socket = new Socket("127.0.0.1",7050);
                 //socket객체를 생성을 하는데. 매개변수는 서버ip와 포트번호를 집어넣고 소켓객체를 만들고 socket객체변수에 할당.

                 System.out.println("******채팅방에 들어왔습니다.******"); 

                 SendThread st = new SendThread(socket); //sendthread클래스의 객체를 생성을 하고 매개변수는
                 //포트번호와 접속정보를 넣은 socket객체변수를 사용하고 좌측에 있는 st객체변수에 객체를 할당
                 //메시지전달용 객체생성
                 ReceiveThread rt = new ReceiveThread(socket);
                 //receivethread클래스의 객체를 생성을 하고 접속정보가 있는 socket객체변수를 매개변수로 넣는다. 그리고 
                 //좌측에 있는 rt객체변수에 할당을 함.
                 //응답용 객체생성

                 st.start();//샌드스레드의 start메서드를 작동시키고
         
                 rt.start();//리시브스레드의 start메서드를 작동시킨다. 

           }catch(Exception e){                
                 System.out.println(e);        
           }
      }
}
*/