package time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("시작일: " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("종료일: " + endDateTime + "\n");
		
		//---------------------------------------------------
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행 중입니다." + "\n");
		}else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다." + "\n");
		}else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다." + "\n");
		}
		//---------------------------------------------------
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond + "\n");
		//---------------------------------------------------
		System.out.println("[종료까지 남은 기간]");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println("남은 기간: " + period.getYears() + "년 ");
		System.out.println(period.getMonths() + "달 ");
		System.out.println(period.getDays() + "일\n");
		//---------------------------------------------------
		Duration duration = 
		Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("남은 초: " + duration.getSeconds());
		
		
	}
}


/*
package time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
   public static void main(String[] args) {
      LocalDateTime startDateTime = LocalDateTime.of(2023,  1, 1, 9, 0, 0);//매개변수를 입력받고 날짜데이터를 만들고
      //startDateTime객체변수에 할당을 함
      System.out.println("시작일: " + startDateTime);
      //넣어놓음 데이터를 출력함. 
      
      LocalDateTime endDateTime = LocalDateTime.of(2024,  3, 31, 18, 0, 0);//종료날짜에 대한 데이터를 of메서드로 입력하고
      //날짜데이터객체를 생성해서 endDateTime객체변수에 할당했음
      System.out.println("종료일: " + endDateTime + "\n");
      //--------------------------------------------------------------
      if(startDateTime.isBefore(endDateTime)) { //startDateTime이 endDateTime이전에 존재했는가
         //진행중이라고 출력함
         System.out.println("진행 중입니다." + "\n");
      } else if(startDateTime.isEqual(endDateTime)) {//시작날짜와 종료날짜가 같은가? 이에 해당하면 종료하라.
         System.out.println("종료합니다." + "\n");
      } else if(startDateTime.isAfter(endDateTime)) {//시작날짜가 종료날짜이후에 존재하는가? 그러면 종료하다. 
         System.out.println("종료했습니다." + "\n");
      }
      //--------------------------------------------------------------
      System.out.println("[종료까지 남은 시간]");
      long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
      //시작날짜와 종료날짜에 대한 시간차를 연도기준으로 계산해서 remainYear변수에 할당함
      long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
      //시작날짜와 종료날짜에 대한 시간차를 월기준으로 계산해서 remainMonth변수에 넣어줄것 
      long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
      //시작날짜와 종료날짜에 대한 시간차를 일자기준으로 계산해서 remainDay에 할당할것
      long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
      //시작데이터와 종료데이터사이의 시간을 계산해서 remainHour변수에 넣을 것
      long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
      //시작데이터와 종료데이터사이의 분을 계산해서 remainminute변수에 할당할것 
      long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
      //시작데이터와 종료데이터사이의 초단위를 계산해서 remainsecond변수에 할당할 것
      

      remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
      //시작날자와 종료날짜의 사이에 년도를 계산해서 remainYear변수에 할당
      remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
      //시작날짜와 종료날짜의 사이에 월을 계산해서 remainmonth변수에 할당
      remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
      //시작날짜와 종료날짜의 사이에 일을 계산해서 remainday에 할당한다
      remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
      //시작날짜와 종료날짜에서 시간차이를 구해서 remainHour변수에 할당
      remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
      //시작날자와 종료날자에서 초단위차이를 구해서 remainseond변수에 할당
      
      System.out.println("남은 해: " + remainYear);//결과 해를 출력
      System.out.println("남은 달: " + remainMonth);//결과달을 출력
      System.out.println("남은 일: " + remainDay);//결과월을 출력
      System.out.println("남은 시간: " + remainHour);//결과시간을 출력
      System.out.println("남은 분: " + remainMinute);//결과분을 출력
      System.out.println("남은 초: " + remainSecond + "\n");//결과초를 출력
      //--------------------------------------------------------------
      System.out.println("[종료까지 남은 기간]");
      Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
      //리턴타입이 Period클래스타입이다. 
      //페리오드는 날짜데이터연산에 사용함
      //페리오드클래스 between메서드로 startDatetime객체변수의 날짜데이터뽑는 메서드, endDatetime객체변수의 날짜데이터뽑는 메서드를 사용해서
      //시작날짜와 끝날짜를 메서드를 통해서 리턴받는다. 
      //그리고 그결과를 페리오드클래스의 타입적용한 period객체변수에 할당한다. 
      System.out.print("남은 기간: " + period.getYears() + "년 ");
      //period객체변수의 getYears메서드로 연도 출력
      System.out.print(period.getMonths() + "달 ");
      //period객체변수의 getMonths메서드로 월 출력
      System.out.println(period.getDays() + "일\n");
      //period객체변수의 getdays메서드로 일을 출력
      //리턴타입이 클래스타입으로 계산됨.
      //--------------------------------------------------------------
      Duration duration = 
      Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
      //Duration도 클래스임. 
      //duration의 between메서드로 시작날짜를 구하는 메서드와 끝날짜를 구하는 메서드로 매개변수르 넣고 duration으로 리턴받는다
      //그결과를 duration객체변수에 할당한다. 
      //between 같은 경우 숫자를 셀수있는 대상들끼리의 사이에서의 가지수를 구할때 사용하는 개념. 
      System.out.println("남은 초: " + duration.getSeconds());
      //duration객체변수에서 getsecons메서드로 
      //문장상에서 duration은 시작과 끝이 달리기 처럼 서로 연결관계에 있는 문장에서 많이 쓰인다
      //이 코드에서는 시작과 끝에서 연결되있는 그런 개념으로 시간을 계산해서 남은 초를 출력한것이다. 
      //duration은 시퀀스, 시리얼적인 표현임. 서로 이어져있는 아날로그데이터같은 표기임.
   }
}
*/