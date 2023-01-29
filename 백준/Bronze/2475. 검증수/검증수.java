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
        // 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int sum = 0; // 각 숫자를 제곱한 수들의 합
        // 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
        // 04256 = 0 + 16 + 4 + 25 + 36 = 81
        // 81 % 10 = 1
        for (int i = 0; i < 5; i++) {
            int x = Integer.parseInt(st.nextToken());
            sum += x * x;
        }
        //첫째 줄에 검증수를 출력한다.
        // A＠B = (A + B) × (A - B)
        bw.write(String.valueOf(sum % 10));
        bw.flush();
        bw.close();
    }

}
