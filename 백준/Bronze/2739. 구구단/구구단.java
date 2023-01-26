import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // [입력] 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
        byte inputN = Byte.parseByte(br.readLine());
        br.close();

        for (byte i = 1; i <= 9; i++) {
            // [출력] 출력형식과 같게 N*1부터 N*9까지 출력한다.
            System.out.println(inputN + " * " + i + " = " + inputN * i);
        }
    }

}
