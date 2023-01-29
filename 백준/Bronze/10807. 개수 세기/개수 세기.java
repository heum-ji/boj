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
        // [입력] 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
        byte inputN = Byte.parseByte(br.readLine());
        // [입력] 둘째 줄에는 정수가 공백으로 구분되어져있다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // [입력] 셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
        String inputV = br.readLine();
        br.close();

        byte sumV = 0; // 정수v와 같은 정수 갯수

        // 수열 A 데이터 삽입
        for (byte i = 0; i < inputN; i++) {
            if (inputV.equals(st.nextToken())) { // 찾으려고 하는 정수 V와 같은 경우
                sumV++;
            }
        }
        bw.write(String.valueOf(sumV));
        bw.flush();
        bw.close();
    }

}
