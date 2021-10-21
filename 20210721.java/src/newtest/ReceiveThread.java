package newtest;

import java.io.*;
import java.net.*;

public class ReceiveThread extends Thread {
	//thread클래스의 상속을 받은 ReceiveThread클래스
	Socket socket;
	
	ReceiveThread(Socket socket){
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			//socket객체의 getinputStream메서드로 입력데이터를 받은 것을 InputStreamReader로 읽어들이고
			//그것을 BufferedReader클래스객체의 매개변수로 받아들이고
			//BufferedReader 클래스타입이 적용된 reader에 할당
			while(true) {
				
				String str = reader.readLine();
				//reader변수의 readLine메서드가 데이터를 읽어들이고(키보드로)
				//그 값을 문자열클래스타입이 적용된 str에 할당
				if(str == null)
					//만약 str값이 null 일때는 
					//break
					
					break;
				
				System.out.println("[상대방]" + str);
			}
		}catch(Exception e) {
	}
}
}

/*
package newtest;

import java.io.*;
import java.net.*;

class ReceiveThread extends Thread{//thread클래스의 상속을 받은 receivethread클래스
     Socket socket;//소켓선언

     ReceiveThread(Socket socket){
        //생성자에서 외부에서 매개변수를 받아서
        //현재 리시브스레드의 socket필드에 매개변수로 들어오는 소켓을 할당해준다. 
   
          this.socket = socket;
     }
   
     public void run(){ //런메서드.
          try{                     
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//socket객체의 getinputstream메서드로 입력데이터를 입력들임. 
//new키워드로 inputstreamreader메서드로. 입력데이터스트림을 읽어들인다.
//new키워드로 bufferedreader클래스객체의 매개변수로 받아들여서. 자바애플리케이션이 읽을 수 있는 바이트코드로 변환된 것을 버퍼에서 읽도록 해줌. 그것을 객체로 만들고
//좌측에 있는 reader객체변수에 할당한다. 
                 while(true){   
//while문                    
   
String str = reader.readLine();
//reader객체변수의 readLine메서드가 데이터를 읽고 
//키보드와 같은. 인터페이스에서 데이터를 읽는데. 그게 누구에의하면
//reader객체변수가 함. 
//그 읽어들인 결과 문자열클래스타입이 적용된 str객체변수에 할당된다. 

                       if(str == null)
                          //만약에 str이 내용이 없으면 널일때는 
                          //break 종료가 되는것임. 
                          //while이기때문에 입력이 있는동안에는 계속 읽어들임. 
                             break;

                  System.out.println("[상대방]"+str);//출력을 해줌. 상대방이라는 글씨와 str변수 저장된 데이터가 출력된다.          
                 }       
          }catch(Exception e){//에러발생시 예외처리 .          
          } 
     }
}
*/