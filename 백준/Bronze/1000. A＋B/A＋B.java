import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int inputA = Integer.parseInt(st.nextToken());
        int inputB = Integer.parseInt(st.nextToken());

        System.out.println(inputA + inputB);
    }
}