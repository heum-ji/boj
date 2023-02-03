import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxIndex = 0; // 최댓값 순서
        int maxNum = 0; // 최댓값

        // 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다.
        // 주어지는 자연수는 100 보다 작다.
        for (int i = 1; i <= 9; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > maxNum) { // 최댓값 갱신
                maxNum = x;
                maxIndex = i;
            }
        }
        br.close();
        bw.write(maxNum + "\n");
        bw.write(String.valueOf(maxIndex));

        bw.flush();
        bw.close();
    }

}
