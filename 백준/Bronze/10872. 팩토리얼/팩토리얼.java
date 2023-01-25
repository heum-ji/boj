import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // [입력] 첫째 줄에 정수 N(0 ≤ N ≤ 12) : 479,001,600 (최대값) int 범위
        int inputN = Integer.parseInt(br.readLine());
        br.close();

        int result = 1;

        // for문으로 풀이
        for (int i = inputN; i > 1; i--) {
            result *= i;
        }

        // [출력] 첫째 줄에 N!을 출력한다.
        System.out.println(result); // for문 출력
    }
}
