package format;

import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args) {
		String id ="java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID : {0} \n회원 이름: {1} \n회원 전화: {2}";
		String result1 = MessageFormat.format(text,  id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {"'java'","'신용권'","'010-123-5678'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}

/*
package format;

import java.text.MessageFormat;

public class MessageFormatExample {
   public static void main(String[] args) {   
      //PHP를 했을때. 프리페어드스테이트먼트라는 개념.
      //SQL문이 외부에서 요청이 들어올때 그에 빠르게 대응하기위해서
      //미리 SQL문장을 만들어놓고 외부에서 들어오는 파라매터는 바인딩변수에 붙여서 execute메서드로 실행을 돌려서 결과를 출력했다.
      //바인딩변수는 => ?,?,? 이런식으로 나열됐었죠? 
      //미리 포맷을 잡아놓고 외부에서 들어오는 변수나 리터럴을 부착시킨다. 
      String id = "java";
      String name = "신용권";
      String tel = "010-123-5678"; //3개의 문자열데이터가 string클래스타입이 적용된 각각의 변수에 할당된다. 
      
      String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
      //외부의 변수나 리터럴이 부착될 위치를 인덱스 넘버로서 미리 자리를 배정한다.
      //0,1,2 여기에 들어간다
      //이런 포맷은 { } 중괄호로 위치한 곳에 변수를 꽂아둔다. 
      //\n 개행문자로서 엔터키를 누른것과 같은 효과를 준다
            
      String result1 = MessageFormat.format(text, id, name, tel);//format메서드로 4개의 매개변수를 입력 받음
      //그리고 result1에 결과값에 해당하는 객체를 할당한다. 
      System.out.println(result1);//출력을 함
      System.out.println();
      
      String sql = "insert into member values( {0}, {1}, {2} )";//sql문을 대한 변수를 설정하고 문자열을 할당함
      Object[] arguments = { "'java'", "'신용권'", "'010-123-5678'" };
      //sql문에서 문자열데이터를 다룰때 양쪽에 ''를 붙임. db엔진에서 전달을 할때. 
      //이것이 문자열이기 때문에 외부에서 쌍따옴표를 또 붙임. 그리고 그것을 전부 {} 중괄호로 묶어서 arguments 인수로서 
      // Object클래스 배열인 arguments배열에 할당한다. 
      String result2 = MessageFormat.format(sql, arguments);
      //format메서드에 sql문장이 있는 변수와 인수가 있는 arguments배열을 서로 바인딩작업하고 
      //결과값을 result2에 리턴된 값을 할당한다
      System.out.println(result2);//이것을 그값을 출력한다
   }
}
*/
