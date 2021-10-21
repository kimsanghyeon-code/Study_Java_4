package format;

import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args) {
		String id ="java";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸�: {1} \nȸ�� ��ȭ: {2}";
		String result1 = MessageFormat.format(text,  id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {"'java'","'�ſ��'","'010-123-5678'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}

/*
package format;

import java.text.MessageFormat;

public class MessageFormatExample {
   public static void main(String[] args) {   
      //PHP�� ������. �������彺����Ʈ��Ʈ��� ����.
      //SQL���� �ܺο��� ��û�� ���ö� �׿� ������ �����ϱ����ؼ�
      //�̸� SQL������ �������� �ܺο��� ������ �Ķ���ʹ� ���ε������� �ٿ��� execute�޼���� ������ ������ ����� ����ߴ�.
      //���ε������� => ?,?,? �̷������� �����ƾ���? 
      //�̸� ������ ��Ƴ��� �ܺο��� ������ ������ ���ͷ��� ������Ų��. 
      String id = "java";
      String name = "�ſ��";
      String tel = "010-123-5678"; //3���� ���ڿ������Ͱ� stringŬ����Ÿ���� ����� ������ ������ �Ҵ�ȴ�. 
      
      String text = "ȸ�� ID: {0} \nȸ�� �̸�: {1} \nȸ�� ��ȭ: {2}";
      //�ܺ��� ������ ���ͷ��� ������ ��ġ�� �ε��� �ѹ��μ� �̸� �ڸ��� �����Ѵ�.
      //0,1,2 ���⿡ ����
      //�̷� ������ { } �߰�ȣ�� ��ġ�� ���� ������ �ȾƵд�. 
      //\n ���๮�ڷμ� ����Ű�� �����Ͱ� ���� ȿ���� �ش�
            
      String result1 = MessageFormat.format(text, id, name, tel);//format�޼���� 4���� �Ű������� �Է� ����
      //�׸��� result1�� ������� �ش��ϴ� ��ü�� �Ҵ��Ѵ�. 
      System.out.println(result1);//����� ��
      System.out.println();
      
      String sql = "insert into member values( {0}, {1}, {2} )";//sql���� ���� ������ �����ϰ� ���ڿ��� �Ҵ���
      Object[] arguments = { "'java'", "'�ſ��'", "'010-123-5678'" };
      //sql������ ���ڿ������͸� �ٷ궧 ���ʿ� ''�� ����. db�������� ������ �Ҷ�. 
      //�̰��� ���ڿ��̱� ������ �ܺο��� �ֵ���ǥ�� �� ����. �׸��� �װ��� ���� {} �߰�ȣ�� ��� arguments �μ��μ� 
      // ObjectŬ���� �迭�� arguments�迭�� �Ҵ��Ѵ�. 
      String result2 = MessageFormat.format(sql, arguments);
      //format�޼��忡 sql������ �ִ� ������ �μ��� �ִ� arguments�迭�� ���� ���ε��۾��ϰ� 
      //������� result2�� ���ϵ� ���� �Ҵ��Ѵ�
      System.out.println(result2);//�̰��� �װ��� ����Ѵ�
   }
}
*/
