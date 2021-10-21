package newtest;
import java.io.*;
public class two {
public static void main(String[] args) {
   try {
      FileWriter test = new FileWriter("test2.txt");
      //new키워드로 Filewriter클래스의 매개변수로 test2.txt를 넣음.
      //FileWriter클래스타입을 적용한 test객체변수에 그것을 할당
      test.write("깃허브 코파일럿은 아직 미래를 바꾸지 않는다" + "\r\n" + "래는 언제나 너무 오래 걸린다는 것이 문제이다. \r\n"
            + "\r\n"
            + "이런 예를 들어보자. 2006년 당시 자바의 설립자이자 책임 디자이너였던 제임스 고슬링은 “휴대폰이 미래의 데스크톱이 될 것이다”라고 선언했다. 고슬링이 틀린 것은 아니지만, 아직 완전히 맞다고 할 수는 없다. 휴대폰은 어디에나 있는 디바이스가 되었지만, 데스크톱은 지난 분기에만 7,160만 대가 출시됐기 때문이다. 필자는 데스크톱이 없어졌으면 좋겠다. 지난 주에도 이웃의 바이러스 걸린 윈도우 노트북을 고쳐주느라 예기치 않게 휴가를 내야만 했다. 고슬링의 선언이 현실이 되기를 바라마지 않지만, 그런 날은 좀처럼 오지 않고 있다."
                     
            );
      //test객체변수에 write메서드작동시키고 매개변수에 문자열을 넣음
      //내용이 길경우에 " " 쌍따옴표안에 넣어주고
      // \r\n 라인피드와 개행문자를 넣어주고
      //2행의 내용이 입력이 되는 것임. 
      
      
      test.close(); //test객체변수에 close메서드를 써서 객체변수를 닫아버림.
   } catch(IOException e) { //catch절에서 입출력예외처리를 하고 그것에 대한 출력을 한다. 에러가 발생했다면. 
      System.out.println(e);
   }
}
}