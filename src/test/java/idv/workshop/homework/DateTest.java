package idv.workshop.homework;

import org.junit.Test;

import java.time.*;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTest {

    //參考資料來源:https://magiclen.org/java-8-date-time-api/
    
    @Test
    public void testCurrentLocalDateTime() {
        //直接使用LocalDateTime類別來取得日期與時間
        final LocalDateTime currentPoint = LocalDateTime.now();
        System.out.println(currentPoint);

        //指定時區
    final LocalDateTime currentPointUTC = LocalDateTime.now(Clock.systemUTC());
        System.out.println(currentPointUTC);

        //同LocalDateTime.now();
        final LocalDateTime currentPointDefault = LocalDateTime.now(Clock.systemDefaultZone());
        System.out.println(currentPointDefault);

        final LocalDateTime currentPointPlus9 = LocalDateTime.now(Clock.system(ZoneId.of("+8")));
        System.out.println(currentPointPlus9);

        final LocalDateTime nextWeekDateTime = LocalDateTime.now().plusWeeks(16);
        System.out.println(nextWeekDateTime);

        final LocalDate next16WeekDate = LocalDate.now().plusWeeks(16);
        System.out.println(next16WeekDate);

        final Instant instant1 = Instant.parse("2015-04-03T00:00:00Z");
        System.out.println(instant1);   //2015-04-03T00:00:00Z

        //UTC的「西元2015年4月3日凌晨1點整」與「西元1970年1月1日凌晨0點整」共相差了1428019200000毫秒 = 1428019200秒
        final Instant instant2 = Instant.ofEpochMilli(1428019200000L);
        System.out.println(instant2);   //2015-04-03T00:00:00Z

        final Duration duration1 = Duration.parse("PT20M");
        System.out.println(duration1);  //PT20M -> 20min

        //此方法比上者好
        //PT應該就是"Period Time"的縮寫
        final Duration duration2 = Duration.ofMinutes(20);
        System.out.println(duration2);  //PT20M -> 20min

        //Duration物件也可以和Instant物件一同使用，進行時間的加減運算
        final Instant instant = Instant.parse("2015-04-03T00:00:00Z");
        final Duration duration = Duration.parse("PT20M");
        final Instant newInstant = instant.plus(duration);
        System.out.println(newInstant);  //2015-04-03T00:20:00Z

        //也可以使用Duration的between來計算兩個Instant物件的時間差
        final Instant instantA = Instant.parse("2017-11-17T13:50:00Z");
        final Instant instantB = Instant.parse("2017-12-21T01:50:00Z");
        final Duration durationAtoB = Duration.between(instantA, instantB);
        System.out.println(durationAtoB); //PT804H -> 804hr...

        //系統預設時區
        final ZoneId zoneidDefault = ZoneId.systemDefault();
        System.out.println(zoneidDefault);

        final ZoneId zoneidPlus8 = ZoneId.of("UTC+8");
        System.out.println(zoneidPlus8);

        //宣告
        Instant nowInstant = Instant.now();
        System.out.println("***" + nowInstant);
        //ZoneId物件可以配合LocalDateTime類別所提供的ofInstant方法來將Instant物件轉成LocalDateTime物件
        final LocalDateTime nowLocalDateTime = LocalDateTime.ofInstant(nowInstant, zoneidPlus8); //加8小時
        System.out.println("***" + nowLocalDateTime);

        //ZoneOffset類別本身也是有提供of或是ofXXXX方法來建立ZoneOffset物件
        final ZoneOffset zoneid8hr1 = (ZoneOffset) ZoneId.of("+8");
        final ZoneOffset zoneid8hr2 = ZoneOffset.of("+8");
        final ZoneOffset zoneid8hr3 = ZoneOffset.ofHours(8);
        System.out.println(zoneid8hr1);  //+08:00
        System.out.println(zoneid8hr2);  //+08:00
        System.out.println(zoneid8hr3);  //+08:00

        // The direction of zone offset is different with zone id (reversed).
        final Instant nowLocalDateTimeToInstant = nowLocalDateTime.toInstant(ZoneOffset.ofHours(0));
        System.out.println("***" + nowLocalDateTimeToInstant);  //為何沒加八小時!?

        //建立一個日期時間
        final LocalDateTime qingming = LocalDateTime.of(2017, 12, 22, 20, 30, 30);
        final LocalDate qingmingDate = LocalDate.of(2017, 12, 22);
        final LocalTime qingmingTime = LocalTime.of(20, 30 ,30);
        System.out.println(qingming);
        System.out.println(qingmingDate);
        System.out.println(qingmingTime);

        final LocalDateTime qingmingParsed1 = LocalDateTime.parse("2017-12-22T22:25:00");
        System.out.println(qingmingParsed1);

        final LocalDateTime qingmingParsed2 = LocalDateTime.parse("2017/12/22 22:25:00", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(qingmingParsed2);

        System.out.println("qingming from epoch: " + qingming.toEpochSecond(ZoneOffset.ofHours(0)));

        //取得年、月、日、小時、分鐘、秒、星期
        final LocalDateTime currentDateTime = LocalDateTime.now();
        final int year = currentDateTime.getYear();
        final int month = currentDateTime.getMonthValue();
        final Month m = currentDateTime.getMonth();
        final int day = currentDateTime.getDayOfMonth();
        final DayOfWeek w = currentDateTime.getDayOfWeek();
        final int hour = currentDateTime.getHour();
        final int minute = currentDateTime.getMinute();
        final int second = currentDateTime.getSecond();

        System.out.println(year);
        System.out.println(month);
        System.out.println(m);
        System.out.println(day);
        System.out.println(w);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

        //修改日期或時間
        final LocalDate currentDate = LocalDate.now();
        //將日期改為該月的一日,注意這裡currentDate並沒有被改變！
        final LocalDate thisMonth = currentDate.withDayOfMonth(1);
        System.out.println(currentDate);
        System.out.println(thisMonth);

        //LocalDate、LocalTime與LocalDateTime物件也和Instant等物件一樣可以做一些時間的運算
        final LocalDateTime weekAfterNextWeekDateTime = LocalDateTime.now().plusWeeks(2);
        final LocalDateTime next7DaysDateTime = LocalDateTime.now().plusDays(7);
        System.out.println(weekAfterNextWeekDateTime);
        System.out.println(next7DaysDateTime);

        //取得目前這個月的第一天與最後一天
        final LocalDateTime firstDayOfMonthDateTime = LocalDateTime.now().with(TemporalAdjusters.firstDayOfMonth());
        final LocalDateTime lastDayOfMonthDateTime = LocalDateTime.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(firstDayOfMonthDateTime);
        System.out.println(lastDayOfMonthDateTime);

        //取得距離目前最近的星期三
        //TemporalAdjusters提供了next和nextOrSame與previous和previousOrSame方法，可以快速找出某一時間點往前或是往後距離最近的星期日子。
        final LocalDateTime previousWednesdayDateTime = LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.WEDNESDAY));
        final LocalDateTime nextWednesdayDateTime = LocalDateTime.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println(previousWednesdayDateTime);
        System.out.println(nextWednesdayDateTime);

        //減少時間精確度(Truncation)
        //只有LocalTime與LocalDateTime物件有truncatedTo方法可以使用
        //捨棄hour以下的單位
        final LocalDateTime hourDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.HOURS);
        System.out.println(hourDateTime);

        //ZonedDateTime的建立與使用
        //前面提到的LocalDate、LocalTime與LocalDateTime都沒有時區的概念，如果有要使用到時區的話，應該要使用ZonedDateTime這個類別
        //只不過ZonedDateTime需要在建立時多代入ZoneId物件來指定時間的時區
        //同ZonedDateTime.now(Clock.systemDefaultZone())。直接使用ZonedDateTime類別來取得日期與時間，由於Clock物件已有時區資訊，故不用再代入時區
        final ZonedDateTime currentPoint2 = ZonedDateTime.now();   //ctrl點進去now可以知道封裝內容是return now(Clock.systemDefaultZone());
        final ZonedDateTime currentPoint3 = ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Tokyo")));
        System.out.println(currentPoint2);
        System.out.println(currentPoint3);

        //除了使用ZonedDateTime類別來建立ZonedDateTime物件之外，也可以直接用LocalDateTime物件的atZone方法，參數傳入ZoneId物件，就能轉成ZonedDateTime物件
        final LocalDateTime currentDateTime2 = LocalDateTime.now();
        final ZonedDateTime zonedCurrentDateTime = currentDateTime2.atZone(ZoneId.of("+8"));
        System.out.println(currentDateTime2);
        System.out.println(zonedCurrentDateTime);

        //ZonedDateTime物件因為已經包含了時區資訊，因此可以直接使用toInstant方法，不用代入任何時區參數，就可以轉成Instant物件。
        final Instant zonedCurrentInstant = ZonedDateTime.now().toInstant();
        System.out.println(zonedCurrentInstant);

        //年表/曆法(Chronology)
        //java.time套件除了能支援國際通用的ISO 8601日期與時間的表示方式外，還支援一些non-ISO的曆法，相關API都在java.time.chrono套件內。
        //如果要使用日本昭和或是平成年號來紀年的話，可以使用java.time.chrono裡的JapaneseChronology、JapaneseDate與JapaneseEra(日本年號列舉)類別
        final JapaneseChronology japaneseChronology = JapaneseChronology.INSTANCE;
        final JapaneseDate japaneseDate = japaneseChronology.dateNow();
        System.out.println(japaneseChronology);
        System.out.println(japaneseDate);

        //YearMonth與MonthDay
        //有時我們只會需要年月(如信用卡的有效日期)或是月日(如生日)等資料，java.time套件裡也有這樣的類別存在，分別就是YearMonth和MonthDay。
        final MonthDay birthday = MonthDay.of(11, 4);
        final YearMonth creditCard = YearMonth.of(2020, 12);
        System.out.println(birthday);
        System.out.println(creditCard);

        //由於YearMonth和MonthDay所含的資訊比較少，因此若要轉成LocalDate物件，還需要再提供更多的資訊
        final LocalDate birthdayLocalDate = birthday.atYear(1993);
        final LocalDate creditCardLocalDate = creditCard.atDay(5);
        System.out.println(birthdayLocalDate);
        System.out.println(creditCardLocalDate);

    }
}