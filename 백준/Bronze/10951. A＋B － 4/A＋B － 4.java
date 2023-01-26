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
        String str = "";

        /*
         * [입력] 입력은 여러 개의 테스트 케이스로 이루어져 있다.
         * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
         * */
        while ((str = br.readLine()) != null) { // 특별한 종료시점 언급이 없으므로, EOF(End of File) 체크
            StringTokenizer st = new StringTokenizer(str, " ");
            int inputA = Integer.parseInt(st.nextToken());
            int inputB = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(inputA + inputB));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
