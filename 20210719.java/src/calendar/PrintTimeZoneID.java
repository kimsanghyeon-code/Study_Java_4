package calendar;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}
}


/*
package calendar;

import java.util.TimeZone;

public class PrintTimeZoneID {
   public static void main(String[] args) {
      String[] availableIDs = TimeZone.getAvailableIDs();
      //TimeZone 클래스이고 그안에 있는 getAvailableIDs 시간대 타임존에 대한 배열데이터임. 
      for(String id : availableIDs) {
         //availableIDs이 배열데이터 좌측에 있는 id가 한개씩 배열데이터를 뽑아와서 지역변수로서 출력이 된다. 
         System.out.println(id);
      }
   }
}
*/