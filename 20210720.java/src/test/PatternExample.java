package test;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp,  data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
	}
}


/*
package test;

import java.util.regex.Pattern;

public class PatternExample {
   public static void main(String[] args) {
      String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //ǥ������ regExp 
//���ڿ�Ŭ������ü������ �Ҵ�
      String data = "010-123-4567";
//���ϸ�Ī�� ��ų data��ü������ ���ڿ��� �Ҵ�
      boolean result = Pattern.matches(regExp, data);
//PatternŬ������ matches�޼��带 ����ؼ� �׾ȿ� ǥ���İ� ���ڿ��� ���� �־
//������� �����Ѵ�. ��ġ�ϸ� true�� ��ġ���ϸ� false�� ��. 
//result�� ��. 
      if(result) { //result�� ���̸� ���Խ���ġ
         System.out.println("���Խİ� ��ġ�մϴ�.");
      } else {
         System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
      }
      
      regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
//���Խ��� ����
      data = "angel@navercom";
//data��ü������ ���ο� �����͸��ְ�
      result = Pattern.matches(regExp, data);
//���� ��ġ���Ѽ� �׽�Ʈ��. 
      if(result) {
         System.out.println("���Խİ� ��ġ�մϴ�.");
      } else {
         System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
      }
   }
}
*/
/*
(02|010)-\\d{3,4}-\\d{4}
(02|010) : �������� or�� �ǹ�. 02Ȥ�� 010 
- ����
\\d{3,4} : ���ڰ� 3���ھƴϸ� 4���ڱ��� ǥ���ɼ�����
- ����
\\d{4} : ���ڰ� 4������. 
*/

/*
sungon-k@nate.com
sungon-k@daum.co.kr
\\w+@\\w+\\.\\w+(\\.\\w+)?
\\w+ : �Ѱ��̻��� ���ĺ� �Ǵ� ����
@ : @���ڰ� �ִ°�.
\\w+ : �Ѱ��̻��� ���ĺ� �Ǵ� ����
\\. : ��Ʈ
\\w+ : �Ѱ��̻��� ���ĺ� �Ǵ� ����
(\\.\\w+)? : 
( ) �׷��� 
\\. :��Ʈ
\\w+ : �Ѱ��̻��� ���ĺ� �Ǵ� ����
? : �ѹ��� �ü�����. 
*/
