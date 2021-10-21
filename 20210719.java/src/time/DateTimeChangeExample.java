package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재: " + now);
		
		LocalDateTime targetDateTime = null;
		
		//직접 변경
		targetDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		System.out.println("직접 변경: " + targetDateTime);
		
		//년도 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("다음 해의 첫 일: " + targetDateTime);
		
		//월 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달의 첫 일: " + targetDateTime);
		
		//요일 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일: " + targetDateTime);
	}
}


/*
package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now(); //now객체생성해서 now객체변수에 할당함.
      System.out.println("현재: " + now);
      
      LocalDateTime  targetDateTime = null; //targetDateTime객체변수에는 널값으로 초기화
      
      //직접 변경
      targetDateTime = now
         .withYear(2024) //withYear는 년도변경
         .withMonth(10)//month는 월변경
         .withDayOfMonth(5)//일자를 변경함
         .withHour(13) //시간을 변경함
         .withMinute(30)//분을 변경함
         .withSecond(20);//초를 변경함
      System.out.println("직접 변경: " + targetDateTime); // 누적데이터를 가지고 있는 targetDatetime객체변수를 변경된 데이터를 출력함. 
      
      //년도 상대 변경
      targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());//temporalAdjusters클래스의 firstdayofYear메서드
      //이해의 첫날에 대한 출력
         System.out.println("이번 해의 첫 일: " + targetDateTime);
      targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());//이번해의 마지막 일.
         System.out.println("이번 해의 마지막 일: " + targetDateTime);
         
      targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());//firstDayOfNextYear메서드는 
      //다음해의 연도 첫날
         System.out.println("다음 해의 첫 일: " + targetDateTime);
      
      //월 상대 변경
      targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());//이번달의 첫째일
         System.out.println("이번 달의 첫 일: " + targetDateTime);
         
      targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());//lastdayOfMonth 이번달의 마지막일
         System.out.println("이번 달의 마지막 일: " + targetDateTime);
         
      targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());//FIRSTdayofnextmonth메서드
      //다음달.첫일 다음달의 첫째일은 언제인가 해당데이터를 리턴한다. 
         System.out.println("다음 달의 첫 일: " + targetDateTime);
         
      //요일 상대 변경
      targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
      //월의 첫번째 인데, 그것은 한주중에서 월요일이다. 그것의 날짜데이터를 뽑아서 리턴한다. 그것을 타겟데이트타임이 할당받는다. 
         System.out.println("이번 달의 첫 월요일: " + targetDateTime);
      targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
      //다음에 돌아오는 월요일은? 해당리턴값을 targetdatetime변수에 할당한다 .
         System.out.println("돌아오는 월요일: " + targetDateTime);
         
      targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
      //previous지난 , 월요일에 대한 데이터를 뽑아서 targetDateTime변수에 할당한다. 
         System.out.println("지난 월요일: " + targetDateTime);
   }
}

*/