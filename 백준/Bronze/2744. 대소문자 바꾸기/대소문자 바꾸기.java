import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (char c : br.readLine().toCharArray()) {// toCharArray() : String을 char[]로 변환
            bw.write(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c)); // isUpperCase : 대문자면 True 소문자면 false
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
