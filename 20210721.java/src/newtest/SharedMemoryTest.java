package newtest;

import java.util.Scanner;

public class SharedMemoryTest {
	public static void main(String[] args) {
		PlusThread pt = new PlusThread();
		//new 키워드 PlusThread클래스 객체생성해서 PlusThread 클래스타입 적용된 pt객체변수할당
		MinusThread mt = new MinusThread();
		//new 키워드 MinusThread클래스 객체생성해서 MinusThread 클래스타입 적용된 mt객체변수할당
		SharedMemory shobj = new SharedMemory();
		//new 키워드 SharedMemory클래스 객체생성해서 SharedMemory 클래스타입 적용된 shobjㄱ개체변수 할당
		pt.shmem = shobj;
		//pt객체변수에 적용된 shmem필드에 shobj객체변수 할당
		mt.shmem = shobj;
		//mt객체변수에 적용된 shmem필드에 shobj객체변수 할당
		System.out.println("Press Enter until x is 0");
		pt.start();
		mt.start();
	}
}

class SharedMemory{
	int x = 5;
	boolean isQuit = false;
}

class PlusThread extends Thread{
	//Thread클래스 상속받음
	SharedMemory shmem;
	//SharedMemory클래스타입이 적용된 shmem필드
	public void run() {
		try {
			while(!shmem.isQuit) {
				System.out.println("x=" + shmem.x);
				Thread.sleep(300);
				//thread sleep메서드가 0.3초간 멈춰있음
				shmem.x++;
				//그 후 shmem.x 필드 1증가
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class MinusThread extends Thread{
	SharedMemory shmem;
	public void run() {
		Scanner sc = new Scanner(System.in);
		//자체 입력받고 new키워드로 생성된 Scanner클래스 객체를
		//Scanner 클래스타입이 적용된 sc에 할당
		while(shmem.x!=0) {
			sc.nextLine();
			shmem.x--;
		}
		shmem.isQuit = true;
		System.out.println("Now x is 0. You win!");
	}
}


/*
package newtest;

import java.util.Scanner;

public class SharedMemoryTest {

   public static void main(String[] args) {

      PlusThread pt = new PlusThread();//new키워드 plusThread클래스객체생성해서 pt객체변수할당

      MinusThread mt = new MinusThread();//new키워드 minusThread클래스객체생성해서 mt객체변수할당

      SharedMemory shobj = new SharedMemory(); //new키워드로 sharedmemory클래스객체생성을 해서 shobj객체변수에 할당

      pt.shmem = shobj; //pt객체변수에 shmem필드에 shobj객체변수를 할당함

      mt.shmem = shobj;//mt객체변수에 shmem필드에 shobj객체변수를 할당함

      System.out.println("Press Enter until x is 0"); //가이드텍스트출력

      pt.start(); //pt객체변수의 start메서드작동

      mt.start(); //mt객체변수의 start메서드작동

   }
}

class SharedMemory {

   int x = 5; //x는 5

   boolean isQuit = false; //isQuit객체변수는 false로 초기화 
}

class PlusThread extends Thread {
//스레드클래스를 상속받았음
   
   SharedMemory shmem; //shmem필드를 shardmemory클래스타입적용함

   public void run() {

      try {

         while (!shmem.isQuit) { //while문 shmem.isquit메서드가 부정연산 
            //해당클래스를 보면 isquit는 false로 초기화되어있고 이것이 !연산때문에 true가 된다. 
            //중괄호를 실행하게 됨

            System.out.println("x=" + shmem.x);
            //x= 하고 출력되고 그다음에 shmem.x를 출력함. 
            //이게 5로 초기화되어있음

            Thread.sleep(300);//스레드 sleep 메서드가 0.3초동안 멈춰있다가  

            shmem.x++; //shmem.x필드를 1증가시키는 거예요
            //0.3잠들었다가 x를 증가시킨다. 자동으로.
         }
      } catch (Exception e) {

         System.out.println(e);
      }
   }
}

class MinusThread extends Thread {

   SharedMemory shmem; //shmem필드가 있음

   public void run() {

      Scanner sc = new Scanner(System.in);
      //입력을 받고 new키워드로 scanner클래스의 객체를 생성함. 
      //스캐너클래스의 타입을 받은 sc객체변수에 할당함.

      while (shmem.x != 0) {
//while문을 작동됨. shmem.x 가 0이 아니다. 참이 되면 true가 됨. 이러면 작동이 됨. 
//x필드가 0이 되면 같지않다 부정되는 것임. 그러면서 조건자체는 false가 됨. while이 종료됨.          

         sc.nextLine();
//스캐너클래스의 객체인 sc객체변수에 nextLine메서드로 입력을 받는 것임. 
         

         shmem.x--;
//shmem.x를 감소시킨다.          
      }
      shmem.isQuit = true;
      
//shmem의 isquit에 true값을 넣음.       

      System.out.println("Now x is 0. You win!");
//종료텍스트를 출력함.      
      
   }

}

//2개의 클래스에서 시작된 스레드가 동시에 작동하고 외부에서 입력있을때 1씩 감소하다가 0이 되면 종료된다. 
*/