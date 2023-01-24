import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // [입력] 100,000보다 작거나 같은 자연수 N
        int n = Integer.parseInt(br.readLine());

        // [출력] 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
