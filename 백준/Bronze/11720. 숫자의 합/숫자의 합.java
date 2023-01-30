import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
        br.readLine();
        char[] inputCharArr = br.readLine().toCharArray(); // 입력된 각 숫자 char로 변경
        br.close();

        int sum = 0;

        for (char inputChar : inputCharArr) {
            sum += Character.getNumericValue(inputChar); // char을 형변환 시 아스키코드로 변환됨
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
