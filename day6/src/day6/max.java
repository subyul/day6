package day6;
import java.util.Scanner;
public class max {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int arr[] = {11, 87, 42, 100, 24};
	int check = 0;
	int count = 0;
	
	
	
	
	while (true)
	{
		System.out.print("[");
		for (int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
		System.out.println("�ִ밪�� �Է��Ͻÿ�:");
		int max = sc.nextInt();
		
		for(int i = 0; i<arr.length; i++)
		{
			if(max == arr[i])
			{
				arr[i]-=arr[i];
				check++;
			}
		}
		if(check == 5)
		{
			System.out.println("���α׷� ����");
			break;
		}
	
		
	
	}
}
}
