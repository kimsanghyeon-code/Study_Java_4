package test;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
				
		int intData2 = 150;
		String strData2 = Integer.toString(150);
	}
}


/*
package test;

public class StringConvertExample {
   public static void main(String[] args) {
      String strData1 = "200"; //strData1객체변수에 200할당
      int intData1 = Integer.parseInt(strData1);
//문자열클래스에서 200을 저장한 상황이었는데
//Integer클래스의 parseInt메서드를 써서 문자열데이터를 int변환했음
//그 결과를 intData1에 할당했음.
      
      int intData2 = 150; //int타입인 intData2에 150이라는 리터럴할당
      String strData2 = String.valueOf(intData2);
//String클래스의 정적메서드인 valueof메서드에 intData2변수를 매개변수로 할당했음
//strData2 String클래스타입객체변수에 할당을 함
   }
}
*/