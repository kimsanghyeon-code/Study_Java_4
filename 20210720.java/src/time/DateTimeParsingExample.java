package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21",formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21",formatter);
		System.out.println(localDate);
		
		formatter= DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21",formatter);
		System.out.println(localDate);
	}
}

/*
package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
   public static void main(String[] args) {
      DateTimeFormatter formatter;//datetimeformatterŬ���� Ÿ���� ����� formatter��ü��������
      LocalDate localDate; //localdateŬ����Ÿ������� localdate��ü���������
      
      localDate = LocalDate.parse("2024-05-21");//�Ű������� ��¥�� ��. localdate������ �Ҵ��� ����.
      System.out.println(localDate);//�״�� ����� ��. 
      
      formatter = DateTimeFormatter.ISO_LOCAL_DATE; //datetimeformatterŬ�������� ����� formatter������ �Ҵ���.
      localDate = LocalDate.parse("2024-05-21", formatter);//�Ľ��޼���� ����Ϸ��� �ϴ� ��¥�� ������ ���� ������ �Ű������� �Ѵ� �־���.
      //�װ��� localDate������ �Ҵ��� ��.
      System.out.println(localDate);      
      
      formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");//ofpattern�޼���� ��¥�� ������ �������ְ�. �װ��� formatter������ �Ҵ�
      localDate = LocalDate.parse("2024/05/21", formatter);//parse�޼���� �Է��ϴ� ��¥�� ������ ����� ������ �Ű������� �־��ش� localdate�� �Ҵ�
      System.out.println(localDate);//���
      
      formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");//�ٸ������� ����. ��Ʈ�� �����ڷ� �ϴ� ������ �ְ� formatter������ �Ҵ���
      localDate = LocalDate.parse("2024.05.21", formatter);//parse�޼��忡 ��¥�� ���˺����� �Ű������� �ְ� localDate������ �Ҵ���
      System.out.println(localDate);//���
   }
}
*/
