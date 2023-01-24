import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // [입력] 100,000보다 작거나 같은 자연수 N
        int n = Integer.parseInt(br.readLine());
        br.close();

        // [출력] 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
        for (int i = 1; i <= n; i++) {
            bw.write(i + "\n"); // 출력량이 많아 println에서 수정
        }
        bw.flush();
        bw.close();
    }
}
