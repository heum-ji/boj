import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
        int inputN = Integer.parseInt(br.readLine());
        int[] arr = new int[inputN];

        // 둘째 줄부터 N개의 줄에는 수가 주어진다.
        // 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
        for (int i = 0; i < inputN; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        // 오름차순 정렬
        Arrays.sort(arr);

        for (int i : arr) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
