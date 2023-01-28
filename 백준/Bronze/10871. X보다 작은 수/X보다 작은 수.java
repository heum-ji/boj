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
        // [입력] 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int inputN = Integer.parseInt(st.nextToken()); // 수열 A를 이루는 정수 N
        int inputX = Integer.parseInt(st.nextToken()); // 비교되는 정수 X
        int[] arrA = new int[inputN]; // 수열 A - 입력받은 inputN 사이즈 만큼 생성

        // [입력] 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
        // 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        br.close();

        // 수열 A 데이터 삽입
        for (int i = 0; i < inputN; i++) {
            arrA[i] = Integer.parseInt(st2.nextToken());
        }

        // [출력] X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
        for (int arr : arrA) {

            if (arr < inputX) {
                bw.write(arr + " ");
            }
        }
        bw.flush();
        bw.close();
    }

}
