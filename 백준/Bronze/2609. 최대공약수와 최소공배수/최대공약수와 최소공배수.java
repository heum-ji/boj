import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    // 최대 공약수 - 유클리드 호제법 (a > b)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int maxNum = Math.max(a, b); // 큰 수
        int minNum = Math.min(a, b); // 작은 수

        int gcd = gcd(maxNum, minNum); // 최대공약수
        int lcm = a * b / gcd; // 최소공배수 : 두수의 곱 / 최대공약수

        // 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,
        // 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
        bw.write(String.valueOf(gcd));
        bw.newLine();

        bw.write(String.valueOf(lcm));
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
