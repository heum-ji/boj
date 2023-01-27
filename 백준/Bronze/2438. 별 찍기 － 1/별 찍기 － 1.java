import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // [입력] 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
        int inputN = Integer.parseInt(br.readLine());
        br.close();

        // [출력] 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
        for (int i = 1; i <= inputN; i++) {

            for (int j = 0; j < i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
