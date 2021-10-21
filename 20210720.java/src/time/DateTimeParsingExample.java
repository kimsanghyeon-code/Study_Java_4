package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21",formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21",formatter);
		System.out.println(localDate);
		
		formatter= DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21",formatter);
		System.out.println(localDate);
	}
}

/*
package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
   public static void main(String[] args) {
      DateTimeFormatter formatter;//datetimeformatter클래스 타입이 적용된 formatter객체변수선언
      LocalDate localDate; //localdate클래스타입적용된 localdate객체변수선언됨
      
      localDate = LocalDate.parse("2024-05-21");//매개변수로 날짜가 들어감. localdate변수에 할당을 했음.
      System.out.println(localDate);//그대로 출력을 함. 
      
      formatter = DateTimeFormatter.ISO_LOCAL_DATE; //datetimeformatter클래스에서 상수를 formatter변수를 할당함.
      localDate = LocalDate.parse("2024-05-21", formatter);//파스메서드로 출력하려고 하는 날짜와 포맷이 잡힌 변수를 매개변수로 둘다 넣어줌.
      //그것을 localDate변수에 할당을 함.
      System.out.println(localDate);      
      
      formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");//ofpattern메서드로 날짜의 패턴을 설정해주고. 그것을 formatter변수에 할당
      localDate = LocalDate.parse("2024/05/21", formatter);//parse메서드로 입력하는 날짜와 패턴이 저장된 변수를 매개변수로 넣어준다 localdate에 할당
      System.out.println(localDate);//출력
      
      formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");//다른형태의 패턴. 도트를 구분자로 하는 패턴을 넣고 formatter변수에 할당함
      localDate = LocalDate.parse("2024.05.21", formatter);//parse메서드에 날짜와 포맷변수를 매개변수로 넣고 localDate변수에 할당함
      System.out.println(localDate);//출력
   }
}
*/
