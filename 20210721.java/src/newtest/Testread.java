package newtest;

import java.io.*;

public class Testread {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("test1.txt");
			
			int i;
			
			while ((i = fr.read()) != -1) {
				char c = (char)i;
				
				System.out.print(c);
			}
			fr.close();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}

/*
package newtest;

import java.io.*;

class Testread {

   public static void main(String[] args) {

      try {

         FileReader fr = new FileReader("multiplicationTable.txt");
         //FileReaderŬ�������� �о���̷��� ������ �ֵ���ǥ�ȿ� �־��ְ� �̰��� �Ű������� ��. �׷��� ��ü�����ؼ� fr��ü������ �Ҵ�

         int i; //i���� ����

         while ((i = fr.read()) != -1) {
            //while�� i�� fr��ü������ read�޼����� ������ ��� �ְ� ��. -1�� �ٸ��ٴ� ���� true�� ��쿡 �߰�ȣ�� ������ ����.
            

            char c = (char) i; //i�� ������ charŸ������ ������ȯ�ϰ� �׳����� c������ �Ҵ����ش�. 

            System.out.print(c); //c�� �����
         }
         fr.close(); //fr��ü������ �ݾ��ش�. �̰��� �б⵿���� �ϴ� ��ü�� �����Ų��. 

      } catch (IOException e) {

         System.out.println(e);
      } //����ó���� ���� ������. 
   }
}
*/
