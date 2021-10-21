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
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}


/*
package thread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
   public static void main(String[] args) {
      Toolkit toolkit = Toolkit.getDefaultToolkit();   //ToolKit클래스에서 getDefaultToolkit()메서드를 작동시키고 리턴되는 객체를 
      //toolkit객체변수할당을 함.
      for(int i=0; i<5; i++) {      //for문에서 i는0 이고 i는 5보다 작을때까지 반복
         toolkit.beep();//toolkit.beep메서드로 소리를 일으킴
         try { Thread.sleep(300); } catch(Exception e) {}
         //1000 이 1초, 500은 0.5초 
         //sleep메서드때문이라고 보시면 되요. 
      }

      for(int i=0; i<5; i++) { //i는 0부터 
*/