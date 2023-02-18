import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        int[] resultArr = new int[10];
        int sum = a * b * c;
        String sumStr = String.valueOf(sum);
        char[] sumChar = sumStr.toCharArray();

        for (char sumC : sumChar) {
            resultArr[Character.getNumericValue(sumC)]++;
        }

        for (int i : resultArr) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}