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
			System.out.println("띵");
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
      //Runnable beepTask = new BeepTask(); //BeepTask클래스의 객체를 생성해서 beepTask객체변수에 넣음.
      //Thread thread = new Thread(beepTask); //생성된 beepTask객체변수를 new thread스레드클래스의 객체를 생성할때 매개변수로서 beepTask를 넣어줌.
      //그결과 나온것을 thread객체변수에 할당한다. 
      //thread객체변수는 작동할 수있는 비프테스크와 그것이 받치고있는 스레드객체를 가지고 있다.
      
      //how2
      Thread thread = new Thread(new Runnable() { //생성자를 쓸때. 클래스객체를 선언을 해버리는 방식임. 
         //Runnable인터페이스는 스레드를 작동시키는 객체를 만들어낼수 있음. 
         //html,css,js 인라인js, 인라인css설정. 빨리빨리 코드아낄때.
         //runnable인터페이스는 구현객체가 필요한데. 스레드안에 Runnable익명객체를 쓰게 되면. 따로 클래스를 쓰지 바로 
         //메인에서 코드를 실행할 수있음. 
         
         @Override
         public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();   
            for(int i=0; i<5; i++) {      
               toolkit.beep();
               try { Thread.sleep(500); } catch(Exception e) {}
            }
         }
      });
      
      //지금까지 객체를 생성할때 매개변수는 주로 객체변수를 매개변수로 집어넣은 형태였음. 
      //객체를 넣기는 하는데. 넣는 자리에 코드를 써버린 것임. 
      
      //일반적으로 이전봤던 것은 , 객체변수를 선언하고, 매개변수자리에는 객체변수만 넣음.
      //여기서는 매개변수넣는자리에 객체변수를 선언하고 빠르게 사용하는 것이라고 보면 됨. 
      
      
      //how3
      /*Thread thread = new Thread(() -> {
         Toolkit toolkit = Toolkit.getDefaultToolkit();   
         for(int i=0; i<5; i++) {      
            toolkit.beep();
            try { Thread.sleep(500); } catch(Exception e) {}
         }
      });*/
      
/*     thread.start(); //비프음을 들리게 해주는 스레드객체변수의 start메서드를 작동시킨다. 
      //start메서드가 작동하면 run메서드가 같이 움직임. 
      
      for(int i=0; i<5; i++) { //main함수인 메인스레드에서 for문이 돌아감. i는 0, i는 5보다 작을때까지 반복
         System.out.println("띵");//문자출력을 함. 
         try { Thread.sleep(500); } catch(Exception e) {} //thread.sleep메서드때문에 0.5 간격을 갖게 되어있음. 
      }
   }
}

*/