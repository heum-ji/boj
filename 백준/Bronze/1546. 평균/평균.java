import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
        int inputN = Integer.parseInt(br.readLine());
        // 둘째 줄에 세준이의 현재 성적이 주어진다.
        // 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] arr = new int[inputN]; // 점수 저장용
        int maxScore = 0; // 최대값 M
        double sumScore = 0; // 점수합

        // 최대값 추출
        for (int i = 0; i < inputN; i++) {
            int curScore = Integer.parseInt(st.nextToken());

            arr[i] = curScore; // 점수 저장
            // 최대값 갱신
            if (curScore > maxScore) {
                maxScore = curScore;
            }
        }

        // 점수 변환
        for (int i = 0; i < inputN; i++) {
            double tempScore = (double) arr[i] / maxScore * 100; // 점수 변환 (점수 / M * 100)
            sumScore += tempScore;
        }
        System.out.println();

        // 평균 계산
        bw.write(String.valueOf(sumScore / inputN));
        bw.flush();
        bw.close();
    }

}