import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // [입력] (-2,000,000,000 ≤ N, M ≤ 2,000,000,000) : 연산 시 범위 넘어가므로 long 사용
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        // [출력]
        // (|N-M|)을 출력한다. : 절대값
        System.out.println(Math.abs(n - m));
    }
}
