package test;

public class BytesToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);
				System.out.println(str);
	}
}



/*
package test;

public class BytesToStringExample {
   public static void main(String[] args) {
      byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
//byteŸ�Թ迭�� ������ bytes�迭������ ������ �Ҵ��� �ϰ�
      String str = new String(bytes);//�迭������ �Ű������� �ؼ�
//newŰ����� stringŬ���������ڸ� �۵��ؼ� ��ü�� �����
//�װ��� str stringŬ������ü������ �Ҵ��� ��
      System.out.println( str );//����� ��
   }
}
*/