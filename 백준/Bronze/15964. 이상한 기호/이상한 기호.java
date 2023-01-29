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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        // 첫째 줄에 A, B가 주어진다. (1 ≤ A, B ≤ 100,000)
        long inputA = Long.parseLong(st.nextToken());
        long inputB = Long.parseLong(st.nextToken());

        // 첫째 줄에 A＠B의 결과를 출력한다.
        // A＠B = (A + B) × (A - B)
        bw.write(String.valueOf((inputA + inputB) * (inputA - inputB)));
        bw.flush();
        bw.close();
    }

}
