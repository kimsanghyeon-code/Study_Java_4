package time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {
	public static void main(String[] args) throws InterruptedException{
		//��¥ ���
		LocalDate currDate = LocalDate.now();
		System.out.println("���� ��¥: " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("��ǥ ��¥: " + targetDate + "\n");
		
		//�ð� ���
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð�: " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0);
		System.out.println("��ǥ �ð�: " + targetTime + "\n");
		
		//��¥�� �ð� ���
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð�: " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("��ǥ ��¥�� �ð�: " + targetDateTime + "\n");
		
		//���� ����ÿ� �ð���(TimeZone)
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �����: " + utcDateTime);
		ZonedDateTime newyorkDateTime =
				ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.print("���� �ð���: " + newyorkDateTime + "\n");
		
		//Ư�� ������ Ÿ�ӽ����� ���
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1�� �����ϴ�.");
		}else if(instant1.isAfter(instant2)) {
			System.out.println("instant1�� �ʽ��ϴ�.");
		}else {
			System.out.println("������ �ð��Դϴ�.");
		}
		System.out.println("����(nanos): " + instant1.until(instant2,  ChronoUnit.NANOS));
	}
}

/*
package time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {
   public static void main(String[] args) throws InterruptedException {
      //��¥ ���
      LocalDate currDate = LocalDate.now(); //LocalDateŬ������ now�޼��带 ���ؼ� ��¥��ü��� currDate��ü������ �Ҵ�
      System.out.println("���� ��¥: " + currDate);//���

      LocalDate targetDate = LocalDate.of(2024, 5, 10);//�Ű�����3���� ����.
      //�׸��� ��¥�����Ͱ�ü�� �����ؼ� targetDate��ü������ �Ҵ��� ��
      System.out.println("��ǥ ��¥: " + targetDate + "\n");

      //�ð� ���
      LocalTime currTime = LocalTime.now(); //LocatTimeŬ������ now�޼��带 �Ἥ �ð���ü�� �����ϰ� currTime��ü������ �Ҵ���
      System.out.println("���� �ð�: " + currTime);//currTime��ü������ �����.
      
      LocalTime targetTime = LocalTime.of(6, 30, 0, 0);//.of�޼���� �Ű������� �־ �۵��ǰ����ִ� �޼����ε�
      //�ð��� ���� ������ ����. ��/��/��/������
      System.out.println("��ǥ �ð�: " + targetTime + "\n"); //���� ��������� �����ʾƼ� ����Ʈ�μ� ����� �ǰ� ��. 
      
      //��¥�� �ð� ���
      LocalDateTime currDateTime = LocalDateTime.now();//��¥�� �ð��� ���� ��ü�� ��. ���ݿ� ���� �ð���¥�����͸� ��� ��
      //������ ��ü�� currDateTime��ü������ �Ҵ��� ��
      System.out.println("���� ��¥�� �ð�: " + currDateTime);//���
      
      LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);//of�޼��尡 ����
      //��/��/��/��/��/��/�������� �����͸� �Ű������� �ְ� 
      //��ü������ �Ҵ��� ��.
      System.out.println("��ǥ ��¥�� �ð�: " + targetDateTime + "\n");//����ϰ� ��.
      
      //���� ����ÿ� �ð���(TimeZone)
      ZonedDateTime utcDateTime =   ZonedDateTime.now(ZoneId.of("UTC"));
      //zonedDateTime �ð����ð��� �������now�޼��带 �����. zoneID�߿��� of�޼���� UTC�ð��� �����Ѵ�. 
      //Ÿ������ �����͸� �ٷ�� ��ü�� �����µ�. �̰��� utcDateTime��ü������ �Ҵ��
      System.out.println("���� �����: " + utcDateTime); //��������ø� �����. 
      ZonedDateTime newyorkDateTime = 
       ZonedDateTime.now(ZoneId.of("America/New_York"));
      //zonedDateTime���� now�޼��� zonedId.of�޼���� ����/���ø��� �Ű������� �ְ� newyorkDateTime��ü������ �Ҵ���
      System.out.println("���� �ð���: " + newyorkDateTime + "\n");//����Ѵ�. 
      
      //Ư�� ������ Ÿ�ӽ����� ���
      Instant instant1 = Instant.now();//Ư�������� �ð��� üũ��.
      //now�޼���� ���� �ð��� �޾Ƴ�. �װ��� instant1��ü������ ������
      Thread.sleep(10); //1�� 1/1000�ʵ��� �����带 �����. 1000�� 1����. �и������������.
      Instant instant2 = Instant.now();//instant.now�޼���� ����ð��� üũ�ϰ� ��. �׸��� �� �����Ϳ� ���� ��ü�� instant2��ü������ �Ҵ���      
      if(instant1.isBefore(instant2)) {//���࿡ instant2��ü���������� instant1�� �־��°�. 
         //�̰��� ���̸� instant1�� �����ϴٶ�� ��µ�.
         System.out.println("instant1�� �����ϴ�.");
      } else if(instant1.isAfter(instant2)) {
         System.out.println("instant1�� �ʽ��ϴ�.");
      } else {
         System.out.println("������ �ð��Դϴ�.");
      }
      System.out.println("����(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
      //instant1�� until�޼���� instant1�� ����� instant2�ϰ� �� �ð����� �����
      //ChronoUnitŬ�����ε� NANOS�޼���� �����ʴ����� ����� �Ѵ�. 
   }
}
*/