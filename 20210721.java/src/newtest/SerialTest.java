package newtest;

import java.io.*;

class SerialTest {

     public static void main(String[] args) {
      
          try {
   
              ObjectOutputStream out = 
                         
                   new ObjectOutputStream(new FileOutputStream("a.dat"));
//a.dat���ϸ��� ���� ���ο� FileOutputStreamŬ���� ��ü�� ���� �� 
              //ObjectoutputStreamŬ������ü�� ����
              StuInfo s1 = new StuInfo("hin",27);
   //2���� �Ű������� ���� ���ο� StuInfoŬ������ü ����
              StuInfo s2 = new StuInfo("John",25);
            //2���� �Ű������� ���� ���ο� StuInfoŬ������ü ����
              
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

//���ʿ� ��ȣ���� �۵��� �Ѵ�. newŰ����� FileOutputStreamŬ������ü�� �����ؼ� �Ķ���ͷ� a.dat ���ϸ��� ������ ��½�Ʈ���� �ٷ�� ��ü�� �����Ѵ�.
//�� ������ ����� �ٷ�� ��ü�� �Ű������� ��� newŰ����� ObjectOutputStreamŬ������ü�� �����Ѵ�. 
//�̰��� ��������� �ٷ�� ��ü�� ���������, �װ��� Ȱ���ؼ� ��ü�� ������� �ٷ�� ��ü�� ��������ٴ� ����. 
// �װ��� ��ü���Ŭ����Ÿ���� ������ out��ü������ �Ҵ��Ѵ�. 
//out��ü������ ��ü����ȭ�۾��� �Ҷ� ����ϴ� ��ü������ �ȴٰ� ���� ��. 
//��ü����ȭ�� ��ü�� ���Ϸ� ����س��� ����. 

              StuInfo s1 = new StuInfo("hin",27);
//newŰ����� stuinfoŬ������ü�� �����ϰ� 2���� �Ű������� �Է���.
//s1��ü������ �Ҵ��� ��.               
   
              StuInfo s2 = new StuInfo("John",25);
//newŰ����� stuinfoŬ������ü�� �����ϰ� 2���� �Ű������� �Է���. 
//s2��ü������ �Ҵ���.              

              out.writeObject(s1);
//��ü�� ����ȭ������ out��ü������ writeObject ��ü�� �����۾��� �ϴ� �޼����ε� �Ű������� s1�� Ÿ������ �δ� ����. 
              
              
              out.writeObject(s2);
//s2��ü������ out��ü������ writeobject�۾��� ��.            

              out.close();
//out������ ������ close�޼���� Ȱ���� ��Ȱ��ȭ���ѹ���.                

          } catch (Exception e) { //����ó���ι�
                                                                                                                   
                  System.out.println(e);
          }
     }      
}
*/