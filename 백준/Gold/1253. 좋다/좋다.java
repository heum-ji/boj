import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 : 첫째 줄에는 수의 개수 N(1 ≤ N ≤ 2,000)
        int inputN = Integer.parseInt(br.readLine());

        // 입력 : 두 번째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다. (|Ai| ≤ 1,000,000,000, Ai는 정수)
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] arr = new int[inputN];
        int goodNumCount = 0; // 좋은 수 개수

        // 배열 생성
        for (int i = 0; i < inputN; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 오름차순 정렬 : nlogn
        Arrays.sort(arr);

        // 알고리즘 : 투포인터
        for (int i = 0; i < inputN; i++) {
            int findValue = arr[i]; // 찾는 값
            int startIndex = 0; // 시작 인덱스
            int endIndex = inputN - 1; // 종료 인덱스

            // 순회
            while (startIndex < endIndex) {
                int sum = arr[startIndex] + arr[endIndex]; // 두 수 의 합

                // 찾는 수와 두수의 합이 같은 경우
                if (sum == findValue) {
                    // 찾는 수 중 자기 자신은 예외 처리
                    if (startIndex != i && endIndex != i) {
                        // 두 수 모두 아닌 경우 : 좋은 수 -> 찾았으니 반복문 종료
                        goodNumCount++;
                        break;
                    } else if (startIndex == i) {
                        startIndex++;
                    } else {
                        endIndex--;
                    }
                } else if (sum > findValue) { // 합이 크니 감소
                    endIndex--;
                } else { // 합이 작으니 증가
                    startIndex++;
                }
            }
        }
        System.out.println(goodNumCount);
    }
}
