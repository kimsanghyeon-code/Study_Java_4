package newtest;

import java.io.*;
import java.net.*;

public class ClientTest {
	public static void main(String[] args) {
		Socket socket = null;
		//socket 클래스타입을 Socket 객체에 적용 후 null값으로 초기화
		
		try {
			socket = new Socket("218.37.39.138",5050);
			//new Socket클래스객체를 생성 후 매개변수로 ip주소 넣고 socket객체변수에 적용
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			//socket객체변수의 getInputStream메서드로 데이터 입력받은 후 새로운 InputStreamReader메서드로 매개변수를 받음
			//이것을 새로운 BufferedReader 클래스 객체 생성 후 매개변수로 받고 BufferedReader클래스가 적용된 reader 변수에 할당
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
			//socket객체의 getOutputStream 메서드가 적용된 PrintWriter메서드를 출력작업  함
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
           //socket클래스타입을 socket객체에 적용함. 
           //널값으로 초기화함. 
   
           try{   
                 socket = new Socket("119.195.234.50",5060);
                 //new socket클래스객체를 생성하는 데 매개변수로 서버의 ip주소를 넣어줌. 
                 //서버하기위한 해당애플리케이션의 포트번호는 5060임. 
                 //ip 주소는 집주소같은 것임. 
                 //아파트면. 집주소로 갔는데. 동호수에 해당하는 게 포트번호라보시면 되요. 
                 //socket객체변수에 할당함. 
 
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//socket객체변수의 getinputstream메서드로 데이터를 입력받고 new키워드로 inputstreamreader메서드로 매개변수로 삼음. 
//이것을 다시 bufferedReader클래스객체를 생성하고 위의 코드를 매개변수로 받은 다음에. 좌측에 있는 
//bufferedreader클래스타입적용된 reader객체변수에 할당한다. 
         
PrintWriter writer = new PrintWriter(socket.getOutputStream());
//socket객체의 getoutputstream메서드를 출력스트림에 데이터를 보낼 수 있게 됨.
//new키워드로 printwriter메서드를 출력작업을 함.
//이에 객체를 좌측에 있는 writer객체변수가 할당을 받음. 
//writer출력에 대해서 주관한다. 
                 
                 writer.println("Hi, I’m client!");//클라이언트측의 메시지가 출력됨. 
         
                 writer.flush();// 클라이언트측의 버퍼를 정리하는 writer객체변수의 flush메서드를 작동시킴

                 System.out.println(reader.readLine());//reader객체변수에서 readline메서드로 외부에서 들어온 출력스트림을 인쇄줄단위로 함.
                 

          }catch(Exception e){                
                 System.out.println(e);//과정에서 문제가 있으면 예외처리를 해줌.         
          }finally{             //마지막에 
                try{   
                      socket.close();  //작업이 끝났으니까. socket객체를 close메서드로 닫아버림. 
                
                }catch(Exception e){ }              //예외처리를 해줌. 
          }
    }
}
*/