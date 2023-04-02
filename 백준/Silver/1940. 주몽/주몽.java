import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 : 첫째 줄에는 재료의 개수 N(1 ≤ N ≤ 15,000)이 주어진다.
        int inputN = Integer.parseInt(br.readLine());

        // 입력 : 그리고 두 번째 줄에는 갑옷을 만드는데 필요한 수 M(1 ≤ M ≤ 10,000,000) 주어진다.
        int inputM = Integer.parseInt(br.readLine());

        // 입력 : 그리고 마지막으로 셋째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다.
        // 고유한 번호는 100,000보다 작거나 같은 자연수이다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[inputN];

        // 재료 배열 생성
        for (int i = 0; i < inputN; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 재료 배열 오름차순 정렬 : nlogn
        Arrays.sort(arr);

        // 정답 : 갑옷을 만들 수 있는 수
        int result = 0;
        int startIndex = 0; // 시작 인덱스
        int endIndex = inputN - 1; // 종료 인덱스

        // 갑옷 만들 수 있는 수 계산
        while (startIndex < endIndex) {
            int sum = arr[startIndex] + arr[endIndex]; // 고유번호 합

            if (sum > inputM) {
                endIndex--;
            } else if (sum < inputM) {
                startIndex++;
            } else {
                result++;
                startIndex++;
                endIndex--;
            }
        }
        System.out.println(result);
    }
}
