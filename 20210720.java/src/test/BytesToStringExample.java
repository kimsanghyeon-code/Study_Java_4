package test;

public class BytesToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);
				System.out.println(str);
	}
}



/*
package test;

public class BytesToStringExample {
   public static void main(String[] args) {
      byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
//byte타입배열을 적용한 bytes배열변수에 수열을 할당을 하고
      String str = new String(bytes);//배열변수를 매개변수로 해서
//new키워드로 string클래스생성자를 작동해서 객체를 만들고
//그것을 str string클래스객체변수에 할당을 함
      System.out.println( str );//출력을 함
   }
}
*/