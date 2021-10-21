package newtest;

import java.io.*;

public class one {

	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("test1.txt");
			//test1.txt파일을 매개변수로 하는 새로운 FileWriter클래스 객체를 생성
			//그것을 FileWriter클래스타입이 적용된 fw에 할당
			for(int i = 2; i<10; i++) {
				for(int j =1; j<10; j++) {
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
 class test1 {
public static void main(String[] args) {
   try {
FileWriter test1 = new FileWriter("test1.txt");//FileWriter클래스객체를 생성하는 데 이떄 매개변수가 test1.txt가 되는것임. 그것을 test1객체변수에 할당
      for (int i = 1; i<10; i++) {//for문은 i는 1에서 10보다 작을때까지.
         for(int j=1; j<10; j++) {//for문은 j가 1에서 10보다 작을때까지.
         test1.write(i + "x" + j + "=" + (i*j) + " ");//test1객체변수에 write메서드로 구구단계산코드를 사용함.
            
         }
         test1.write("\n");
      }
      test1.close();
   }catch(IOException e) {
      System.out.println(e);
   }
}
}
*/