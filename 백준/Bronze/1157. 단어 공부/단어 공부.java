import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
        // 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
        char[] charArr = br.readLine().toCharArray();
        int[] tempArr = new int[26]; // 알파벳 26개
        int maxAlpha = 0;
        char result = ' ';
        br.close();

        // 알파벳 카운트
        for (char curChar : charArr) {
            if ('A' <= curChar && curChar <= 'Z') { // 대문자
                tempArr[curChar - 'A']++;
            } else { // 소문자
                tempArr[curChar - 'a']++;
            }
        }

        // 가장 많이 사용된 알파벳 검색
        for (int i = 0; i < 26; i++) {
            if (tempArr[i] > maxAlpha) { // 최대값 갱신
                maxAlpha = tempArr[i];
                result = (char) (i + 'A'); // 대문자 변경
            } else if (tempArr[i] == maxAlpha) { // 최대값 중복
                result = '?';
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
