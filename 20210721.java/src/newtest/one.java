package newtest;

import java.io.*;

public class one {

	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("test1.txt");
			//test1.txt������ �Ű������� �ϴ� ���ο� FileWriterŬ���� ��ü�� ����
			//�װ��� FileWriterŬ����Ÿ���� ����� fw�� �Ҵ�
			for(int i = 2; i<10; i++) {
				for(int j =1; j<10; j++) {
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
 class test1 {
public static void main(String[] args) {
   try {
FileWriter test1 = new FileWriter("test1.txt");//FileWriterŬ������ü�� �����ϴ� �� �̋� �Ű������� test1.txt�� �Ǵ°���. �װ��� test1��ü������ �Ҵ�
      for (int i = 1; i<10; i++) {//for���� i�� 1���� 10���� ����������.
         for(int j=1; j<10; j++) {//for���� j�� 1���� 10���� ����������.
         test1.write(i + "x" + j + "=" + (i*j) + " ");//test1��ü������ write�޼���� �����ܰ���ڵ带 �����.
            
         }
         test1.write("\n");
      }
      test1.close();
   }catch(IOException e) {
      System.out.println(e);
   }
}
}
*/