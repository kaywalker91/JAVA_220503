package Study0503;

import Study0503.Test;

public class Study93_cons_input_output 
{
	public static void main(String[] args) 
	{
		Test test1 = new Test(10);
		Test test10 = new Test(100);
		Test test100 = new Test(1000);
		Test test2 = new Test(10,"Ŀ��");
		Test test3 = new Test("Ŀ��","�ܹ���","����",10);	
	}
}

class Test // Construct�� Ŭ������ �����ڸ��� �Ȱ���
{
	Test(int money)
	{
		System.out.println("���� "+money+ "������ ������ϴ�!");
	}
	Test(int money,String drink)
	{
		System.out.println("���� "+money+ "������ ���ܼ� "+drink+"�� ���̽��ϴ�.");
	}
	Test(String drink,String eat1,String eat2,int money)
	{
		System.out.println("���� "+drink+"�� "+eat1+"�� "+eat2+"�� �Ծ "+money+"������ ����ϴ�.");
	}
}


