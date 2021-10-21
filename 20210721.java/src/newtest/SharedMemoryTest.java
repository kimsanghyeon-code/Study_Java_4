package newtest;

import java.util.Scanner;

public class SharedMemoryTest {
	public static void main(String[] args) {
		PlusThread pt = new PlusThread();
		//new Ű���� PlusThreadŬ���� ��ü�����ؼ� PlusThread Ŭ����Ÿ�� ����� pt��ü�����Ҵ�
		MinusThread mt = new MinusThread();
		//new Ű���� MinusThreadŬ���� ��ü�����ؼ� MinusThread Ŭ����Ÿ�� ����� mt��ü�����Ҵ�
		SharedMemory shobj = new SharedMemory();
		//new Ű���� SharedMemoryŬ���� ��ü�����ؼ� SharedMemory Ŭ����Ÿ�� ����� shobj����ü���� �Ҵ�
		pt.shmem = shobj;
		//pt��ü������ ����� shmem�ʵ忡 shobj��ü���� �Ҵ�
		mt.shmem = shobj;
		//mt��ü������ ����� shmem�ʵ忡 shobj��ü���� �Ҵ�
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
	//ThreadŬ���� ��ӹ���
	SharedMemory shmem;
	//SharedMemoryŬ����Ÿ���� ����� shmem�ʵ�
	public void run() {
		try {
			while(!shmem.isQuit) {
				System.out.println("x=" + shmem.x);
				Thread.sleep(300);
				//thread sleep�޼��尡 0.3�ʰ� ��������
				shmem.x++;
				//�� �� shmem.x �ʵ� 1����
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
		//��ü �Է¹ް� newŰ����� ������ ScannerŬ���� ��ü��
		//Scanner Ŭ����Ÿ���� ����� sc�� �Ҵ�
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

      PlusThread pt = new PlusThread();//newŰ���� plusThreadŬ������ü�����ؼ� pt��ü�����Ҵ�

      MinusThread mt = new MinusThread();//newŰ���� minusThreadŬ������ü�����ؼ� mt��ü�����Ҵ�

      SharedMemory shobj = new SharedMemory(); //newŰ����� sharedmemoryŬ������ü������ �ؼ� shobj��ü������ �Ҵ�

      pt.shmem = shobj; //pt��ü������ shmem�ʵ忡 shobj��ü������ �Ҵ���

      mt.shmem = shobj;//mt��ü������ shmem�ʵ忡 shobj��ü������ �Ҵ���

      System.out.println("Press Enter until x is 0"); //���̵��ؽ�Ʈ���

      pt.start(); //pt��ü������ start�޼����۵�

      mt.start(); //mt��ü������ start�޼����۵�

   }
}

class SharedMemory {

   int x = 5; //x�� 5

   boolean isQuit = false; //isQuit��ü������ false�� �ʱ�ȭ 
}

class PlusThread extends Thread {
//������Ŭ������ ��ӹ޾���
   
   SharedMemory shmem; //shmem�ʵ带 shardmemoryŬ����Ÿ��������

   public void run() {

      try {

         while (!shmem.isQuit) { //while�� shmem.isquit�޼��尡 �������� 
            //�ش�Ŭ������ ���� isquit�� false�� �ʱ�ȭ�Ǿ��ְ� �̰��� !���궧���� true�� �ȴ�. 
            //�߰�ȣ�� �����ϰ� ��

            System.out.println("x=" + shmem.x);
            //x= �ϰ� ��µǰ� �״����� shmem.x�� �����. 
            //�̰� 5�� �ʱ�ȭ�Ǿ�����

            Thread.sleep(300);//������ sleep �޼��尡 0.3�ʵ��� �����ִٰ�  

            shmem.x++; //shmem.x�ʵ带 1������Ű�� �ſ���
            //0.3�����ٰ� x�� ������Ų��. �ڵ�����.
         }
      } catch (Exception e) {

         System.out.println(e);
      }
   }
}

class MinusThread extends Thread {

   SharedMemory shmem; //shmem�ʵ尡 ����

   public void run() {

      Scanner sc = new Scanner(System.in);
      //�Է��� �ް� newŰ����� scannerŬ������ ��ü�� ������. 
      //��ĳ��Ŭ������ Ÿ���� ���� sc��ü������ �Ҵ���.

      while (shmem.x != 0) {
//while���� �۵���. shmem.x �� 0�� �ƴϴ�. ���� �Ǹ� true�� ��. �̷��� �۵��� ��. 
//x�ʵ尡 0�� �Ǹ� �����ʴ� �����Ǵ� ����. �׷��鼭 ������ü�� false�� ��. while�� �����.          

         sc.nextLine();
//��ĳ��Ŭ������ ��ü�� sc��ü������ nextLine�޼���� �Է��� �޴� ����. 
         

         shmem.x--;
//shmem.x�� ���ҽ�Ų��.          
      }
      shmem.isQuit = true;
      
//shmem�� isquit�� true���� ����.       

      System.out.println("Now x is 0. You win!");
//�����ؽ�Ʈ�� �����.      
      
   }

}

//2���� Ŭ�������� ���۵� �����尡 ���ÿ� �۵��ϰ� �ܺο��� �Է������� 1�� �����ϴٰ� 0�� �Ǹ� ����ȴ�. 
*/