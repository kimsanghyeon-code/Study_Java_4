package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("����: " + now);
		
		LocalDateTime targetDateTime = null;
		
		//���� ����
		targetDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		System.out.println("���� ����: " + targetDateTime);
		
		//�⵵ ��� ����
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("�̹� ���� ù ��: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("�̹� ���� ������ ��: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("���� ���� ù ��: " + targetDateTime);
		
		//�� ��� ����
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("�̹� ���� ù ��: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("�̹� ���� ������ ��: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("���� ���� ù ��: " + targetDateTime);
		
		//���� ��� ����
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("�̹� ���� ù ������: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("���ƿ��� ������: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("���� ������: " + targetDateTime);
	}
}


/*
package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now(); //now��ü�����ؼ� now��ü������ �Ҵ���.
      System.out.println("����: " + now);
      
      LocalDateTime  targetDateTime = null; //targetDateTime��ü�������� �ΰ����� �ʱ�ȭ
      
      //���� ����
      targetDateTime = now
         .withYear(2024) //withYear�� �⵵����
         .withMonth(10)//month�� ������
         .withDayOfMonth(5)//���ڸ� ������
         .withHour(13) //�ð��� ������
         .withMinute(30)//���� ������
         .withSecond(20);//�ʸ� ������
      System.out.println("���� ����: " + targetDateTime); // ���������͸� ������ �ִ� targetDatetime��ü������ ����� �����͸� �����. 
      
      //�⵵ ��� ����
      targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());//temporalAdjustersŬ������ firstdayofYear�޼���
      //������ ù���� ���� ���
         System.out.println("�̹� ���� ù ��: " + targetDateTime);
      targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());//�̹����� ������ ��.
         System.out.println("�̹� ���� ������ ��: " + targetDateTime);
         
      targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());//firstDayOfNextYear�޼���� 
      //�������� ���� ù��
         System.out.println("���� ���� ù ��: " + targetDateTime);
      
      //�� ��� ����
      targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());//�̹����� ù°��
         System.out.println("�̹� ���� ù ��: " + targetDateTime);
         
      targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());//lastdayOfMonth �̹����� ��������
         System.out.println("�̹� ���� ������ ��: " + targetDateTime);
         
      targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());//FIRSTdayofnextmonth�޼���
      //������.ù�� �������� ù°���� �����ΰ� �ش絥���͸� �����Ѵ�. 
         System.out.println("���� ���� ù ��: " + targetDateTime);
         
      //���� ��� ����
      targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
      //���� ù��° �ε�, �װ��� �����߿��� �������̴�. �װ��� ��¥�����͸� �̾Ƽ� �����Ѵ�. �װ��� Ÿ�ٵ���ƮŸ���� �Ҵ�޴´�. 
         System.out.println("�̹� ���� ù ������: " + targetDateTime);
      targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
      //������ ���ƿ��� ��������? �ش縮�ϰ��� targetdatetime������ �Ҵ��Ѵ� .
         System.out.println("���ƿ��� ������: " + targetDateTime);
         
      targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
      //previous���� , �����Ͽ� ���� �����͸� �̾Ƽ� targetDateTime������ �Ҵ��Ѵ�. 
         System.out.println("���� ������: " + targetDateTime);
   }
}

*/