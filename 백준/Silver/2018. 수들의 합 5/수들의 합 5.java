import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 : 첫 줄에 정수 N이 주어진다.
        final int N = Integer.parseInt(br.readLine());

        int answer = 1; // 출력용 가지수 : 자기 자신 출력 포함 ++
        int startIndex = 1; // 시작 포인터
        int endIndex = 1; // 종료 포인터
        int sum = 1;

        // 처리 : 투 포인터 알고리즘
        while (endIndex != N) {
            if (sum == N) {
                answer++;
                endIndex++;
                sum += endIndex;
            } else if (sum > N) {
                sum -= startIndex;
                startIndex++;
            } else {
                endIndex++;
                sum += endIndex;
            }
        }

        // 출력 : 입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오
        System.out.println(answer);
    }
}
