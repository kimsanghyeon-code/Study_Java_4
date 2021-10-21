package test;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바");
				if(index == -1) {
					System.out.println("자바 문자열이 포함되어 있지 않습니다.");
				}else {
					System.out.println("자바 문자열이 포함되어 있습니다.");
					str = str.replace("자바", "Java");
							System.out.println("-->" + str);
				}
	}
}


/*
package test;

public class FindAndReplaceExample {
   public static void main(String[] args) {
      String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
//원본문자열객체변수에 할당된다
      int index = str.indexOf("자바");
//indexof 메서드 로 매개변수에 자바를 넣어주고. str객체변수에서 찾아내게 하는것임.
//그결과가 index변수에 할당된다
      if(index == -1) {
//만약에 index변수값이 -1과 같다면 
//포함안됨
         System.out.println("자바 문자열이 포함되어 있지 않습니다.");
      } else {
         System.out.println("자바 문자열이 포함되어 있습니다.");
//문자열에 포함됨을 확인했다면, str객체변수에 replace메서드로 자바를 Java로 매개변수로 넣어서 변환된 결과가 str객체변수에 할당되도록 한다.
         str = str.replace("자바", "Java");
         System.out.println("-->" + str);//출력
      }
   }
}
*/