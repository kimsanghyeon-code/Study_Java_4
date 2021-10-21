package newtest;

import java.io.*;

public class Testwrite {

	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("multiplicationTable.txt");
			
			for(int i=5; i<10; i++) {
				
				for(int j=5; j<10; j++) {
					
					fw.write(i + "x" + j + "=" + (i*j) + " ");
				}
				fw.write("\n");
			}
			fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}


/*
package newtest;

import java.io.*;

class Testwrite {

   public static void main(String[] args) {

      try {

         FileWriter fw = new FileWriter("multiplicationTable.txt");//newŰ���� FileWriterŬ������ü�����ؼ� �̶� �Ű������� 
         //���Ͼ��⸦ �ҷ��� �Ҷ� ����Ϸ��� ���ϸ��� �������ֽø� ��
         //��ü������ �ؼ� FileWriterŬ����Ÿ���� ������ fw��ü������ �Ҵ��� ��.

         for (int i = 5; i < 10; i++) { //for������ i�� 5�� �ʱ�ȭ�ǰ�, i�� 10���� ���������� �ݺ�

            for (int j = 5; j < 10; j++) { //for������ j�� 5�� �ʱ�ȭ�ǰ�, j�� 10���� ���������� �ݺ�

          fw.write(i + "x" + j + "=" + (i * j) + "  "); //fw��ü������ write�޼����� �Ű������� ����ҳ����� �ۼ���
          //i x j = i*j 
          //������п� ��¹��� ��ĭ�� ����� ������ ��.
            }
            fw.write("\n");//fw��ü������ write�޼��尡 ���๮�ڸ� �־��༭. ���ٳ����� �ȴ�. 
         }
         fw.close(); //fw��ü�������� close�޼��带 �Ἥ �����۾��� �۾��� �� �� �ִ� ��ü������ �ݾƹ����� �޼��尡 close��. 
         // ��ŵ� �׷��� ���Ͼ��⵵ �׷��� ���������� ����ϴ� ��ü�� �����Ű�� ���� �ʿ���

      } catch (IOException e) { //����¿���ó���� ���� Ŭ������ ��ü�� ���� ���縦 ��

         System.out.println(e);//���������� ����ϴ� ��
      }
   }
}
*/