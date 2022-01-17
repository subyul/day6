package day6;
import java.util.Scanner;
public class tictactoe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int game[] = new int[9];
		int turn = 0;
		int win = 0;
		
		while (true) {
			for(int i = 0; i<game.length; i++) {
				if(game[i] == 0) {
					System.out.print("[]");
				}
				else if(game[i] == 1) {
					System.out.print("[0]");
				}
				else if(game[i] == 2) {
					System.out.println("[X]");
				}
				
				if(i==2 || i==5) {
					System.out.println();
				}
	}
			System.out.println();
			
			for(int i = 0; i<game.length; i++) {
				System.out.println("[p1] ÀÎµ¦½º ÀÔ·Â:");
				int data = sc.nextInt();
				
			}

}
	}
}
