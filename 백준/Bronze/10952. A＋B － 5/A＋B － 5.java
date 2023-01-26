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
        StringTokenizer st;
        int inputA;
        int inputB;
            
        // [처리]
        while (true) {
            /*
             * [입력] 입력은 여러 개의 테스트 케이스로 이루어져 있다.
             * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
             */
            st = new StringTokenizer(br.readLine(), " ");
            inputA = Integer.parseInt(st.nextToken());
            inputB = Integer.parseInt(st.nextToken());

            // 입력의 마지막에는 0 두 개가 들어온다.
            if (inputA == 0 && inputB == 0) {
                break;
            }

            bw.write(String.valueOf(inputA + inputB)); // 합산 + 형변환
            bw.newLine(); // 개행처리
        }
        br.close();

        // [출력] 각 테스트 케이스마다 A+B를 출력한다.
        bw.flush();
        bw.close();
    }

}
