package newtest;

import java.io.*;
import java.net.*;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		//ServerSocket클래스타입이 적용된 serverSocket객체변수가 선언되고 null값으로 초기화 
		Socket socket = null;
		//Socket클래스타입이 적용된 socket객체변수 null값으로 초기화
		try {
			serverSocket = new ServerSocket(5050);
			//ServerSocket객체 생성 (포트번호 5050)
			System.out.println("ready to connect..");
			socket = serverSocket.accept();
			//대기하다가 클라이언트에서 연결요청이 들어오면 승인하는 것이 accept메서드
			//이것을 작동시켜서 socket객체변수에 할당
			System.out.println("connected!");
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			//socket객체변수에 getinputStream메서드를 할당(키보드로 입력)
			//그것을 새로운 InputStreamReader에 할당
			//그것을 새로운 BufferedReader객체 생성 후 할당하는데,
			//BufferedReader클래스타입이 적용된 reader에 할당
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

class ServerTest{//서버테스트클래스
       public static void main(String[] args) {   
           ServerSocket serverSocket = null;//serversocket클래스타입이 적용된 serversocket객체변수가 선언이 되고 널값으로 초기화
    
           Socket socket = null; //socket클래스타입이 적용된 socket객체변수에도 널값으로 초기화
   
           try{   
                 serverSocket = new ServerSocket(5060);//serversocket객체를 생성할때 프로그램의 포트번호를 5060으로 설정함.
                 //그것을 serversocket객체변수에 할당

       System.out.println("ready to connect..");
                 
       socket = serverSocket.accept();//대기를 하다가 클라이언트에서 연결요청이 들어오면 그것을 잡아주는 것이 accept메서드이고 이것을 작동시켜서 socket객체변수에 넣어줌. 

                 System.out.println("connected!");         
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//한행의 단위로 데이터를 읽어들이는 것이 버퍼리더클래스이고. 이것을 적용항 reader객체변수를 선언과 함꼐 우측에 있는 결과물을 할당받는다.
//socket객체변수에 getInputstream메서드를 작동시킴. 입력받음
//그것을 매개변수로 new키워드 inputstreamReader클래스객체를 생성함. 입력되는 데이터흐름을 읽어들임. 
//이것을 매개변수로 new키워드 bufferedReader클래스객체를 생성해서 
//앞에서 설명했던 reader객체변수에 할당을 함. 
         
PrintWriter writer = new PrintWriter(socket.getOutputStream());
//socket객체변수에서 getoutputstream메서드를 통해서 출력을 하는데, new키워드로 printwriter클래스객체를 생성을 함. 
//그것을 printwriter클래스타입을 받은 writer객체변수에 할당함. 쓰기 작업에 대한 것은 writer객체변수가 작업함.
         
                 System.out.println(reader.readLine());
//출력을 하는데 reader객체변수의 readline메서드를 데이터라인을 읽어들임. 그리고 읽어들인 데이터를 출력함.                  
         
                 writer.println("Hello, I’m server!");
//writer객체변수에서 println메서드를 통해 출력하는데. 위의 문자열을 출력하는 것임. 이게 연결되어서 데이터주고 받음이 된다는 것을 보여줌.                  
         
                 writer.flush();
//writer객체변수에서 flush메서드로 버퍼에 있는 스트림을 정리해버린다.                  
          
          }catch(Exception e){                
                 System.out.println(e);        //연결과정에 문제가 있으면 예외처리를 해줌.
          }finally{//마지막으로 작업하는 것.              
                try{   
                      socket.close(); //socket객체를 닫고. 
                
                }catch(Exception e){ }//여기서 문제 터지면. 여기에서 예외처리를 해줌.               
                try{
                       serverSocket.close();//serversocket을 닫아줌. 

                }catch(Exception e){ }//예외처리를 해줌. 
         }
    }
}
*/