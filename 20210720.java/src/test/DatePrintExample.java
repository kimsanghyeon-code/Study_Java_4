package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
   public static void main(String[] args) {
      Date now = new Date(); //dateŬ������ü�� ������ �ؼ�. 
//now��ü������ �Ҵ��� ��.
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
//newŰ����� simpledateformatŬ������ü�� ���õ� �������� �Ű������� �ۼ��ϰ� ��ü�� �����ؼ� sdf��ü������ �Ҵ��� ��
      System.out.println( sdf.format(now) );
//sdf��ü������ format�ż���� now��ü������ �����
   }
}

/*
package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
   public static void main(String[] args) {
      Date now = new Date(); //dateŬ������ü�� ������ �ؼ�. 
//now��ü������ �Ҵ��� ��.
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
//newŰ����� simpledateformatŬ������ü�� ���õ� �������� �Ű������� �ۼ��ϰ� ��ü�� �����ؼ� sdf��ü������ �Ҵ��� ��
      System.out.println( sdf.format(now) );
//sdf��ü������ format�ż���� now��ü������ �����
   }
}
*/