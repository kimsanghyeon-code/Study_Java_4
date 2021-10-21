package newtest;

import java.io.*;

class StuInfo implements java.io.Serializable{

     String name;

     int age;

     StuInfo(String name, int age){

           this.name = name;
   
           this.age = age;
     }
     void printInfo(){

           System.out.println("name:"+name);
 
           System.out.println("age:"+age);
     }
}

/*
package newtest;

import java.io.*;

class StuInfo implements java.io.Serializable{//Serializable인터페이스의 구현클래스를 만듬. 그것이 stuinfo 클래스

     String name; //2개의 필드가 만들어짐. name과 age

     int age;

     StuInfo(String name, int age){ //생성자는 이름과 나이를 입력하면 매개변수로서 전달하면 
        //this 객체가 자기자신이 가지고 있는 필드에 매개변수로 입력된 이름과 나이 데이터를 필드에 저장한다. 

           this.name = name;
   
           this.age = age;
     }
     void printInfo(){ //메서드는 printinfo메서드인데. 
        //이것은 name과 age에 대한 출력을 하는 작업을 함. 

           System.out.println("name:"+name);
 
           System.out.println("age:"+age);
     }
}
*/