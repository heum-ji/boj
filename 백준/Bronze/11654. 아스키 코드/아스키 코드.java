import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
        char inputX = br.readLine().charAt(0); // 문자열을 char형(문자) 로 변환
        br.close();

        // 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
        bw.write(String.valueOf((int) inputX)); // char형을 int형으로 변환(아스키 코드)
        bw.flush();
        bw.close();
    }

}
