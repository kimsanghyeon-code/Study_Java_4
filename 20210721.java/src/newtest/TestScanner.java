package newtest;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name:");
		
		String name = sc.nextLine();
		System.out.print("age: ");
		int age = sc.nextInt();
		
		System.out.println("*******회원정보*******");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("**************");
	}
}


/*
package newtest;

import java.util.Scanner;

class TestScanner {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);//Scanner클래스객체생성하는데 매개변수는 컴퓨터인터페이스를 통해서 입력된 데이터가 들어갈수있도록 함. 
      //sc객체변수에 할당을 하고.
      //앞으로 sc객체변수가 시스템에 입력이 되면. sc가 모든것을 관리하게 된다. 

      System.out.print("name:");//문자열이 출력

      String name = sc.nextLine();//sc객체변수에 nextLine메서드가 작동을 함
      //입력한 것이 name문자열객체변수에 할당됨

      System.out.print("age: ");//문자열을 출력

      int age = sc.nextInt();//sc객체변수에 nextInt메서드로 숫자를 입력받음 그것을 age변수에 할당한다

      System.out.println("********회원정보********");

      System.out.println("name:" + name); //name변수에 입력된 데이터를 출력하고

      System.out.println("age:" + age); //age변수에 입력된 데이터를 출력한다. 

      System.out.println("**********************");
   }
}
*/