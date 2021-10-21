package calendar;

import java.util.*;

public class CalendarExample {
   public static void main(String[] args) {
      Calendar now = Calendar.getInstance();
      
      int year    = now.get(Calendar.YEAR);                
      int month  = now.get(Calendar.MONTH) + 1;          
      int day    = now.get(Calendar.DAY_OF_MONTH);     
      
      int week    = now.get(Calendar.DAY_OF_WEEK);        
      String strWeek = null;
      switch(week) {
         case Calendar.MONDAY:
            strWeek = "월";
            break;
         case Calendar.TUESDAY:
            strWeek = "화";
            break;
         case Calendar.WEDNESDAY:
            strWeek = "수";
            break;
         case Calendar.THURSDAY:
            strWeek = "목";
            break;
         case Calendar.FRIDAY:
            strWeek = "금";
            break;
         case Calendar.SATURDAY:
            strWeek = "토";
            break;
         default:
            strWeek = "일";
      }
      
      int amPm  = now.get(Calendar.AM_PM);   
      String strAmPm = null;
      if(amPm == Calendar.AM) {
         strAmPm = "오전";
      } else {
         strAmPm = "오후";
      }
      
      int hour    = now.get(Calendar.HOUR);                 
      int minute  = now.get(Calendar.MINUTE);             
      int second  = now.get(Calendar.SECOND);              

      System.out.print(year + "년 ");
      System.out.print(month + "월 ");
      System.out.println(day + "일 ");
      System.out.print(strWeek + "요일 ");
      System.out.println(strAmPm + " ");
      System.out.print(hour + "시 ");
      System.out.print(minute + "분 ");
      System.out.println(second + "초 ");
   }
}

/*
package calendar;

import java.util.*;

public class CalendarExample {
   public static void main(String[] args) {
      Calendar now = Calendar.getInstance();
      //캘린더클래스에서 정적메서드인 겟인스턴스메서드를 통해서 달력데이터객체를 얻어낼수 있음.
      //그 얻어낸 객체를 now객체변수에 할당하고 사용한다. 
      
      int year    = now.get(Calendar.YEAR); //now객체변수에서 겟메서드를 데이터를 받아냄. 
      //년도를 리턴하게 됨. 그것이 year변수에 할당
      //calendar.YEAR 파란글씨가 나옴. 파란글씨는 캘린더클래스의 상수1
      int month  = now.get(Calendar.MONTH) + 1;         
      //월을 리턴해줌 그것이 month변수에 할당
      int day    = now.get(Calendar.DAY_OF_MONTH);
      //일을 리턴해줌 그것이 day변수에 할당
      
      int week    = now.get(Calendar.DAY_OF_WEEK);
      //요일을 리턴해줌 그것이 week변수에 할당
   
      String strWeek = null;
      //string클래스타입이 적용된 strWeek객체변수에 우선은 널값으로 초기화했음
      switch(week) {//switch문이 week변수에 들어간 데이터를 통해서 case를 선택하게 된다
         case Calendar.MONDAY: //현재 week에 있는 데이터가 calendar.MONDAY에 해당이 되는가
            //그러면 아래에 있는 strWeek객체변수에 월이라는 문자를 할당해준다 그리고 break해서 switch문빠져나감.
            //밑에 있는 나머지 요일정보도 다 똑같음. 
            strWeek = "월"; 
            break;
         case Calendar.TUESDAY:
            strWeek = "화";
            break;
         case Calendar.WEDNESDAY:
            strWeek = "수";
            break;
         case Calendar.THURSDAY:
            strWeek = "목";
            break;
         case Calendar.FRIDAY:
            strWeek = "금";
            break;
         case Calendar.SATURDAY:
            strWeek = "토";
            break;
         default: //그외의 정보는 일로 들어감
            strWeek = "일";
      }
      
      int amPm  = now.get(Calendar.AM_PM);
      //now객체변수에서 get메서드를 쓰는데 calendar클래스에서 AMPM상수데이터를 가져오고
      //그것을 amPm int변수에 할당을 함
      String strAmPm = null; //strAmPm string클래스객체변수를 선언하고 널값을 할당한다. 
      if(amPm == Calendar.AM) {
         //만약에 amPm변수가 calendar.AM데이터가 같다면 
         //strAmPm객체변수에는 오전을 할당하고 그것이 아니면 오후를 할당한다. 
         strAmPm = "오전";
      } else {
         strAmPm = "오후";
      }
      
      int hour    = now.get(Calendar.HOUR);
      //now객체변수에서 get메서드로 calendar.HOUR상수를 hour변수에 할당한다. 
      int minute  = now.get(Calendar.MINUTE);
      //calendar.MINUTE 분정도를 minute변수에 할당한다. 
      int second  = now.get(Calendar.SECOND);   
      //get메서드로 calendar.SECOND상수를 통해서 초데이터를 second변수에 할당한다. 

      System.out.print(year + "년 "); //위에 만들었던 년도 데이터변수를 출력함
      System.out.print(month + "월 ");//월데이터
      System.out.println(day + "일 ");//일데이터
      System.out.print(strWeek + "요일 ");//요일데이터
      System.out.println(strAmPm + " ");//AMPM 오전오후데이터
      System.out.print(hour + "시 ");//시데이터
      System.out.print(minute + "분 ");//분데이터
      System.out.println(second + "초 ");//초데이터
      //차례대로 변수를 생성한 것들을 하나씩 출력해준다. 
   }
}
*/
