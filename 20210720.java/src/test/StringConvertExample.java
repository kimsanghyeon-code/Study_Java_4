package test;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
				
		int intData2 = 150;
		String strData2 = Integer.toString(150);
	}
}


/*
package test;

public class StringConvertExample {
   public static void main(String[] args) {
      String strData1 = "200"; //strData1��ü������ 200�Ҵ�
      int intData1 = Integer.parseInt(strData1);
//���ڿ�Ŭ�������� 200�� ������ ��Ȳ�̾��µ�
//IntegerŬ������ parseInt�޼��带 �Ἥ ���ڿ������͸� int��ȯ����
//�� ����� intData1�� �Ҵ�����.
      
      int intData2 = 150; //intŸ���� intData2�� 150�̶�� ���ͷ��Ҵ�
      String strData2 = String.valueOf(intData2);
//StringŬ������ �����޼����� valueof�޼��忡 intData2������ �Ű������� �Ҵ�����
//strData2 StringŬ����Ÿ�԰�ü������ �Ҵ��� ��
   }
}
*/