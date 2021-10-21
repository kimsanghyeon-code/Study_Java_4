package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}


/*
package thread;
import java.awt.Toolkit;

public class BeepTask implements Runnable {   //BeepTaskŬ������ ����Ŭ������.
   //Runnable�������̽��� ������ ����Ŭ�����̴�. 
   //Runnable�������̽��� �����带 �۵���Ű�� ��ü�� ������ ����. 
   public void run() { //run�޼��带 �����س���.      
      Toolkit toolkit = Toolkit.getDefaultToolkit();   //ToolkitŬ������ getdefaulttoolkit�޼��带 �۵��ؼ� ��ü�� toolkit��ü������ �Ҵ�
      for(int i=0; i<5; i++) {      //for���� �۵���Ŵ
         toolkit.beep(); //beep���� �߻���Ŵ 
         try { Thread.sleep(500); } catch(Exception e) {}//threadŬ������ sleep�޼����� 0.5�ʰ��ݶ����� �Ҹ� ������鸮�� ����.
      }
   }
}
*/