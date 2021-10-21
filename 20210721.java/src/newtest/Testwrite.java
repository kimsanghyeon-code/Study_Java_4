package newtest;

import java.io.*;

public class Testwrite {

	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("multiplicationTable.txt");
			
			for(int i=5; i<10; i++) {
				
				for(int j=5; j<10; j++) {
					
					fw.write(i + "x" + j + "=" + (i*j) + " ");
				}
				fw.write("\n");
			}
			fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}


/*
package newtest;

import java.io.*;

class Testwrite {

   public static void main(String[] args) {

      try {

         FileWriter fw = new FileWriter("multiplicationTable.txt");//new키워드 FileWriter클래스객체생성해서 이때 매개변수는 
         //파일쓰기를 할려고 할때 사용하려는 파일명을 기재해주시면 됨
         //객체생성을 해서 FileWriter클래스타입을 적용한 fw객체변수에 할당을 함.

         for (int i = 5; i < 10; i++) { //for문에서 i는 5로 초기화되고, i는 10보다 작을때까지 반복

            for (int j = 5; j < 10; j++) { //for문에서 j는 5로 초기화되고, j는 10보다 작을때까지 반복

          fw.write(i + "x" + j + "=" + (i * j) + "  "); //fw객체변수에 write메서드의 매개변수로 출력할내용을 작성함
          //i x j = i*j 
          //공백덕분에 출력문이 한칸씩 띄워서 나오게 됨.
            }
            fw.write("\n");//fw객체변수의 write메서드가 개행문자를 넣어줘서. 한줄내리게 된다. 
         }
         fw.close(); //fw객체변수에서 close메서드를 써서 쓰기작업을 작업을 할 수 있는 객체변수를 닫아버리는 메서드가 close임. 
         // 통신도 그렇고 파일쓰기도 그렇고 마지막에는 사용하던 객체를 종료시키는 것이 필요함

      } catch (IOException e) { //입출력예외처리에 대한 클래스와 객체에 대한 기재를 함

         System.out.println(e);//오류내용을 출력하는 것
      }
   }
}
*/