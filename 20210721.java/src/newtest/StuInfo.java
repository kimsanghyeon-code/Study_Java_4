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

class StuInfo implements java.io.Serializable{//Serializable�������̽��� ����Ŭ������ ����. �װ��� stuinfo Ŭ����

     String name; //2���� �ʵ尡 �������. name�� age

     int age;

     StuInfo(String name, int age){ //�����ڴ� �̸��� ���̸� �Է��ϸ� �Ű������μ� �����ϸ� 
        //this ��ü�� �ڱ��ڽ��� ������ �ִ� �ʵ忡 �Ű������� �Էµ� �̸��� ���� �����͸� �ʵ忡 �����Ѵ�. 

           this.name = name;
   
           this.age = age;
     }
     void printInfo(){ //�޼���� printinfo�޼����ε�. 
        //�̰��� name�� age�� ���� ����� �ϴ� �۾��� ��. 

           System.out.println("name:"+name);
 
           System.out.println("age:"+age);
     }
}
*/