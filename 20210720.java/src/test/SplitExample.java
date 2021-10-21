package test;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		String[] strl = str.split(",");
		for(String token : strl) {
			System.out.println(token);
		}

	}
}


/*
package test;

import java.util.StringTokenizer;

public class SplitExample {
   public static void main(String[] args) {
      String str = "아이디,이름,패스워드"; //문자열을 str객체변수할당
      
      //방법1(split() 메소드 이용)
      String[] tokens = str.split(","); //str객체변수에 split메서드를 작동시키고 매개변수는 구분자인 ,를 넣음. 그것을 tokens string클래스배열에 넣어줌
      for(String token : tokens) {
//for문으로 가서 tokens배열에서 한개씩 데이터를 뽑아서 for문 지역변수인 token에 할당을 해서 .
         System.out.println(token);
//개행시키면서 출력을 한다. 
//다 출력될때까지 출력을 함
      }
      
      System.out.println();
//위의 방법과 아래의 방법을 구분하기위한 개행코드
      
      //방법2(StringTokenizer 이용)
      StringTokenizer st = new StringTokenizer(str, ",");
//stringTokenizer클래스의 생성자에 ,를 매개변수로 넣어줌
//st객체변수에 할당을 한다. 
      while(st.hasMoreTokens()) {
//while문으로 st객체에 대해 hasMoreTokens메서드를 적용함
         String token = st.nextToken();
//st객체변수에서 nextToken메서드를 사용해서 데이터를 넣고 token문자열객체변수에 할당함
         System.out.println(token);
//출력을 함
      }
      
   }
}
*/
