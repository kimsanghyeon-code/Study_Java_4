package format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ D��° ��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("�̴��� d��° ��");
		System.out.println(sdf.format(now));
	}
}

/*
package format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
   public static void main(String[] args) {
      Date now = new Date(); //dateŬ������ü���� �ϰ� now��ü������ �Ҵ�
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //simpledateformatŬ������ü�� ������ ��
      //sdf�� �Ҵ��� ��
      System.out.println( sdf.format(now) ); //format�޼��带 ���ؼ� now��ü������ �ִ� 
      //date��ü�� �����
      //yyyy-MM-dd y�� ����,m�� ��, d�� ����. �׷��� ��¥ ǥ����.
      
      sdf = new SimpleDateFormat("yyyy�� MM�� dd��"); //�������� ��, ��, �Ϸ� ������ ����ְ�
      //�Ʒ��� ���� now��ü������ �ִ� �����͸� ����ϰ� �ȴ�
      System.out.println( sdf.format(now) );
      
      sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss"); // ���� �� ���ϰ� ������ ����Ҷ�
      // ������ �����ڸ� ��. �׸��� a�� ���� hh�ð� mm�� �� ss�� �� �̷��� �ð������͵� ���� ����Ѵ�. 
      System.out.println( sdf.format(now) );
      
      sdf = new SimpleDateFormat("������ E����"); //���� ��ü�� �����ؼ� �Ű������� E�� ���µ� �̰��� ���Ͽ� ���� ���� ǥ����. �ѱ���ǥ��. 
      System.out.println( sdf.format(now) ); //�������
      
      sdf = new SimpleDateFormat("������ D��° ��"); //������ �ϼ��� ����ؼ� ������ ����� ������ ����ϰ� ����Ѵ�. 
      System.out.println( sdf.format(now) );
      
      sdf = new SimpleDateFormat("�̴��� d��° ��"); //�̴޾��� n��° ���� �������.
      System.out.println( sdf.format(now) );      
   }
}
*/
