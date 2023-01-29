import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
        int inputT = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputT; i++) {
            String inputStr = br.readLine();
            // 아래 문자를 + 연산하면 합쳐진 새로운 문자가 되므로 주의!!
            bw.write(String.valueOf(inputStr.charAt(0)));
            bw.write(String.valueOf(inputStr.charAt(inputStr.length() - 1)));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
