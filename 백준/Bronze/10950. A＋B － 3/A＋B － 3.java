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

        // [입력] 첫째 줄에 테스트 케이스의 개수 T
        int inputT = Integer.parseInt(br.readLine());

        // [처리] 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        for (int i = 0; i < inputT; i++) {
            // 공백으로 A, B 구분
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // A, B 추출
            int inputA = Integer.parseInt(st.nextToken());
            int inputB = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(inputA + inputB)); // 합산 + 형변환
            bw.newLine(); // 개행처리
        }
        br.close();

        // [출력] 각 테스트 케이스마다 A+B를 출력한다.
        bw.flush();
        bw.close();
    }

}