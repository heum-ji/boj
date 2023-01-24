import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        short inputYear = Short.parseShort(br.readLine());

        // (4의 배수 O && 100의 배수 X) || 400의 배수 = 윤년
        if (((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
