package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
      String nowString = now.format(dateTimeFormatter);
      System.out.println(nowString);
   }
}


/*
package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();//now�޼���� ���糯¥�� �ð������͸� �� �׸��� �� ��ü�� now��ü������ �Ҵ���
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");//ofpattern�޼���� ������ �����Ѵ�. �׸��� �� ��ü�� datetimeformatter��ü������ �Ҵ��� ��
      String nowString = now.format(dateTimeFormatter); //now��ü������ format�� ������ �����ߴ� datetimeformatter������ �Ű������� �־��� �׸��� �װ��� stringŬ����Ÿ���� ����� nowstring��ü������ �Ҵ��� ��
      System.out.println(nowString); //���
   }
}
*/