package test;

import java.util.regex.Pattern;

public class PatternMatcherExample {
   public static void main(String[] args) {
      String id = "5Angel1004";
      String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
//[a-zA-Z] 한글자이고. 대괄호 한개가 한글자인데.
//a-z까지 A-Z까지  그래서 소문자와 대문자 모두 표시한다.
//[a-zA-Z0-9] 대괄호는 1개의 글자인데
//a-z까지 A-Z까지 그리고 0-9 까지
//{7,11} 8~12자까지의 ID값에 해당함. 
//정규표현식이란것은. 글자를 검색하거나 데이터를 찾아내거나.
//데이터사이언스, 빅데이터, ai분야에서 많이 사용됨.
//DNA검사, 코로나바이러스데이터의 유전자정보를 매치를 정규화표현식이 사용됨. 
      boolean isMatch = Pattern.matches(regExp, id);
      if(isMatch) {
         System.out.println("ID로 사용할 수 있습니다.");
      } else {
         System.out.println("ID로 사용할 수 없습니다.");
      }
   }
} 