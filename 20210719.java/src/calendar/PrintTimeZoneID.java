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
      //TimeZone Ŭ�����̰� �׾ȿ� �ִ� getAvailableIDs �ð��� Ÿ������ ���� �迭��������. 
      for(String id : availableIDs) {
         //availableIDs�� �迭������ ������ �ִ� id�� �Ѱ��� �迭�����͸� �̾ƿͼ� ���������μ� ����� �ȴ�. 
         System.out.println(id);
      }
   }
}
*/