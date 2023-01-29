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
        // 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
        String inputS = br.readLine();
        br.close();

        int[] arr = new int[26]; // 알파벳 : 26개

        // 초기값 -1로 초기화 : 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
        Arrays.fill(arr, -1);

        // 알파벳 포함 유/무 체크
        for (int i = 0; i < inputS.length(); i++) {
            char c = inputS.charAt(i); // 비교할 값 (아스키)

            // a : 97 (아스키) : index 0
            if (arr[c - 'a'] == -1) { // 한번도 바뀌지 않은 경우에만 처리 (중복인 경우 제외)
                arr[c - 'a'] = i;
            }
        }

        // 출력
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) { // 마지막엔 " " 추가 X
                bw.write(String.valueOf(arr[i]));
            } else {
                bw.write(arr[i] + " ");
            }
        }

        bw.flush();
        bw.close();
    }

}
