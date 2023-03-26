import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 첫째 줄 읽기
        // 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.

        int suNo = Integer.parseInt(stringTokenizer.nextToken());// 숫자 개수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의 개수
        long[] sumArr = new long[suNo + 1]; // 합 배열

        // 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 둘째줄 읽기

        // 합 배열 구하기
        for (int i = 1; i <= suNo; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // 질의 구하기
        // 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다
        for (int k = 0; k < quizNo; k++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 셋째 줄 부터 질의 개수 만큼 읽기 반복
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(String.valueOf(sumArr[j] - sumArr[i - 1]));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
