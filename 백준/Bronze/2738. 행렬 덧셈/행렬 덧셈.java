import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 첫째 줄에 행렬의 크기 N 과 M이 주어진다.
        short inputN = Short.parseShort(st.nextToken());
        short inputM = Short.parseShort(st.nextToken());
        // 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
        // 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
        // N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
        short[][] arrA = new short[inputN][inputM];
        short[][] arrB = new short[inputN][inputM];

        // 행렬 A 생성
        for (short i = 0; i < inputN; i++) { // 행
            st = new StringTokenizer(br.readLine(), " ");

            for (short j = 0; j < inputM; j++) { // 열
                arrA[i][j] = Short.parseShort(st.nextToken());
            }
        }

        // 행렬 B 생성
        for (short i = 0; i < inputN; i++) { // 행
            st = new StringTokenizer(br.readLine(), " ");

            for (short j = 0; j < inputM; j++) { // 열
                arrB[i][j] = Short.parseShort(st.nextToken());
            }
        }
        br.close();

        // 행렬 덧셈 계산
        for (short i = 0; i < inputN; i++) { // 행

            for (short j = 0; j < inputM; j++) { // 열
                bw.write(String.valueOf(arrA[i][j] + arrB[i][j]) + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
