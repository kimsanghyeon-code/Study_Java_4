package test;

import java.util.regex.Pattern;

public class PatternMatcherExample {
   public static void main(String[] args) {
      String id = "5Angel1004";
      String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
//[a-zA-Z] �ѱ����̰�. ���ȣ �Ѱ��� �ѱ����ε�.
//a-z���� A-Z����  �׷��� �ҹ��ڿ� �빮�� ��� ǥ���Ѵ�.
//[a-zA-Z0-9] ���ȣ�� 1���� �����ε�
//a-z���� A-Z���� �׸��� 0-9 ����
//{7,11} 8~12�ڱ����� ID���� �ش���. 
//����ǥ�����̶�����. ���ڸ� �˻��ϰų� �����͸� ã�Ƴ��ų�.
//�����ͻ��̾�, ������, ai�о߿��� ���� ����.
//DNA�˻�, �ڷγ����̷����������� ������������ ��ġ�� ����ȭǥ������ ����. 
      boolean isMatch = Pattern.matches(regExp, id);
      if(isMatch) {
         System.out.println("ID�� ����� �� �ֽ��ϴ�.");
      } else {
         System.out.println("ID�� ����� �� �����ϴ�.");
      }
   }
} 