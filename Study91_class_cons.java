package Study0503;

import java.util.Scanner;

public class Study91_class_cons 
{

	public static void main(String[] args) 
	{
		Bun bun = new Bun();
	}

}

class Bun
{
	Bun()
	{
		Scanner sc = new Scanner(System.in);
		
		int Bun = 3;
		int kor[] = new int[Bun];
		int eng[] = new int[Bun];
		int math[] = new int[Bun];
		int sum[] = new int[Bun];
		int avg[] = new int[Bun];
		
		for(int i=0; i<Bun; i++)
		{
			System.out.print("����:");
			kor[i] = sc.nextInt();
			System.out.print("����:");
			eng[i] = sc.nextInt();
			System.out.print("����:");
			math[i] = sc.nextInt();
			System.out.println();
				
			sum[i] = kor[i]+eng[i]+math[i] ;
			avg[i] = sum[i]/3;
						
		}
					
		for(int i=0; i<Bun; i++)
		{
			System.out.println("����:"+sum[i]);
			System.out.println("���:"+avg[i]);
			System.out.println();	
		}
	}
	
}
