package format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
	}
}

/*
package format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
   public static void main(String[] args) {
      Date now = new Date(); //date클래스객체생성 하고 now객체변수에 할당
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //simpledateformat클래스객체를 생성을 함
      //sdf에 할당을 함
      System.out.println( sdf.format(now) ); //format메서드를 통해서 now객체변수에 있는 
      //date객체를 출력함
      //yyyy-MM-dd y는 연도,m은 월, d는 일임. 그래서 날짜 표기함.
      
      sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); //데쉬말고 년, 월, 일로 포맷을 잡아주고
      //아래와 같이 now객체변수에 있는 데이터를 출력하게 된다
      System.out.println( sdf.format(now) );
      
      sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss"); // 조금 더 상세하게 정보를 출력할때
      // 닷으로 구분자를 줌. 그리고 a는 오전 hh시간 mm은 분 ss는 초 이렇게 시간데이터도 같이 출력한다. 
      System.out.println( sdf.format(now) );
      
      sdf = new SimpleDateFormat("오늘은 E요일"); //새로 객체를 생성해서 매개변수로 E가 들어갔는데 이것은 요일에 대한 외자 표현임. 한글자표현. 
      System.out.println( sdf.format(now) ); //요일출력
      
      sdf = new SimpleDateFormat("올해의 D번째 날"); //올해의 일수를 계산해서 오늘이 몇번쨰 날인지 계산하고 출력한다. 
      System.out.println( sdf.format(now) );
      
      sdf = new SimpleDateFormat("이달의 d번째 날"); //이달안의 n번째 날을 계산해줌.
      System.out.println( sdf.format(now) );      
   }
}
*/
