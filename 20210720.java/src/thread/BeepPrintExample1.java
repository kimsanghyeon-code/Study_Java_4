package thread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}


/*
package thread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
   public static void main(String[] args) {
      Toolkit toolkit = Toolkit.getDefaultToolkit();   //ToolKitŬ�������� getDefaultToolkit()�޼��带 �۵���Ű�� ���ϵǴ� ��ü�� 
      //toolkit��ü�����Ҵ��� ��.
      for(int i=0; i<5; i++) {      //for������ i��0 �̰� i�� 5���� ���������� �ݺ�
         toolkit.beep();//toolkit.beep�޼���� �Ҹ��� ����Ŵ
         try { Thread.sleep(300); } catch(Exception e) {}
         //1000 �� 1��, 500�� 0.5�� 
         //sleep�޼��嶧���̶�� ���ø� �ǿ�. 
      }

      for(int i=0; i<5; i++) { //i�� 0���� 
*/