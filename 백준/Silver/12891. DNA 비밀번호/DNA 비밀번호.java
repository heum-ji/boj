import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int PASS = 4; // 비밀번호 통과 유/무 체크
    static int[] checkArr; // 비밀번호 조건용
    static int[] myArr; // 비밀번호 검사용
    static int checkPass; // 비밀번호 검사 통과 카운트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 첫번째 줄에 민호가 임의로 만든 DNA 문자열 길이 |S|와 비밀번호로 사용할 부분문자열의 길이 |P| 가 주어진다.
        // (1 ≤ |P| ≤ |S| ≤ 1,000,000)
        int inputS = Integer.parseInt(st.nextToken());
        int inputP = Integer.parseInt(st.nextToken());
        int result = 0; // 결과용

        // 전역변수 초기화
        checkArr = new int[4];
        myArr = new int[4];
        checkPass = 0;

        // 두번째 줄에는 민호가 임의로 만든 DNA 문자열이 주어진다.
        char[] dnaStr = br.readLine().toCharArray();

        // 세번째 줄에는 부분문자열에 포함되어야 할 {‘A’, ‘C’, ‘G’, ‘T’} 의 최소 개수가 공백을 구분으로 주어진다.
        // 각각의 수는 |S| 보다 작거나 같은 음이 아닌 정수이며 총 합은 |S| 보다 작거나 같음이 보장된다.
        st = new StringTokenizer(br.readLine());
        br.close();

        // 비밀번호 검사용 Set
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());

            if (checkArr[i] == 0) {
                checkPass++;
            }
        }

        // 초기 부분 문자열 Set
        for (int i = 0; i < inputP; i++) {
            addChar(dnaStr[i]);
        }

        // 초기 부분 문자열 비밀번호 통과 갱신
        if (checkPass == PASS) {
            result++;
        }

        // 슬라이딩 알고리즘 구현
        for (int i = inputP; i < inputS; i++) {
            int j = i - inputP; // 제일 앞 index 추출

            addChar(dnaStr[i]); // 문자 추가
            removeChar(dnaStr[j]); // 문자 제거

            // 비밀번호 통과 갱신
            if (checkPass == PASS) {
                result++;
            }
        }

        System.out.println(result);
    }

    /**
     * 추가된 문자 비밀번호 체크
     *
     * @param c 추가된 문자
     */
    private static void addChar(char c) {
        switch (c) {
            case 'A':
                checkAddChar(0);
                break;
            case 'C':
                checkAddChar(1);
                break;
            case 'G':
                checkAddChar(2);
                break;
            case 'T':
                checkAddChar(3);
                break;
            default:
                System.out.println("지원하지 않는 문자입니다" + c);
                break;
        }
    }

    /**
     * 제거된 문자 비밀번호 체크
     *
     * @param c 제거된 문자
     */
    private static void removeChar(char c) {
        switch (c) {
            case 'A':
                checkRemoveChar(0);
                break;
            case 'C':
                checkRemoveChar(1);
                break;
            case 'G':
                checkRemoveChar(2);
                break;
            case 'T':
                checkRemoveChar(3);
                break;
            default:
                System.out.println("지원하지 않는 문자입니다" + c);
                break;
        }
    }

    /**
     * 추가된 문자 비밀번호 갱신
     *
     * @param index 추가된 문자 index
     */
    private static void checkAddChar(int index) {
        myArr[index]++;

        // 증가 후 비교
        if (myArr[index] == checkArr[index]) {
            checkPass++;
        }
    }

    /**
     * 제거된 문자 비밀번호 갱신
     *
     * @param index 제거된 문자 index
     */
    private static void checkRemoveChar(int index) {
        // 비교 후 감소
        if (myArr[index] == checkArr[index]) {
            checkPass--;
        }

        myArr[index]--;
    }
}
