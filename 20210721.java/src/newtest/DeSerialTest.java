package newtest;

import java.io.*;

public class DeSerialTest {
	public static void main(String[] args) {
		
		try {
			ObjectInputStream in = 
					new ObjectInputStream(new FileInputStream("a.dat"));
			//a.dat파일을 읽어들일 수 있는 새로운 FileInputStream클래스 객체 생성 후 ObjectInputStream에 할당
			//그것을 매개변수로 삼는 objectInputStream 클래스타입을 적용한 객체변수
			StuInfo s;
			//StuInfo클래스타입이 적용된 객체변수 s
			while ((s=(StuInfo) in.readObject()) !=null)
				//while문이 시작
				//in객체변수에 readObject메서드로 객체의 내용을 읽음
				//해당 정보를 s객체변수에 할당
				//그것이 null값이 아니라면, 아래의 출력메서드 실행
				s.printInfo();
			//메서드 작동
			in.close();
			//메서드 닫음
		}catch(EOFException e) {
			//예외처리코드
			System.out.println("더 이상 읽을 데이터가 없습니다");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


/*
package newtest;

import java.io.*;

class DeSerialTest {

   public static void main(String[] args) {

      try {

ObjectInputStream in = new ObjectInputStream(new FileInputStream("a.dat"));
//new키워드로 파일인풋스트림클래스의 객체를 생성하고 a.dat파일을 읽어들일수있도록 해주는 객체로서 작동함. 
//객체의 역직렬화를 위해서 objectInputstream클래스객체를 생성할때 바로 윗줄에서 설명한 파일입력객체를 매개변수로 삼는다는 것
//이렇게 읽어진 객체들을 
//좌측에 있는 in 객체변수. objectinputstream클래스타입을 적용한 객체변수인데. 이것이 우측의 객체를 할당받는다.
//이제 in객체변수가 데이터역직렬화를 위해서 작동된다. 


         StuInfo s;
//stuinfo클래스타입이 적용된 s객체변수         

         while ((s = (StuInfo) in.readObject()) != null)
//while문이 시작되고 in객체변수에 readObject메서드로 객체의 내용을 역직렬화하여 읽어들임.
//읽어들인 내용을 stuinfo클래스타입으로 캐스팅연산, 강제타입변환을 하는 것임. 
//변환된 객체정보를 s객체변수에 할당을 함.
//할당된 내용이 null 아니다는 것이 참이면. 아래의 출력메서드를 작동시킴            

            s.printInfo();
//s.printinfo메서드를 작동시킴   
//stuinfo클래스에 있던 직렬화와 역직렬화에 관련된 코드들중에서
//역직렬화로 객체를 출력하게 될 메서드를 작동시킨다. 

         in.close();
//역직렬화에 관여한 in객체변수를 close메서드로 닫아버린다.          

      } catch (EOFException e) { //더이상 읽어들일 내용이 없을때의 예외처리를 위한 코드예요. 
         

         System.out.println("더 이상 읽을 데이터가 없습니다");

      } catch (Exception e) { //그외의 에러가 생길때 작동되는 예외처리클래스 

         System.out.println(e);
      }
   }
}
*/