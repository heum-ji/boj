import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 출력 포맷 'YYYY-MM-DD'

        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Seoul")); // Timezone '서울'

        System.out.println(simpleDateFormat.format(new Date())); // 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
    }
}
