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
            strWeek = "��";
            break;
         case Calendar.TUESDAY:
            strWeek = "ȭ";
            break;
         case Calendar.WEDNESDAY:
            strWeek = "��";
            break;
         case Calendar.THURSDAY:
            strWeek = "��";
            break;
         case Calendar.FRIDAY:
            strWeek = "��";
            break;
         case Calendar.SATURDAY:
            strWeek = "��";
            break;
         default:
            strWeek = "��";
      }
      
      int amPm  = now.get(Calendar.AM_PM);   
      String strAmPm = null;
      if(amPm == Calendar.AM) {
         strAmPm = "����";
      } else {
         strAmPm = "����";
      }
      
      int hour    = now.get(Calendar.HOUR);                 
      int minute  = now.get(Calendar.MINUTE);             
      int second  = now.get(Calendar.SECOND);              

      System.out.print(year + "�� ");
      System.out.print(month + "�� ");
      System.out.println(day + "�� ");
      System.out.print(strWeek + "���� ");
      System.out.println(strAmPm + " ");
      System.out.print(hour + "�� ");
      System.out.print(minute + "�� ");
      System.out.println(second + "�� ");
   }
}

/*
package calendar;

import java.util.*;

public class CalendarExample {
   public static void main(String[] args) {
      Calendar now = Calendar.getInstance();
      //Ķ����Ŭ�������� �����޼����� ���ν��Ͻ��޼��带 ���ؼ� �޷µ����Ͱ�ü�� ���� ����.
      //�� �� ��ü�� now��ü������ �Ҵ��ϰ� ����Ѵ�. 
      
      int year    = now.get(Calendar.YEAR); //now��ü�������� �ٸ޼��带 �����͸� �޾Ƴ�. 
      //�⵵�� �����ϰ� ��. �װ��� year������ �Ҵ�
      //calendar.YEAR �Ķ��۾��� ����. �Ķ��۾��� Ķ����Ŭ������ ���1
      int month  = now.get(Calendar.MONTH) + 1;         
      //���� �������� �װ��� month������ �Ҵ�
      int day    = now.get(Calendar.DAY_OF_MONTH);
      //���� �������� �װ��� day������ �Ҵ�
      
      int week    = now.get(Calendar.DAY_OF_WEEK);
      //������ �������� �װ��� week������ �Ҵ�
   
      String strWeek = null;
      //stringŬ����Ÿ���� ����� strWeek��ü������ �켱�� �ΰ����� �ʱ�ȭ����
      switch(week) {//switch���� week������ �� �����͸� ���ؼ� case�� �����ϰ� �ȴ�
         case Calendar.MONDAY: //���� week�� �ִ� �����Ͱ� calendar.MONDAY�� �ش��� �Ǵ°�
            //�׷��� �Ʒ��� �ִ� strWeek��ü������ ���̶�� ���ڸ� �Ҵ����ش� �׸��� break�ؼ� switch����������.
            //�ؿ� �ִ� ������ ���������� �� �Ȱ���. 
            strWeek = "��"; 
            break;
         case Calendar.TUESDAY:
            strWeek = "ȭ";
            break;
         case Calendar.WEDNESDAY:
            strWeek = "��";
            break;
         case Calendar.THURSDAY:
            strWeek = "��";
            break;
         case Calendar.FRIDAY:
            strWeek = "��";
            break;
         case Calendar.SATURDAY:
            strWeek = "��";
            break;
         default: //�׿��� ������ �Ϸ� ��
            strWeek = "��";
      }
      
      int amPm  = now.get(Calendar.AM_PM);
      //now��ü�������� get�޼��带 ���µ� calendarŬ�������� AMPM��������͸� ��������
      //�װ��� amPm int������ �Ҵ��� ��
      String strAmPm = null; //strAmPm stringŬ������ü������ �����ϰ� �ΰ��� �Ҵ��Ѵ�. 
      if(amPm == Calendar.AM) {
         //���࿡ amPm������ calendar.AM�����Ͱ� ���ٸ� 
         //strAmPm��ü�������� ������ �Ҵ��ϰ� �װ��� �ƴϸ� ���ĸ� �Ҵ��Ѵ�. 
         strAmPm = "����";
      } else {
         strAmPm = "����";
      }
      
      int hour    = now.get(Calendar.HOUR);
      //now��ü�������� get�޼���� calendar.HOUR����� hour������ �Ҵ��Ѵ�. 
      int minute  = now.get(Calendar.MINUTE);
      //calendar.MINUTE �������� minute������ �Ҵ��Ѵ�. 
      int second  = now.get(Calendar.SECOND);   
      //get�޼���� calendar.SECOND����� ���ؼ� �ʵ����͸� second������ �Ҵ��Ѵ�. 

      System.out.print(year + "�� "); //���� ������� �⵵ �����ͺ����� �����
      System.out.print(month + "�� ");//��������
      System.out.println(day + "�� ");//�ϵ�����
      System.out.print(strWeek + "���� ");//���ϵ�����
      System.out.println(strAmPm + " ");//AMPM �������ĵ�����
      System.out.print(hour + "�� ");//�õ�����
      System.out.print(minute + "�� ");//�е�����
      System.out.println(second + "�� ");//�ʵ�����
      //���ʴ�� ������ ������ �͵��� �ϳ��� ������ش�. 
   }
}
*/
