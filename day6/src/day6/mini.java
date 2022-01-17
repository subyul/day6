package day6;

import java.util.Scanner;

public class mini {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int game[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int p1[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int p2[] = { 0, 0, 0, 0, 0, 0, 0, 0 };

		int turn = 0;

		int idx1 = 0;
		int idx2 = 0;
		p1[idx1] = 1;
		p2[idx2] = 2;
		int win1 = 0;
		int win2 = 0;

		while (true) {
			System.out.print("[");
			for (int i = 0; i < p1.length; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println("]");
			System.out.println("p1은 " + win1 + "바퀴째 입니다.");

			System.out.print("[");
			for (int i = 0; i < p2.length; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println("]");
			System.out.println("p2는" + win2 + "바퀴째 입니다.");

			if (turn % 2 == 0) {
				System.out.print("[p1]1~3 입력:");
				int data = sc.nextInt();

				p1[idx1] = 0;
				idx1 = idx1 + data;
				if (idx1 >= 8) {
					win1++;
				}
				idx1 = idx1 % 8;
				p1[idx1] = 1;
			} else if (turn % 2 == 1) {
				System.out.println("[p2]1~3 입력:");
				int data = sc.nextInt();

				p2[idx2] = 0;
				idx2 = idx2 + data;
				if (idx2 >= 8) {
					win2++;
				}
				idx2 = idx2 % 8;
				p2[idx2] = 2;
			}
			if ((idx1 == idx2) && (turn % 2 == 0) && (idx1 != 0)) {
				System.out.println("p1이 p2를 잡았다!");
				p2[idx2] = 0;
				idx2 = 0;
				p2[idx2] = 2;

			} else if ((idx1 == idx2) && (turn % 2 == 1) && (idx2 != 0)) {
				System.out.println("p2가 p1을 잡았다!");
				p1[idx1] = 0;
				idx1 = 0;
				p2[idx1] = 1;
			}
			System.out.println();
			turn++;
		}
	}

}
