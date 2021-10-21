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

public class BeepTask implements Runnable {   //BeepTask클래스는 구현클래스임.
   //Runnable인터페이스를 구현한 구현클래스이다. 
   //Runnable인터페이스는 스레드를 작동시키는 객체를 만들어낼수 있음. 
   public void run() { //run메서드를 정의해놓음.      
      Toolkit toolkit = Toolkit.getDefaultToolkit();   //Toolkit클래스의 getdefaulttoolkit메서드를 작동해서 객체를 toolkit객체변수에 할당
      for(int i=0; i<5; i++) {      //for문을 작동시킴
         toolkit.beep(); //beep음을 발생시킴 
         try { Thread.sleep(500); } catch(Exception e) {}//thread클래스의 sleep메서드의 0.5초간격때문에 소리 나뉘어들리게 되죠.
      }
   }
}
*/