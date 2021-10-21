package time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시: " + now);
		
		LocalDateTime targetDateTime = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);
		System.out.println("연산후: " + targetDateTime);
	}
}

/*
package time;
import java.time.LocalDateTime;

public class DateTimeOperationExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();//LocalDateTime클래스의 now메서드를 통해서 시간데이터를 얻고 now객체변수할당을 함
      System.out.println("현재시: " + now);
      
      LocalDateTime  targetDateTime = now //LocalDateTime클래스로 targetDateTime변수를 정의해서 위의 now변수의 이름을 써주시고. 
            //now객체변수에 있던 시간객체를 targetDateTime변수에 할당을 해서 시간데이터를 공유함. 
         .plusYears(1) //plusYears메서드로 년도로 더해주고
         .minusMonths(2) //minusMonths메서드로 월을 차감한다
         .plusDays(3) //plusDays메서드로 일자를 더해준다
         .plusHours(4) //plusHours메서드로 시간을 더해준다
         .minusMinutes(5) //minusMinutes 분데이터를 차감해준다
         .plusSeconds(6); //plusSeconds초데이터를 추가해준다. 
      System.out.println("연산후: " + targetDateTime); //시간에 대한 연산을 한줄로 다 끝내주고, 그결과를 저장한
      //targetDateTime변수를 출력하면 된다.
   }
}
*/