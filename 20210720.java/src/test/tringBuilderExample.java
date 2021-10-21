package test;

public class tringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		System.out.print(str);
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
	}
}


/*
package test;

public class StringBuilderExample {
   public static void main(String[] args) {
      String str = "";//공백을 str객체변수에 할당
      for(int i=1; i<=100; i++) {
//i는 1로 초기화하고 100보다 작거나 같을때까지 반복
         str += i; //str객체변수에 i를 누적시킨다는 것
      }
      System.out.println(str);
      
      StringBuilder sb = new StringBuilder(); //stringbuilder클래스객체생성해서 스트링빌더클래스타입을 적용한 sb객체변수에 할당
      for(int i=1; i<=100; i++) {
//for문으로 i는 1로 설정하고 i는 100보다작거나 같을때까지 반복
         sb.append(i); //sb객체에 append메서드를 적용하고 매개변수는 i로 해줌
      }
      str = sb.toString(); //sb객체변수에 toString메서드를 작동시키고 리턴값을 str객체(널값으로 초기화됐던 객체변수)에 할당함.
      System.out.println(str); //출력 str객체변수로 함
   }
}
*/