package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년";
		strDateTime += now.getMonthValue() + "월";
		strDateTime += now.getDayOfMonth() + "일";
		strDateTime += now.getHour() + "시";
		strDateTime += now.getMinute() + "분";
		strDateTime += now.getSecond() + "초";
		strDateTime += now.getNano() + "나노초";
		System.out.println(strDateTime + "\n");
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("올해는 윤년: 2월은 29일까지 있습니다.\n");
		}else {
			System.out.println("올해는 평년: 2월은 28일까지 있습니다.\n");
		}
		
		//협정 세계시와 존오프셋
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 타임촌: " + seoulDateTime);
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("서울 존아이디: " + seoulZoneId);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("서울 존오프셋: " + seoulZoneOffset + "\n");
				
	}
}

/*
package time;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();//LocalDateTime클래스의 now메서드로 객체를 생성하고
      //now객체변수에 할당한다.
      System.out.println(now);//출력을 함. 

      String strDateTime = now.getYear() + "년 ";//now객체에서 getYear메서드를 작동하고 뒤의 문자열을 추가한후에 strDateTime객체변수에 할당한다.
      strDateTime += now.getMonthValue() + "월 ";//대입연산자로 now객체에서 getMonthValue메서드에 월이라는 단어를 추가하고 strDateTime문자열객체변수에 할당
      strDateTime += now.getDayOfMonth() + "일 ";//대입연산자로 getDayofMonth메서드로 일정도받고, 일이라는 글자를 추가한다. 
      strDateTime += now.getDayOfWeek() + " ";//대입연산자로 week주의 정보를 추출해서 변수에 할당한다.
      strDateTime += now.getHour() + "시 "; //시간정보를 추가해서 대입연산을 진행한다.
      strDateTime += now.getMinute() + "분 "; //분정보를 추가해서 대입연산을 진행한다. 
      strDateTime += now.getSecond() + "초 ";//초정보를 추가해서 대입연산을 진행한다. 
      strDateTime += now.getNano() + "나노초";//나노초정보를 추가해서 대입연산을 진행한다. 
      System.out.println(strDateTime + "\n");//누적시킨 strDateTime객체변수에 저장된 내용을 싹다 출력한다.
      
      LocalDate nowDate = now.toLocalDate(); //toLocalDate메서드로 객체를 생성해서 nowDate변수에 할당한다. 
      if(nowDate.isLeapYear()) {//만약에 nowDate변수에 isLeapYear메서드가 참일경우에 아래의 중괄호를 실행한다. 
         System.out.println("올해는 윤년: 2월은 29일까지 있습니다.\n");
      } else {
         System.out.println("올해는 평년: 2월은 28일까지 있습니다.\n");
      }
      
      //협정 세계시와 존오프셋
      ZonedDateTime utcDateTime =   ZonedDateTime.now(ZoneId.of("UTC"));//ZonedDateTime클래스의 now메서드
      //UTF 협정세계시를 출력했음.
      System.out.println("협정 세계시: " + utcDateTime);
      ZonedDateTime seoulDateTime =  ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
      //zoneddatetime클래스에서 now메서드로 국가는 asia 도시는 seoul의 시간에 대한 객체를 생성해서 seoulDateTime변수에 할당한다. 
      System.out.println("서울 타임존: " + seoulDateTime);//seoulDateTime변수의 값을 출력함.
      ZoneId seoulZoneId = seoulDateTime.getZone();//seoulDateTime객체변수에 getZone메서드를 작동시키고 리턴함.
      //Zone지역정보를 알려달라는 것.정보를 받아서 seoulZonId객체에 할당한다 (zoneId클래스의 타입을 적용한) 
      System.out.println("서울 존아이디: " + seoulZoneId);//출력함. 
      ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();//seouldateTime객체변수의 기준시간대 정보를 알아내는 getOffset메서드를 작동시켜서
      //그결과를 seoulzoneoffset변수에 할당을 함
      System.out.println("서울 존오프셋: " + seoulZoneOffset + "\n");// 출력함. 
   }
}
*/
