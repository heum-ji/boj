import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // [입력] 첫째 줄에 정수 N(0 ≤ N ≤ 12) : 479,001,600 (최대값) int 범위
        int inputN = Integer.parseInt(br.readLine());

        // [출력] 첫째 줄에 N!을 출력한다.
        System.out.println(factorial(inputN)); // 팩토리얼 호출

        br.close();
    }

    // 재귀 방법으로 풀이
    private static int factorial(int n) {
        if (n <= 1) { // 0! = 1
            return 1;
        }
        return n * factorial(n - 1);
    }
}
