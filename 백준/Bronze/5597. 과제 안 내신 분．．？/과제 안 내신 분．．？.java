import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 
        // 출석번호에 중복은 없다.
        ArrayList<Integer> arrList = new ArrayList<Integer>(30); // 학생 30명

        // 정렬된 1 ~ 30 삽입
        for (int i = 0; i < 30; i++) {
            arrList.add(i + 1);
        }

        // 제출한 학생 제거
        for (int i = 0; i < 28; i++) {
            String curVal = br.readLine();
            arrList.removeIf(n -> n == Integer.parseInt(curVal));
        }

        // 제출 안 한 학생 출력 - 정렬되어 있음
        for (Integer student : arrList) {
            bw.write(String.valueOf(student));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
