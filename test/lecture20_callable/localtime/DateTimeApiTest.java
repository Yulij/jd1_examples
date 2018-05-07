package lecture20_callable.localtime;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateTimeApiTest {

    /**
     * Использование старого времени
     */
    @Test
    public void testOldApi() {
//        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 8);
//        calendar.add(Calendar.DAY_OF_MONTH, 2);

        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("EEEEE d MM yyyy");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println(format);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEEE dd M yyyy");
        try {
            Date date = sdf.parse(format);
            System.out.println(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Форматирование с новым классом времени
     */
    @Test
    public void testFormatting() {
        LocalDate now = LocalDate.now();
        String formattedString
                = now.format(DateTimeFormatter.ofPattern("dd--MM--yyyy"));
        System.out.println(formattedString);

        String dateAsString = "20--06-+1990";
        LocalDate parsedDate
                = LocalDate.parse(dateAsString, DateTimeFormatter.ofPattern("dd--MM-+yyyy"));
        System.out.println(parsedDate.getYear());
        System.out.println(parsedDate.getMonth());
        System.out.println(parsedDate.getDayOfMonth());
    }

    /**
     * Инициализируем объекты времени и даты
     */
    @Test
    public void testLocalDateCreation() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        LocalDate oldDate = LocalDate.of(1800, Month.NOVEMBER, 5);
        System.out.println(oldDate);
    }

    /**
     * Добавляем к текущей дате 20 месяцев
     */
    @Test
    public void testModification() {
        LocalDate today = LocalDate.now();
        LocalDate localDate = today.plus(20, ChronoUnit.MONTHS);
        System.out.println(localDate);
    }

    /**
     * Выводим разницу между часовыми поясами
     */
    @Test
    public void testZonedTimes() {
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime minskTime = ZonedDateTime.now(ZoneId.of("Europe/Minsk"));
        ZonedDateTime denverTime = ZonedDateTime.now(ZoneId.of("America/Denver"));
        System.out.println(minskTime.getHour() - parisTime.getHour());
        System.out.println(minskTime.getHour() - denverTime.getHour());
        System.out.println(londonTime.getHour() - denverTime.getHour());

    }

    @Test
    public void testInstant() {
        Instant instant = Instant.now(); // альтернативный способ инициализации
        Date date = new Date();
        System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }

    /**
     * Время через 3 года 2 месяца и 1 день
     */
    @Test
    public void testPeriodAddition() {
        LocalDate plus = LocalDate.now().plus(Period.of(3, 2, 1));
        System.out.println(plus);
    }

    @Test
    public void testDurationsAndPeriods() {
        LocalDate today = LocalDate.now();
        LocalDateTime localDateTime = today.atTime(23, 10, 14);
        System.out.println(localDateTime);
        LocalDateTime todayWithTime = LocalDateTime.now();
        LocalDateTime twoDaysInFuture = todayWithTime.plusDays(2);
        Duration between = Duration.between(todayWithTime, twoDaysInFuture);
        System.out.println(between.getSeconds());

        LocalDate birthday = LocalDate.of(2032, Month.JULY, 6);
        Period period = Period.between(birthday, today);
        boolean supported = today.isSupported(ChronoUnit.HOURS);
        System.out.println(supported);
        System.out.println("Лет: " + period.getYears());
        System.out.println("Месяцев: " + period.getMonths());
        System.out.println("Дней: " + period.getDays());
    }

    /**
     * Расширенная инициализация времени
     */
    @Test
    public void testTemporalAdjusters() {
        LocalDate adjustedDate = LocalDate.of(2017, Month.FEBRUARY, 28)
                .with(TemporalAdjusters.lastDayOfYear());
        DayOfWeek dayOfWeek = adjustedDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(adjustedDate);
        System.out.println(adjustedDate.format(DateTimeFormatter.ofPattern("EE")));
    }

    /**
     * Инициализация времени на 80 минут меньше текущего
     */
    @Test
    public void testCustomAdjuster() {
        LocalTime with = LocalTime.now().with(new BackInTimeAdjuster());
        System.out.println(with);
    }

    @Test
    public void testReplaceDate() {
        LocalDate now = LocalDate.now();
        LocalDate inFuture = LocalDate.of(2023, Month.MARCH, 13);
        LocalDate with = now.with(inFuture);
        System.out.println(with);
    }

    private class BackInTimeAdjuster implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            return temporal.minus(80, ChronoUnit.MINUTES);
        }
    }

    @Test
    public void testLocale() {
        for (Locale locale : Locale.getAvailableLocales()) {
            System.out.println("Display language " + locale.getDisplayLanguage() +
                    ". Display country " + locale.getDisplayCountry() + " " + locale. getDisplayName());
        }

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
    }
}
