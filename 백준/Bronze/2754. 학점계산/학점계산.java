import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputScore = br.readLine();
        br.close();

        double grade = 0.0; // 평점

        // Early Return - F 평점
        if ("F".equals(inputScore)) {
            bw.write(String.valueOf(grade));
            bw.flush();
            bw.close();
            return;
        }

        // 평점 구별
        switch (inputScore.charAt(0)) { // A, B, C, D
            case 'A':
                grade = 4.0;
                break;
            case 'B':
                grade = 3.0;
                break;
            case 'C':
                grade = 2.0;
                break;
            case 'D':
                grade = 1.0;
                break;
            default:
                break;
        }

        // 세부 평점
        switch (inputScore.charAt(1)) { // +, 0, -
            case '+':
                grade += 0.3;
                break;
            case '-':
                grade -= 0.3;
                break;
            default: // 0
                break;
        }
        bw.write(String.valueOf(grade));
        bw.flush();
        bw.close();
    }

}
