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
		
		String strDateTime = now.getYear() + "��";
		strDateTime += now.getMonthValue() + "��";
		strDateTime += now.getDayOfMonth() + "��";
		strDateTime += now.getHour() + "��";
		strDateTime += now.getMinute() + "��";
		strDateTime += now.getSecond() + "��";
		strDateTime += now.getNano() + "������";
		System.out.println(strDateTime + "\n");
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("���ش� ����: 2���� 29�ϱ��� �ֽ��ϴ�.\n");
		}else {
			System.out.println("���ش� ���: 2���� 28�ϱ��� �ֽ��ϴ�.\n");
		}
		
		//���� ����ÿ� ��������
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �����: " + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� Ÿ����: " + seoulDateTime);
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("���� �����̵�: " + seoulZoneId);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("���� ��������: " + seoulZoneOffset + "\n");
				
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
      LocalDateTime now = LocalDateTime.now();//LocalDateTimeŬ������ now�޼���� ��ü�� �����ϰ�
      //now��ü������ �Ҵ��Ѵ�.
      System.out.println(now);//����� ��. 

      String strDateTime = now.getYear() + "�� ";//now��ü���� getYear�޼��带 �۵��ϰ� ���� ���ڿ��� �߰����Ŀ� strDateTime��ü������ �Ҵ��Ѵ�.
      strDateTime += now.getMonthValue() + "�� ";//���Կ����ڷ� now��ü���� getMonthValue�޼��忡 ���̶�� �ܾ �߰��ϰ� strDateTime���ڿ���ü������ �Ҵ�
      strDateTime += now.getDayOfMonth() + "�� ";//���Կ����ڷ� getDayofMonth�޼���� �������ް�, ���̶�� ���ڸ� �߰��Ѵ�. 
      strDateTime += now.getDayOfWeek() + " ";//���Կ����ڷ� week���� ������ �����ؼ� ������ �Ҵ��Ѵ�.
      strDateTime += now.getHour() + "�� "; //�ð������� �߰��ؼ� ���Կ����� �����Ѵ�.
      strDateTime += now.getMinute() + "�� "; //�������� �߰��ؼ� ���Կ����� �����Ѵ�. 
      strDateTime += now.getSecond() + "�� ";//�������� �߰��ؼ� ���Կ����� �����Ѵ�. 
      strDateTime += now.getNano() + "������";//������������ �߰��ؼ� ���Կ����� �����Ѵ�. 
      System.out.println(strDateTime + "\n");//������Ų strDateTime��ü������ ����� ������ �ϴ� ����Ѵ�.
      
      LocalDate nowDate = now.toLocalDate(); //toLocalDate�޼���� ��ü�� �����ؼ� nowDate������ �Ҵ��Ѵ�. 
      if(nowDate.isLeapYear()) {//���࿡ nowDate������ isLeapYear�޼��尡 ���ϰ�쿡 �Ʒ��� �߰�ȣ�� �����Ѵ�. 
         System.out.println("���ش� ����: 2���� 29�ϱ��� �ֽ��ϴ�.\n");
      } else {
         System.out.println("���ش� ���: 2���� 28�ϱ��� �ֽ��ϴ�.\n");
      }
      
      //���� ����ÿ� ��������
      ZonedDateTime utcDateTime =   ZonedDateTime.now(ZoneId.of("UTC"));//ZonedDateTimeŬ������ now�޼���
      //UTF ��������ø� �������.
      System.out.println("���� �����: " + utcDateTime);
      ZonedDateTime seoulDateTime =  ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
      //zoneddatetimeŬ�������� now�޼���� ������ asia ���ô� seoul�� �ð��� ���� ��ü�� �����ؼ� seoulDateTime������ �Ҵ��Ѵ�. 
      System.out.println("���� Ÿ����: " + seoulDateTime);//seoulDateTime������ ���� �����.
      ZoneId seoulZoneId = seoulDateTime.getZone();//seoulDateTime��ü������ getZone�޼��带 �۵���Ű�� ������.
      //Zone���������� �˷��޶�� ��.������ �޾Ƽ� seoulZonId��ü�� �Ҵ��Ѵ� (zoneIdŬ������ Ÿ���� ������) 
      System.out.println("���� �����̵�: " + seoulZoneId);//�����. 
      ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();//seouldateTime��ü������ ���ؽð��� ������ �˾Ƴ��� getOffset�޼��带 �۵����Ѽ�
      //�װ���� seoulzoneoffset������ �Ҵ��� ��
      System.out.println("���� ��������: " + seoulZoneOffset + "\n");// �����. 
   }
}
*/
