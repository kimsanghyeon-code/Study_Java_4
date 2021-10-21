package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
   public static void main(String[] args) {
      Date now = new Date(); //date클래스객체를 생성을 해서. 
//now객체변수에 할당을 함.
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
//new키워드로 simpledateformat클래스객체를 제시된 포맷으로 매개변수를 작성하고 객체를 생성해서 sdf객체변수에 할당을 함
      System.out.println( sdf.format(now) );
//sdf객체변수에 format매서드로 now객체변수를 출력함
   }
}

/*
package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
   public static void main(String[] args) {
      Date now = new Date(); //date클래스객체를 생성을 해서. 
//now객체변수에 할당을 함.
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
//new키워드로 simpledateformat클래스객체를 제시된 포맷으로 매개변수를 작성하고 객체를 생성해서 sdf객체변수에 할당을 함
      System.out.println( sdf.format(now) );
//sdf객체변수에 format매서드로 now객체변수를 출력함
   }
}
*/