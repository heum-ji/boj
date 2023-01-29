import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 
        // 출석번호에 중복은 없다.
        boolean[] student = new boolean[30];

        // 제출한 학생 제거
        for (byte i = 0; i < 28; i++) {
            student[Byte.parseByte(br.readLine()) - 1] = true;
        }

        // 제출 안 한 학생 출력
        for (int i = 0; i < 30; i++) {
            // 제출 안 한 학생 = false
            if (!student[i]) {
                bw.write(String.valueOf(i + 1)); // 학생은 1부터 시작
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }

}
