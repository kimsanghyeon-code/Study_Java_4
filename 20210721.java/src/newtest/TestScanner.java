package newtest;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name:");
		
		String name = sc.nextLine();
		System.out.print("age: ");
		int age = sc.nextInt();
		
		System.out.println("*******ȸ������*******");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("**************");
	}
}


/*
package newtest;

import java.util.Scanner;

class TestScanner {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);//ScannerŬ������ü�����ϴµ� �Ű������� ��ǻ���������̽��� ���ؼ� �Էµ� �����Ͱ� �����ֵ��� ��. 
      //sc��ü������ �Ҵ��� �ϰ�.
      //������ sc��ü������ �ý��ۿ� �Է��� �Ǹ�. sc�� ������ �����ϰ� �ȴ�. 

      System.out.print("name:");//���ڿ��� ���

      String name = sc.nextLine();//sc��ü������ nextLine�޼��尡 �۵��� ��
      //�Է��� ���� name���ڿ���ü������ �Ҵ��

      System.out.print("age: ");//���ڿ��� ���

      int age = sc.nextInt();//sc��ü������ nextInt�޼���� ���ڸ� �Է¹��� �װ��� age������ �Ҵ��Ѵ�

      System.out.println("********ȸ������********");

      System.out.println("name:" + name); //name������ �Էµ� �����͸� ����ϰ�

      System.out.println("age:" + age); //age������ �Էµ� �����͸� ����Ѵ�. 

      System.out.println("**********************");
   }
}
*/