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
		setX("admin","1004","관리자");
		
		while(true)
		{
			System.out.println("1.로그인");
			System.out.println("2.종료");
				
			System.out.print("선택: ");
			nm = sc.nextInt();
				
			if(nm == 1)
			{
				System.out.println();
				System.out.print("아이디: ");
				InputID = sc.next();
				System.out.print("비번: ");
				InputPW = sc.next();
				System.out.println();
			}
			else if(nm == 2)
			{
				System.out.println("프로그램 종료.");
				break;	
			}
				
			if(id.equals("") && pw.equals(""))
			{
				System.out.println("회원정보가 없습니다.\n");
			}		
			else if(!InputID.equals(id) && !InputPW.equals(pw))
			{
				System.out.println("아이디,비밀번호가 틀렸습니다.\n");
			}		
			else if(!InputID.equals(id))
			{
				System.out.println("아이디가 틀렸습니다.\n");
			}		
			else if(!InputPW.equals(pw))
			{
				System.out.println("비밀번호가 틀렸습니다.\n");
			}
			else if(InputID.equals(id) && InputPW.equals(pw))
			{
				System.out.println(name+"로 로그인되었습니다.\n");
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

