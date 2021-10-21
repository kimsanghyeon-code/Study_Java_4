package thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//how1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//how2
		/*Thread thread = new Thread(new Runnable(){
		 * @Override
		 * public void run(){
		 * Toolkit toolkit = Toolkit.getDefaultToolkit();
		 * for(int i=0; i<5; i++){
		 * toolkit.beep();
		 * try{thread.sleep(500);}catch(Exception e){}
		 * }
		 * }
		 * });		 */
		
		//how3
		/*Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		})*/
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}

	}
}


/*
package thread;
import java.awt.Toolkit;

public class BeepPrintExample2 {
   public static void main(String[] args) {
      //how1
      //Runnable beepTask = new BeepTask(); //BeepTaskŬ������ ��ü�� �����ؼ� beepTask��ü������ ����.
      //Thread thread = new Thread(beepTask); //������ beepTask��ü������ new thread������Ŭ������ ��ü�� �����Ҷ� �Ű������μ� beepTask�� �־���.
      //�װ�� ���°��� thread��ü������ �Ҵ��Ѵ�. 
      //thread��ü������ �۵��� ���ִ� �����׽�ũ�� �װ��� ��ġ���ִ� �����尴ü�� ������ �ִ�.
      
      //how2
      Thread thread = new Thread(new Runnable() { //�����ڸ� ����. Ŭ������ü�� ������ �ع����� �����. 
         //Runnable�������̽��� �����带 �۵���Ű�� ��ü�� ������ ����. 
         //html,css,js �ζ���js, �ζ���css����. �������� �ڵ�Ƴ���.
         //runnable�������̽��� ������ü�� �ʿ��ѵ�. ������ȿ� Runnable�͸�ü�� ���� �Ǹ�. ���� Ŭ������ ���� �ٷ� 
         //���ο��� �ڵ带 ������ ������. 
         
         @Override
         public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();   
            for(int i=0; i<5; i++) {      
               toolkit.beep();
               try { Thread.sleep(500); } catch(Exception e) {}
            }
         }
      });
      
      //���ݱ��� ��ü�� �����Ҷ� �Ű������� �ַ� ��ü������ �Ű������� ������� ���¿���. 
      //��ü�� �ֱ�� �ϴµ�. �ִ� �ڸ��� �ڵ带 ����� ����. 
      
      //�Ϲ������� �����ô� ���� , ��ü������ �����ϰ�, �Ű������ڸ����� ��ü������ ����.
      //���⼭�� �Ű������ִ��ڸ��� ��ü������ �����ϰ� ������ ����ϴ� ���̶�� ���� ��. 
      
      
      //how3
      /*Thread thread = new Thread(() -> {
         Toolkit toolkit = Toolkit.getDefaultToolkit();   
         for(int i=0; i<5; i++) {      
            toolkit.beep();
            try { Thread.sleep(500); } catch(Exception e) {}
         }
      });*/
      
/*     thread.start(); //�������� �鸮�� ���ִ� �����尴ü������ start�޼��带 �۵���Ų��. 
      //start�޼��尡 �۵��ϸ� run�޼��尡 ���� ������. 
      
      for(int i=0; i<5; i++) { //main�Լ��� ���ν����忡�� for���� ���ư�. i�� 0, i�� 5���� ���������� �ݺ�
         System.out.println("��");//��������� ��. 
         try { Thread.sleep(500); } catch(Exception e) {} //thread.sleep�޼��嶧���� 0.5 ������ ���� �Ǿ�����. 
      }
   }
}

*/