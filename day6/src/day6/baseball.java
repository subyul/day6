package day6;
import java.util.Scanner;
import java.util.Random;
public class baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int com[] = {1, 7, 3};
		int me [] = new int[3];
		
		int strike = 0;
		int ball = 0;
		
		while(true)
		{
			
			System.out.print("[1] 1~9 입력:");
			int data1 = sc.nextInt();
			
			System.out.print("[2] 1~9 입력:");
			int data2 = sc.nextInt();
			
			System.out.print("[3] 1~9 입력:");
			int data3 = sc.nextInt();
			
			for(int i = 0; i<com.length; i++)
			{
				System.out.print(com[i]+" ");	
				me[0] = data1;
			
			if((com[i]==data1)||(com[i]==data2)||(com[i]==data3))
			{
				strike+=1;
			
			}
				
			}
			System.out.println(strike+"strike");
			System.out.println(ball+"ball");
			}
			}
		
		}
		
	
	
		
