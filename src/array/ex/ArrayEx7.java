package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] score = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < score.length; i++) {

            System.out.println((i+1)+"번 학생의 성적을 입력하세요 : ");
            for(int z =0; z < 3; z++){
                System.out.println(subjects[z] + " 점수 : " );
                score[i][z] = scanner.nextInt();
            }
        }

        for (int i = 0; i < score.length; i++) {
            int total = 0;
            for (int z =0; z < 3; z++){
                total += score[i][z];
            }
            double average = total / 3.0;
            System.out.println((i+1)+"번 학생의 총점 : " + total + ", 평균: " + average);
        }
    }
}
