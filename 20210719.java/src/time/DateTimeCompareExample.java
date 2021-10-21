package time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("������: " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("������: " + endDateTime + "\n");
		
		//---------------------------------------------------
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("���� ���Դϴ�." + "\n");
		}else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("�����մϴ�." + "\n");
		}else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("�����߽��ϴ�." + "\n");
		}
		//---------------------------------------------------
		System.out.println("[������� ���� �ð�]");
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
		
		System.out.println("���� ��: " + remainYear);
		System.out.println("���� ��: " + remainMonth);
		System.out.println("���� ��: " + remainDay);
		System.out.println("���� �ð�: " + remainHour);
		System.out.println("���� ��: " + remainMinute);
		System.out.println("���� ��: " + remainSecond + "\n");
		//---------------------------------------------------
		System.out.println("[������� ���� �Ⱓ]");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println("���� �Ⱓ: " + period.getYears() + "�� ");
		System.out.println(period.getMonths() + "�� ");
		System.out.println(period.getDays() + "��\n");
		//---------------------------------------------------
		Duration duration = 
		Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("���� ��: " + duration.getSeconds());
		
		
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
      LocalDateTime startDateTime = LocalDateTime.of(2023,  1, 1, 9, 0, 0);//�Ű������� �Է¹ް� ��¥�����͸� �����
      //startDateTime��ü������ �Ҵ��� ��
      System.out.println("������: " + startDateTime);
      //�־���� �����͸� �����. 
      
      LocalDateTime endDateTime = LocalDateTime.of(2024,  3, 31, 18, 0, 0);//���ᳯ¥�� ���� �����͸� of�޼���� �Է��ϰ�
      //��¥�����Ͱ�ü�� �����ؼ� endDateTime��ü������ �Ҵ�����
      System.out.println("������: " + endDateTime + "\n");
      //--------------------------------------------------------------
      if(startDateTime.isBefore(endDateTime)) { //startDateTime�� endDateTime������ �����ߴ°�
         //�������̶�� �����
         System.out.println("���� ���Դϴ�." + "\n");
      } else if(startDateTime.isEqual(endDateTime)) {//���۳�¥�� ���ᳯ¥�� ������? �̿� �ش��ϸ� �����϶�.
         System.out.println("�����մϴ�." + "\n");
      } else if(startDateTime.isAfter(endDateTime)) {//���۳�¥�� ���ᳯ¥���Ŀ� �����ϴ°�? �׷��� �����ϴ�. 
         System.out.println("�����߽��ϴ�." + "\n");
      }
      //--------------------------------------------------------------
      System.out.println("[������� ���� �ð�]");
      long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
      //���۳�¥�� ���ᳯ¥�� ���� �ð����� ������������ ����ؼ� remainYear������ �Ҵ���
      long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
      //���۳�¥�� ���ᳯ¥�� ���� �ð����� ���������� ����ؼ� remainMonth������ �־��ٰ� 
      long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
      //���۳�¥�� ���ᳯ¥�� ���� �ð����� ���ڱ������� ����ؼ� remainDay�� �Ҵ��Ұ�
      long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
      //���۵����Ϳ� ���ᵥ���ͻ����� �ð��� ����ؼ� remainHour������ ���� ��
      long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
      //���۵����Ϳ� ���ᵥ���ͻ����� ���� ����ؼ� remainminute������ �Ҵ��Ұ� 
      long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
      //���۵����Ϳ� ���ᵥ���ͻ����� �ʴ����� ����ؼ� remainsecond������ �Ҵ��� ��
      

      remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
      //���۳��ڿ� ���ᳯ¥�� ���̿� �⵵�� ����ؼ� remainYear������ �Ҵ�
      remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
      //���۳�¥�� ���ᳯ¥�� ���̿� ���� ����ؼ� remainmonth������ �Ҵ�
      remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
      //���۳�¥�� ���ᳯ¥�� ���̿� ���� ����ؼ� remainday�� �Ҵ��Ѵ�
      remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
      //���۳�¥�� ���ᳯ¥���� �ð����̸� ���ؼ� remainHour������ �Ҵ�
      remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
      //���۳��ڿ� ���ᳯ�ڿ��� �ʴ������̸� ���ؼ� remainseond������ �Ҵ�
      
      System.out.println("���� ��: " + remainYear);//��� �ظ� ���
      System.out.println("���� ��: " + remainMonth);//������� ���
      System.out.println("���� ��: " + remainDay);//������� ���
      System.out.println("���� �ð�: " + remainHour);//����ð��� ���
      System.out.println("���� ��: " + remainMinute);//������� ���
      System.out.println("���� ��: " + remainSecond + "\n");//����ʸ� ���
      //--------------------------------------------------------------
      System.out.println("[������� ���� �Ⱓ]");
      Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
      //����Ÿ���� PeriodŬ����Ÿ���̴�. 
      //�丮����� ��¥�����Ϳ��꿡 �����
      //�丮����Ŭ���� between�޼���� startDatetime��ü������ ��¥�����ͻ̴� �޼���, endDatetime��ü������ ��¥�����ͻ̴� �޼��带 ����ؼ�
      //���۳�¥�� ����¥�� �޼��带 ���ؼ� ���Ϲ޴´�. 
      //�׸��� �װ���� �丮����Ŭ������ Ÿ�������� period��ü������ �Ҵ��Ѵ�. 
      System.out.print("���� �Ⱓ: " + period.getYears() + "�� ");
      //period��ü������ getYears�޼���� ���� ���
      System.out.print(period.getMonths() + "�� ");
      //period��ü������ getMonths�޼���� �� ���
      System.out.println(period.getDays() + "��\n");
      //period��ü������ getdays�޼���� ���� ���
      //����Ÿ���� Ŭ����Ÿ������ ����.
      //--------------------------------------------------------------
      Duration duration = 
      Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
      //Duration�� Ŭ������. 
      //duration�� between�޼���� ���۳�¥�� ���ϴ� �޼���� ����¥�� ���ϴ� �޼���� �Ű������� �ְ� duration���� ���Ϲ޴´�
      //�װ���� duration��ü������ �Ҵ��Ѵ�. 
      //between ���� ��� ���ڸ� �����ִ� ���鳢���� ���̿����� �������� ���Ҷ� ����ϴ� ����. 
      System.out.println("���� ��: " + duration.getSeconds());
      //duration��ü�������� getsecons�޼���� 
      //����󿡼� duration�� ���۰� ���� �޸��� ó�� ���� ������迡 �ִ� ���忡�� ���� ���δ�
      //�� �ڵ忡���� ���۰� ������ ������ִ� �׷� �������� �ð��� ����ؼ� ���� �ʸ� ����Ѱ��̴�. 
      //duration�� ������, �ø������� ǥ����. ���� �̾����ִ� �Ƴ��α׵����Ͱ��� ǥ����.
   }
}
*/