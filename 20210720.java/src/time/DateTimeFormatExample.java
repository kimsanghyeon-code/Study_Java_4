package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
      String nowString = now.format(dateTimeFormatter);
      System.out.println(nowString);
   }
}


/*
package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();//now메서드로 현재날짜와 시간데이터를 얻어냄 그리고 그 객체를 now객체변수에 할당함
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");//ofpattern메서드로 패턴을 제시한다. 그리고 그 객체를 datetimeformatter객체변수에 할당을 함
      String nowString = now.format(dateTimeFormatter); //now객체변수의 format을 위에서 설정했던 datetimeformatter변수를 매개변수로 넣어줌 그리고 그것을 string클래스타입이 적용된 nowstring객체변수에 할당을 함
      System.out.println(nowString); //출력
   }
}
*/