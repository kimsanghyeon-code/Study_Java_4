package test;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp,  data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}


/*
package test;

import java.util.regex.Pattern;

public class PatternExample {
   public static void main(String[] args) {
      String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //표현식을 regExp 
//문자열클래스객체변수에 할당
      String data = "010-123-4567";
//패턴매칭을 시킬 data객체변수에 문자열을 할당
      boolean result = Pattern.matches(regExp, data);
//Pattern클래스에 matches메서드를 사용해서 그안에 표현식과 문자열을 같이 넣어서
//결과값을 리턴한다. 일치하면 true가 일치않하면 false가 됨. 
//result에 들어감. 
      if(result) { //result가 참이면 정규식일치
         System.out.println("정규식과 일치합니다.");
      } else {
         System.out.println("정규식과 일치하지 않습니다.");
      }
      
      regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
//정규식이 들어가고
      data = "angel@navercom";
//data객체변수도 새로운 데이터를넣고
      result = Pattern.matches(regExp, data);
//둘이 일치시켜서 테스트함. 
      if(result) {
         System.out.println("정규식과 일치합니다.");
      } else {
         System.out.println("정규식과 일치하지 않습니다.");
      }
   }
}
*/
/*
(02|010)-\\d{3,4}-\\d{4}
(02|010) : 파이프는 or의 의미. 02혹은 010 
- 포함
\\d{3,4} : 숫자가 3글자아니면 4글자까지 표현될수있음
- 포함
\\d{4} : 숫자가 4글자임. 
*/

/*
sungon-k@nate.com
sungon-k@daum.co.kr
\\w+@\\w+\\.\\w+(\\.\\w+)?
\\w+ : 한개이상의 알파벳 또는 숫자
@ : @글자가 있는가.
\\w+ : 한개이상의 알파벳 또는 숫자
\\. : 도트
\\w+ : 한개이상의 알파벳 또는 숫자
(\\.\\w+)? : 
( ) 그룹핑 
\\. :도트
\\w+ : 한개이상의 알파벳 또는 숫자
? : 한번더 올수있음. 
*/
