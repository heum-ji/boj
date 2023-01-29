import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
        // 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다.
        // 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
        String inputStr = null;

        // 100줄 이내 언제 끝날지 모르니 EOF(End of File) 체크
        while ((inputStr = br.readLine()) != null) {
            bw.write(inputStr);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
