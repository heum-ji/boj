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
        // 첫째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M이 주어진다. (1 ≤ N ≤ 1024, 1 ≤ M ≤ 100,000)
        StringTokenizer st = new StringTokenizer(br.readLine()); // 첫째 줄 읽기

        int inputN = Integer.parseInt(st.nextToken()); // 표의 크기
        int inputM = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수

        // 표 생성
        int[][] arrA = new int[inputN + 1][inputN + 1];

        // 표 채우기
        for (int i = 1; i <= inputN; i++) { // 행
            // 둘째 줄부터 N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다.
            st = new StringTokenizer(br.readLine()); // 표 읽기

            for (int j = 1; j <= inputN; j++) { // 열
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 구간 합 생성
        int[][] arrS = new int[inputN + 1][inputN + 1];

        // 구간 합 계산
        for (int i = 1; i <= inputN; i++) { // 행
            for (int j = 1; j <= inputN; j++) { // 열
                arrS[i][j] = arrS[i][j - 1] + arrS[i - 1][j] - arrS[i - 1][j - 1] + arrA[i][j];
            }
        }

        // 구간 합 출력
        for (int i = 0; i < inputM; i++) {
            // 다음 M개의 줄에는 네 개의 정수 x1, y1, x2, y2 가 주어지며, (x1, y1)부터 (x2, y2)의 합을 구해 출력해야 한다.
            // 표에 채워져 있는 수는 1,000보다 작거나 같은 자연수이다. (x1 ≤ x2, y1 ≤ y2)
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = arrS[x2][y2] - arrS[x2][y1 - 1] - arrS[x1 - 1][y2] + arrS[x1 - 1][y1 - 1];
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
