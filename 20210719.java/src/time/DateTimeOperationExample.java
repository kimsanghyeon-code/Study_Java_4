package time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("�����: " + now);
		
		LocalDateTime targetDateTime = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);
		System.out.println("������: " + targetDateTime);
	}
}

/*
package time;
import java.time.LocalDateTime;

public class DateTimeOperationExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();//LocalDateTimeŬ������ now�޼��带 ���ؼ� �ð������͸� ��� now��ü�����Ҵ��� ��
      System.out.println("�����: " + now);
      
      LocalDateTime  targetDateTime = now //LocalDateTimeŬ������ targetDateTime������ �����ؼ� ���� now������ �̸��� ���ֽð�. 
            //now��ü������ �ִ� �ð���ü�� targetDateTime������ �Ҵ��� �ؼ� �ð������͸� ������. 
         .plusYears(1) //plusYears�޼���� �⵵�� �����ְ�
         .minusMonths(2) //minusMonths�޼���� ���� �����Ѵ�
         .plusDays(3) //plusDays�޼���� ���ڸ� �����ش�
         .plusHours(4) //plusHours�޼���� �ð��� �����ش�
         .minusMinutes(5) //minusMinutes �е����͸� �������ش�
         .plusSeconds(6); //plusSeconds�ʵ����͸� �߰����ش�. 
      System.out.println("������: " + targetDateTime); //�ð��� ���� ������ ���ٷ� �� �����ְ�, �װ���� ������
      //targetDateTime������ ����ϸ� �ȴ�.
   }
}
*/