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
        // 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
        // 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
        // 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        // 첫째 줄에 단어의 개수를 출력한다.
        bw.write(String.valueOf(st.countTokens()));
        bw.flush();
        bw.close();
    }
}
