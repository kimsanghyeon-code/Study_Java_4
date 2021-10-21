package newtest;

import java.io.*;
import java.net.*;

public class SendThread extends Thread{
	Socket socket;
	//Socket클래스타입을 적용한 socket객체변수
	
	SendThread(Socket socket){
		//socket객체를 매개변수로 받고, SendThread객체의 필드에 매개변수를 할당
		
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			//System.in메서드를 통해서 데이터를 입력받는 InputStreamReader를 생성 후 
			//BufferedReader에 할당
			//그것을 BufferedReader 클래스타입이 적용된 reader에 할당
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			//socket객체에 getoutputStream메서드를 통해 출력하는 역할을 하는 매개변수를 
			//PrintWriter에 할당
			//그것을 PrintWriter클래스타입이 적용된 writer에 할당
			while(true) {
				
				String str = reader.readLine();
				//reader객체변수의 readLine의 데이터를 읽어서 문자열 str객체변수에 할당
				if(str.equals("BYE"))
					//만약 str객체변수의 equals메서드가 BYE와 같다면 
					//Break
					break;
				writer.println(str);
				writer.flush();
			}
					
		}catch(Exception e) {
			//예외처리
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
package newtest;

import java.io.*;
import java.net.*;
//채팅프로그램을 작성할때는 주고 받는 각각의 역할에 대해서 클래스를 작성을 함. 
class SendThread extends Thread{//스레드로부터 상속을 받은 sendthread클래스
     Socket socket; //socket클래스타입을 적용한 socket객체변수선언

     SendThread(Socket socket){//생성자. socket객체를 매개변수로 받고,
        //현재 sendThread객체의 필드에 매개변수를 할당을 함. 
   
          this.socket = socket;
     }
   
     public void run(){ //run메서드
          try{                     
BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
//system.in메서드를 통해서 데이터를 입력받도록 하는데. 이것이 inputsteramreader클래스객체의 매개변수가 되어줌. 
//입력된 스트림을 자바프로그램에서 읽어들일수 있도록 바이트코드로 전환하여 버퍼에 읽어들이게 하는 게
//buffredreader클래스임. 이것의 매개변수로서 바로위의 설명된 코드가 매개변수로 들어감. 
//reader클래스객체변수에 할당된다. 
//reader객체변수는 입력에 대한 작업을 다룰수 있게 됨. 

PrintWriter writer =    new PrintWriter(socket.getOutputStream());
//socket객체에 getoutputstream메서드를 통해서 출력을 대한 데이터를 작성함
//이것을 매개변수로 printwriter클래스가 객체를 만들고 , 이것을 wirter객체변수에 할당함.
//writer쓰기에 대한 작업을 다룰수있게 됨. 

                 while(true){
      
                       String str = reader.readLine();
//reader객체변수의 readline한행의 데이터를 읽어 들여서 str문자열객체변수에 할당한다.                        
                       if(str.equals("BYE")) 
//만약에 str객체변수에 equals메서드가 BYE와 같다면                          
//현재의 whilie문을 종료한다. break때문에.                          
                             break;

                       writer.println(str);         
//if문이 중괄호가 없으면 바로 밑에 문장을 실행함. 그런데 아니면 BYE아니면
//writer객체변수에 println메서드에서 str객체변수에 저장된 문장을 출력한다. 
                       writer.flush();
//출력이 끝나면 writer객체변수에 버퍼를 비워준다. flush메서드.                       
                 }                 
          }catch(Exception e){                //작업진행중 에러가 나오면 예외처리를 해줌. 
                 System.out.println(e);        
          }finally{             
                try{   //마지막으로 
                      System.out.println("******채팅방을 나갑니다.******");
                      //종료에 대한 메시지를 출력해줌. 
                      socket.close();         //socket객체도 닫아버림.          
                }catch(Exception e){ }              //이외에는 예외처리
          }
    }
}
*/