package day6;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		char[] grade = new char[5];
		int cnt = 0;

		while (true) {
			System.out.println("====성적 시스템====");
			System.out.println("1.성적등록 2.리스트 0.종료");
			System.out.print("메뉴선택 >");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("이름입력 >");
				name[cnt] = sc.next();
				System.out.print("국어점수 입력 >");
				kor[cnt] = sc.nextInt();
				System.out.print("영어점수 입력 >");
				eng[cnt] = sc.nextInt();
				System.out.print("수학점수 입력 >");
				mat[cnt] = sc.nextInt();
				total[cnt] = kor[cnt] + eng[cnt] + mat[cnt];
				avg[cnt] = total[cnt] / 3f;

				if (avg[cnt] <= 90) {
					grade[cnt] = 'a';
				} else if (avg[cnt] <= 80) {
					grade[cnt] = 'b';
				} else if (avg[cnt] <= 70) {
					grade[cnt] = 'c';
				} else if (avg[cnt] <= 60) {
					grade[cnt] = 'd';
				} else {
					grade[cnt] = 'f';
				}
				System.out.println("성적등록 완료!");
				cnt++;

			} else if (menu == 2) {
				System.out.println("이름\t국어\t영어\t수학\t평균\t학점\t");
				System.out.println("-------------------------------------------");

				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", name[i], kor[i], eng[i], mat[i], total[i],
							avg[i], grade[i]);

				}

			} else if (menu == 0) {
				break;
			} else {

			}

		}

	}

}
