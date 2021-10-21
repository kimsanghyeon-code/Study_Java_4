package time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {
	public static void main(String[] args) throws InterruptedException{
		//날짜 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜: " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("목표 날짜: " + targetDate + "\n");
		
		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간: " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0);
		System.out.println("목표 시간: " + targetTime + "\n");
		
		//날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("목표 날짜와 시간: " + targetDateTime + "\n");
		
		//협정 세계시와 시간촌(TimeZone)
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		ZonedDateTime newyorkDateTime =
				ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.print("뉴욕 시간존: " + newyorkDateTime + "\n");
		
		//특정 시점의 타임스태프 얻기
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠릅니다.");
		}else if(instant1.isAfter(instant2)) {
			System.out.println("instant1이 늦습니다.");
		}else {
			System.out.println("동일한 시간입니다.");
		}
		System.out.println("차이(nanos): " + instant1.until(instant2,  ChronoUnit.NANOS));
	}
}

/*
package time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {
   public static void main(String[] args) throws InterruptedException {
      //날짜 얻기
      LocalDate currDate = LocalDate.now(); //LocalDate클래스의 now메서드를 통해서 날짜객체얻고 currDate객체변수에 할당
      System.out.println("현재 날짜: " + currDate);//출력

      LocalDate targetDate = LocalDate.of(2024, 5, 10);//매개변수3개를 넣음.
      //그리고 날짜데이터객체를 생성해서 targetDate객체변수에 할당을 함
      System.out.println("목표 날짜: " + targetDate + "\n");

      //시간 얻기
      LocalTime currTime = LocalTime.now(); //LocatTime클래스의 now메서드를 써서 시간객체를 생성하고 currTime객체변수에 할당함
      System.out.println("현재 시간: " + currTime);//currTime객체변수를 출력함.
      
      LocalTime targetTime = LocalTime.of(6, 30, 0, 0);//.of메서드는 매개변수를 넣어서 작동되게해주는 메서드인데
      //시간에 대한 설정을 해줌. 시/분/초/나노초
      System.out.println("목표 시간: " + targetTime + "\n"); //따로 출력포맷을 잡지않아서 디폴트로서 출력이 되게 함. 
      
      //날짜와 시간 얻기
      LocalDateTime currDateTime = LocalDateTime.now();//날짜와 시간에 대한 객체를 얻어냄. 지금에 대한 시간날짜데이터를 얻게 함
      //생성된 객체를 currDateTime객체변수에 할당을 함
      System.out.println("현재 날짜와 시간: " + currDateTime);//출력
      
      LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);//of메서드가 나옴
      //년/월/일/시/분/초/나노초의 데이터를 매개변수로 넣고 
      //객체변수에 할당을 함.
      System.out.println("목표 날짜와 시간: " + targetDateTime + "\n");//출력하게 함.
      
      //협정 세계시와 시간존(TimeZone)
      ZonedDateTime utcDateTime =   ZonedDateTime.now(ZoneId.of("UTC"));
      //zonedDateTime 시간존시간의 현재상태now메서드를 사용함. zoneID중에서 of메서드로 UTC시간을 적용한다. 
      //타임존의 데이터를 다루는 객체가 나오는데. 이것이 utcDateTime객체변수에 할당됨
      System.out.println("협정 세계시: " + utcDateTime); //협정세계시를 출력함. 
      ZonedDateTime newyorkDateTime = 
       ZonedDateTime.now(ZoneId.of("America/New_York"));
      //zonedDateTime에서 now메서드 zonedId.of메서드로 국가/도시명을 매개변수로 넣고 newyorkDateTime객체변수에 할당함
      System.out.println("뉴욕 시간존: " + newyorkDateTime + "\n");//출력한다. 
      
      //특정 시점의 타임스탬프 얻기
      Instant instant1 = Instant.now();//특정시점의 시간을 체크함.
      //now메서드로 현재 시간을 받아냄. 그것을 instant1객체변수에 저장함
      Thread.sleep(10); //1은 1/1000초동안 스레드를 멈춘다. 1000이 1초임. 밀리세컨드단위임.
      Instant instant2 = Instant.now();//instant.now메서드로 현재시간을 체크하게 함. 그리고 그 데이터에 대한 객체를 instant2객체변수에 할당함      
      if(instant1.isBefore(instant2)) {//만약에 instant2객체변수이전에 instant1이 있었는가. 
         //이것이 참이면 instant1이 빠릅니다라고 출력됨.
         System.out.println("instant1이 빠릅니다.");
      } else if(instant1.isAfter(instant2)) {
         System.out.println("instant1이 늦습니다.");
      } else {
         System.out.println("동일한 시간입니다.");
      }
      System.out.println("차이(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
      //instant1에 until메서드로 instant1과 대상인 instant2하고 의 시간차를 계산함
      //ChronoUnit클래스인데 NANOS메서드로 나노초단위로 계산을 한다. 
   }
}
*/