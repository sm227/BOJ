import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNum = sc.nextInt();

        int[] score; // 점수 저장할 배열 선언
        for (int i = 0; i < caseNum; i++) {
            int sn = sc.nextInt(); // 학생 수 입력
            score = new int[sn]; // 학생 수 만큼 점수 배열 초기화

            int sum = 0;
            // 점수 입력 받아 배열에 저장하기
            double avg = 0;
            for (int j = 0; j < sn; j++) {
                score[j] = sc.nextInt();
                sum += score[j]; // 학생들의 총 점
                avg = sum / sn;
                int count = 0;
                for(int k = 1; k < score.length; k++) { // 평균보다 높은 값 찾기
                    if(score[k] > avg) {
                        // 퍼센트 계산
                        System.out.println(score[k]);
                        count +=1;
                    }
                }
                double result = (count / sn) * 100;
                System.out.println(result);
            }
        }
    }
}
