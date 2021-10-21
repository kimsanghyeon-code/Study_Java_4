package test;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		String[] strl = str.split(",");
		for(String token : strl) {
			System.out.println(token);
		}

	}
}


/*
package test;

import java.util.StringTokenizer;

public class SplitExample {
   public static void main(String[] args) {
      String str = "���̵�,�̸�,�н�����"; //���ڿ��� str��ü�����Ҵ�
      
      //���1(split() �޼ҵ� �̿�)
      String[] tokens = str.split(","); //str��ü������ split�޼��带 �۵���Ű�� �Ű������� �������� ,�� ����. �װ��� tokens stringŬ�����迭�� �־���
      for(String token : tokens) {
//for������ ���� tokens�迭���� �Ѱ��� �����͸� �̾Ƽ� for�� ���������� token�� �Ҵ��� �ؼ� .
         System.out.println(token);
//�����Ű�鼭 ����� �Ѵ�. 
//�� ��µɶ����� ����� ��
      }
      
      System.out.println();
//���� ����� �Ʒ��� ����� �����ϱ����� �����ڵ�
      
      //���2(StringTokenizer �̿�)
      StringTokenizer st = new StringTokenizer(str, ",");
//stringTokenizerŬ������ �����ڿ� ,�� �Ű������� �־���
//st��ü������ �Ҵ��� �Ѵ�. 
      while(st.hasMoreTokens()) {
//while������ st��ü�� ���� hasMoreTokens�޼��带 ������
         String token = st.nextToken();
//st��ü�������� nextToken�޼��带 ����ؼ� �����͸� �ְ� token���ڿ���ü������ �Ҵ���
         System.out.println(token);
//����� ��
      }
      
   }
}
*/
