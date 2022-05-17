package Study0503;

import java.util.Scanner;

public class Study94_replace 
{
	public static void main(String[] args)
	{
		String test = "안녕하세요\n신입개발자 김대각입니다.";

		test = test.replace("안녕하세요", "hello,World!");
	
		System.out.println(test);
	}
}
