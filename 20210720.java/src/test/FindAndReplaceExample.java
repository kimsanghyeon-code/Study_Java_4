package test;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
				if(index == -1) {
					System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
				}else {
					System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
					str = str.replace("�ڹ�", "Java");
							System.out.println("-->" + str);
				}
	}
}


/*
package test;

public class FindAndReplaceExample {
   public static void main(String[] args) {
      String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
//�������ڿ���ü������ �Ҵ�ȴ�
      int index = str.indexOf("�ڹ�");
//indexof �޼��� �� �Ű������� �ڹٸ� �־��ְ�. str��ü�������� ã�Ƴ��� �ϴ°���.
//�װ���� index������ �Ҵ�ȴ�
      if(index == -1) {
//���࿡ index�������� -1�� ���ٸ� 
//���Ծȵ�
         System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
      } else {
         System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
//���ڿ��� ���Ե��� Ȯ���ߴٸ�, str��ü������ replace�޼���� �ڹٸ� Java�� �Ű������� �־ ��ȯ�� ����� str��ü������ �Ҵ�ǵ��� �Ѵ�.
         str = str.replace("�ڹ�", "Java");
         System.out.println("-->" + str);//���
      }
   }
}
*/