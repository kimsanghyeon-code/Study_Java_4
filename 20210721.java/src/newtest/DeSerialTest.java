package newtest;

import java.io.*;

public class DeSerialTest {
	public static void main(String[] args) {
		
		try {
			ObjectInputStream in = 
					new ObjectInputStream(new FileInputStream("a.dat"));
			//a.dat������ �о���� �� �ִ� ���ο� FileInputStreamŬ���� ��ü ���� �� ObjectInputStream�� �Ҵ�
			//�װ��� �Ű������� ��� objectInputStream Ŭ����Ÿ���� ������ ��ü����
			StuInfo s;
			//StuInfoŬ����Ÿ���� ����� ��ü���� s
			while ((s=(StuInfo) in.readObject()) !=null)
				//while���� ����
				//in��ü������ readObject�޼���� ��ü�� ������ ����
				//�ش� ������ s��ü������ �Ҵ�
				//�װ��� null���� �ƴ϶��, �Ʒ��� ��¸޼��� ����
				s.printInfo();
			//�޼��� �۵�
			in.close();
			//�޼��� ����
		}catch(EOFException e) {
			//����ó���ڵ�
			System.out.println("�� �̻� ���� �����Ͱ� �����ϴ�");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


/*
package newtest;

import java.io.*;

class DeSerialTest {

   public static void main(String[] args) {

      try {

ObjectInputStream in = new ObjectInputStream(new FileInputStream("a.dat"));
//newŰ����� ������ǲ��Ʈ��Ŭ������ ��ü�� �����ϰ� a.dat������ �о���ϼ��ֵ��� ���ִ� ��ü�μ� �۵���. 
//��ü�� ������ȭ�� ���ؼ� objectInputstreamŬ������ü�� �����Ҷ� �ٷ� ���ٿ��� ������ �����Է°�ü�� �Ű������� ��´ٴ� ��
//�̷��� �о��� ��ü���� 
//������ �ִ� in ��ü����. objectinputstreamŬ����Ÿ���� ������ ��ü�����ε�. �̰��� ������ ��ü�� �Ҵ�޴´�.
//���� in��ü������ �����Ϳ�����ȭ�� ���ؼ� �۵��ȴ�. 


         StuInfo s;
//stuinfoŬ����Ÿ���� ����� s��ü����         

         while ((s = (StuInfo) in.readObject()) != null)
//while���� ���۵ǰ� in��ü������ readObject�޼���� ��ü�� ������ ������ȭ�Ͽ� �о����.
//�о���� ������ stuinfoŬ����Ÿ������ ĳ���ÿ���, ����Ÿ�Ժ�ȯ�� �ϴ� ����. 
//��ȯ�� ��ü������ s��ü������ �Ҵ��� ��.
//�Ҵ�� ������ null �ƴϴٴ� ���� ���̸�. �Ʒ��� ��¸޼��带 �۵���Ŵ            

            s.printInfo();
//s.printinfo�޼��带 �۵���Ŵ   
//stuinfoŬ������ �ִ� ����ȭ�� ������ȭ�� ���õ� �ڵ���߿���
//������ȭ�� ��ü�� ����ϰ� �� �޼��带 �۵���Ų��. 

         in.close();
//������ȭ�� ������ in��ü������ close�޼���� �ݾƹ�����.          

      } catch (EOFException e) { //���̻� �о���� ������ �������� ����ó���� ���� �ڵ忹��. 
         

         System.out.println("�� �̻� ���� �����Ͱ� �����ϴ�");

      } catch (Exception e) { //�׿��� ������ ���涧 �۵��Ǵ� ����ó��Ŭ���� 

         System.out.println(e);
      }
   }
}
*/