package Study0503;

import java.util.Scanner;

public class Study96_cons95 
{

	public static void main(String[] args) 
	{
		Inout1 inout = new Inout1();
	}

}

class Inout1
{
	Scanner sc = new Scanner(System.in);

	String InputID;
	String InputPW;
	
	private String id;
	private String pw;
	private String name;
	
	int nm;

	Inout1()
	{
		setX("admin","1004","������");
		
		while(true)
		{
			System.out.println("1.�α���");
			System.out.println("2.����");
				
			System.out.print("����: ");
			nm = sc.nextInt();
				
			if(nm == 1)
			{
				System.out.println();
				System.out.print("���̵�: ");
				InputID = sc.next();
				System.out.print("���: ");
				InputPW = sc.next();
				System.out.println();
			}
			else if(nm == 2)
			{
				System.out.println("���α׷� ����.");
				break;	
			}
				
			if(id.equals("") && pw.equals(""))
			{
				System.out.println("ȸ�������� �����ϴ�.\n");
			}		
			else if(!InputID.equals(id) && !InputPW.equals(pw))
			{
				System.out.println("���̵�,��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
			}		
			else if(!InputID.equals(id))
			{
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.\n");
			}		
			else if(!InputPW.equals(pw))
			{
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
			}
			else if(InputID.equals(id) && InputPW.equals(pw))
			{
				System.out.println(name+"�� �α��εǾ����ϴ�.\n");
				break;
			}		
		}
	}
	
	void setX(String id,String pw,String name)
	{
		this.id = id;
		this.pw = pw;
		this.name = name;
		
	}
}

