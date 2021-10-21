package newtest;

import java.io.*;

class SerialTest {

     public static void main(String[] args) {
      
          try {
   
              ObjectOutputStream out = 
                         
                   new ObjectOutputStream(new FileOutputStream("a.dat"));
//a.dat파일명을 가진 새로운 FileOutputStream클래스 객체를 생성 후 
              //ObjectoutputStream클래스객체를 생성
              StuInfo s1 = new StuInfo("hin",27);
   //2개의 매개변수를 가진 새로운 StuInfo클래스객체 생성
              StuInfo s2 = new StuInfo("John",25);
            //2개의 매개변수를 가진 새로운 StuInfo클래스객체 생성
              
              out.writeObject(s1);
             
              out.writeObject(s2);

              out.close();

          } catch (Exception e) {
                                                                                                                   
                  System.out.println(e);
          }
     }      
}

/*
package newtest;

import java.io.*;

class SerialTest {

     public static void main(String[] args) {
      
          try {
   
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("a.dat"));

//안쪽에 괄호부터 작동을 한다. new키워드로 FileOutputStream클래스객체를 생성해서 파라매터로 a.dat 파일명을 가지고 출력스트림을 다루는 객체를 생성한다.
//그 파일의 출력을 다루는 객체를 매개변수로 삼는 new키워드로 ObjectOutputStream클래스객체를 생성한다. 
//이것은 파일출력을 다루는 객체가 만들어지고, 그것을 활용해서 객체의 출력으로 다루는 객체가 만들어진다는 것임. 
// 그것을 객체출력클래스타입을 적용한 out객체변수에 할당한다. 
//out객체변수는 객체직렬화작업을 할때 사용하는 객체변수가 된다고 보면 됨. 
//객체직렬화란 객체를 파일로 출력해내는 것임. 

              StuInfo s1 = new StuInfo("hin",27);
//new키워드로 stuinfo클래스객체를 생성하고 2개의 매개변수를 입력함.
//s1객체변수에 할당을 함.               
   
              StuInfo s2 = new StuInfo("John",25);
//new키워드로 stuinfo클래스객체를 생성하고 2개의 매개변수를 입력함. 
//s2객체변수에 할당함.              

              out.writeObject(s1);
//객체를 직렬화시켜줄 out객체변수가 writeObject 객체를 쓰기작업을 하는 메서드인데 매개변수로 s1을 타겟으로 두는 것임. 
              
              
              out.writeObject(s2);
//s2객체변수를 out객체변수가 writeobject작업을 함.            

              out.close();
//out역할이 끝나서 close메서드로 활동을 비활성화시켜버림.                

          } catch (Exception e) { //예외처리부문
                                                                                                                   
                  System.out.println(e);
          }
     }      
}
*/