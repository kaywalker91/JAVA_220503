package Study0503;

import java.util.Scanner;

public class Study94_replace 
{
	public static void main(String[] args)
	{
		String test = "�ȳ��ϼ���\n���԰����� ��밢�Դϴ�.";

		test = test.replace("�ȳ��ϼ���", "hello,World!");
	
		System.out.println(test);
	}
}
