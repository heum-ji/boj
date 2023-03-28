import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
        int N = Integer.parseInt(st.nextToken()); // 수열의 개수
        int M = Integer.parseInt(st.nextToken()); // 나누어 떨어지는 수
        
        // 둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)
        st = new StringTokenizer(br.readLine());

        // 같은 나머지 index 카운트 배열 선언
        long[] C = new long[M]; // 나머지 : 나누는 수 - 1 ex) 3 : 0 1 2
        int sum = 0; // 구간 합

        // 구간합 + % 연산 처리
        for (int i = 0; i < N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % M; // 현재까지 구간 합 % M
            C[sum]++; // 같은 나머지 index++
        }
        
        long answer = C[0]; // 정답용 변수 : 나머지가 0인 경우 + 같은 나머지 index 중 2개를 뽑는 경우의 수

        // 같은 나머지 index 중 2개를 뽑는 경우의 수 연산
        for (int i = 0; i < M; i++) {
            answer += (long) C[i] * (C[i] - 1) / 2; // n * n - 1 / 2
        }
        System.out.println(answer);
    }
}
