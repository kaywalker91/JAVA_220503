package Study0503;

import Study0503.Test;

public class Study93_cons_input_output 
{
	public static void main(String[] args) 
	{
		Test test1 = new Test(10);
		Test test10 = new Test(100);
		Test test100 = new Test(1000);
		Test test2 = new Test(10,"커피");
		Test test3 = new Test("커피","햄버거","피자",10);	
	}
}

class Test // Construct은 클래스명 생성자명이 똑같다
{
	Test(int money)
	{
		System.out.println("오늘 "+money+ "만원이 생겼습니다!");
	}
	Test(int money,String drink)
	{
		System.out.println("오늘 "+money+ "만원이 생겨서 "+drink+"를 마셨습니다.");
	}
	Test(String drink,String eat1,String eat2,int money)
	{
		System.out.println("오늘 "+drink+"와 "+eat1+"와 "+eat2+"를 먹어서 "+money+"만원을 썼습니다.");
	}
}


