package newtest;

import java.io.*;

public class Testread {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("test1.txt");
			
			int i;
			
			while ((i = fr.read()) != -1) {
				char c = (char)i;
				
				System.out.print(c);
			}
			fr.close();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}

/*
package newtest;

import java.io.*;

class Testread {

   public static void main(String[] args) {

      try {

         FileReader fr = new FileReader("multiplicationTable.txt");
         //FileReader클래스에서 읽어들이려는 파일을 쌍따옴표안에 넣어주고 이것을 매개변수로 씀. 그래서 객체생성해서 fr객체변수에 할당

         int i; //i변수 선언

         while ((i = fr.read()) != -1) {
            //while문 i가 fr객체변수의 read메서드한 내용을 담고 있게 함. -1과 다르다는 것이 true일 경우에 중괄호의 내용을 실행.
            

            char c = (char) i; //i의 내용을 char타입으로 강제변환하고 그내용을 c변수에 할당해준다. 

            System.out.print(c); //c를 출력함
         }
         fr.close(); //fr객체변수를 닫아준다. 이것은 읽기동작을 하는 객체를 종료시킨다. 

      } catch (IOException e) {

         System.out.println(e);
      } //예외처리에 대한 내용임. 
   }
}
*/
