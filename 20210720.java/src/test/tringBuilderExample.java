package test;

public class tringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		System.out.print(str);
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
	}
}


/*
package test;

public class StringBuilderExample {
   public static void main(String[] args) {
      String str = "";//������ str��ü������ �Ҵ�
      for(int i=1; i<=100; i++) {
//i�� 1�� �ʱ�ȭ�ϰ� 100���� �۰ų� ���������� �ݺ�
         str += i; //str��ü������ i�� ������Ų�ٴ� ��
      }
      System.out.println(str);
      
      StringBuilder sb = new StringBuilder(); //stringbuilderŬ������ü�����ؼ� ��Ʈ������Ŭ����Ÿ���� ������ sb��ü������ �Ҵ�
      for(int i=1; i<=100; i++) {
//for������ i�� 1�� �����ϰ� i�� 100�����۰ų� ���������� �ݺ�
         sb.append(i); //sb��ü�� append�޼��带 �����ϰ� �Ű������� i�� ����
      }
      str = sb.toString(); //sb��ü������ toString�޼��带 �۵���Ű�� ���ϰ��� str��ü(�ΰ����� �ʱ�ȭ�ƴ� ��ü����)�� �Ҵ���.
      System.out.println(str); //��� str��ü������ ��
   }
}
*/