import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
        int inputN = Integer.parseInt(br.readLine());
        br.close();

        // 세로 반복
        for (int i = 1; i <= inputN; i++) {
            // 가로 반복
            for (int j = inputN; j >= 1; j--) {
                bw.write(j > i ? " " : "*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
