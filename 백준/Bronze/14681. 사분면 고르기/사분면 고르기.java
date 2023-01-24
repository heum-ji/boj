import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        short inputX = Short.parseShort(br.readLine());
        short inputY = Short.parseShort(br.readLine());

        if (inputX > 0) { // Quadrant 1 : ++, Quadrant 4 : +-
            System.out.println(inputY > 0 ? 1 : 4);
        } else { // Quadrant 2 : -+, Quadrant 3 : --
            System.out.println(inputY > 0 ? 2 : 3);
        }
    }
}
