import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main4 {
    private String eventName;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    
    public static void main(String[] args) {
        // ここにテスト用のコードを書いてください
        ZonedDateTime start = ZonedDateTime.of(2024, 7, 1, 10, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime end = ZonedDateTime.of(2024, 7, 15, 22, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        Duration duration = Duration.between(start, end);
        long days = duration.toDays();
        long hours = duration.toHours()%24;


        Main4 eventMain4 = new Main4("サマーフェスティバル",start,end);
        System.out.println("イベント： " + eventMain4.eventName);
        System.out.println("開始： " + formatter.format(start) + "\n終了： " + formatter.format(end));
        System.out.println("期間：" + eventMain4.getEventDuration() + "\n現地時間：" + eventMain4.getLocalTime() + "\nUTC時間：" + eventMain4.getUtcTime());

    }

    public Main4(String name, ZonedDateTime start, ZonedDateTime end) {
        this.eventName = name;
        this.startTime = start;
        this.endTime = end;
    }

    public String getEventDuration() {
        Duration duration = Duration.between(startTime, endTime);
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        return days + "日と" + hours + "時間";
    }

    public String getLocalTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.format(formatter);
    }

    public String getUtcTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.withZoneSameInstant(ZoneId.of("UTC")).format(formatter);
    }
}